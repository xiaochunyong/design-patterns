package me.ely.action.iterator;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class ConcreteIterator<E> implements Iterator<E> {
    private E[] items;
    private int position = 0;

    public ConcreteIterator(E[] items) {
        this.items = items;
    }

    @Override
    public E next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
