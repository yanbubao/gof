package april.pattern.bridge.demo.impl;

/**
 * @author yanzx
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("PythonNote");
    }
}
