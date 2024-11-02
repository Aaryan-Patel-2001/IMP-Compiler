

public class typeanalysis {
    public static void main(String[] args) {
        String example = "/Users/aaryanpatel/IMP-Compiler/imp_compiler/examples/source/example.imp";
        try {
            compile.compileFile(example);
            // System.out.println("Type analysis successful!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
