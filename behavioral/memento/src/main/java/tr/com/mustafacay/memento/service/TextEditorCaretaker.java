package tr.com.mustafacay.memento.service;

import lombok.Getter;

// Caretaker: Memento'ları saklar ve geri yükler
@Getter
public class TextEditorCaretaker {
    private TextEditorMemento memento;

    public void saveMemento(TextEditorMemento memento) {
        this.memento = memento;
    }

}
