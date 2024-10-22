package chat_room_application;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}