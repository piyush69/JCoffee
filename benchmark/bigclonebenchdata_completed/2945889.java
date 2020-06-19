


class c2945889 {
public MyHelperClass UploadStatus;
	public MyHelperClass HttpVersion;
	public MyHelperClass uploadProgress;

    public void fileUpload() throws Exception {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass CoreProtocolPNames = new MyHelperClass();
        httpclient.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
        MyHelperClass uid = new MyHelperClass();
        HttpPost httppost = new HttpPost("http://upload.1fichier.com/en/upload.cgi?id=" + uid);
        MyHelperClass oneFichierAccount = new MyHelperClass();
        if ((boolean)(Object)oneFichierAccount.loginsuccessful) {
            MyHelperClass OneFichierAccount = new MyHelperClass();
            httppost.setHeader("Cookie", OneFichierAccount.getSidcookie());
        }
        MultipartEntity mpEntity = new MultipartEntity();
        MyHelperClass file = new MyHelperClass();
        mpEntity.addPart("file[]",(StringBody)(Object) new MonitoredFileBody(file, uploadProgress));
        mpEntity.addPart("domain", new StringBody("0"));
        httppost.setEntity(mpEntity);
        MyHelperClass NULogger = new MyHelperClass();
        NULogger.getLogger().info("Now uploading your file into 1fichier...........................");
        MyHelperClass Level = new MyHelperClass();
        NULogger.getLogger().log(Level.INFO, "Now executing.......{0}", httppost.getRequestLine());
        MyHelperClass status = new MyHelperClass();
        status = UploadStatus.UPLOADING;
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
//        MyHelperClass status = new MyHelperClass();
        status = UploadStatus.GETTINGLINK;
        httpclient.getConnectionManager().shutdown();
//        MyHelperClass NULogger = new MyHelperClass();
        NULogger.getLogger().info(response.getStatusLine().toString());
        if ((boolean)(Object)response.containsHeader("Location")) {
            MyHelperClass uploadresponse = new MyHelperClass();
            uploadresponse = response.getFirstHeader("Location").getValue();
//            MyHelperClass Level = new MyHelperClass();
            NULogger.getLogger().log(Level.INFO, "Upload location link : {0}", uploadresponse);
        } else {
            throw new Exception("There might be a problem with your internet connection or server error. Please try again");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass loginsuccessful;
	public MyHelperClass GETTINGLINK;
	public MyHelperClass UPLOADING;
	public MyHelperClass HTTP_1_1;
	public MyHelperClass PROTOCOL_VERSION;
	public MyHelperClass INFO;
public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getSidcookie(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getConnectionManager(){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(){}
	HttpPost(String o0){}
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getRequestLine(){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

public MyHelperClass addPart(String o0, StringBody o1){ return null; }}

class MonitoredFileBody {

MonitoredFileBody(MyHelperClass o0, MyHelperClass o1){}
	MonitoredFileBody(){}}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class HttpResponse {

public MyHelperClass getFirstHeader(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass containsHeader(String o0){ return null; }}
