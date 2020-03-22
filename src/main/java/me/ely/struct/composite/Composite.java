package me.ely.struct.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Composite extends Component {

    private List<Component> childs;

    public Composite(String name) {
        super(name);
        childs = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("Composite: " + name);
        for (Component component : childs) {
            component.print(level + 1);
        }
    }

    @Override
    void add(Component component) {
        this.childs.add(component);
    }

    @Override
    void remove(Component component) {
        this.childs.remove(component);
    }
}
