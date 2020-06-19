import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18570190 {
public MyHelperClass Logger;

    public Processing getProcess(long processId) throws Throwable, BookKeeprCommunicationException {
        try {
            MyHelperClass httpClient = new MyHelperClass();
            synchronized (httpClient) {
                MyHelperClass remoteHost = new MyHelperClass();
                HttpGet req = new HttpGet(remoteHost.getUrl() + "/id/" + Long.toHexString(processId));
//                MyHelperClass httpClient = new MyHelperClass();
                HttpResponse resp =(HttpResponse)(Object) httpClient.execute(req);
                MyHelperClass HttpStatus = new MyHelperClass();
                if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    try {
                        MyHelperClass XMLReader = new MyHelperClass();
                        XMLAble xmlable =(XMLAble)(Object) XMLReader.read(resp.getEntity().getContent());
                        if ((Processing)(Object)xmlable instanceof Processing) {
                            Processing p = (Processing)(Processing)(Object) xmlable;
                            return p;
                        } else {
                            throw new BookKeeprCommunicationException("BookKeepr returned the wrong thing for pointingID");
                        }
                    } catch (ArithmeticException ex) {
                        MyHelperClass Level = new MyHelperClass();
                        Logger.getLogger(BookKeeprConnection.class.getName()).log(Level.WARNING, "Got a malformed message from the bookkeepr",(SAXException)(Object) ex);
                        throw new BookKeeprCommunicationException((String)(Object)ex);
                    }
                } else {
                    resp.getEntity().consumeContent();
                    throw new BookKeeprCommunicationException("Got a " + resp.getStatusLine().getStatusCode() + " from the BookKeepr");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new BookKeeprCommunicationException((String)(Object)ex);
        } catch (ArrayStoreException ex) {
            throw new BookKeeprCommunicationException((String)(Object)ex);
        } catch (ClassCastException ex) {
            throw new BookKeeprCommunicationException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass SC_OK;
public MyHelperClass getUrl(){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SAXException o2){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class Processing {

}

class BookKeeprCommunicationException extends Exception{
	public BookKeeprCommunicationException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class XMLAble {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class BookKeeprConnection {

}
