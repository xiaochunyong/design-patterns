package me.ely.action.interpreter.calc;


import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Context {

    private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

    public void assign(Variable variable, boolean value) {
        map.put(variable, new Boolean(value));
    }

    public boolean lookup(Variable variable) {
        Boolean value = map.get(variable);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
