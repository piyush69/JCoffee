import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9806128 {
public MyHelperClass LOG;
	public MyHelperClass MD;
	public MyHelperClass _intrinsicValuesByAttribute;
	public MyHelperClass url(){ return null; }

    private void _readValuesFromNetwork()  throws Throwable {
        MyHelperClass _intrinsicValuesByAttribute = new MyHelperClass();
        if (_intrinsicValuesByAttribute == null) {
            NSMutableDictionary values = new NSMutableDictionary(3);
            values.setObjectForKey(Boolean.FALSE, "NetworkFailure");
            try {
                URLConnection connection =(URLConnection)(Object) url().openConnection();
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpconnect = (HttpURLConnection) connection;
                    httpconnect.setRequestMethod("HEAD");
                    switch(httpconnect.getResponseCode()) {
                        case HttpURLConnection.HTTP_OK:
                        case HttpURLConnection.HTTP_MOVED_PERM:
                        case HttpURLConnection.HTTP_MOVED_TEMP:
                        case HttpURLConnection.HTTP_NOT_MODIFIED:
                            values.setObjectForKey(Boolean.TRUE, MD.FSExists);
                            break;
                        default:
                            values.setObjectForKey(Boolean.FALSE, MD.FSExists);
                    }
                    LOG.info("_readValuesFromNetwork: " + httpconnect.toString());
                    values.setObjectForKey(new NSTimestamp(httpconnect.getLastModified()), MD.FSContentChangeDate);
                    values.setObjectForKey(new Integer(httpconnect.getContentLength()), MD.FSSize);
                } else {
                    values.setObjectForKey(Boolean.FALSE, MD.FSExists);
                }
            } catch (Exception x) {
                values.setObjectForKey(Boolean.FALSE, MD.FSExists);
                values.setObjectForKey(Boolean.TRUE, "NetworkFailure");
            }
            _intrinsicValuesByAttribute =(MyHelperClass)(Object) values;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FSExists;
	public MyHelperClass FSSize;
	public MyHelperClass FSContentChangeDate;
public MyHelperClass openConnection(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class NSMutableDictionary {

NSMutableDictionary(){}
	NSMutableDictionary(int o0){}
	public MyHelperClass setObjectForKey(Boolean o0, MyHelperClass o1){ return null; }
	public MyHelperClass setObjectForKey(Boolean o0, String o1){ return null; }
	public MyHelperClass setObjectForKey(Integer o0, MyHelperClass o1){ return null; }
	public MyHelperClass setObjectForKey(NSTimestamp o0, MyHelperClass o1){ return null; }}

class NSTimestamp {

NSTimestamp(long o0){}
	NSTimestamp(){}}
