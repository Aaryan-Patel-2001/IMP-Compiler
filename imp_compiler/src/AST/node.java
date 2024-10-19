package AST;
import java.io.FileWriter;
import java.io.IOException;

public class Node {
    public String name;
    public Node[] children;
    public Node(String name, Node[] children) {
        this.name = name;
        this.children = children;
    }
    public Node(String name) {
        this.name = name;
        this.children = new Node[0];
    }
    public String toString() {
        return this.name;
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
    public ExpressionNode(Node[] children) {
        super("expression", children);
    }

    public ExpressionNode(String string) {
        super(string);  
    }

    public ExpressionNode(String string, Node[] nodes) {
        super(string, nodes);  
    }
}

class SkipcmdNode extends CommandNode {
    public SkipcmdNode() {
        super("skipcmd");
    }
}

class IntValueNode extends ExpressionNode {
    Integer value; 
    public IntValueNode(Integer value) {
        super("Integer");
        this.value = value; 
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
}


class AssignNode extends CommandNode {
    public AssignNode(Node varNode, Node exprNode) {
        super("Assign", new Node[] { varNode, exprNode });
    }
}

class IfNode extends CommandNode {
    public IfNode(Node condition, Node thenBranch, Node elseBranch) {
        super("If", new Node[] { condition, thenBranch, elseBranch });
    }
}

/* While Loop Node */
class WhileNode extends CommandNode {
    public WhileNode(Node condition, Node body) {
        super("While", new Node[] { condition, body });
    }
}

/* Sequence of Commands Node */
class SeqNode extends CommandNode {
    public SeqNode(Node[] children) {
        super("Seq", children);
    }
}


/* Variable Declaration Node */
class VarDeclNode extends CommandNode {
    private final boolean isHigh;  // To track whether it's HIGH or LOW security

    public VarDeclNode(String id, boolean isHigh) {
        super("VarDecl", new Node[] { new VarNameNode(id) });
        this.isHigh = isHigh;
    }

    public boolean isHigh() {
        return isHigh;
    }
}

/* Return Command Node */
class ReturnNode extends CommandNode {
    public ReturnNode(Node expr) {
        super("Return", new Node[] { expr });
    }
}



