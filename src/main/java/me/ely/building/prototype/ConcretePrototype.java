package me.ely.building.prototype;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class ConcretePrototype extends Prototype {

    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype myClone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return field;
    }
}
