import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5746452 {
public MyHelperClass mysessioncookie;
public MyHelperClass uploadresponse;
	public MyHelperClass zShareAccount;
	public MyHelperClass zsharelink;
	public MyHelperClass NULogger;
	public MyHelperClass UploadStatus;
	public MyHelperClass HttpMultipartMode;
	public MyHelperClass status;
	public MyHelperClass EntityUtils;
	public MyHelperClass Level;
	public MyHelperClass file;
	public MyHelperClass uploadProgress;
	public MyHelperClass generateZShareID(){ return null; }

    private void fileUpload() throws Throwable, IOException {
        HttpClient httpclient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient();
        MyHelperClass postURL = new MyHelperClass();
        HttpPost httppost = new HttpPost(postURL);
        MyHelperClass zShareAccount = new MyHelperClass();
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)zShareAccount.loginsuccessful) {
//            MyHelperClass zShareAccount = new MyHelperClass();
            httppost.setHeader("Cookie", zShareAccount.getSidcookie() + ";" + zShareAccount.getMysessioncookie());
        } else {
            MyHelperClass sidcookie = new MyHelperClass();
            httppost.setHeader("Cookie", sidcookie + ";" + mysessioncookie);
        }
        generateZShareID();
        MultipartEntity mpEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
        mpEntity.addPart("", new MonitoredFileBody(file, uploadProgress));
        mpEntity.addPart("TOS", new StringBody("1"));
        httppost.setEntity(mpEntity);
        NULogger.getLogger().log(Level.INFO, "executing request {0}", httppost.getRequestLine());
        status = UploadStatus.UPLOADING;
        NULogger.getLogger().info("Now uploading your file into zshare.net");
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
        HttpEntity resEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        NULogger.getLogger().info(response.getStatusLine().toString());
        if (resEntity != null) {
            uploadresponse = EntityUtils.toString(resEntity);
        }
        uploadresponse = uploadresponse.replaceAll("\n", "");
        uploadresponse = uploadresponse.substring(uploadresponse.indexOf("index2.php"));
        uploadresponse = uploadresponse.substring(0, uploadresponse.indexOf("\">here"));
        uploadresponse = uploadresponse.replaceAll("amp;", "");
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)zShareAccount.loginsuccessful) {
            uploadresponse = zShareAccount.getZsharelink() +(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)uploadresponse;
        } else {
            uploadresponse = zsharelink +(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)uploadresponse;
        }
        uploadresponse = uploadresponse.replaceAll(" ", "%20");
        NULogger.getLogger().log(Level.INFO, "resp : {0}", uploadresponse);
        httpclient.getConnectionManager().shutdown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass loginsuccessful;
	public MyHelperClass BROWSER_COMPATIBLE;
	public MyHelperClass UPLOADING;
public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass getSidcookie(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getMysessioncookie(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getZsharelink(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }}

class HttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass getRequestLine(){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class MultipartEntity {

MultipartEntity(MyHelperClass o0){}
	MultipartEntity(){}
	public MyHelperClass addPart(String o0, MonitoredFileBody o1){ return null; }
	public MyHelperClass addPart(String o0, StringBody o1){ return null; }}

class MonitoredFileBody {

MonitoredFileBody(MyHelperClass o0, MyHelperClass o1){}
	MonitoredFileBody(){}}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
