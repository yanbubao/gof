package april.pattern.behavioral.command.ftpdemo.commands;

/**
 * @author yanzx
 */
public class LoginCommand extends AbstractCommand {

    public LoginCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("正在登录ftp...");
    }
}
