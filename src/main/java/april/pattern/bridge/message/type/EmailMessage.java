package april.pattern.bridge.message.type;

import april.pattern.bridge.message.IMessage;

/**
 * @author yanzx
 */
public class EmailMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送" + message + "给" + toUser);
    }
}
