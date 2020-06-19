import java.io.*;
import java.lang.*;
import java.util.*;



class c21817380 {
public MyHelperClass NULL;
public MyHelperClass setURL(String o0){ return null; }
	public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass setRangeEnd(int o0){ return null; }
public MyHelperClass head;
	public MyHelperClass ent;
	public MyHelperClass AuthManager;
	public MyHelperClass auth;
	public MyHelperClass setResumable(boolean o0){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getSite(){ return null; }

    public void getDownloadInfo(String _url) throws Exception {
        DefaultHttpClient cl =(DefaultHttpClient)(Object) NULL; //new DefaultHttpClient();
        cl = new DefaultHttpClient();
        InfoAuthPromter hp = new InfoAuthPromter();
//        MyHelperClass cl = new MyHelperClass();
        cl.setCredentialsProvider(hp);
        HttpHead head =(HttpHead)(Object) NULL; //new HttpHead();
        head = new HttpHead(_url);
//        MyHelperClass head = new MyHelperClass();
        head.setHeader("User-Agent", "test");
//        MyHelperClass head = new MyHelperClass();
        head.setHeader("Accept", "*/*");
//        MyHelperClass head = new MyHelperClass();
        head.setHeader("Range", "bytes=0-");
//        MyHelperClass head = new MyHelperClass();
        HttpResponse resp =(HttpResponse)(Object) cl.execute((MyHelperClass)(Object)head);
        MyHelperClass ent = new MyHelperClass();
        ent = resp.getEntity();
        int code =(int)(Object) resp.getStatusLine().getStatusCode();
        if (code == 401) {
            throw new Exception("HTTP Auth Failed");
        }
        AuthManager.putAuth(getSite(), auth);
        setURL(head.getURI().toString());
        setSize(ent.getContentLength());
        setRangeEnd((int)(Object)getSize() - 1);
        setResumable(code == 206);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass setCredentialsProvider(InfoAuthPromter o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass putAuth(MyHelperClass o0, MyHelperClass o1){ return null; }}

class InfoAuthPromter {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass setCredentialsProvider(InfoAuthPromter o0){ return null; }}

class HttpHead {

HttpHead(){}
	HttpHead(String o0){}
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}
