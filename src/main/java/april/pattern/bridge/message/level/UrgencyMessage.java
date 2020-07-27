package april.pattern.bridge.message.level;

import april.pattern.bridge.message.AbstractMessage;
import april.pattern.bridge.message.IMessage;

/**
 * @author yanzx
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    protected void sendMessage(String message, String toUser) {
        message = "【加急】" + message;
        super.sendMessage(message, toUser);
    }
}
