package chain;

import chain.handler.*;
import chain.request.Request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public class RequestHandlerChain implements Handler {
    private AbstractHandler handlerChain;

    public RequestHandlerChain() {
        buildChain();
    }

    private void buildChain() {
        this.handlerChain = new SpamHandler(new FanHandler(new ComplaintHandler(new NewLocHandler(null))));
    }

    @Override
    public void handleRequest(Request request) {
        handlerChain.handleRequest(request);
    }
}
