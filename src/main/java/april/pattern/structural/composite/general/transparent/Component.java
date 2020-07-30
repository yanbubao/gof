package april.pattern.structural.composite.general.transparent;

/**
 * 抽象根节点，将所有功能都抽象在最顶层接口，会导致子节点也能实现其不需要的功能即此demo中throw异常
 *
 * @author yanzx
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException("addChild not supported!");
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException("removeChild not supported!");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("getChild not supported!");
    }
}
