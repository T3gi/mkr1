package mkr1;

public class AuthorName extends Decorator{
    public AuthorName(Message message) {
        super(message);
    }
    String newText = super.getText()+" Volodymyr Tytok";
    @Override
    public String getText(){
        return newText;
    }
    public void Text() {
        System.out.println(newText);
    }

}
