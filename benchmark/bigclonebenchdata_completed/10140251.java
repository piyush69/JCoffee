import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10140251 {
public MyHelperClass NSForwardException;
	public MyHelperClass ERXFileUtilities;
	public MyHelperClass bindingKeys(){ return null; }
	public MyHelperClass valueForBinding(String o0){ return null; }
	public MyHelperClass url(){ return null; }

    protected String contentString()  throws Throwable {
        String result = null;
        URL url;
        String encoding = null;
        try {
            url =(URL)(Object) url();
            URLConnection connection = url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(false);
            connection.setUseCaches(false);
            for (Enumeration e =(Enumeration)(Object) bindingKeys().objectEnumerator(); e.hasMoreElements(); ) {
                String key = (String) e.nextElement();
                if (key.startsWith("?")) {
                    connection.setRequestProperty(key.substring(1), valueForBinding(key).toString());
                }
            }
            if (connection.getContentEncoding() != null) {
                encoding = connection.getContentEncoding();
            }
            if (encoding == null) {
                encoding = (String)(String)(Object) valueForBinding("encoding");
            }
            if (encoding == null) {
                encoding = "UTF-8";
            }
            InputStream stream = connection.getInputStream();
            byte bytes[] =(byte[])(Object) ERXFileUtilities.bytesFromInputStream(stream);
            stream.close();
            result = new String(bytes, encoding);
        } catch (IOException ex) {
            throw(Throwable)(Object) NSForwardException._runtimeExceptionForThrowable(ex);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass bytesFromInputStream(InputStream o0){ return null; }
	public MyHelperClass objectEnumerator(){ return null; }
	public MyHelperClass _runtimeExceptionForThrowable(IOException o0){ return null; }}
