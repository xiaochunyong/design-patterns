package me.ely.action.visitor;

import me.ely.action.visitor.element.Customer;
import me.ely.action.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
