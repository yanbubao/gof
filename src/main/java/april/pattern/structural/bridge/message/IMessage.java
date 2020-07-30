package april.pattern.structural.bridge.message;

/**
 * @author yanzx
 */
public interface IMessage {
    void send(String message, String toUser);
}
