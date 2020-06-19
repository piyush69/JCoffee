import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20916189 {
public MyHelperClass UploadStatus;
	public MyHelperClass uploadProgress;

    public void fileUpload() throws Throwable, Exception {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        MyHelperClass postURL = new MyHelperClass();
        HttpPost httppost = new HttpPost(postURL);
        MyHelperClass HttpMultipartMode = new MyHelperClass();
        MultipartEntity reqEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
        MyHelperClass file = new MyHelperClass();
        reqEntity.addPart("fff", new MonitoredFileBody(file, uploadProgress));
        httppost.setEntity(reqEntity);
        MyHelperClass NULogger = new MyHelperClass();
        NULogger.getLogger().info("Now uploading your file into 2shared.com. Please wait......................");
        MyHelperClass status = new MyHelperClass();
        status = UploadStatus.UPLOADING;
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
//        MyHelperClass status = new MyHelperClass();
        status = UploadStatus.GETTINGLINK;
        HttpEntity resEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        if (resEntity != null) {
            MyHelperClass EntityUtils = new MyHelperClass();
            String page = EntityUtils.toString(resEntity);
            MyHelperClass Level = new MyHelperClass();
            NULogger.getLogger().log(Level.INFO, "PAGE :{0}", page);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass GETTINGLINK;
	public MyHelperClass BROWSER_COMPATIBLE;
	public MyHelperClass UPLOADING;
public MyHelperClass getLogger(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, String o2){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

MultipartEntity(MyHelperClass o0){}
	MultipartEntity(){}
	public MyHelperClass addPart(String o0, MonitoredFileBody o1){ return null; }}

class MonitoredFileBody {

MonitoredFileBody(MyHelperClass o0, MyHelperClass o1){}
	MonitoredFileBody(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
