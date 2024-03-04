package tr.com.mustafacay.mediator.service.uiornek;

import lombok.Setter;

/**
 * Concrete Mediator sınıfı
  */
@Setter
public class Dialog implements DialogMediator {
    private TextBox textBox;
    private CheckBox checkBox;
    private Button button;

    @Override
    public void notify(String componentName) {
        if (componentName.equals("CheckBox")) {
            if (checkBox.isChecked()) {
                System.out.println("Kullanıcı checkbox kutucuğunu işaretledi.");
                textBox.setVisible(true);
            } else {
                System.out.println("Kullanıcı checkbox kutucuğunun işaretini kaldırdı.");
                textBox.setVisible(false);
            }
        } else if (componentName.equals("Button")) {
            // Gönderme işlemi
            System.out.println("Veri gönderiliyor...");
        }
    }
}
