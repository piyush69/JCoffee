


class c20619644 {

    private static void upload(String login, String password, String file) throws ApiException {
        System.out.println("Trying to login to 4shared........");
        File f = new File(file);
        if (!(Boolean)(Object)f.exists() || !(Boolean)(Object)f.canRead() || (boolean)(Object)f.isDirectory()) {
            System.out.println("File does not exist, unreadable or not a file");
            return;
        }
        DesktopAppJax2 da =(DesktopAppJax2)(Object) (new DesktopAppJax2Service().getDesktopAppJax2Port());
        String loginRes =(String)(Object) da.login(login, password);
        if (!loginRes.isEmpty()) {
            System.out.println("Login failed: " + loginRes);
            return;
        }
        if (!(Boolean)(Object)da.hasRightUpload()) {
            System.out.println("Uploading is temporarily disabled");
            return;
        }
        System.out.println("4shared Login successful :)");
        long newFileId =(long)(Object) da.uploadStartFile(login, password, -1, f.getName(), f.length());
        System.out.println("File id : " + newFileId);
        String sessionKey =(String)(Object) da.createUploadSessionKey(login, password, -1);
        long dcId =(long)(Object) da.getNewFileDataCenter(login, password);
        String url =(String)(Object) da.getUploadFormUrl((int) dcId, sessionKey);
        try {
            HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
            HttpPost post = new HttpPost(url);
            MultipartEntity me = new MultipartEntity();
            StringBody rfid = new StringBody("" + newFileId);
            StringBody rfb = new StringBody("" + 0);
            InputStreamBody isb = new InputStreamBody(new BufferedInputStream(new FileInputStream(f)), "FilePart");
            me.addPart("resumableFileId", rfid);
            me.addPart("resumableFirstByte", rfb);
            me.addPart("FilePart", isb);
            post.setEntity(me);
            HttpResponse resp =(HttpResponse)(Object) client.execute(post);
            HttpEntity resEnt =(HttpEntity)(Object) resp.getEntity();
            MyHelperClass DigestUtils = new MyHelperClass();
            String res =(String)(Object) da.uploadFinishFile(login, password, newFileId, DigestUtils.md5Hex(new FileInputStream(f)));
            if (res.isEmpty()) {
                System.out.println("File uploaded.");
                MyHelperClass downloadlink = new MyHelperClass();
                downloadlink = da.getFileDownloadLink(login, password, newFileId);
//                MyHelperClass downloadlink = new MyHelperClass();
                System.out.println("Download link : " + downloadlink);
            } else {
                System.out.println("Upload failed: " + res);
            }
        } catch (Exception ex) {
            System.out.println("Upload failed: " + ex.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass md5Hex(FileInputStream o0){ return null; }}

class ApiException extends Exception{
	public ApiException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getName(){ return null; }}

class DesktopAppJax2 {

public MyHelperClass createUploadSessionKey(String o0, String o1, int o2){ return null; }
	public MyHelperClass uploadFinishFile(String o0, String o1, long o2, MyHelperClass o3){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getUploadFormUrl(int o0, String o1){ return null; }
	public MyHelperClass hasRightUpload(){ return null; }
	public MyHelperClass uploadStartFile(String o0, String o1, int o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass getNewFileDataCenter(String o0, String o1){ return null; }
	public MyHelperClass getFileDownloadLink(String o0, String o1, long o2){ return null; }}

class DesktopAppJax2Service {

public MyHelperClass getDesktopAppJax2Port(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

public MyHelperClass addPart(String o0, StringBody o1){ return null; }
	public MyHelperClass addPart(String o0, InputStreamBody o1){ return null; }}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class InputStreamBody {

InputStreamBody(BufferedInputStream o0, String o1){}
	InputStreamBody(){}}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}
