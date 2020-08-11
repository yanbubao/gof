package april.pattern.behavioral.command.player.actions;

import april.pattern.behavioral.command.player.GPlayer;
import april.pattern.behavioral.command.player.IAction;

/**
 * @author yanzx
 */
public class PauseAction implements IAction {

    private final GPlayer player;

    public PauseAction(GPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player.pause();
    }
}
