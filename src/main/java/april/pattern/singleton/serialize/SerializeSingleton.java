package april.pattern.singleton.serialize;

import java.io.Serializable;

/**
 * 一个单例类可能会因为序列化、反序列化所破坏！
 *
 * @author yanzx
 */
public class SerializeSingleton implements Serializable {

    private SerializeSingleton() {
    }

    private static SerializeSingleton instance = new SerializeSingleton();

    public static SerializeSingleton getInstance() {
        return instance;
    }

    private Object readResolve(){ return instance;}
}
