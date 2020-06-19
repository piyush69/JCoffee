import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7401182 {
public MyHelperClass NULL;
public MyHelperClass UploadStatus;
	public MyHelperClass uploadProgress;
public MyHelperClass NULogger;
	public MyHelperClass uploadFinished(){ return null; }
	public MyHelperClass uploadFailed(){ return null; }

//    @Override
    public void run()  throws Throwable {
        try {
            MyHelperClass status = new MyHelperClass();
            status = UploadStatus.INITIALISING;
            DefaultHttpClient httpclient = new DefaultHttpClient();
            HttpGet httpget = new HttpGet("http://www.filedropper.com");
            httpget.setHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2 GTBDFff GTB7.0");
            HttpResponse httpresponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httpget);
            httpresponse.getEntity().consumeContent();
            HttpPost httppost =(HttpPost)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new HttpPost();
            httppost = new HttpPost("http://www.filedropper.com/index.php?xml=true");
//            MyHelperClass httppost = new MyHelperClass();
            httppost.setHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2 GTBDFff GTB7.0");
            MyHelperClass HttpMultipartMode = new MyHelperClass();
            MultipartEntity requestEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
            MyHelperClass file = new MyHelperClass();
            requestEntity.addPart("file",(StringBody)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new MonitoredFileBody(file, uploadProgress));
            requestEntity.addPart("Upload", new StringBody("Submit Query"));
//            MyHelperClass httppost = new MyHelperClass();
            httppost.setEntity(requestEntity);
//            MyHelperClass status = new MyHelperClass();
            status = UploadStatus.UPLOADING;
//            MyHelperClass httppost = new MyHelperClass();
            httpresponse =(HttpResponse)(Object)(Object)(Object) httpclient.execute((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(HttpGet)(Object)httppost);
            MyHelperClass EntityUtils = new MyHelperClass();
            String strResponse = EntityUtils.toString(httpresponse.getEntity());
//            MyHelperClass status = new MyHelperClass();
            status = UploadStatus.GETTINGLINK;
            String downURL =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new String();
            downURL = "http://www.filedropper.com/" + strResponse.substring(strResponse.lastIndexOf("=") + 1);
//            MyHelperClass downURL = new MyHelperClass();
            NULogger.getLogger().info(downURL);
            uploadFinished();
        } catch (Exception ex) {
            ex.printStackTrace();
            NULogger.getLogger().severe(ex.toString());
            uploadFailed();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GETTINGLINK;
	public MyHelperClass INITIALISING;
	public MyHelperClass BROWSER_COMPATIBLE;
	public MyHelperClass UPLOADING;
public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass execute(MyHelperClass o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class MultipartEntity {

MultipartEntity(MyHelperClass o0){}
	MultipartEntity(){}
	public MyHelperClass addPart(String o0, StringBody o1){ return null; }}

class MonitoredFileBody {

MonitoredFileBody(MyHelperClass o0, MyHelperClass o1){}
	MonitoredFileBody(){}}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
