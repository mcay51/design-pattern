package tr.com.mustafacay.state.service;
/**
 * Kullanıcı sınıfı, belgeyi oluşturan kullanıcı bilgisini içerir.
  */
public class User {
    private boolean isAdmin; // Kullanıcının yönetici olup olmadığını belirten alan

    public User(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
