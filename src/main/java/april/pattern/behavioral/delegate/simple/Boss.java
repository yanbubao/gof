package april.pattern.behavioral.delegate.simple;

/**
 * @author yanzx
 */
public class Boss {
    public void command(String taskName, LeaderDelegate leaderDelegate) {
        leaderDelegate.doAction(taskName);
    }
}
