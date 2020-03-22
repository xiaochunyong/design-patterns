package me.ely.action.mediator;

import me.ely.action.mediator.colleague.Alarm;
import me.ely.action.mediator.colleague.Calendar;
import me.ely.action.mediator.colleague.CoffeePot;
import me.ely.action.mediator.colleague.Sprinkler;


/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calendar calendar = new Calendar();
        Sprinkler sprinkler = new Sprinkler();


        Mediator mediator = new ConcreteMediator(alarm, coffeePot, calendar, sprinkler);
        alarm.onEvent(mediator);
    }
}
