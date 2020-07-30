package april.pattern.structural.composite.general.safe;

/**
 * @author yanzx
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
