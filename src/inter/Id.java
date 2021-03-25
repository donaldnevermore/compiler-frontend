package inter;

import lexer.Word;
import symbols.Type;

public class Id extends Expr {
    // Relative address
    public int offset;

    public Id(Word id, Type p, int b) {
        super(id, p);
        offset = b;
    }
}
