package april.pattern.behavioral.command.ftpdemo;

import april.pattern.behavioral.command.ftpdemo.commands.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author yanzx
 */
public class CommandContext {

    private static final Map<String, ICommand> commandMap;

    private static final FtpServer ftpServer;

    static {
        commandMap = new HashMap<>();
        commandMap.put("login", new LoginCommand("login"));
        commandMap.put("conn", new ConnectCommand("conn"));
        commandMap.put("up", new UpCommand("up"));
        commandMap.put("down", new DownloadCommand("down"));
        commandMap.put("shut", new ShutDownCommand("shut"));
        commandMap.put("help", new HelpCommand("help"));
        ftpServer = new FtpServer();
    }

    public void sendCommand(String commandName) {

        if (Objects.isNull(commandName)) {
            System.out.println("请输入命令");
            return;
        }

        if (commandName.trim().contains("\\s")) {
            String[] input = commandName.split("\\s");
            for (String str : input) {
                if (preHandler(str)) return;
            }

        } else {
            if (preHandler(commandName.trim())) return;
        }

        ftpServer.executeCommands();
    }

    private boolean preHandler(String commandName) {

        ICommand command;
        command = commandMap.get(commandName);
        if (Objects.isNull(command)) {
            System.out.println(commandName + "命令无法执行，请输入 help 查询可执行的命令！");
            return true;
        }
        ftpServer.addCommand(command);
        return false;
    }


}
