package inter;

import lexer.Word;
import symbols.Type;

public class Temp extends Expr {
    static int count = 0;
    int number = 0;

    public Temp(Type p) {
        super(Word.temp, p);
        count++;
        number = count;
    }

    public String toString() {
        return "t" + number;
    }
}
