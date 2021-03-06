package april.pattern.structural.adapter.general.interfaceadapter;

/**
 * @author yanzx
 */
public abstract class Adapter implements Target {

    protected Adaptee adaptee;

    protected Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int request1() {
        return 0;
    }

    @Override
    public int request2() {
        return 0;
    }

    @Override
    public int request3() {
        return 0;
    }

    @Override
    public int request4() {
        return 0;
    }
}
