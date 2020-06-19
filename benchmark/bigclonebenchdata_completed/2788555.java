import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2788555 {
public MyHelperClass TranslationProvider;
	public MyHelperClass JOptionPane;
	public MyHelperClass NeembuuUploader;
public MyHelperClass start;
	public MyHelperClass strResponse;
	public MyHelperClass NULogger;
	public MyHelperClass httppost;
	public MyHelperClass status;
	public MyHelperClass Level;
	public MyHelperClass uploadProgress;
	public MyHelperClass link;
	public MyHelperClass UploadStatus;
	public MyHelperClass delURL;
	public MyHelperClass EntityUtils;
	public MyHelperClass HotFileAccount;
	public MyHelperClass HttpMultipartMode;
	public MyHelperClass httpget;
	public MyHelperClass manageURL;
	public MyHelperClass file;
	public MyHelperClass downURL;
	public MyHelperClass uploadFailed(){ return null; }
	public MyHelperClass uploadFinished(){ return null; }

    private void uploadLogin()  throws Throwable {
        try {
            MyHelperClass status = new MyHelperClass();
            status = UploadStatus.INITIALISING;
            MyHelperClass file = new MyHelperClass();
            if (file.length() > 419430400) {
                JOptionPane.showMessageDialog(NeembuuUploader.getInstance(), "<html><b>" + getClass().getSimpleName() + "</b> " + TranslationProvider.get("uploaders.maxfilesize") + ": <b>400MB</b></html>", getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
                uploadFailed();
                return;
            }
            status = UploadStatus.GETTINGCOOKIE;
            HttpParams params =(HttpParams)(Object) new BasicHttpParams();
            params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
            DefaultHttpClient httpclient = new DefaultHttpClient(params);
            httpget = new HttpGet("http://hotfile.com/?cookiecheck=1");
            httpget.setHeader("Referer", "http://www.hotfile.com/");
            httpget.setHeader("Cache-Control", "max-age=0");
            httpget.setHeader("Origin", "http://www.hotfile.com/");
            httpget.setHeader("Accept", "application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
            httpclient = new DefaultHttpClient(params);
            httpclient.getCookieStore().addCookie(HotFileAccount.getHfcookie());
            HttpResponse httpresponse = httpclient.execute(httpget);
            strResponse = EntityUtils.toString(httpresponse.getEntity());
            start =(MyHelperClass)(Object) "<form action=\"";
            link = strResponse.substring(strResponse.indexOf(start + "http://") + start.length());
            link = link.substring(0, link.indexOf("\""));
            NULogger.getLogger().info(link);
            httppost = new HttpPost(link);
            httppost.setHeader("Referer", "http://www.hotfile.com/");
            httppost.setHeader("Cache-Control", "max-age=0");
            httppost.setHeader("Origin", "http://www.hotfile.com/");
            httppost.setHeader("Accept", "application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
            MultipartEntity requestEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
            requestEntity.addPart("uploads[]", new MonitoredFileBody(file, uploadProgress));
            requestEntity.addPart("iagree", new StringBody("on"));
            requestEntity.addPart("", new StringBody("Upload"));
            httppost.setEntity(requestEntity);
            status = UploadStatus.UPLOADING;
            httpresponse = httpclient.execute(httppost);
            manageURL = httpresponse.getHeaders("Location")[0].getValue();
            NULogger.getLogger().log(Level.INFO, "HotFile Manage URL{0}", manageURL);
            NULogger.getLogger().info("Getting links from Manage URL");
            status = UploadStatus.GETTINGLINK;
            httpget = new HttpGet(manageURL);
            httpclient = new DefaultHttpClient(params);
            httpresponse = httpclient.execute(httpget);
            strResponse = EntityUtils.toString(httpresponse.getEntity());
            start =(MyHelperClass)(Object) "<input type=\"text\" name=\"url\" id=\"url\" class=\"textfield\" value=\"";
            downURL = strResponse.substring(strResponse.indexOf(start) + start.length());
            downURL = downURL.substring(0, downURL.indexOf("\""));
            start =(MyHelperClass)(Object) "<input type=\"text\" name=\"delete\" id=\"delete\" class=\"textfield\" value=\"";
            delURL = strResponse.substring(strResponse.indexOf(start) + start.length());
            delURL = delURL.substring(0, delURL.indexOf("\""));
            NULogger.getLogger().log(Level.INFO, "Download Link: {0}", downURL);
            NULogger.getLogger().log(Level.INFO, "Delete link: {0}", delURL);
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
public MyHelperClass INFO;
	public MyHelperClass BROWSER_COMPATIBLE;
	public MyHelperClass GETTINGLINK;
	public MyHelperClass GETTINGCOOKIE;
	public MyHelperClass INITIALISING;
	public MyHelperClass UPLOADING;
public MyHelperClass getLogger(){ return null; }
	public MyHelperClass indexOf(MyHelperClass o0){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass getHfcookie(){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass length(){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}
	public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass getCookieStore(){ return null; }}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getHeaders(String o0){ return null; }}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}}

class MultipartEntity {

}

class MonitoredFileBody {

MonitoredFileBody(MyHelperClass o0, MyHelperClass o1){}
	MonitoredFileBody(){}}

class StringBody {

StringBody(String o0){}
	StringBody(){}}
