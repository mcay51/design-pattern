package tr.com.mustafacay.interpreter.service.jobexpression;
/**
 * Meslek gruplarını temsil eden sınıf -> Sanatçı
 */
public class ArtistExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        if (context.getFormula().contains("A")) {
            context.setTotalPoint(context.getTotalPoint() + 35); // Sanatçı puanı ekle
        }
    }
}
