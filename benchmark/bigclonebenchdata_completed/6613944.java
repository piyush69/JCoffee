import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6613944 {
public static MyHelperClass _unmarshalObject(OvalDefinitions o0, InputStream o1){ return null; }
public static MyHelperClass _getDatastore(){ return null; }
	public static MyHelperClass _toURL(String o0){ return null; }
//	public MyHelperClass _unmarshalObject(OvalDefinitions o0, InputStream o1){ return null; }
//public MyHelperClass _toURL(String o0){ return null; }
//	public MyHelperClass _getDatastore(){ return null; }

    public static String installOvalDefinitions(final String xml_location)  throws Throwable {
        InputStream in_stream = null;
        try {
            URL url =(URL)(Object) _toURL(xml_location);
            if (url == null) {
                in_stream = new FileInputStream(xml_location);
            } else {
                in_stream = url.openStream();
            }
        } catch (IOException ex) {
            throw new OvalException((String)(Object)ex);
        }
        Class<OvalDefinitions> type = OvalDefinitions.class;
        OvalDefinitions object =(OvalDefinitions)(Object) _unmarshalObject((OvalDefinitions)(Object)type, in_stream);
        String pid =(String)(Object) _getDatastore().save((OvalDefinitions)(Object)type, object);
        return pid;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass save(OvalDefinitions o0, OvalDefinitions o1){ return null; }}

class OvalException extends Exception{
	public OvalException(String errorMessage) { super(errorMessage); }
}

class OvalDefinitions {

}
