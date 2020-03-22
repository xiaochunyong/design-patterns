package me.ely.building.factorymethod;

import me.ely.building.factorymethod.factory.ConcreteFactory1;
import me.ely.building.factorymethod.factory.ConcreteFactory2;
import me.ely.building.factorymethod.factory.Factory;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory2();
        factory.doSomething();

    }
}
