package tr.com.mustafacay.interpreter;
import tr.com.mustafacay.interpreter.service.jobexpression.Expression;
import tr.com.mustafacay.interpreter.service.romannumeral.Interpreter;
import tr.com.mustafacay.interpreter.service.jobexpression.Context;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Interpreter Design Pattern\n");
       System.out.println("Örnek 1 Roma Rakamı Yorumlama");
        romaRakamOrnek();
        System.out.println("**************************************\n");
        System.out.println("Örnek 2 Job Expression Yorumlama");
        jobExpressionOrnek();


    }
    public static void romaRakamOrnek(){
        // İfadeyi değerlendirir ve sonucu ekrana yazdırır
        System.out.println("Roma Rakamlarının Sayısal Değeri IV: " + Interpreter.evaluate("IV"));
        System.out.println("Roma Rakamlarının Sayısal Değeri IX: " + Interpreter.evaluate("IX"));
        System.out.println("Roma Rakamlarının Sayısal Değeri XX: " + Interpreter.evaluate("XX"));

    }
    public static void jobExpressionOrnek(){
        // Test senaryoları
        Context context = new Context();
        System.out.println("DELDA : Doktor, Mühendis, Avukat, Doktor Sanatçı ");
        context.setFormula("DELDA"); // Doktor, Mühendis, Avukat, Doktor, Sanatçı
        Expression.runExpression(context);
        System.out.println("AL : Sanatçı, Avukat");

        context.setFormula("AL"); // Sanatçı, Avukat
        Expression.runExpression(context);
    }
}
