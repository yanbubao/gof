package april.pattern.bridge.message;

/**
 * @author yanzx
 */
public abstract class AbstractMessage {

    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    protected void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }
}
