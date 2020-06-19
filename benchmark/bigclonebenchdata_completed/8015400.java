import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8015400 {
public MyHelperClass createFormDataString(String o0, Datum o1, Datum o2, StringBuffer o3){ return null; }
public MyHelperClass lastRequestURL;
	public MyHelperClass server;
	public MyHelperClass DasLogger;
	public MyHelperClass isLegacyStream(){ return null; }
	public MyHelperClass processLegacyStream(InputStream o0){ return null; }

    protected synchronized InputStream openURLConnection(StreamDataSetDescriptor dsd, Datum start, Datum end, StringBuffer additionalFormData) throws Throwable, DasException {
        String[] tokens =(String[])(Object) dsd.getDataSetID().split("\\?|\\&");
        String dataSetID = tokens[1];
        try {
            String formData =(String)(Object) createFormDataString(dataSetID, start, end, additionalFormData);
            if ((boolean)(Object)dsd.isRestrictedAccess()) {
                MyHelperClass key = new MyHelperClass();
                key = server.getKey("");
//                MyHelperClass key = new MyHelperClass();
                if (key != null) {
//                    MyHelperClass key = new MyHelperClass();
                    formData += "&key=" + URLEncoder.encode(key.toString(), "UTF-8");
                }
            }
            MyHelperClass redirect = new MyHelperClass();
            if ((boolean)(Object)redirect) {
                formData += "&redirect=1";
            }
            URL serverURL =(URL)(Object) this.server.getURL(formData);
            this.lastRequestURL =(MyHelperClass)(Object) String.valueOf(serverURL);
            DasLogger.getLogger(DasLogger.DATA_TRANSFER_LOG).info("opening " + serverURL.toString());
            URLConnection urlConnection = serverURL.openConnection();
            urlConnection.connect();
            String contentType = urlConnection.getContentType();
            if (!contentType.equalsIgnoreCase("application/octet-stream")) {
                BufferedReader bin = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String line = bin.readLine();
                String message = "";
                while (line != null) {
                    message = message.concat(line);
                    line = bin.readLine();
                }
                throw new DasIOException(message);
            }
            InputStream in = urlConnection.getInputStream();
            if ((boolean)(Object)isLegacyStream()) {
                return(InputStream)(Object) processLegacyStream(in);
            } else {
                throw new UnsupportedOperationException();
            }
        } catch (IOException e) {
            throw new DasIOException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DATA_TRANSFER_LOG;
public MyHelperClass split(String o0){ return null; }
	public MyHelperClass getKey(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getURL(String o0){ return null; }
	public MyHelperClass getLogger(MyHelperClass o0){ return null; }}

class StreamDataSetDescriptor {

public MyHelperClass getDataSetID(){ return null; }
	public MyHelperClass isRestrictedAccess(){ return null; }}

class Datum {

}

class DasException extends Exception{
	public DasException(String errorMessage) { super(errorMessage); }
}

class DasIOException extends Exception{
	public DasIOException(String errorMessage) { super(errorMessage); }
}
