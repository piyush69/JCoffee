import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10753830 {
public static MyHelperClass Code;
//public MyHelperClass Code;

    public static Document send(String address, Document request) throws Throwable, MalformedURLException, IOException {
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Sending request to " + address);
            MyHelperClass XMLUtil = new MyHelperClass();
            String requestString =(String)(Object) XMLUtil.transformToString(request);
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Sending Request " + requestString);
        }
        URL url = new URL(address);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "text/xml");
        connection.setDoOutput(true);
        connection.setDefaultUseCaches(false);
        connection.setRequestMethod("POST");
        connection.connect();
        OutputStream os = connection.getOutputStream();
        MyHelperClass XMLUtil = new MyHelperClass();
        XMLUtil.transformToStream(request, os);
        os.flush();
        os.close();
        if (connection.getResponseCode() != connection.HTTP_OK) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Was expecting HTTP_OK (200) but received response code: " + connection.getResponseCode());
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Message: " + connection.getResponseMessage());
            throw new LibraryException(Code.REQUEST_FAILURE, connection.getResponseCode() + " - " + connection.getResponseMessage());
        }
        BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
//        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Received Response" + sb.toString());
        }
        try {
//            MyHelperClass XMLUtil = new MyHelperClass();
            return(Document)(Object) XMLUtil.parseString(sb.toString());
        } catch (UncheckedIOException ex) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Error parsing XML Response",(SAXException)(Object) ex);
            throw new LibraryException(Code.INVALID_XML,(SAXException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INVALID_XML;
	public MyHelperClass REQUEST_FAILURE;
public MyHelperClass error(String o0, SAXException o1){ return null; }
	public MyHelperClass transformToString(Document o0){ return null; }
	public MyHelperClass parseString(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass transformToStream(Document o0, OutputStream o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Document {

}

class LibraryException extends Exception{
	public LibraryException(String errorMessage) { super(errorMessage); }
	LibraryException(MyHelperClass o0, SAXException o1){}
	LibraryException(){}
	LibraryException(MyHelperClass o0, String o1){}
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
