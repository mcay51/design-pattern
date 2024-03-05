package tr.com.mustafacay.interpreter.service.romannumeral;

/**
 * TerminalExpression sınıfı, tek bir Roma rakamı sembolünü yorumlar.
  */
public class TerminalExpression implements AbstractExpression {
    private char symbol;

    public TerminalExpression(char symbol) {
        this.symbol = symbol;
    }

    // Verilen sembolün Roma rakamı değerini döndürür
    public int interpret(Context context) {
        return context.getValue(symbol);
    }
}
