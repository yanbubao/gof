package april.pattern.structural.adapter.general.objectadapter;

/**
 * @author yanzx
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int request() {
        return adaptee.specificRequest() / 10;
    }
}
