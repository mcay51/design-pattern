package tr.com.mustafacay.mediator.service.messageornek;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Member {

    private String memberName;
    private MessageService messageService;
    public Member(String memberName){
        this.memberName=memberName;
    }
    public void setMessageServiceMediator(MessageService messageService) {
        this.messageService=messageService;
    }

    //Mesaj Gönderme Metodu
    public void sendMessage(String messageTo, String message) {
        System.out.println("SendMessage - > Kime : "+messageTo + " Mesaj :  "+ message );
        messageService.sendMessage(memberName,messageTo,message);
    }
    //Mesaj alma metodu
    public void reciveMessage(String messageFrom, String message) {
        System.out.println(messageFrom+" kullanıcısından "+memberName+" kullanıcısına mesaj var : "+message);

    }
}
