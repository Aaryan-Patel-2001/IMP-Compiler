package AST;

public class ast {
    public Node root;
    public ast(Node root) {
        this.root = root;
    }
    public String toString() {
        return this.root.toString();
    }

    
}
