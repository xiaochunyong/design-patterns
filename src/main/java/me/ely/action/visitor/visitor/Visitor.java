package me.ely.action.visitor.visitor;

import me.ely.action.visitor.element.Customer;
import me.ely.action.visitor.element.Item;
import me.ely.action.visitor.element.Order;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public interface Visitor {

    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);

}
