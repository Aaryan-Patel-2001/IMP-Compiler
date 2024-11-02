 

import java.io.FileReader;
import AST.*; 

public class compile {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage: java App <input_file>");
            System.exit(1);
        }

        String sourceFile = args[0];
        compileFile(sourceFile);
    }

    @SuppressWarnings("deprecation")
    public static void compileFile(String sourceFile) throws Exception {
        try {
            // Initialize the parser with your source file
            parser p = new parser(new Lexer(new FileReader(sourceFile)));
            
            // Parse the file and get the AST root node
            Object result = p.parse().value;
            
            if (result instanceof Node) {
                Node astRoot = (Node) result;
                astRoot.typeCheckCmd(new Environment());
                
                // Write the AST to a DOT file

                // astRoot.writeDotFile("ast.dot");
                // System.err.println("Parsing and AST generation successful! DOT file created.");
                
                // Optionally: Print the root of the AST
                System.out.println(astRoot);
            } else {
                System.err.println("Parsing failed: result is not an AST Node.");
            }
        } catch (Exception e) {
            System.err.println("Parsing failed!");
            System.err.println(e.getMessage());
            System.err.println(e.getStackTrace());
        }
    }
}
