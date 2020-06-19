import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5746453 {
public MyHelperClass CommonUploaderTasks;
	public MyHelperClass UploadStatus;
	public MyHelperClass mysessioncookie;
	public MyHelperClass EntityUtils;
public MyHelperClass uploadFinished(){ return null; }

    private void getDownloadLink() throws Throwable, Exception {
        MyHelperClass status = new MyHelperClass();
        status = UploadStatus.GETTINGLINK;
        MyHelperClass NULogger = new MyHelperClass();
        NULogger.getLogger().info("Now Getting Download link...");
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass uploadresponse = new MyHelperClass();
        HttpGet h = new HttpGet(uploadresponse);
        MyHelperClass postURL = new MyHelperClass();
        h.setHeader("Referer", postURL);
        MyHelperClass zShareAccount = new MyHelperClass();
        if (zShareAccount.loginsuccessful) {
//            MyHelperClass zShareAccount = new MyHelperClass();
            h.setHeader("Cookie", zShareAccount.getSidcookie() + ";" + zShareAccount.getMysessioncookie());
        } else {
            MyHelperClass sidcookie = new MyHelperClass();
            h.setHeader("Cookie", sidcookie + ";" + mysessioncookie);
        }
        HttpResponse res = client.execute(h);
        HttpEntity entity = res.getEntity();
        MyHelperClass linkpage = new MyHelperClass();
        linkpage = EntityUtils.toString(entity);
//        MyHelperClass linkpage = new MyHelperClass();
        linkpage = linkpage.replaceAll("\n", "");
        MyHelperClass downloadlink = new MyHelperClass();
        downloadlink = CommonUploaderTasks.parseResponse(linkpage, "value=\"", "\"");
        MyHelperClass deletelink = new MyHelperClass();
        deletelink = CommonUploaderTasks.parseResponse(linkpage, "delete.html?", "\"");
//        MyHelperClass deletelink = new MyHelperClass();
        deletelink = "http://www.zshare.net/delete.html?"(MyHelperClass)(Object) + deletelink;
        MyHelperClass downURL = new MyHelperClass();
        downURL = downloadlink;
        MyHelperClass delURL = new MyHelperClass();
        delURL = deletelink;
        MyHelperClass Level = new MyHelperClass();
        NULogger.getLogger().log(Level.INFO, "Download link : {0}", downloadlink);
//        MyHelperClass Level = new MyHelperClass();
        NULogger.getLogger().log(Level.INFO, "Delete Link : {0}", deletelink);
        uploadFinished();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass loginsuccessful;
public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getSidcookie(){ return null; }
	public MyHelperClass getMysessioncookie(){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}
