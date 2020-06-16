package april.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("yanzx");
        List<String> list = new ArrayList<>();
        list.add("11");
        concretePrototype.setList(list);

        System.out.println("原型对象：" + concretePrototype);

        ConcretePrototype cloneObject = concretePrototype.clone();
        System.out.println("clone的对象：" + cloneObject);
        System.out.println(concretePrototype.getList() == cloneObject.getList());

        // 修改clone对象的属性值，clone的对象和原型对象的引用类型对象是同一块堆，只是将引用clone了
        cloneObject.getList().add("22");
        System.out.println(concretePrototype.getList() == cloneObject.getList());
        System.out.println("原型对象：" + concretePrototype);
        System.out.println("clone的对象：" + cloneObject);
    }
}
