package AST;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class Node {
    public String name;
    public Node[] children;
    
    public Node(String name, Node[] children) {
        this.name = name;
        this.children = children;
        // this.type = Optional.empty();
    }
    public Node(String name) {
        this.name = name;
        this.children = new Node[0];
        // this.type = Optional.empty();
    }
    public String toString() {
        return this.name;
    }


    public Type typeCheck(Environment env) throws SemanticError {
        // Default behavior if not overridden
        throw new SemanticError("typeCheck not implemented for this node type: " + this.getClass().getSimpleName());
    }

    public void typeCheckCmd(Environment env) throws SemanticError {
        // Default behavior if not overridden
        throw new SemanticError("typeCheck not implemented for this node type: " + this.getClass().getSimpleName());
    }

    // Generate DOT representation
    public void toDot(StringBuilder sb, int parentId) {
        int currentId = NodeIdGenerator.getNextId();
        sb.append("  ").append(currentId).append(" [label=\"").append(name).append("\"];\n");
        if (parentId != -1) {
            sb.append("  ").append(parentId).append(" -> ").append(currentId).append(";\n");
        }

        for (Node child : children) {
            if (child != null) {
                child.toDot(sb, currentId);
            }
        }
    }

    // Method to write DOT to file
    public void writeDotFile(String filename) {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph AST {\n");

        // Start the recursion from root with no parent (-1)
        this.toDot(sb, -1);

        sb.append("}");
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(sb.toString());
            System.out.println("DOT file written to: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class NodeIdGenerator {
    private static int currentId = 0;

    public static int getNextId() {
        return currentId++;
    }
}

class ProgramNode extends Node {
    public ProgramNode(Node[] children) {
        super("program", children);
    }
}

class CommandNode extends Node {
    public CommandNode(Node[] children) {
        super("command", children);
    }

    public CommandNode(String string) {
        super(string);  
    }

    public CommandNode(String string, Node[] nodes) {
        super(string, nodes);
    }
}

class ExpressionNode extends Node {
    Optional<Type> type; 
    public ExpressionNode(Node[] children) {
        super("expression", children);
        this.type = Optional.empty();
    }

    public ExpressionNode(String string) {
        super(string);  
        this.type = Optional.empty();
    }

    public ExpressionNode(String string, Node[] nodes) {
        super(string, nodes);  
        this.type = Optional.empty();
    } 
}

class IntValueNode extends ExpressionNode {
    Integer value; 
    public IntValueNode(Integer value) {
        super("Integer");
        this.value = value; 
        this.type = Optional.of(new Type(Type.BaseType.INT, Type.Label.LOW));
    }

    @Override
    public Type typeCheck(Environment env) {
        if (this.type.isPresent()) {
           return this.type.get();
        }
        else {
            return new Type(Type.BaseType.INT, Type.Label.LOW); // default label can be LOW or as specified
        } 

    }

    public Integer getValue() {
        return value;
    }
}

class BoolValueNode extends ExpressionNode {
    Boolean value; 
    public BoolValueNode(Boolean value) {
        super("Boolean");
        this.value = value; 
        this.type = Optional.of(new Type(Type.BaseType.BOOL, Type.Label.LOW));
    }

    @Override
    public Type typeCheck(Environment env) {
        if (this.type.isPresent()) {
            return this.type.get();
         }
         else {
             return new Type(Type.BaseType.INT, Type.Label.LOW); // default label can be LOW or as specified
         } 
    }

    public Boolean getValue() {
        return value;
    }
}

class VarNameNode extends ExpressionNode {
    private final String variable; 
    public VarNameNode(String variable) {
        super("ID");
        this.variable = variable; 

    }

    public String getVariable() {
        return variable;
    }

    @Override
    public Type typeCheck(Environment env) throws SemanticError {
        Type varType = env.lookup(variable);
        if (varType == null) {
            throw new SemanticError("Variable " + variable + " not declared");
        }
        return varType;
    }

}

/* Binary Operation Node */
class BinOpNode extends ExpressionNode {
    private final String operator;

    public BinOpNode(String operator, Node left, Node right) {
        super("BinOp", new Node[] { left, right });
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public Type typeCheck(Environment env) throws SemanticError {
        Type leftType = children[0].typeCheck(env);
        Type rightType = children[1].typeCheck(env);

        if (leftType.getBaseType() != rightType.getBaseType()) {
            throw new SemanticError("Type mismatch in binary operation: " + leftType + " " + operator + " " + rightType);
        }
        return new Type(leftType.getBaseType(), Type.LabelUpperBound(leftType.getLabel(), rightType.getLabel()));
    }
}

class SkipcmdNode extends CommandNode {
    public SkipcmdNode() {
        super("skipcmd");
    }

    @Override
    public void typeCheckCmd(Environment env) throws SemanticError {
        // Do nothing
    }
}

/* Variable Declaration Node */
// TODO: Variable declaration node does not take type. Need to change that! 
// FIXME: Add these changes to specs.cup and the parser code 
// Note: Seems like lexer passes in TYPE for both int and bool, and passes int and bool as values to the type 
class VarDeclNode extends CommandNode {
    private final boolean isHigh;  // To track whether it's HIGH or LOW security

    public VarDeclNode(String id, boolean isHigh) {
        super("VarDecl", new Node[] { new VarNameNode(id) });
        this.isHigh = isHigh;
    }

    public boolean isHigh() {
        return isHigh;
    }

    @Override
    public void typeCheckCmd(Environment env) {
        String varName = ((VarNameNode) children[0]).getVariable();
        Type varType = new Type(Type.BaseType.INT, isHigh ? Type.Label.HIGH : Type.Label.LOW);
        env.declare(varName, varType);
    }
}


class AssignNode extends CommandNode {
    public AssignNode(Node varNode, Node exprNode) {
        super("Assign", new Node[] { varNode, exprNode });
    }

    @Override
    public void typeCheckCmd(Environment env) throws SemanticError {
        Type varType = children[0].typeCheck(env);
        Type exprType = children[1].typeCheck(env);

        if (varType.getBaseType() != exprType.getBaseType()) {
            throw new SemanticError("Type mismatch in assignment: " + varType + " = " + exprType);
        }
        if (varType.getLabel() == Type.Label.LOW && exprType.getLabel() == Type.Label.HIGH) {
            throw new SemanticError("Assignment of HIGH to LOW variable: " + varType + " = " + exprType);
        }
    }
}

// TODO: branches and labels for IF command 
class IfNode extends CommandNode {
    public IfNode(Node condition, Node thenBranch, Node elseBranch) {
        super("If", new Node[] { condition, thenBranch, elseBranch });
    }

    @Override
    public void typeCheckCmd(Environment env) throws SemanticError {
        Type condType = children[0].typeCheck(env);
        if (condType.getBaseType() != Type.BaseType.BOOL) {
            throw new SemanticError("Non-boolean condition in if statement: " + condType);
        }

        children[1].typeCheckCmd(env);
        children[2].typeCheckCmd(env);
    }
}

/* While Loop Node */
// TODO: branches and labels for WHILE command
class WhileNode extends CommandNode {
    public WhileNode(Node condition, Node body) {
        super("While", new Node[] { condition, body });
    }

    @Override
    public void typeCheckCmd(Environment env) throws SemanticError {
        Type condType = children[0].typeCheck(env);
        if (condType.getBaseType() != Type.BaseType.BOOL) {
            throw new SemanticError("Non-boolean condition in while loop: " + condType);
        }

        children[1].typeCheckCmd(env);
    }
}

/* Sequence of Commands Node */
class SeqNode extends CommandNode {
    public SeqNode(Node[] children) {
        super("Seq", children);
    }

    @Override
    public void typeCheckCmd(Environment env) throws SemanticError {
        for (Node child : children) {
            child.typeCheckCmd(env);
        }
    }
}

/* Return Command Node */
class ReturnNode extends CommandNode {
    public ReturnNode(Node expr) {
        super("Return", new Node[] { expr });
    }

    @Override
    public void typeCheckCmd(Environment env) throws SemanticError {
        children[0].typeCheck(env);
        if (children[0].typeCheck(env).getLabel() == Type.Label.HIGH) {
            throw new SemanticError("Return value cannot be HIGH security");
        }
    }

}



