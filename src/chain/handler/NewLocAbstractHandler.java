package chain.handler;

import chain.request.Request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public class NewLocAbstractHandler extends AbstractHandler {
    public NewLocAbstractHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request != null) {
            if (Request.NEW_LOCATION_TYPE.equals(request.getType())) {
                System.out.println("New-Location-Handler handle the request");
            } else {
                next.handleRequest(request);
            }
        }
    }
}
