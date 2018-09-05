package chain;

import chain.handler.*;
import chain.request.Request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public class RequstHandlerChain implements Handler {
    private AbstractHandler handlerChain;

    public RequstHandlerChain() {
        buildChain();
    }

    private void buildChain() {
        this.handlerChain = new SpamAbstractHandler(new FanAbstractHandler(new ComplaintAbstractHandler(new NewLocAbstractHandler(null))));
    }

    @Override
    public void handleRequest(Request request) {
        handlerChain.handleRequest(request);
    }
}
