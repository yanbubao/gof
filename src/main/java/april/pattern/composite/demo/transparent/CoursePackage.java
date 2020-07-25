package april.pattern.composite.demo.transparent;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author yanzx
 */
public class CoursePackage extends CourseComponent {

    private List<CourseComponent> courseComponents;
    private String name;
    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
        this.courseComponents = Lists.newArrayList();
    }

    @Override
    public void addChild(CourseComponent catalogComponent) {
        courseComponents.add(catalogComponent);
    }

    @Override
    public void removeChild(CourseComponent catalogComponent) {
        courseComponents.remove(catalogComponent);
    }

    @Override
    public String getName(CourseComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);

        for (CourseComponent catalogComponent : courseComponents) {
            //控制显示格式
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    //打印空格控制格式
                    System.out.print("  ");
                }
                for (int i = 0; i < this.level; i++) {
                    //每一行开始打印一个+号
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            //打印标题
            catalogComponent.print();
        }
    }
}
