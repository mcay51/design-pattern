package tr.com.mustafacay.interpreter.service.jobexpression;
/**
 * Meslek gruplarını temsil eden sınıf - > Mühendis
 */
public class EngineerExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        if (context.getFormula().contains("E")) {
            context.setTotalPoint(context.getTotalPoint() + 30); // Mühendis puanı ekle
        }
    }
}
