package april.pattern.behavioral.command.general;

/**
 * @author yanzx
 */
public class ConcreteCommand implements ICommand {

    // 直接创建接收者，不暴露给客户端
    private final Receiver mReceiver = new Receiver();

    @Override
    public void execute() {
        this.mReceiver.action();
    }
}
