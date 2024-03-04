package tr.com.mustafacay.memento.service;

import lombok.Getter;

// Memento: Nesnenin durumunu içeren bir yapı
@Getter
public class TextEditorMemento {
    private String text;

    public TextEditorMemento(String text) {
        this.text = text;
    }

}
