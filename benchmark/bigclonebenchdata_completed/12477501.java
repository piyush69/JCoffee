import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12477501 {
public MyHelperClass TAG;
public MyHelperClass Log;
	public MyHelperClass executeWithoutRewriting(HttpUriRequest o0, HttpContext o1){ return null; }
	public MyHelperClass wrapRequest(HttpUriRequest o0){ return null; }

    public HttpResponse execute(HttpUriRequest request, HttpContext context) throws Throwable, IOException {
        URI uri =(URI)(Object) request.getURI();
        String original = uri.toString();
        MyHelperClass mResolver = new MyHelperClass();
        UrlRules rules =(UrlRules)(Object) UrlRules.getRules(mResolver);
        Rule rule =(Rule)(Object) rules.matchRule(original);
        String rewritten =(String)(Object) rule.apply(original);
        if (rewritten == null) {
            MyHelperClass TAG = new MyHelperClass();
            Log.w(TAG, "Blocked by " + rule.mName + ": " + original);
            throw new BlockedRequestException((String)(Object)rule);
        } else if (rewritten == original) {
            return(HttpResponse)(Object) executeWithoutRewriting(request, context);
        }
        try {
            uri = new URI(rewritten);
        } catch (URISyntaxException e) {
            throw new RuntimeException("Bad URL from rule: " + rule.mName, e);
        }
        RequestWrapper wrapper =(RequestWrapper)(Object) wrapRequest(request);
        wrapper.setURI(uri);
        request =(HttpUriRequest)(Object) wrapper;
        MyHelperClass LOCAL_LOGV = new MyHelperClass();
        if ((boolean)(Object)LOCAL_LOGV) Log.v(TAG, "Rule " + rule.mName + ": " + original + " -> " + rewritten);
        return(HttpResponse)(Object) executeWithoutRewriting(request, context);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass v(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1){ return null; }}

class HttpUriRequest {

public MyHelperClass getURI(){ return null; }}

class HttpContext {

}

class HttpResponse {

}

class UrlRules {

public MyHelperClass matchRule(String o0){ return null; }
	public static MyHelperClass getRules(MyHelperClass o0){ return null; }}

class BlockedRequestException extends Exception{
	public BlockedRequestException(String errorMessage) { super(errorMessage); }
}

class RequestWrapper {

public MyHelperClass setURI(URI o0){ return null; }}

class Rule {
public MyHelperClass mName;
public MyHelperClass apply(String o0){ return null; }}
