package me.ely.action.chainofresponsibility;

import model.action.Request;
import model.action.RequestType;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/19
 */
public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println(request.getName() + " is handler by ConcreteHandler2");
            return;
        }

        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
