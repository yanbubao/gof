package april.pattern.prototype.deep;

import lombok.Data;
import lombok.ToString;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yanzx
 */
@Data
@ToString
public class ConcretePrototype implements Serializable, Cloneable {

    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }

    /**
     * deep clone.
     *
     * @return ConcretePrototype
     */
    public ConcretePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 通过硬编码的方式将hobbies属性进行深克隆！
     *
     * @return
     */
    public ConcretePrototype deepCloneHobbies() {
        try {
            ConcretePrototype result = (ConcretePrototype) super.clone();
            result.hobbies = (List) ((ArrayList) result.hobbies).clone();
            return result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
