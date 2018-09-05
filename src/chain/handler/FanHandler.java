package chain.handler;

import chain.request.Request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public class FanHandler extends AbstractHandler {
    public FanHandler(AbstractHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request != null) {
            if (Request.FAN_TYPE.equals(request.getType())) {
                System.out.println("Fan-Handler handle the request");
            } else {
                next.handleRequest(request);
            }
        }
    }
}
