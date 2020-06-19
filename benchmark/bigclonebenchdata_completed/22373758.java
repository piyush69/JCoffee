import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22373758 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;
	public static MyHelperClass NULogger;
//public MyHelperClass NULogger;

    private static void fileUpload() throws Throwable, Exception {
        File file =(File)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new File();
        file = new File("c:/Documents and Settings/dinesh/Desktop/ZShareUploaderPlugin.java");
        DefaultHttpClient httpclient =(DefaultHttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new DefaultHttpClient();
        httpclient = new DefaultHttpClient();
        MyHelperClass uploadid = new MyHelperClass();
        HttpPost httppost = new HttpPost("http://flameupload.com/cgi/ubr_upload.pl?upload_id=" + uploadid);
        MyHelperClass HttpMultipartMode = new MyHelperClass();
        MultipartEntity mpEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
//        MyHelperClass file = new MyHelperClass();
        ContentBody cbFile = new FileBody((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(MyHelperClass)(Object)file);
        mpEntity.addPart("upfile_0", cbFile);
        mpEntity.addPart("uploaded",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("hotfile",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("turbobit",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("depositfiles",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("fileserve",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("filefactory",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("netload",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("uploadstation",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("badongo",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("uploading",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("megashare",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        mpEntity.addPart("_2shared",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("on"));
        httppost.setEntity(mpEntity);
        MyHelperClass Level = new MyHelperClass();
        NULogger.getLogger().log(Level.INFO, "executing request {0}", httppost.getRequestLine());
        MyHelperClass NULogger = new MyHelperClass();
        NULogger.getLogger().info("Now uploading your file into flameupload.com");
//        MyHelperClass httpclient = new MyHelperClass();
        HttpResponse response =(HttpResponse[])(Object)(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
        HttpEntity resEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
//        MyHelperClass NULogger = new MyHelperClass();
        NULogger.getLogger().info(response.getStatusLine().toString());
        MyHelperClass EntityUtils = new MyHelperClass();
        NULogger.getLogger().info(EntityUtils.toString(resEntity));
        Header[] allHeaders =(Header[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getAllHeaders();
        for (int i = 0; i < allHeaders.length; i++) {
            System.out.println(allHeaders[i].getName() + "=" + allHeaders[i].getValue());
        }
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)response.getStatusLine().getStatusCode() == 302) {
//            MyHelperClass NULogger = new MyHelperClass();
            NULogger.getLogger().info("Files uploaded successfully");
        } else {
            throw new Exception("There might be a problem with your internet connection or server error. Please try again later :(");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass BROWSER_COMPATIBLE;
public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass getRequestLine(){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

MultipartEntity(MyHelperClass o0){}
	MultipartEntity(){}
	public MyHelperClass addPart(String o0, ContentBody o1){ return null; }}

class ContentBody {

}

class FileBody {

FileBody(MyHelperClass o0){}
	FileBody(){}}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class HttpResponse {

public MyHelperClass getAllHeaders(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}

class Header {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
