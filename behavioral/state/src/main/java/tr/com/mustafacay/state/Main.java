package tr.com.mustafacay.state;
import tr.com.mustafacay.state.service.User;
import tr.com.mustafacay.state.service.Document;
import tr.com.mustafacay.state.service.ModerationState;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! State Design Pattern");

        // Kullanıcı oluşturulur
        User user = new User(true); // Yönetici kullanıcı

        // Belge oluşturulur ve başlangıç durumu atanır
        Document document = new Document(user);

        // Belge yayımlanmaya çalışılır
        document.publish(); // Belge taslak durumunda olduğu için yayımlanamaz.

        // Belge durumu değiştirilir ve yayımlanmaya tekrar çalışılır
        document.setState(new ModerationState());
        document.publish(); // Belge moderasyon aşamasında ve yayımlanabilir.

        // Yine de tekrar yayımlanmaya çalışılır
        document.publish(); // Belge zaten yayımlanmış durumda.

    }
}