package april.pattern.behavioral.command.ftpdemo.commands;

/**
 * @author yanzx
 */
public class UpCommand extends AbstractCommand {

    public UpCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("上传文件至ftp...");
    }
}
