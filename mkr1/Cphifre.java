package mkr1;

public class Cphifre extends Decorator{
    public Cphifre(Message message) {
        super(message);
    }
    String newText = super.getText()+" Cphifred";
    @Override
    public String getText(){
        return newText;
    }
    public void Text() {
        System.out.println(newText);
    }
}
