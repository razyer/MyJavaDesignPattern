package chain.handler;

import chain.request.Request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public class SpamAbstractHandler extends AbstractHandler {
    public SpamAbstractHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request != null) {
            if (Request.SPAM_TYPE.equals(request.getType())) {
                System.out.println("Spam-Handler handle the request");
            } else {
                next.handleRequest(request);
            }
        }
    }
}