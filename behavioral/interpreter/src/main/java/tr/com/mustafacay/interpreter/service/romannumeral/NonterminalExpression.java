package tr.com.mustafacay.interpreter.service.romannumeral;

/**
 * NonterminalExpression sınıfı, iki Roma rakamı sembolünü bir araya getirerek işlem yapar.
  */
public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public NonterminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    // İki sembolün değerini birleştirerek işlem yapar
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
