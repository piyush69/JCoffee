


class c21492246 {
public MyHelperClass getData(MyHelperClass o0){ return null; }
public MyHelperClass uploadProgress;
	public MyHelperClass Logger;
	public MyHelperClass CommonUploaderTasks;
	public MyHelperClass file;
	public MyHelperClass Level;
	public MyHelperClass HttpMultipartMode;
	public MyHelperClass usercookie;
	public MyHelperClass deletelink;
	public MyHelperClass netLoadAccount;
	public MyHelperClass UploadStatus;
	public MyHelperClass downloadlink;
	public MyHelperClass status;
	public MyHelperClass NULogger;
	public MyHelperClass downURL;
	public MyHelperClass postURL;
	public MyHelperClass delURL;
	public MyHelperClass uploadresponse;
	public MyHelperClass upload_hash;
	public MyHelperClass initialize(){ return null; }
	public MyHelperClass uploadFailed(){ return null; }
	public MyHelperClass uploadFinished(){ return null; }

    public void run() {
        try {
            MyHelperClass netLoadAccount = new MyHelperClass();
            if ((boolean)(Object)netLoadAccount.loginsuccessful) {
                String host;// = new String();
                host = netLoadAccount.username + " | Netload.in";
            } else {
                String host;// = new String();
                host = "Netload.in";
            }
            MyHelperClass status = new MyHelperClass();
            status = UploadStatus.INITIALISING;
            initialize();
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            HttpPost httppost = new HttpPost(postURL);
            if ((boolean)(Object)netLoadAccount.loginsuccessful) {
                httppost.setHeader("Cookie", usercookie);
            }
            MultipartEntity mpEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
            if ((boolean)(Object)netLoadAccount.loginsuccessful) {
                mpEntity.addPart("upload_hash", new StringBody(upload_hash));
            }
            mpEntity.addPart("file", new MonitoredFileBody(file, uploadProgress));
            httppost.setEntity(mpEntity);
            NULogger.getLogger().log(Level.INFO, "executing request {0}", httppost.getRequestLine());
            NULogger.getLogger().info("Now uploading your file into netload");
            status = UploadStatus.UPLOADING;
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            status = UploadStatus.GETTINGLINK;
            HttpEntity resEntity =(HttpEntity)(Object) response.getEntity();
            NULogger.getLogger().info(response.getStatusLine().toString());
            httpclient.getConnectionManager().shutdown();
            if ((boolean)(Object)response.containsHeader("Location")) {
                Header firstHeader =(Header)(Object) response.getFirstHeader("Location");
                NULogger.getLogger().info(firstHeader.getValue());
                uploadresponse = getData(firstHeader.getValue());
                downloadlink = CommonUploaderTasks.parseResponse(uploadresponse, "The download link is: <br/>", "\" target=\"_blank\">");
                downloadlink = downloadlink.substring(downloadlink.indexOf("href=\""));
                downloadlink = downloadlink.replace("href=\"", "");
                NULogger.getLogger().log(Level.INFO, "download link : {0}", downloadlink);
                deletelink = CommonUploaderTasks.parseResponse(uploadresponse, "The deletion link is: <br/>", "\" target=\"_blank\">");
                deletelink = deletelink.substring(deletelink.indexOf("href=\""));
                deletelink = deletelink.replace("href=\"", "");
                NULogger.getLogger().log(Level.INFO, "delete link : {0}", deletelink);
                downURL = downloadlink;
                delURL = deletelink;
                uploadFinished();
            } else {
                throw new Exception("There might be a problem with your internet connection or server error. Please try after some time :(");
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
            uploadFailed();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UPLOADING;
	public MyHelperClass BROWSER_COMPATIBLE;
	public MyHelperClass INITIALISING;
	public MyHelperClass INFO;
	public MyHelperClass SEVERE;
	public MyHelperClass loginsuccessful;
	public MyHelperClass username;
	public MyHelperClass GETTINGLINK;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass parseResponse(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass info(MyHelperClass o0){ return null; }}

class HttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(){}
	HttpPost(MyHelperClass o0){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getRequestLine(){ return null; }}

class MultipartEntity {

MultipartEntity(){}
	MultipartEntity(MyHelperClass o0){}
	public MyHelperClass addPart(String o0, StringBody o1){ return null; }
	public MyHelperClass addPart(String o0, MonitoredFileBody o1){ return null; }}

class StringBody {

StringBody(){}
	StringBody(MyHelperClass o0){}}

class MonitoredFileBody {

MonitoredFileBody(){}
	MonitoredFileBody(MyHelperClass o0, MyHelperClass o1){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getFirstHeader(String o0){ return null; }
	public MyHelperClass containsHeader(String o0){ return null; }}

class HttpEntity {

}

class Header {

public MyHelperClass getValue(){ return null; }}
