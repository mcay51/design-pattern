package tr.com.mustafacay.interpreter.service.jobexpression;

/**
 * Meslek gruplarını temsil eden sınıf -> Doktor
 */
class DoctorExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        if (context.getFormula().contains("D")) {
            context.setTotalPoint(context.getTotalPoint() + 25); // Doktor puanı ekle
        }
    }
}
