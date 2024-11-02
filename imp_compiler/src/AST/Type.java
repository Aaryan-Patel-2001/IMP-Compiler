package AST;

public class Type {
    public enum BaseType { INT, BOOL }
    public enum Label { HIGH, LOW }

    private BaseType baseType;
    private Label label;

    public Type(BaseType baseType, Label label) {
        this.baseType = baseType;
        this.label = label;
    }

    public BaseType getBaseType() {
        return baseType;
    }

    public Label getLabel() {
        return label;
    }

    public static Label LabelUpperBound(Label l1, Label l2) {
        if (l1 == Label.LOW && l2 == Label.LOW) {
            return Label.LOW;
        }
        return Label.HIGH;
    }

    // Flow is allowed from l1 to l2: return true, false otherwise
    public static boolean LabelFlowAllowed(Label l1, Label l2){
        if (l1 == l2){
            return true; 
        }
        if (l1 == Label.LOW && l2 == Label.HIGH){
            return true; 
        }
        return false;
    }

    @Override
    public String toString() {
        return baseType.toString() + "_" + label.toString();
    }
}
