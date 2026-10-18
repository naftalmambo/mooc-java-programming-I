
public class Main {

    public static void main(String[] args) {

        // Try out your class here

        MessagingService service = new MessagingService();
        Message message = new Message("Naftal", "Java Engineer");
        service.add(message);

        System.out.println(service.getMessages());

    }
}
