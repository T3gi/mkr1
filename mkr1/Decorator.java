package mkr1;

public abstract class Decorator extends Message {
    protected Message message;

    public Decorator(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText();
    }
    public void Text() {
        System.out.println(message.getText());
    }
}
