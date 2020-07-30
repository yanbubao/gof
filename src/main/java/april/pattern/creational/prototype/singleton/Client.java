package april.pattern.creational.prototype.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 单例模式，与原型模式是对应的；要么单例，要么原型！
 *
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        //创建原型对象
        ConcretePrototype prototype = ConcretePrototype.getInstance();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);

        ConcretePrototype clone = prototype.clone();

        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + clone);
        System.out.println(prototype == clone);

        System.out.println("原型对象的爱好：" + prototype.getHobbies());
        System.out.println("克隆对象的爱好：" + clone.getHobbies());
        System.out.println(prototype.getHobbies() == clone.getHobbies());

    }
}
