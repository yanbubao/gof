package april.pattern.behavioral.command.ftpdemo.commands;

/**
 * @author yanzx
 */
public class ShutDownCommand extends AbstractCommand {

    public ShutDownCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("关闭ftp连接...");
    }
}
