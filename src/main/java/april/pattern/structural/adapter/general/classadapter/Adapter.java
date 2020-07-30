package april.pattern.structural.adapter.general.classadapter;

/**
 * @author yanzx
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public int request() {
        return super.specificRequest() / 10;
    }
}
