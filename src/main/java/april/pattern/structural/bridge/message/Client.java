package april.pattern.structural.bridge.message;

import april.pattern.structural.bridge.message.level.NormalMessage;
import april.pattern.structural.bridge.message.level.UrgencyMessage;
import april.pattern.structural.bridge.message.type.EmailMessage;
import april.pattern.structural.bridge.message.type.SmsMessage;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("请假", "轩老板");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("请假", "轩老板");
    }
}
