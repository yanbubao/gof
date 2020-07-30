package april.pattern.creational.singleton.test;

import april.pattern.creational.singleton.serialize.SerializeSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author yanzx
 * @date 2020/06/05 00:02
 */
public class SerializeSingletonTest {

    /**
     * 将s2序列化到磁盘，再反序列化到内存中指向s1，比较s1 == s2
     * 结论：false
     *
     * @param args
     */
    public static void main(String[] args) {

        SerializeSingleton s1 = null;
        SerializeSingleton s2 = SerializeSingleton.getInstance();

        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream("SerializeSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerializeSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializeSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
            /**
             * SerializeSingleton 中没写 private Object readResolve(){ return INSTANCE;}
             * 导致反序列化后得到的地址被重新分配！
             */


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
