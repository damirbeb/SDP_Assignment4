package chat_room_application;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new RegularUser(chatMediator, "User 1");
        User user2 = new RegularUser(chatMediator, "User 2");
        User user3 = new PremiumUser(chatMediator, "Premium User");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("Hello everyone!");
        user2.sendMessage("Hi there!");
        user3.sendMessage("This is a premium message.");
    }
}