import java.io.FileReader;
import AST.*; 
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        try {
            // Initialize the parser with your source file
            parser p = new parser(new Lexer(new FileReader("/Users/aaryanpatel/IMP-Compiler/imp_compiler/examples/source/loop.imp")));
            
            // Parse the file and get the AST root node
            Object result = p.parse().value;
            
            if (result instanceof Node) {
                Node astRoot = (Node) result;
                
                // Write the AST to a DOT file
                astRoot.writeDotFile("ast.dot");
                System.err.println("Parsing and AST generation successful! DOT file created.");
                
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

