package me.ely.building.simpefactory;

import model.factory.ConcreteProduct;
import model.factory.ConcreteProduct1;
import model.factory.ConcreteProduct2;
import model.factory.Product;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class SimpleFactory {

    public static Product createProduct(int type) {
        Product product;
        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct();
        }
        return product;
    }
}
