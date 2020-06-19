import java.io.*;
import java.lang.*;
import java.util.*;



class c21518266 {
public MyHelperClass NULL;
public MyHelperClass setInputStream(MyHelperClass o0){ return null; }
public MyHelperClass getURL(){ return null; }
public MyHelperClass get;
	public MyHelperClass ent;
	public MyHelperClass cl;
	public MyHelperClass getRangeEnd(){ return null; }
	public MyHelperClass getPosition(){ return null; }

    public void initGet() throws Exception {
        DefaultHttpClient cl =(DefaultHttpClient)(Object) NULL; //new DefaultHttpClient();
        cl = new DefaultHttpClient();
        GetAuthPromter hp = new GetAuthPromter();
//        MyHelperClass cl = new MyHelperClass();
        cl.setCredentialsProvider(hp);
        HttpGet get =(HttpGet)(Object) NULL; //new HttpGet();
        get = new HttpGet(getURL());
//        MyHelperClass get = new MyHelperClass();
        get.setHeader("User-Agent", "test");
//        MyHelperClass get = new MyHelperClass();
        get.setHeader("Accept", "*/*");
        get.setHeader("Range", "bytes=" + getPosition() + "-" + getRangeEnd());
        HttpResponse resp =(HttpResponse)(Object) cl.execute((MyHelperClass)(Object)get);
        ent = resp.getEntity();
        setInputStream(ent.getContent());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setCredentialsProvider(GetAuthPromter o0){ return null; }}

class GetAuthPromter {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass setCredentialsProvider(GetAuthPromter o0){ return null; }}

class HttpGet {

HttpGet(){}
	HttpGet(MyHelperClass o0){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}
