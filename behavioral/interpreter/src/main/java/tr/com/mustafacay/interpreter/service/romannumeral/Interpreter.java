package tr.com.mustafacay.interpreter.service.romannumeral;

/**
 * Interpreter sınıfı, Roma rakamlarını yorumlar ve işler.
  */
public class Interpreter {
    // İfadeyi yorumlar ve sonucu döndürür
    public static int evaluate(String expression) {
        // Bağlam oluşturulur
        Context context = new Context();
        // İfade parçalanır ve yorumlanır
        // Bu örnekte, ifadeler basit bir şekilde ele alınmıştır
        // Gerçek uygulamalarda ifadelerin ayrıştırılması daha karmaşık olabilir
        AbstractExpression expressionTree = parseExpression(expression);
        // Yorumlanmış ifade sonucu döndürülür
        return expressionTree.interpret(context);
    }

    private static AbstractExpression parseExpression(String expression) {
        // İfadeyi ayrıştırarak ifade ağacını oluşturur
        // Bu kısımda ifadeyi uygun şekilde ayrıştırmak için daha kapsamlı bir işlem gerekebilir
        // Ancak, basitliği korumak için burada detaylara girilmemiştir
        char[] symbols = expression.toCharArray();
        AbstractExpression leftExpression = new TerminalExpression(symbols[0]);
        AbstractExpression rightExpression = new TerminalExpression(symbols[1]);
        return new NonterminalExpression(leftExpression, rightExpression);
    }
}
