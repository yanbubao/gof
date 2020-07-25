package april.pattern.composite.demo.safe;

/**
 * @author yanzx
 */
public abstract class Directory {

    protected abstract void show();

    protected String name;

    public Directory(String name) {
        this.name = name;
    }
}
