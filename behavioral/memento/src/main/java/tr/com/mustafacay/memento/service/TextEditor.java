package tr.com.mustafacay.memento.service;

import lombok.Getter;
import lombok.Setter;

// Originator: Nesnenin durumunu saklar ve geri getirir
@Getter
@Setter
public class TextEditor {
    private String text;

    // Memento oluştur
    public TextEditorMemento save() {
        return new TextEditorMemento(text);
    }

    // Memento'dan geri yükle
    public void restore(TextEditorMemento memento) {
        this.text = memento.getText();
    }
}
