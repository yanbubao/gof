package april.pattern.singleton.register;

/**
 * @author: yanzx
 * @date: 2020/06/04 23:47
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
