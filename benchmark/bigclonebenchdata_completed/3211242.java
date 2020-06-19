import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3211242 {
public static MyHelperClass decodeBuffer(ByteBuffer o0, String o1){ return null; }
public static MyHelperClass Logging;
	public static MyHelperClass WWIO;
//	public MyHelperClass decodeBuffer(ByteBuffer o0, String o1){ return null; }
	public static MyHelperClass getCharsetName(String o0){ return null; }
//public MyHelperClass Logging;
//	public MyHelperClass WWIO;
//	public MyHelperClass getCharsetName(String o0){ return null; }

    public static String callService(String urlString) throws Throwable, NoItemException, ServiceException {
        if (urlString == null || urlString.length() < 1) return null;
        InputStream inputStream = null;
        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            HttpURLConnection htpc = (HttpURLConnection) connection;
            int responseCode = htpc.getResponseCode();
            String responseMessage = htpc.getResponseMessage();
            String contentType = htpc.getContentType();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputStream = connection.getInputStream();
                MyHelperClass WWIO = new MyHelperClass();
                ByteBuffer buffer =(ByteBuffer)(Object) WWIO.readStreamToBuffer(inputStream);
                String charsetName =(String)(Object) getCharsetName(contentType);
                return(String)(Object) decodeBuffer(buffer, charsetName);
            } else if (responseCode == HttpURLConnection.HTTP_BAD_REQUEST) {
                throw new NoItemException(responseMessage);
            } else {
                throw new ServiceException(responseMessage);
            }
        } catch (MalformedURLException e) {
            String msg =(String)(Object) Logging.getMessage("generic.MalformedURL", urlString);
            Logging.logger().log((Level)(Object)java.util.logging.Level.SEVERE, msg);
            throw new WWRuntimeException(msg);
        } catch (IOException e) {
            String msg =(String)(Object) Logging.getMessage("POI.ServiceError", urlString);
            Logging.logger().log((Level)(Object)java.util.logging.Level.SEVERE, msg);
            throw new ServiceException(msg);
        } finally {
            WWIO.closeStream(inputStream, urlString);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readStreamToBuffer(InputStream o0){ return null; }
	public MyHelperClass closeStream(InputStream o0, String o1){ return null; }
	public MyHelperClass getMessage(String o0, String o1){ return null; }
	public MyHelperClass log(Level o0, String o1){ return null; }
	public MyHelperClass logger(){ return null; }}

class NoItemException extends Exception{
	public NoItemException(String errorMessage) { super(errorMessage); }
}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
}

class ByteBuffer {

}

class WWRuntimeException extends Exception{
	public WWRuntimeException(String errorMessage) { super(errorMessage); }
}

class Level {

}
