import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13279965 {
public static MyHelperClass NULL;
public static MyHelperClass HttpVersion;
//	public MyHelperClass NULL;
	public static MyHelperClass EntityUtils;
	public static MyHelperClass autologincookie;
	public static MyHelperClass parseResponse(MyHelperClass o0, String o1, String o2){ return null; }
//public MyHelperClass autologincookie;
//	public MyHelperClass EntityUtils;
//	public MyHelperClass HttpVersion;
//	public MyHelperClass parseResponse(MyHelperClass o0, String o1, String o2){ return null; }

    public static void fileUpload() throws Throwable, IOException {
        HttpClient httpclient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient();
        MyHelperClass CoreProtocolPNames = new MyHelperClass();
        httpclient.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
        File file =(File)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new File();
        file = new File("H:\\FileServeUploader.java");
        MyHelperClass postURL = new MyHelperClass();
        HttpPost httppost = new HttpPost(postURL);
        MyHelperClass uprandcookie = new MyHelperClass();
        httppost.setHeader("Cookie", uprandcookie + ";" + autologincookie);
        MultipartEntity mpEntity = new MultipartEntity();
//        MyHelperClass file = new MyHelperClass();
        ContentBody cbFile = new FileBody((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(MyHelperClass)(Object)file);
        mpEntity.addPart("MAX_FILE_SIZE",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("2097152000"));
        MyHelperClass uid = new MyHelperClass();
        mpEntity.addPart("UPLOAD_IDENTIFIER",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody(uid));
        mpEntity.addPart("go",(ContentBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new StringBody("1"));
        mpEntity.addPart("files", cbFile);
        httppost.setEntity(mpEntity);
        System.out.println("Now uploading your file into depositfiles...........................");
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
        HttpEntity resEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        System.out.println(response.getStatusLine());
        if (resEntity != null) {
            MyHelperClass uploadresponse = new MyHelperClass();
            uploadresponse = EntityUtils.toString(resEntity);
            MyHelperClass downloadlink = new MyHelperClass();
            downloadlink = parseResponse(uploadresponse, "ud_download_url = '", "'");
            MyHelperClass deletelink = new MyHelperClass();
            deletelink = parseResponse(uploadresponse, "ud_delete_url = '", "'");
//            MyHelperClass downloadlink = new MyHelperClass();
            System.out.println("download link : " + downloadlink);
//            MyHelperClass deletelink = new MyHelperClass();
            System.out.println("delete link : " + deletelink);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_1_1;
	public MyHelperClass PROTOCOL_VERSION;
public MyHelperClass setParameter(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class MultipartEntity {

public MyHelperClass addPart(String o0, ContentBody o1){ return null; }}

class ContentBody {

}

class FileBody {

FileBody(MyHelperClass o0){}
	FileBody(){}}

class StringBody {

StringBody(MyHelperClass o0){}
	StringBody(String o0){}
	StringBody(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
