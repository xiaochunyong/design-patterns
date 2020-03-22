package me.ely.action.visitor;

import me.ely.action.visitor.element.Customer;
import me.ely.action.visitor.element.Item;
import me.ely.action.visitor.element.Order;
import me.ely.action.visitor.visitor.GeneralReport;
import me.ely.action.visitor.visitor.Visitor;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {
    public static void main(String[] args) {
        Customer customer1 = new Customer("customer1");
        customer1.addOrder(new Order("order1", "item1"));
        customer1.addOrder(new Order("order2", "item1"));
        customer1.addOrder(new Order("order3", "item1"));


        Order order = new Order("order_a");
        order.addItem(new Item("item_a1"));
        order.addItem(new Item("item_a2"));
        order.addItem(new Item("item_a3"));

        Customer customer2 = new Customer("customer2");
        customer2.addOrder(order);


        CustomerGroup customerGroup = new CustomerGroup();
        customerGroup.addCustomer(customer1);
        customerGroup.addCustomer(customer2);


        Visitor visitor = new GeneralReport();
        customerGroup.accept(visitor);

        ((GeneralReport) visitor).displayResult();
    }
}
