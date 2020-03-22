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
public class ConcreteMediator extends Mediator {

    private Alarm alarm;
    private CoffeePot coffeePot;
    private Calendar calendar;
    private Sprinkler sprinkler;

    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calendar calendar, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calendar = calendar;
        this.sprinkler = sprinkler;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "coffeePot":
                doCoffeePotEvent();
                break;
            case "calendar":
                doCalenderEvent();
                break;
            case "sprinkler":
                doSprinklerEvent();
                break;
        }
    }

    public void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calendar.doCalendar();
        sprinkler.doSprinkler();
    }

    public void doCoffeePotEvent() {
        // ...
    }

    public void doCalenderEvent() {
        // ...
    }

    public void doSprinklerEvent() {
        // ...
    }

}
