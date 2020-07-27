package april.pattern.bridge.message.level;


import april.pattern.bridge.message.AbstractMessage;
import april.pattern.bridge.message.IMessage;

/**
 * @author yanzx
 */
public class NormalMessage extends AbstractMessage {
    public NormalMessage(IMessage message) {
        super(message);
    }
}
