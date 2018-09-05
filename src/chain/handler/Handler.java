package chain.handler;

import chain.request.Request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public interface Handler {
    void handleRequest(Request request);
}
