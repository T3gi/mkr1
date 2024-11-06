package mkr1;


public class DateTime extends Decorator{
    public DateTime(Message message) {
        super(message);
    }
    String newText = super.getText()+" DateTime";
    @Override
    public String getText(){
        return newText;
    }
    public void Text() {
        System.out.println(newText);
    }
}
