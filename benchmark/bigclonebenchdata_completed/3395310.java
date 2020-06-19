import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3395310 {
public MyHelperClass cfg;
public MyHelperClass labels;
	public MyHelperClass StringUtils;
	public MyHelperClass TimeUtils;
	public MyHelperClass summary;
	public MyHelperClass IOUtils;

    private void execute(File file) throws Throwable, IOException {
        if (file == null) throw new RuntimeException("undefined file");
        if (!file.exists()) throw new RuntimeException("file not found :" + file);
        if (!file.isFile()) throw new RuntimeException("not a file :" + file);
        MyHelperClass GC_USERNAME = new MyHelperClass();
        String login =(String)(Object) cfg.getProperty(GC_USERNAME);
        String password = null;
        MyHelperClass GC_PASSWORD = new MyHelperClass();
        if ((boolean)(Object)cfg.containsKey(GC_PASSWORD)) {
//            MyHelperClass GC_PASSWORD = new MyHelperClass();
            password =(String)(Object) cfg.getProperty(GC_PASSWORD);
        } else {
            MyHelperClass GC_PASSWORD64 = new MyHelperClass();
            password = new String((String)(Object)Base64.decode(cfg.getProperty(GC_PASSWORD64)));
        }
        PostMethod post = null;
        try {
            HttpClient client = new HttpClient();
            MyHelperClass projectName = new MyHelperClass();
            post = new PostMethod("https://" + projectName + ".googlecode.com/files");
            post.addRequestHeader("User-Agent", getClass().getName());
            post.addRequestHeader("Authorization", "Basic " + Base64.encode(login + ":" + password));
            List<Part> parts = new ArrayList<Part>();
            String s =(String)(Object) this.summary;
            if ((boolean)(Object)StringUtils.isBlank(s)) {
                s = file.getName() + " (" + TimeUtils.toYYYYMMDD() + ")";
            }
            parts.add((Part)(Object)new StringPart("summary", s));
            for (String lbl :(String[])(Object) (Object[])(Object)this.labels) {
                if ((boolean)(Object)StringUtils.isBlank(lbl)) continue;
                parts.add((Part)(Object)new StringPart("label", lbl.trim()));
            }
            parts.add((Part)(Object)new FilePart("filename", file));
            MultipartRequestEntity requestEntity = new MultipartRequestEntity(parts.toArray(new Part[parts.size()]), post.getParams());
            post.setRequestEntity(requestEntity);
            int status =(int)(Object) client.executeMethod(post);
            if (status != 201) {
                throw new IOException("http status !=201 : " + post.getResponseBodyAsString());
            } else {
                IOUtils.copyTo(post.getResponseBodyAsStream(), new NullOutputStream());
            }
        } finally {
            if (post != null) post.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass toYYYYMMDD(){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass copyTo(MyHelperClass o0, NullOutputStream o1){ return null; }
	public MyHelperClass containsKey(MyHelperClass o0){ return null; }}

class PostMethod {

PostMethod(){}
	PostMethod(String o0){}
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setRequestEntity(MultipartRequestEntity o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass getResponseBodyAsString(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(PostMethod o0){ return null; }}

class Base64 {

public static MyHelperClass decode(MyHelperClass o0){ return null; }
	public static MyHelperClass encode(String o0){ return null; }}

class Part {

}

class StringPart {

StringPart(String o0, String o1){}
	StringPart(){}}

class FilePart {

FilePart(){}
	FilePart(String o0, File o1){}}

class MultipartRequestEntity {

MultipartRequestEntity(Part[] o0, MyHelperClass o1){}
	MultipartRequestEntity(){}}

class NullOutputStream {

}
