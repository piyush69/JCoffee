import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18570192 {
public MyHelperClass Logger;

    public List<CandidateListStub> getAllCandLists() throws Throwable, BookKeeprCommunicationException {
        try {
            MyHelperClass httpClient = new MyHelperClass();
            synchronized (httpClient) {
                MyHelperClass remoteHost = new MyHelperClass();
                HttpGet req = new HttpGet(remoteHost.getUrl() + "/cand/lists");
//                MyHelperClass httpClient = new MyHelperClass();
                HttpResponse resp =(HttpResponse)(Object) httpClient.execute(req);
                MyHelperClass HttpStatus = new MyHelperClass();
                if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    try {
                        InputStream in =(InputStream)(Object) resp.getEntity().getContent();
                        MyHelperClass XMLReader = new MyHelperClass();
                        XMLAble xmlable =(XMLAble)(Object) XMLReader.read(in);
                        in.close();
                        if ((CandidateListIndex)(Object)xmlable instanceof CandidateListIndex) {
                            CandidateListIndex idx = (CandidateListIndex)(CandidateListIndex)(Object) xmlable;
                            return(List<CandidateListStub>)(Object) idx.getCandidateListStubList();
                        } else {
                            throw new BookKeeprCommunicationException("BookKeepr returned the wrong thing for /cand/lists");
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
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class CandidateListStub {

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

class CandidateListIndex {

public MyHelperClass getCandidateListStubList(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class BookKeeprConnection {

}
