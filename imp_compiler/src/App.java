import java.io.FileReader;

public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
    try {
        // Lexer l = new Lexer(new FileReader("/Users/aaryanpatel/IMP-Compiler/imp_compiler/examples/source/example.imp"));
        // int i = 100;
        // while (i != 0) {
        //     i = l.next_token().sym;
        //     System.out.println(i);
            
        // }
    parser p = new parser(new Lexer(new FileReader("/Users/aaryanpatel/IMP-Compiler/imp_compiler/examples/source/example.imp")));
    Object result = p.parse().value;
    System.err.println("Parsing successful!");
    System.out.println(result);
    }
  catch (Exception e) {
    System.err.println("Parsing failed!");
    System.err.println(e.getMessage());
    }
}
}
