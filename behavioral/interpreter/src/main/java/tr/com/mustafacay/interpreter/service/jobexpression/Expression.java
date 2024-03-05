package tr.com.mustafacay.interpreter.service.jobexpression;

import java.util.ArrayList;
import java.util.List;

/**
 * İfade ağacını oluşturan sınıf
 */
public class Expression {
    // İfade ağacını oluşturmak için metot
    static List<RoleExpression> createExpressionTree(String formula) {
        List<RoleExpression> tree = new ArrayList<>(); // İfade ağacı

        // Her karakter için uygun ifadeyi ağaca ekle
        for (char role : formula.toCharArray()) {
            if (role == 'D') {
                tree.add(new DoctorExpression());
            } else if (role == 'E') {
                tree.add(new EngineerExpression());
            } else if (role == 'L') {
                tree.add(new LawyerExpression());
            } else if (role == 'A') {
                tree.add(new ArtistExpression());
            }
        }

        return tree;
    }

    // İfadeleri yorumlamak için metot
    public static void runExpression(Context context) {
        for (RoleExpression expression : createExpressionTree(context.getFormula())) {
            expression.interpret(context); // İfadenin yorumlanması
        }

        // Sonucun yazdırılması
        System.out.println(context.getFormula() + " için toplam puan: " + context.getTotalPoint());
    }
}
