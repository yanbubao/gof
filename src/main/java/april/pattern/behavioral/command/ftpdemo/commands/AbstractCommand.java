package april.pattern.behavioral.command.ftpdemo.commands;

import april.pattern.behavioral.command.ftpdemo.ICommand;

/**
 * @author yanzx
 */
public abstract class AbstractCommand implements ICommand {
    /**
     * 公共Command逻辑
     */
    public AbstractCommand(String command) {
        System.out.println(command + "命令准备中...");
    }
}
