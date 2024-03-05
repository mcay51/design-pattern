package tr.com.mustafacay.state.service;

import lombok.Getter;
import lombok.Setter;

/**
 * Context sınıfı, belgenin durumunu ve davranışlarını içerir.
  */
public class Document {
    @Setter
    private State state; // Mevcut durumu tutan alan

    @Getter
    private User user; // Belgeyi oluşturan kullanıcı

    public Document(User user) {
        this.user = user;
        this.state = new DraftState(); // Başlangıç durumu belirtilir
    }

    public void publish() {
        if(user.isAdmin()) {
            state.publish(this); // Mevcut duruma göre yayımlama davranışı çağrılır
        }else {
            System.out.println("Kullanıcının belge yayımlama yetkisi yok");
        }
    }

}

