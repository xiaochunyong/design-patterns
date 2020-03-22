package me.ely.action.visitor.element;

import me.ely.action.visitor.visitor.Visitor;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public interface Element {
    void accept(Visitor visitor);
}
