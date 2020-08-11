package april.pattern.behavioral.command.ftpdemo.commands;

/**
 * @author yanzx
 */
public class DownloadCommand extends AbstractCommand {

    public DownloadCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("从ftp下载文件...");
    }
}
