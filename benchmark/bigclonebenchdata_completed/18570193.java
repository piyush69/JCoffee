import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18570193 {
public MyHelperClass ID;
public MyHelperClass StringConvertable;
	public MyHelperClass Logger;

    public Psrxml getPsrxmlForCandidateList(CandidateList clist) throws Throwable, BookKeeprCommunicationException {
        try {
            MyHelperClass httpClient = new MyHelperClass();
            synchronized (httpClient) {
                long psrxmlid =(long)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) clist.getPsrxmlId();
                MyHelperClass remoteHost = new MyHelperClass();
                HttpGet req = new HttpGet(remoteHost.getUrl() + "/id/" + ID.toString(psrxmlid));
//                MyHelperClass httpClient = new MyHelperClass();
                HttpResponse resp =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(req);
                MyHelperClass HttpStatus = new MyHelperClass();
                if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    try {
                        InputStream in =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) resp.getEntity().getContent();
                        MyHelperClass XMLReader = new MyHelperClass();
                        XMLAble xmlable =(XMLAble)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XMLReader.read(in);
                        in.close();
                        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Psrxml)(Object)xmlable instanceof Psrxml) {
                            Psrxml psrxml = (Psrxml)(Psrxml)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) xmlable;
                            return psrxml;
                        } else {
                            throw new BookKeeprCommunicationException("BookKeepr returned the wrong thing for psrxml id " + psrxmlid);
                        }
                    } catch (SAXException ex) {
                        MyHelperClass Level = new MyHelperClass();
                        Logger.getLogger(BookKeeprConnection.class.getName()).log(Level.WARNING, "Got a malformed message from the bookkeepr", ex);
                        throw new BookKeeprCommunicationException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)ex);
                    }
                } else {
                    resp.getEntity().consumeContent();
//                    MyHelperClass remoteHost = new MyHelperClass();
                    throw new BookKeeprCommunicationException("Got a " + resp.getStatusLine().getStatusCode() + " from the BookKeepr  (" + remoteHost.getUrl() + "/id/" + StringConvertable.ID + ")");
                }
            }
        } catch (HttpException ex) {
            throw new BookKeeprCommunicationException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)ex);
        } catch (IOException ex) {
            throw new BookKeeprCommunicationException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)ex);
        } catch (URISyntaxException ex) {
            throw new BookKeeprCommunicationException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ID;
	public MyHelperClass SC_OK;
	public MyHelperClass WARNING;
public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SAXException o2){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }}

class CandidateList {

public MyHelperClass getPsrxmlId(){ return null; }}

class Psrxml {

}

class BookKeeprCommunicationException extends Exception{
	public BookKeeprCommunicationException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

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

class Object {

public MyHelperClass toString(long o0){ return null; }}
