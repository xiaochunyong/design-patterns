package me.ely.action.visitor.element;

import me.ely.action.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Customer implements Element {

    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
