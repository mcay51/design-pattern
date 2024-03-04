package tr.com.mustafacay.mediator.service.uiornek;

public class  CheckBox implements UIControl {
    private DialogMediator mediator;
    private boolean isChecked;

    public CheckBox(DialogMediator mediator) {
        this.mediator = mediator;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        controlChanged();
    }

    @Override
    public void controlChanged() {
        mediator.notify("CheckBox");
    }
}