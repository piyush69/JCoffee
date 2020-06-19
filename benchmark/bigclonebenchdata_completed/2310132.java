import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2310132 {
public MyHelperClass changeState(MyHelperClass o0, int o1, Object o2, Object o3){ return null; }
public MyHelperClass connection;
	public MyHelperClass requestURL;
	public MyHelperClass requestUserName;
	public MyHelperClass proxy;
	public MyHelperClass requestPassword;
	public MyHelperClass HttpRequest;
	public MyHelperClass requestMethod;
	public MyHelperClass isAsync;
	public MyHelperClass abort(){ return null; }

    public void open(final String method, final java.net.URL url, boolean asyncFlag, final String userName, final String password) throws java.io.IOException {
        this.abort();
        Proxy proxy =(Proxy)(Object) this.proxy;
        URLConnection c = proxy == null || proxy == Proxy.NO_PROXY ? url.openConnection() : url.openConnection(proxy);
        synchronized (this) {
            this.connection =(MyHelperClass)(Object) c;
            this.isAsync =(MyHelperClass)(Object) asyncFlag;
            this.requestMethod =(MyHelperClass)(Object) method;
            this.requestURL =(MyHelperClass)(Object) url;
            this.requestUserName =(MyHelperClass)(Object) userName;
            this.requestPassword =(MyHelperClass)(Object) password;
        }
        this.changeState(HttpRequest.STATE_LOADING, 0, null, null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STATE_LOADING;
}
