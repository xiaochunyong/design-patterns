package me.ely.action.iterator;


/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class ConcreteAggregate implements Aggregate<Integer> {

    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
