package chain;

import chain.request.Request;

/**
 * 责任链模式
 *
 * @author tanzhen
 * @date 2018/9/5
 */
public class Main {
    public static void main(String[] args) {
        RequestHandlerChain requestHandlerChain = new RequestHandlerChain();
        Request spamRequest = new Request(Request.SPAM_TYPE, "SPAM");
        Request fanRequest = new Request(Request.FAN_TYPE, "FAN");
        Request complaintRequest = new Request(Request.COMPLAINT_TYPE, "COMPLAINT");
        Request newLocRequest = new Request(Request.NEW_LOCATION_TYPE, "New Location");

        requestHandlerChain.handleRequest(spamRequest);
        requestHandlerChain.handleRequest(fanRequest);
        requestHandlerChain.handleRequest(complaintRequest);
        requestHandlerChain.handleRequest(newLocRequest);
    }
}
