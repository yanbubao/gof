package april.pattern.creational.singleton.register;

/**
 * @author: yanzx
 */
public enum EnumSingleton {

    /**
     * 实例
     */
    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
