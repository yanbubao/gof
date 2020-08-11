package april.pattern.behavioral.command.ftpdemo;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * @author yanzx
 */
public class FtpServer {

    private final List<ICommand> commands;

    public FtpServer() {
        this.commands = Lists.newArrayList();
    }

    public void addCommand(ICommand command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        Iterator<ICommand> iterator = commands.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute();
            iterator.remove();
        }
    }
}
