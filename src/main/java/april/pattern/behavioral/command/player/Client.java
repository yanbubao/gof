package april.pattern.behavioral.command.player;

import april.pattern.behavioral.command.player.actions.PauseAction;
import april.pattern.behavioral.command.player.actions.PlayAction;
import april.pattern.behavioral.command.player.actions.SpeedAction;
import april.pattern.behavioral.command.player.actions.StopAction;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        GPlayer player = new GPlayer();

        CommandController controller = new CommandController();
        controller.execute(new PlayAction(player));
        System.out.println("**************************");

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new SpeedAction(player));
        controller.addAction(new StopAction(player));
        controller.executes();
    }
}
