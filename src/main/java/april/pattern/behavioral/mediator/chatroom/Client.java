package april.pattern.behavioral.mediator.chatroom;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User tom = new User("tom", chatRoom);
        User jerry = new User("jerry", chatRoom);

        tom.sendMessage("Hi! I am Tom.");
        jerry.sendMessage("Hello! My name is Jerry.");

    }
}
