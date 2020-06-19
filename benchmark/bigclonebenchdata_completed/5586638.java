import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5586638 {
public MyHelperClass setConfidential(boolean o0){ return null; }
public MyHelperClass Engine;
	public MyHelperClass connection;
	public MyHelperClass responseHeadersAdded;
	public MyHelperClass getHelper(){ return null; }

    public  c5586638(HttpClientHelper helper, String method, String requestUri, boolean hasEntity) throws Throwable, IOException {
        super(helper, method, requestUri);
        if (requestUri.startsWith("http")) {
            URL url = new URL(requestUri);
            this.connection =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (HttpURLConnection) url.openConnection();
            int majorVersionNumber =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Engine.getJavaMajorVersion();
            int minorVersionNumber =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Engine.getJavaMinorVersion();
            if ((majorVersionNumber > 1) || (majorVersionNumber == 1 && minorVersionNumber >= 5)) {
                this.connection.setConnectTimeout(getHelper().getConnectTimeout());
                this.connection.setReadTimeout(getHelper().getReadTimeout());
            }
            this.connection.setAllowUserInteraction(getHelper().isAllowUserInteraction());
            this.connection.setDoOutput(hasEntity);
            this.connection.setInstanceFollowRedirects(getHelper().isFollowRedirects());
            this.connection.setUseCaches(getHelper().isUseCaches());
            this.responseHeadersAdded =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) false;
            setConfidential((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(HttpsURLConnection)(Object)this.connection instanceof HttpsURLConnection);
        } else {
            throw new IllegalArgumentException("Only HTTP or HTTPS resource URIs are allowed here");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isAllowUserInteraction(){ return null; }
	public MyHelperClass isFollowRedirects(){ return null; }
	public MyHelperClass setAllowUserInteraction(MyHelperClass o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(MyHelperClass o0){ return null; }
	public MyHelperClass isUseCaches(){ return null; }
	public MyHelperClass setUseCaches(MyHelperClass o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getJavaMajorVersion(){ return null; }
	public MyHelperClass getReadTimeout(){ return null; }
	public MyHelperClass getJavaMinorVersion(){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getConnectTimeout(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }}

class HttpClientHelper {

}

class Object {

Object(){}
	Object(HttpClientHelper o0, String o1, String o2){}}

class HttpsURLConnection {

}
