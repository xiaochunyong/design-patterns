package me.ely.building.abstractfactory;

import me.ely.building.abstractfactory.factory.AbstractFactory;
import me.ely.building.abstractfactory.factory.ConcreteFactory1;
import me.ely.building.abstractfactory.factory.ConcreteFactory2;
import me.ely.building.abstractfactory.model.AbstractProductA;
import me.ely.building.abstractfactory.model.AbstractProductB;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory2();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        System.out.println(productA);
        System.out.println(productB);
    }
}
