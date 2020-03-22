package me.ely.building.abstractfactory.factory;

import me.ely.building.abstractfactory.model.AbstractProductA;
import me.ely.building.abstractfactory.model.AbstractProductB;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
