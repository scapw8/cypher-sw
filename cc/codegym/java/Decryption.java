package cc.codegym.java;

public class Decryption {

    String text;

    public Decryption(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Decryption{" +
                "text='" + text + '\'' +
                '}';
    }
}
