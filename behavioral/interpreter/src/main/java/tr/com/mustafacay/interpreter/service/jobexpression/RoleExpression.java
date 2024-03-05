package tr.com.mustafacay.interpreter.service.jobexpression;

/**
 * RoleExpression soyut sınıfı, ifadelerin yorumlanması için arayüz sağlar
 */
public abstract class RoleExpression {
     abstract void interpret(Context context); // İfadeyi yorumlayan metod
}