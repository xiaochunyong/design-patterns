package me.ely.action.observer;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);

}
