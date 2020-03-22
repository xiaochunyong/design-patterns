package me.ely.struct.composite;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("leaf: " + name);
    }

    @Override
    void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
