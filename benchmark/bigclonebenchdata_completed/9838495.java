import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9838495 {
public MyHelperClass hasError(Element o0){ return null; }
public MyHelperClass errortext;
	public MyHelperClass error;
	public MyHelperClass errorcode;
	public MyHelperClass DOMUtil;
	public MyHelperClass results;
	public MyHelperClass agent;
	public MyHelperClass getUser(){ return null; }
	public MyHelperClass getLastRawXML(){ return null; }
	public MyHelperClass readXML(HttpURLConnection o0){ return null; }
	public MyHelperClass makeResponse(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass clearError(){ return null; }
	public MyHelperClass getHost(){ return null; }

    public void go() throws Throwable, FBConnectionException, FBErrorException, IOException {
        clearError();
        results =(MyHelperClass)(Object) new LoginResults();
        URL url = new URL((String)(Object)(int)(Object)getHost() + (int)(Object)getPath());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("X-FB-User",(String)(Object) getUser());
        conn.setRequestProperty("X-FB-Auth",(String)(Object) makeResponse());
        conn.setRequestProperty("X-FB-Mode", "Login");
        conn.setRequestProperty("X-FB-Login.ClientVersion",(String)(Object) agent);
        conn.connect();
        Element fbresponse;
        try {
            fbresponse =(Element)(Object) readXML(conn);
        } catch (FBConnectionException fbce) {
            throw fbce;
        } catch (FBErrorException fbee) {
            throw fbee;
        } catch (Exception e) {
            FBConnectionException fbce = new FBConnectionException("XML parsing failed");
            fbce.attachSubException(e);
            throw fbce;
        }
        NodeList nl =(NodeList)(Object) fbresponse.getElementsByTagName("LoginResponse");
        for (int i = 0; i < (int)(Object)nl.getLength(); i++) {
            if ((Element)(Object)nl.item(i) instanceof Element && (boolean)(Object)hasError((Element)(Element)(Object) nl.item(i))) {
                error =(MyHelperClass)(Object) true;
                FBErrorException e = new FBErrorException();
                e.setErrorCode(errorcode);
                e.setErrorText(errortext);
                throw e;
            }
        }
        results.setMessage(DOMUtil.getAllElementText(fbresponse, "Message"));
        results.setServerTime(DOMUtil.getAllElementText(fbresponse, "ServerTime"));
        NodeList quotas =(NodeList)(Object) fbresponse.getElementsByTagName("Quota");
        for (int i = 0; i < (int)(Object)quotas.getLength(); i++) {
            if ((Node)(Object)quotas.item(i) instanceof Node) {
                NodeList children =(NodeList)(Object) quotas.item(i).getChildNodes();
                for (int j = 0; j < (int)(Object)children.getLength(); j++) {
                    if ((Element)(Object)children.item(j) instanceof Element) {
                        Element working = (Element)(Element)(Object) children.item(j);
                        if (working.getNodeName().equals("Remaining")) {
                            try {
                                results.setQuotaRemaining(Long.parseLong((String)(Object)DOMUtil.getSimpleElementText(working)));
                            } catch (Exception e) {
                            }
                        }
                        if (working.getNodeName().equals("Used")) {
                            try {
                                results.setQuotaUsed(Long.parseLong((String)(Object)DOMUtil.getSimpleElementText(working)));
                            } catch (Exception e) {
                            }
                        }
                        if (working.getNodeName().equals("Total")) {
                            try {
                                results.setQuotaTotal(Long.parseLong((String)(Object)DOMUtil.getSimpleElementText(working)));
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }
        results.setRawXML(getLastRawXML());
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setServerTime(MyHelperClass o0){ return null; }
	public MyHelperClass setQuotaTotal(long o0){ return null; }
	public MyHelperClass getChildNodes(){ return null; }
	public MyHelperClass setQuotaRemaining(long o0){ return null; }
	public MyHelperClass setRawXML(MyHelperClass o0){ return null; }
	public MyHelperClass setQuotaUsed(long o0){ return null; }
	public MyHelperClass getSimpleElementText(Element o0){ return null; }
	public MyHelperClass setMessage(MyHelperClass o0){ return null; }
	public MyHelperClass getAllElementText(Element o0, String o1){ return null; }}

class FBConnectionException extends Exception{
	public FBConnectionException(String errorMessage) { super(errorMessage); }
}

class FBErrorException extends Exception{
	public FBErrorException(String errorMessage) { super(errorMessage); }
	FBErrorException(){}
}

class LoginResults {

}

class Element {

public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

}
