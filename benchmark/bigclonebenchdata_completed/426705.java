import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c426705 {
public MyHelperClass NULL;
public MyHelperClass downLimit;

    private InputStream getPart() throws Throwable, IOException {
        MyHelperClass url = new MyHelperClass();
        HttpGet get = new HttpGet(url);
        MyHelperClass startAt = new MyHelperClass();
        get.addHeader("Range", "bytes=" + startAt + "-");
        MyHelperClass client = new MyHelperClass();
        HttpResponse res =(HttpResponse)(Object) client.execute(get);
//        MyHelperClass startAt = new MyHelperClass();
        System.out.println("requesting kBs from " + startAt + "     server reply:" + res.getStatusLine());
        if ((int)(Object)res.getStatusLine().getStatusCode() == 403 || res.getStatusLine().toString().toLowerCase().contains("forbidden")) {
            get.abort();
//            MyHelperClass url = new MyHelperClass();
            get = new HttpGet(url);
//            MyHelperClass startAt = new MyHelperClass();
            get.addHeader("Range", "bytes=" + startAt + "-" + ((int)(Object)startAt + (int)(Object)downLimit));
//            MyHelperClass client = new MyHelperClass();
            res =(HttpResponse)(Object) client.execute(get);
//            MyHelperClass startAt = new MyHelperClass();
            System.out.println("Again requesting from kBs " + startAt + "     server reply:" + res.getStatusLine());
//            MyHelperClass startAt = new MyHelperClass();
           (int)(Object) startAt += (int)(Object)downLimit;
        } else {
            boolean complete =(boolean)(Object) NULL; //new boolean();
            complete = true;
        }
        return res.getEntity() == null ? null : res.getEntity().getContent();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}
