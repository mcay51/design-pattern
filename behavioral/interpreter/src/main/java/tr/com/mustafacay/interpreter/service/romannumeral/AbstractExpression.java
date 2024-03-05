package tr.com.mustafacay.interpreter.service.romannumeral;

/**
 * AbstractExpression arayüzü, her ifade tipi için bir yordam içerir.
 */
public interface AbstractExpression {
    int interpret(Context context);
}
