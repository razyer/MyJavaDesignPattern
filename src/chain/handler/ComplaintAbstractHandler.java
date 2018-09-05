package chain.handler;

import chain.request.Request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public class ComplaintAbstractHandler extends AbstractHandler {
    public ComplaintAbstractHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request != null) {
            if (Request.COMPLAINT_TYPE.equals(request.getType())) {
                System.out.println("Complaint-Handler handle the request");
            } else {
                next.handleRequest(request);
            }
        }
    }
}
