import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12803512 {
public MyHelperClass SOME_STATIC_KRAMERIUS_PAGE;
	public MyHelperClass ServerUtils;

//    @Override
    public CheckAvailabilityResult execute(final CheckAvailabilityAction action, final ExecutionContext context) throws Throwable, ActionException {
        MyHelperClass LOGGER = new MyHelperClass();
        if ((boolean)(Object)LOGGER.isDebugEnabled()) {
            String serverName = null;
            MyHelperClass CheckAvailability = new MyHelperClass();
            if (action.getServerId() == CheckAvailability.FEDORA_ID) {
                serverName = "fedora";
//            MyHelperClass CheckAvailability = new MyHelperClass();
            } else if (action.getServerId() == CheckAvailability.KRAMERIUS_ID) {
                serverName = "kramerius";
            }
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug("Processing action: CheckAvailability: " + serverName);
        }
        MyHelperClass httpSessionProvider = new MyHelperClass();
        ServerUtils.checkExpiredSession(httpSessionProvider);
        boolean status = true;
        String url = null;
        String usr = "";
        String pass = "";
        MyHelperClass CheckAvailability = new MyHelperClass();
        if (action.getServerId() == CheckAvailability.FEDORA_ID) {
            MyHelperClass configuration = new MyHelperClass();
            url =(String)(Object) configuration.getFedoraHost();
//            MyHelperClass configuration = new MyHelperClass();
            usr =(String)(Object) configuration.getFedoraLogin();
//            MyHelperClass configuration = new MyHelperClass();
            pass =(String)(Object) configuration.getFedoraPassword();
//        MyHelperClass CheckAvailability = new MyHelperClass();
        } else if (action.getServerId() == CheckAvailability.KRAMERIUS_ID) {
            MyHelperClass configuration = new MyHelperClass();
            url =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) configuration.getKrameriusHost() + (int)(Object)SOME_STATIC_KRAMERIUS_PAGE;
        } else {
            throw new ActionException("Unknown server id");
        }
        try {
            MyHelperClass RESTHelper = new MyHelperClass();
            URLConnection con =(URLConnection)(Object) RESTHelper.openConnection(url, usr, pass, false);
            if (con instanceof HttpURLConnection) {
                HttpURLConnection httpConnection = (HttpURLConnection) con;
                int resp = httpConnection.getResponseCode();
                if (resp < 200 || resp >= 308) {
                    status = false;
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.info("Server " + url + " answered with HTTP code " + httpConnection.getResponseCode());
                }
            } else {
                status = false;
            }
        } catch (MalformedURLException e) {
            status = false;
            e.printStackTrace();
        } catch (IOException e) {
            status = false;
            e.printStackTrace();
        }
        return new CheckAvailabilityResult(status, url);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FEDORA_ID;
	public MyHelperClass KRAMERIUS_ID;
public MyHelperClass checkExpiredSession(MyHelperClass o0){ return null; }
	public MyHelperClass getFedoraPassword(){ return null; }
	public MyHelperClass openConnection(String o0, String o1, String o2, boolean o3){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getKrameriusHost(){ return null; }
	public MyHelperClass getFedoraHost(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getFedoraLogin(){ return null; }}

class CheckAvailabilityAction {

public MyHelperClass getServerId(){ return null; }}

class ExecutionContext {

}

class CheckAvailabilityResult {

CheckAvailabilityResult(boolean o0, String o1){}
	CheckAvailabilityResult(){}}

class ActionException extends Exception{
	public ActionException(String errorMessage) { super(errorMessage); }
}
