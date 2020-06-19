import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1468131 {
public MyHelperClass NULL;
public MyHelperClass TranslationProvider;
	public MyHelperClass JOptionPane;
	public MyHelperClass NeembuuUploader;
public MyHelperClass CommonUploaderTasks;
	public MyHelperClass Logger;
	public MyHelperClass uploadresponse;
	public MyHelperClass downloadlink;
	public MyHelperClass NULogger;
	public MyHelperClass UploadStatus;
	public MyHelperClass file_extension_not_supported;
	public MyHelperClass status;
	public MyHelperClass HttpMultipartMode;
	public MyHelperClass file_ext;
	public MyHelperClass EntityUtils;
	public MyHelperClass Level;
	public MyHelperClass file;
	public MyHelperClass downURL;
	public MyHelperClass uploadProgress;
	public MyHelperClass FileDenAccount;
	public MyHelperClass uploadFinished(){ return null; }
	public MyHelperClass uploadFailed(){ return null; }

    public void run()  throws Throwable {
        try {
            MyHelperClass FileDenAccount = new MyHelperClass();
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)FileDenAccount.loginsuccessful) {
                String host =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new String();
                host = FileDenAccount.username + " | FileDen.com";
            } else {
                String host =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new String();
                host = "FileDen.com";
                uploadFailed();
                return;
            }
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)file.length() > 1073741824) {
                JOptionPane.showMessageDialog(NeembuuUploader.getInstance(), "<html><b>" + getClass().getSimpleName() + "</b> " + TranslationProvider.get("uploaders.maxfilesize") + ": <b>1GB</b></html>", getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
                uploadFailed();
                return;
            }
            file_ext = file.getName().substring((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)file.getName().lastIndexOf(".") + 1);
            String[] unsupported = new String[] { "html", "htm", "php", "php3", "phtml", "htaccess", "htpasswd", "cgi", "pl", "asp", "aspx", "cfm", "exe", "ade", "adp", "bas", "bat", "chm", "cmd", "com", "cpl", "crt", "hlp", "hta", "inf", "ins", "isp", "jse", "lnk", "mdb", "mde", "msc", "msi", "msp", "mst", "pcd", "pif", "reg", "scr", "sct", "shs", "url", "vbe", "vbs", "wsc", "wsf", "wsh", "shb", "js", "vb", "ws", "mdt", "mdw", "mdz", "shb", "scf", "pl", "pm", "dll" };
            for (int i = 0; i < unsupported.length; i++) {
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)file_ext.equalsIgnoreCase(unsupported[i])) {
                    file_extension_not_supported =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) true;
                    break;
                }
            }
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)file_extension_not_supported) {
                JOptionPane.showMessageDialog(NeembuuUploader.getInstance(), "<html><b>" + getClass().getSimpleName() + "</b> " + TranslationProvider.get("uploaders.filetypenotsupported") + ": <b>" + file_ext + "</b></html>", getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
                uploadFailed();
                return;
            }
            status = UploadStatus.INITIALISING;
            DefaultHttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost("http://www.fileden.com/upload_old.php");
            httppost.setHeader("Cookie", FileDenAccount.getCookies().toString());
            MultipartEntity mpEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
            mpEntity.addPart("Filename", new StringBody((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)file.getName()));
            mpEntity.addPart("action", new StringBody("upload"));
            mpEntity.addPart("upload_to", new StringBody(""));
            mpEntity.addPart("overwrite_option", new StringBody("overwrite"));
            mpEntity.addPart("thumbnail_size", new StringBody("small"));
            mpEntity.addPart("create_img_tags", new StringBody("1"));
            mpEntity.addPart("file0", new MonitoredFileBody(file, uploadProgress));
            httppost.setEntity(mpEntity);
            NULogger.getLogger().log(Level.INFO, "executing request {0}", httppost.getRequestLine());
            NULogger.getLogger().info("Now uploading your file into fileden");
            status = UploadStatus.UPLOADING;
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
            HttpEntity resEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
            NULogger.getLogger().info(response.getStatusLine().toString());
            status = UploadStatus.GETTINGLINK;
            if (resEntity != null) {
                uploadresponse = EntityUtils.toString(resEntity);
            }
            NULogger.getLogger().info(uploadresponse);
            downloadlink = CommonUploaderTasks.parseResponse(uploadresponse, "'link':'", "'");
            NULogger.getLogger().log(Level.INFO, "Download link : {0}", downloadlink);
            downURL = downloadlink;
            httpclient.getConnectionManager().shutdown();
            uploadFinished();
        } catch (Exception e) {
            Logger.getLogger(RapidShare.class.getName()).log(Level.SEVERE, null, e);
            uploadFailed();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass loginsuccessful;
	public MyHelperClass SEVERE;
	public MyHelperClass GETTINGLINK;
	public MyHelperClass username;
	public MyHelperClass INITIALISING;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass UPLOADING;
	public MyHelperClass INFO;
	public MyHelperClass BROWSER_COMPATIBLE;
public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass info(MyHelperClass o0){ return null; }
	public MyHelperClass parseResponse(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }}

class DefaultHttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(){}
	HttpPost(String o0){}
	public MyHelperClass getRequestLine(){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class MultipartEntity {

MultipartEntity(MyHelperClass o0){}
	MultipartEntity(){}
	public MyHelperClass addPart(String o0, MonitoredFileBody o1){ return null; }
	public MyHelperClass addPart(String o0, StringBody o1){ return null; }}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class MonitoredFileBody {

MonitoredFileBody(MyHelperClass o0, MyHelperClass o1){}
	MonitoredFileBody(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}

class RapidShare {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
