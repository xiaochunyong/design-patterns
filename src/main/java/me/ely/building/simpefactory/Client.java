package me.ely.building.simpefactory;

import model.factory.Product;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Client {
    public static void main(String[] args) {
        int type = 1;
        Product product = SimpleFactory.createProduct(type);
        // do something with the product;
    }
}
