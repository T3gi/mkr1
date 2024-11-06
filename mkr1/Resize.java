package mkr1;

public class Resize extends Decorator{
    public Resize(Message message) {
        super(message);
    }
    String newText = super.getText()+" Resized";
    @Override
    public String getText(){
        return newText;
    }
    public void Text() {
        System.out.println(newText);
    }
}
