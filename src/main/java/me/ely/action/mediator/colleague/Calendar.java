package me.ely.action.mediator.colleague;

import me.ely.action.mediator.Mediator;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Calendar extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calendar");
    }

    public void doCalendar() {
        System.out.println("doCalendar()");
    }
}
