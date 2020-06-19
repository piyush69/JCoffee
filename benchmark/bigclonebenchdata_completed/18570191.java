import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18570191 {
public MyHelperClass Logger;

    public RawCandidate getRawCandidate(long candId) throws Throwable, BookKeeprCommunicationException {
        try {
            MyHelperClass httpClient = new MyHelperClass();
            synchronized (httpClient) {
                MyHelperClass remoteHost = new MyHelperClass();
                HttpGet req = new HttpGet(remoteHost.getUrl() + "/cand/" + Long.toHexString(candId));
                req.setHeader("Accept-Encoding", "gzip");
//                MyHelperClass httpClient = new MyHelperClass();
                HttpResponse resp =(HttpResponse)(Object) httpClient.execute(req);
                MyHelperClass HttpStatus = new MyHelperClass();
                if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    try {
                        InputStream in =(InputStream)(Object) resp.getEntity().getContent();
                        Header hdr =(Header)(Object) resp.getFirstHeader("Content-Encoding");
                        String enc = "";
                        if (hdr != null) {
                            enc =(String)(Object) resp.getFirstHeader("Content-Encoding").getValue();
                        }
                        if (enc.equals("gzip")) {
                            in =(InputStream)(Object) new GZIPInputStream(in);
                        }
                        MyHelperClass XMLReader = new MyHelperClass();
                        XMLAble xmlable =(XMLAble)(Object) XMLReader.read(in);
                        in.close();
                        if ((RawCandidate)(Object)xmlable instanceof RawCandidate) {
                            RawCandidate p = (RawCandidate)(RawCandidate)(Object) xmlable;
                            return p;
                        } else {
                            throw new BookKeeprCommunicationException("BookKeepr returned the wrong thing for candId");
                        }
                    } catch (UncheckedIOException ex) {
                        MyHelperClass Level = new MyHelperClass();
                        Logger.getLogger(BookKeeprConnection.class.getName()).log(Level.WARNING, "Got a malformed message from the bookkeepr",(SAXException)(Object) ex);
                        throw new BookKeeprCommunicationException((String)(Object)ex);
                    }
                } else {
                    resp.getEntity().consumeContent();
                    throw new BookKeeprCommunicationException("Got a " + resp.getStatusLine().getStatusCode() + " from the BookKeepr");
                }
            }
        } catch (UncheckedIOException ex) {
            throw new BookKeeprCommunicationException((String)(Object)ex);
        } catch (IOException ex) {
            throw new BookKeeprCommunicationException((String)(Object)ex);
        } catch (ArithmeticException ex) {
            throw new BookKeeprCommunicationException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass WARNING;
public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SAXException o2){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class RawCandidate {

}

class BookKeeprCommunicationException extends Exception{
	public BookKeeprCommunicationException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(){}
	HttpGet(String o0){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getFirstHeader(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class Header {

}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(InputStream o0){}}

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
