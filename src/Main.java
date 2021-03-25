import java.io.IOException;
import lexer.Lexer;
import parser.Parser;

public class Main {
    public static void main(String[] args) throws IOException {
        var lex = new Lexer();
        var parse = new Parser(lex);
        parse.program();
        System.out.write('\n');
    }
}
