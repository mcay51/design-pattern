package tr.com.mustafacay.mediator;

import tr.com.mustafacay.mediator.service.messageornek.Member;
import tr.com.mustafacay.mediator.service.messageornek.MessageService;
import tr.com.mustafacay.mediator.service.messageornek.Messenger;
import tr.com.mustafacay.mediator.service.uiornek.Button;
import tr.com.mustafacay.mediator.service.uiornek.CheckBox;
import tr.com.mustafacay.mediator.service.uiornek.Dialog;
import tr.com.mustafacay.mediator.service.uiornek.TextBox;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Mediator Design Pattern");
       // mediatorOrnekUI();
        mediatorMesajServiceOrnek();

    }
    public static void mediatorOrnekUI(){
        Dialog dialog = new Dialog();
        TextBox textBox = new TextBox(dialog);
        CheckBox checkBox = new CheckBox(dialog);
        Button button = new Button(dialog);

        dialog.setTextBox(textBox);
        dialog.setCheckBox(checkBox);
        dialog.setButton(button);

        // Kullanıcı işaret kutusuna tıkladığında
        checkBox.setChecked(true);

        // Kullanıcı veriyi göndermeye hazır olduğunda
        button.controlChanged();
    }
    public static void mediatorMesajServiceOrnek(){
        MessageService messageService=new MessageService();
        Member ali=new Messenger("Ali");
        Member ahmet=new Messenger("Ahmet");
        Member mehmet=new Messenger("Mehmet");
        Member ayse=new Messenger("Ayşe");
        Member fatma=new Messenger("Fatma");
        messageService.register(ali);
        messageService.register(ahmet);
        messageService.register(mehmet);
        messageService.register(ayse);
        messageService.register(fatma);

        ali.sendMessage("Ahmet", "Selam Ahmet Yemeğe Çıkacakmısın ?");
        ayse.sendMessage("Mehmet", "İstediğim evraklar hazır mı ?");
        fatma.sendMessage("Ahmet", "Toplantı saat 3'te ");
        mehmet.sendMessage("Ayşe", "İstediğin evraklar hazır");

    }
}