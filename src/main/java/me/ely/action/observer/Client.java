package me.ely.action.observer;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer o1 = new StatisticsDisplay(subject);
        Observer o2 = new CurrentConditionsDisplay(subject);
        subject.setMeasurements(1, 2, 3);
        subject.setMeasurements(2, 3, 4);
    }
}
