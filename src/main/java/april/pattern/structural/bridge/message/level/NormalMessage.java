package april.pattern.structural.bridge.message.level;


import april.pattern.structural.bridge.message.AbstractMessage;
import april.pattern.structural.bridge.message.IMessage;

/**
 * @author yanzx
 */
public class NormalMessage extends AbstractMessage {
    public NormalMessage(IMessage message) {
        super(message);
    }
}
