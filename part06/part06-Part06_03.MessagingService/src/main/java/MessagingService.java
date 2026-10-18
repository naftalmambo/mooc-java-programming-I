import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> obj;

    public MessagingService() {
        this.obj = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.obj.add(message);

        }
    }

    public ArrayList<Message> getMessages() {
        return this.obj;

    }

}
