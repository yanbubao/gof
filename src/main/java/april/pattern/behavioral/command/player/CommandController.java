package april.pattern.behavioral.command.player;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author yanzx
 */
public class CommandController {

    private final List<IAction> actions;

    public CommandController() {
        this.actions = Lists.newArrayList();
    }

    public void addAction(IAction action) {
        this.actions.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void executes() {
        actions.forEach(IAction::execute);
        actions.clear();
    }
}
