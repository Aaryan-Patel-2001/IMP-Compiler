package AST;
public class node {
    public String name;
    public node[] children;
    public node(String name, node[] children) {
        this.name = name;
        this.children = children;
    }
    public node(String name) {
        this.name = name;
        this.children = new node[0];
    }
    public String toString() {
        return this.name;
    }
}

class skipcmdNode extends node {
    public skipcmdNode() {
        super("skipcmd");
    }
}

class IntValueNode extends node {
    Integer value; 
    public IntValueNode(Integer value) {
        super("Integer");
        this.value = value; 
    }
}

class BoolValueNode extends node {
    Boolean value; 
    public BoolValueNode(Boolean value) {
        super("Boolean");
        this.value = value; 
    }
}

class varNameNode extends node {
    String name; 
    public varNameNode(String name) {
        super("ID");
        this.name = name; 
    }
}

class assignNode extends node {
    public assignNode(node[] children) {
        super("assign", children);
    }
}
