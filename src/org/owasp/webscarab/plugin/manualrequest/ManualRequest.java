package org.owasp.webscarab.plugin.manualrequest;

/*
 * $Id: ManualRequest.java,v 1.1 2003/09/15 11:20:38 rogan Exp $
 */

import org.owasp.webscarab.httpclient.URLFetcher;
import org.owasp.webscarab.model.Request;
import org.owasp.webscarab.model.Response;
import org.owasp.webscarab.model.CookieJar;
import org.owasp.webscarab.plugin.Plug;
import org.owasp.webscarab.plugin.AbstractWebScarabPlugin;

public class ManualRequest extends AbstractWebScarabPlugin {
    
    private Plug _plug = null;
    private CookieJar _cookieJar = null;
    
    public ManualRequest(Plug plug) {
        _plug = plug;
        _cookieJar = plug.getCookieJar();
        
        System.err.println("ManualRequest initialised");
    }
    
    /** The plugin name
     * @return The name of the plugin
     *
     */
    public String getPluginName() {
        return new String("Manual Request");
    }
    
    public Response fetchResponse(Request request) {
        if (request != null) {
            URLFetcher uf = new URLFetcher();
            Response response = uf.fetchResponse(request);
            if (response != null) {
                response.readContentStream();
                _plug.addConversation(request, response);
                return response;
            }
        }
        System.err.println("null request or response");
        return null;
    }
    
    public void addRequestCookies(Request request) {
        _cookieJar.addRequestCookies(request);
    }
    
    public void updateCookies(Response response) {
        _cookieJar.updateCookies(response);
    }
    
}