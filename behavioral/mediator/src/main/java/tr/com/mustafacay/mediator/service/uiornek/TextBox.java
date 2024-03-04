package tr.com.mustafacay.mediator.service.uiornek;
/**
 * Concrete Colleague sınıfları
 */
public class TextBox implements UIControl {
    private DialogMediator mediator;
    private boolean isVisible;

    public TextBox(DialogMediator mediator) {
        this.mediator = mediator;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
        controlChanged();
    }

    @Override
    public void controlChanged() {
        mediator.notify("TextBox");
    }
}