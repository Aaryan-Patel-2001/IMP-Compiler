package AST;

public class ast {
    public node root;
    public ast(node root) {
        this.root = root;
    }
    public String toString() {
        return this.root.toString();
    }
}
