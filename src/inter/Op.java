package inter;

import lexer.Token;
import symbols.Type;

public class Op extends Expr {
    public Op(Token tok, Type p) {
        super(tok, p);
    }

    public Expr reduce() {
        var x = gen();
        var t = new Temp(type);
        emit(t + " = " + x.toString());
        return t;
    }
}
