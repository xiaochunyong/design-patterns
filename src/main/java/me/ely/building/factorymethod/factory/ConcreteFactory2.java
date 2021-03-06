package me.ely.building.factorymethod.factory;

import model.factory.ConcreteProduct2;
import model.factory.Product;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class ConcreteFactory2 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
