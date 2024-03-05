package tr.com.mustafacay.interpreter.service.jobexpression;
/**
 * Meslek gruplarını temsil eden sınıf - > Avukat
 */
public class LawyerExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        if (context.getFormula().contains("L")) {
            context.setTotalPoint(context.getTotalPoint() + 20); // Avukat puanı ekle
        }
    }
}
