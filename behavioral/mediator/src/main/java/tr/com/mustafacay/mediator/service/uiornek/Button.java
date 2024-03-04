package tr.com.mustafacay.mediator.service.uiornek;

public class Button implements UIControl {
    private DialogMediator mediator;

    public Button(DialogMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void controlChanged() {
        mediator.notify("Button");
    }
}