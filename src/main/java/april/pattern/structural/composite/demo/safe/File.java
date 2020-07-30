package april.pattern.structural.composite.demo.safe;

/**
 * @author yanzx
 */
public class File extends Directory {

    public File(String name) {
        super(name);
    }

    @Override
    protected void show() {
        System.out.println(this.name);
    }
}
