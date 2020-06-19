import java.io.*;
import java.lang.*;
import java.util.*;



class c14610316 {
public static MyHelperClass NULL;
public static MyHelperClass rolecookie;
	public static MyHelperClass directioncookie;
//	public MyHelperClass NULL;
	public static MyHelperClass HttpVersion;
	public static MyHelperClass orderbycookie;
	public static MyHelperClass sessioncookie;
	public static MyHelperClass mailcookie;
	public static MyHelperClass namecookie;
//public MyHelperClass HttpVersion;
//	public MyHelperClass orderbycookie;
//	public MyHelperClass namecookie;
//	public MyHelperClass mailcookie;
//	public MyHelperClass directioncookie;
//	public MyHelperClass rolecookie;
//	public MyHelperClass sessioncookie;

    public static void fileUpload() throws IOException {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass CoreProtocolPNames = new MyHelperClass();
        httpclient.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
        File file =(File)(Object) NULL; //new File();
        file = new File("H:\\FileServeUploader.java");
        MyHelperClass postURL = new MyHelperClass();
        HttpPost httppost = new HttpPost(postURL);
        MyHelperClass langcookie = new MyHelperClass();
        httppost.setHeader("Cookie", langcookie + ";" + sessioncookie + ";" + mailcookie + ";" + namecookie + ";" + rolecookie + ";" + orderbycookie + ";" + directioncookie + ";");
        MultipartEntity mpEntity = new MultipartEntity();
//        MyHelperClass file = new MyHelperClass();
        ContentBody cbFile =(ContentBody)(Object) new FileBody((MyHelperClass)(Object)file);
        mpEntity.addPart("files[]", cbFile);
        httppost.setEntity(mpEntity);
        System.out.println("Now uploading your file into wupload...........................");
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
        HttpEntity resEntity =(HttpEntity)(Object) response.getEntity();
        System.out.println(response.getStatusLine());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_1_1;
	public MyHelperClass PROTOCOL_VERSION;
public MyHelperClass setParameter(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getParams(){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(){}
	HttpPost(MyHelperClass o0){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

public MyHelperClass addPart(String o0, ContentBody o1){ return null; }}

class ContentBody {

}

class FileBody {

FileBody(){}
	FileBody(MyHelperClass o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}
