package me.ely.action.iterator;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public interface Aggregate<E> {
    Iterator<E> createIterator();
}
