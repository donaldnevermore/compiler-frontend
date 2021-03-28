package inter;

import lexer.Token;
import symbols.Array;
import symbols.Type;

public class Rel extends Logical {
    public Rel(Token tok, Expr x1, Expr x2) {
        super(tok, x1, x2);
    }

    public Type check(Type p1, Type p2) {
        if (p1 instanceof Array || p2 instanceof Array) {
            return null;
        }
        else if (p1 == p2) {
            return Type.Bool;
        }
        else {
            return null;
        }
    }

    public void jumping(int t, int f) {
        var a = expr1.reduce();
        var b = expr2.reduce();

        var test = a.toString() + " " + op.toString() + " " + b.toString();
        emitjumps(test, t, f);
    }
}
