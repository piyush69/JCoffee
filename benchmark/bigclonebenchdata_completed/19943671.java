import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19943671 {
public MyHelperClass URIConverter;
	public MyHelperClass getResponse(Map<CAP#1 o0, CAP#2 o1){ return null; }

    public InputStream createInputStream(URI uri, Map<?, ?> options) throws Throwable, IOException {
        try {
            URL url = new URL(uri.toString());
            final URLConnection urlConnection = url.openConnection();
            InputStream result = urlConnection.getInputStream();
            Map<Object, Object> response = getResponse(options);
            if (response != null) {
                response.put(URIConverter.RESPONSE_TIME_STAMP_PROPERTY, urlConnection.getLastModified());
            }
            return result;
        } catch (RuntimeException exception) {
            throw new IOWrappedException(exception);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
