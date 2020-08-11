package april.pattern.behavioral.command.ftpdemo.commands;

/**
 * @author yanzx
 */
public class ConnectCommand extends AbstractCommand {

    public ConnectCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("连接至ftp...");
    }
}
