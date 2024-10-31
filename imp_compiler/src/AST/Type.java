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

    @Override
    public String toString() {
        return baseType.toString() + "_" + label.toString();
    }
}
