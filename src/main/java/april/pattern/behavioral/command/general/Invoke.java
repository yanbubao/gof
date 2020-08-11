package april.pattern.behavioral.command.general;

/**
 * @author yanzx
 */
public class Invoke {
    private ICommand command;

    public Invoke(ICommand command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
