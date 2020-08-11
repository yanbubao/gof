package april.pattern.behavioral.command.ftpdemo.commands;

/**
 * @author yanzx
 */
public class HelpCommand extends AbstractCommand {

    public HelpCommand(String command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("login 登录ftp");
        System.out.println("conn  连接ftp");
        System.out.println("up    用ftp上传文件");
        System.out.println("download  用ftp下载文件");
        System.out.println("shutdown  关闭ftp");
    }
}
