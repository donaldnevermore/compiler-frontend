package symbols;

import java.util.Hashtable;
import lexer.Token;
import inter.Id;

public class Env {
    private Hashtable<Token, Id> table;
    protected Env prev;

    public Env(Env n) {
        table = new Hashtable<>();
        prev = n;
    }

    public void put(Token w, Id i) {
        table.put(w, i);
    }

    public Id get(Token w) {
        for (var e = this; e != null; e = e.prev) {
            var found = e.table.get(w);
            if (found != null) {
                return found;
            }
        }

        return null;
    }
}
