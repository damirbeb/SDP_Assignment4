package chat_room_application;

public abstract class User {
    protected ChatMediator mediator;

    public User(ChatMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message, User sender);
}