package me.ely.building.factorymethod.factory;

import model.factory.Product;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // ....
        System.out.println(product);
    }

}
