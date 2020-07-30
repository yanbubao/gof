package april.pattern.structural.composite.general.safe;

/**
 * @author yanzx
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();
}
