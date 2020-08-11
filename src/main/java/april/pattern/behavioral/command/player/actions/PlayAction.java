package april.pattern.behavioral.command.player.actions;

import april.pattern.behavioral.command.player.GPlayer;
import april.pattern.behavioral.command.player.IAction;

/**
 * @author yanzx
 */
public class PlayAction implements IAction {
    private final GPlayer player;

    public PlayAction(GPlayer player) {
        this.player = player;
    }

    public void execute() {
        player.play();
    }
}
