package tr.com.mustafacay.mediator.service.messageornek;

public class Messenger extends Member{
    public Messenger(String memberName) {
        super(memberName);
    }
    @Override
    public void reciveMessage(String messageFrom,String message) {
        System.out.println("Send With ->  "+getClass().getCanonicalName());
        super.reciveMessage(messageFrom, message);
    }

}
