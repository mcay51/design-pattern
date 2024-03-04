package tr.com.mustafacay.mediator.service.messageornek;


import java.util.HashMap;

/**
 * Concrete Mediator sınıfı
  */
public class MessageService implements MessageServiceMediator{
    private HashMap<String, Member> members=new HashMap();

    @Override
    public void register(Member member) {
        if(!members.containsValue(member)) {
            //MessageService mediator sınıfına üyeler üye adları ile kaydediliyor.
            members.put(member.getMemberName(), member);
        }
        //Üyenin mediator sınıfı MessageService olarak atandı. Başka bir MessageServiceMediator türünden bir
        //sınıf daha olsaydı mediator olarak oda seçilebilirdi.
        member.setMessageServiceMediator(this);
    }

    @Override
    public void sendMessage(String messageFrom, String messageTo, String message) {
        //Mesajın gönderileceği üye üyeler Map'inden çekilerek member field'ine atanıyor.
        Member member=members.get(messageTo);
        if(member!=null) {
            //messaj alıcıya gönderiliyor.
            member.reciveMessage(messageFrom, message);
        }
    }
}
