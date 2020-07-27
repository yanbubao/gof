package april.pattern.bridge.demo.impl;

/**
 * @author yanzx
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("JavaNote");
    }
}
