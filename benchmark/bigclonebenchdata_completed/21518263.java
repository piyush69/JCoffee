import java.io.*;
import java.lang.*;
import java.util.*;



class c21518263 {
public MyHelperClass NULL;
	public MyHelperClass setSize(long o0){ return null; }
public MyHelperClass setURL(String o0){ return null; }
	public MyHelperClass setRangeEnd(int o0){ return null; }
public MyHelperClass getURL(){ return null; }
public MyHelperClass head;
	public MyHelperClass log;
	public MyHelperClass AuthManager;
	public MyHelperClass auth;
	public MyHelperClass setResumable(boolean o0){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getSite(){ return null; }

    public void getDownloadInfo() throws Exception {
        DefaultHttpClient cl =(DefaultHttpClient)(Object) NULL; //new DefaultHttpClient();
        cl = new DefaultHttpClient();
        InfoAuthPromter hp = new InfoAuthPromter();
//        MyHelperClass cl = new MyHelperClass();
        cl.setCredentialsProvider(hp);
        HttpHead head =(HttpHead)(Object) NULL; //new HttpHead();
        head = new HttpHead(getURL());
//        MyHelperClass head = new MyHelperClass();
        head.setHeader("User-Agent", "test");
//        MyHelperClass head = new MyHelperClass();
        head.setHeader("Accept", "*/*");
//        MyHelperClass head = new MyHelperClass();
        head.setHeader("Range", "bytes=0-");
//        MyHelperClass head = new MyHelperClass();
        HttpResponse resp =(HttpResponse)(Object) cl.execute((MyHelperClass)(Object)head);
        MyHelperClass log = new MyHelperClass();
        log.debug("getDownloadInfo(url) - Status : " + resp.getStatusLine());
        System.out.println("----------------- RESPONSE HEADERS ------------------------");
        for (Header h :(Header[])(Object) (Object[])(Object)resp.getAllHeaders()) {
            System.out.println(h);
        }
        System.out.println("-----------------------------------------------------------\n");
        int code =(int)(Object) resp.getStatusLine().getStatusCode();
        if (code == 401) {
            throw new Exception("HTTP Authentication Failed");
        }
        AuthManager.putAuth(getSite(), auth);
        setURL(head.getURI().toString());
        log.debug("Last url: " + head.getURI());
        Header hsize =(Header)(Object) resp.getFirstHeader("Content-Length");
        Header hmod =(Header)(Object) resp.getFirstHeader("Last-Modified");
        setSize(Long.parseLong((String)(Object)hsize.getValue()));
        setRangeEnd((int)(Object)getSize() - 1);
        setResumable(code == 206);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass setCredentialsProvider(InfoAuthPromter o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass putAuth(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class InfoAuthPromter {

}

class HttpResponse {

public MyHelperClass getAllHeaders(){ return null; }
	public MyHelperClass getFirstHeader(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass setCredentialsProvider(InfoAuthPromter o0){ return null; }}

class HttpHead {

HttpHead(){}
	HttpHead(MyHelperClass o0){}
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}
