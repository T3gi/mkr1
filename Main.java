import mkr1.*;

public class Main {
    public static void main(String[] args) {

        Message msg = new ConcreteMessage("Hello World");
        msg.Text();
        msg = new Cphifre(msg);
        msg.Text();
        msg = new Resize(msg);
        msg.Text();
        msg = new DateTime(msg);
        msg.Text();
        msg = new AuthorName(msg);
        msg.Text();
    }
}