package april.pattern.structural.composite.general.safe;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author yanzx
 */
public class Composite extends Component {

    private List<Component> component;

    public Composite(String name) {
        super(name);
        this.component = Lists.newArrayList();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : this.component) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Component component) {
        return this.component.add(component);
    }


    public boolean removeChild(Component component) {
        return this.component.remove(component);
    }


    public Component getChild(int index) {
        return this.component.get(index);
    }
}
