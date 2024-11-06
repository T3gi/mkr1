package mkr1;

public class ConcreteMessage extends Message{
    String text;

    public ConcreteMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
    public void Text() {
        System.out.println(text);
    }
}
