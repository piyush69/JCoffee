import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23141718 {
public MyHelperClass NLS;
	public MyHelperClass checkAdminPermission(AbstractBundle o0){ return null; }
	public MyHelperClass findBundleEntry(URL o0, AbstractBundle o1){ return null; }

    protected URLConnection openConnection(URL url) throws IOException {
        MyHelperClass bundleEntry = new MyHelperClass();
        if (bundleEntry != null) return ((URLConnection)(Object)new BundleURLConnection(url, bundleEntry));
        String bidString = url.getHost();
        if (bidString == null) {
            MyHelperClass AdaptorMsg = new MyHelperClass();
            throw new IOException((String)(Object)NLS.bind(AdaptorMsg.URL_NO_BUNDLE_ID, url.toExternalForm()));
        }
        AbstractBundle bundle = null;
        long bundleID;
        try {
            bundleID = Long.parseLong(bidString);
        } catch (NumberFormatException nfe) {
            MyHelperClass AdaptorMsg = new MyHelperClass();
            throw new MalformedURLException((String)(Object)NLS.bind(AdaptorMsg.URL_INVALID_BUNDLE_ID, bidString));
        }
        MyHelperClass context = new MyHelperClass();
        bundle = (AbstractBundle)(AbstractBundle)(Object) context.getBundle(bundleID);
        MyHelperClass SECURITY_AUTHORIZED = new MyHelperClass();
        if (!url.getAuthority().equals(SECURITY_AUTHORIZED)) {
            checkAdminPermission(bundle);
        }
        if (bundle == null) {
            MyHelperClass AdaptorMsg = new MyHelperClass();
            throw new IOException((String)(Object)NLS.bind(AdaptorMsg.URL_NO_BUNDLE_FOUND, url.toExternalForm()));
        }
        return ((URLConnection)(Object)new BundleURLConnection(url, findBundleEntry(url, bundle)));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL_NO_BUNDLE_ID;
	public MyHelperClass URL_NO_BUNDLE_FOUND;
	public MyHelperClass URL_INVALID_BUNDLE_ID;
public MyHelperClass getBundle(long o0){ return null; }
	public MyHelperClass bind(MyHelperClass o0, String o1){ return null; }}

class AbstractBundle {

}

class BundleURLConnection {

BundleURLConnection(URL o0, MyHelperClass o1){}
	BundleURLConnection(){}}
