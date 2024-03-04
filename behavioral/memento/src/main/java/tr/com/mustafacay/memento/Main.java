package tr.com.mustafacay.memento;

import tr.com.mustafacay.memento.service.TextEditor;
import tr.com.mustafacay.memento.service.TextEditorCaretaker;
import tr.com.mustafacay.memento.service.TextEditorMemento;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Memento Design Pattern");

        // Originator oluştur
        TextEditor textEditor = new TextEditor();
        // Caretaker oluştur
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        // Metin gir
        textEditor.setText("Hello, World!");
        System.out.println("Texteditor text değeri girildi : text= "+textEditor.getText());
        // Anlık görüntü oluştur (Memento)
        TextEditorMemento memento = textEditor.save();
        // Mementoyu caretaker'a kaydet
        caretaker.saveMemento(memento);
        System.out.println("Texteditor mementoya kaydedildi. ");
        // Metni değiştir
        textEditor.setText("Goodbye, World!");
        System.out.println("Texteditor text değeri değiştirildi: yeni text ="+textEditor.getText());

        // Önceki duruma geri dön (Mementoyu geri yükle)
        textEditor.restore(caretaker.getMemento());

        // Metni yazdır
        System.out.println("Texteditor mementodan geri yüklendi: Current text: " + textEditor.getText()); // Çıktı: Current text: Hello, World!

    }
}