package me.ely.action.observer;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class CurrentConditionsDisplay implements Observer {

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}
