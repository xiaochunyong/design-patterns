package me.ely.building.abstractfactory.factory;

import me.ely.building.abstractfactory.model.AbstractProductA;
import me.ely.building.abstractfactory.model.AbstractProductB;
import me.ely.building.abstractfactory.model.ProductA2;
import me.ely.building.abstractfactory.model.ProductB2;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class ConcreteFactory2 extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
