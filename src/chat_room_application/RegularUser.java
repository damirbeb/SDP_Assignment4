package chat_room_application;

public class RegularUser extends User {
    private String name;

    public RegularUser(ChatMediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message, User sender) {
        System.out.println(sender + ": " + message);
    }

}