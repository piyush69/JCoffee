


class c5772945 {
public MyHelperClass buildFullURL(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
public MyHelperClass buildURL(String o0, MyHelperClass o1, Object o2){ return null; }
public MyHelperClass API_VERSION;
	public MyHelperClass content_host;
	public MyHelperClass port;
public MyHelperClass HttpMultipartMode;
	public MyHelperClass auth;
	public MyHelperClass HTTP;
	public MyHelperClass getClient(String o0){ return null; }

    @SuppressWarnings("unchecked")
    public HttpResponse putFile(String root, String to_path, File file_obj) throws DropboxException {
        String path = "/files/" + root + to_path;
        try {
            Path targetPath = new Path(path);
            MyHelperClass secureProtocol = new MyHelperClass();
            String target =(String)(Object) buildFullURL(secureProtocol, content_host, port, buildURL(targetPath.removeLastSegments(1).addTrailingSeparator().toString(), API_VERSION, null));
            HttpClient client =(HttpClient)(Object) getClient(target);
            HttpPost req = new HttpPost(target);
            List nvps =(List)(Object) new ArrayList();
            nvps.add(new BasicNameValuePair("file", targetPath.lastSegment()));
            req.setEntity((MultipartEntity)(Object)new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
            auth.sign(req);
            MultipartEntity entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
            FileBody bin = new FileBody(file_obj, targetPath.lastSegment(), "application/octet-stream", null);
            entity.addPart("file", bin);
            req.setEntity(entity);
            HttpResponse resp =(HttpResponse)(Object) client.execute(req);
            resp.getEntity().consumeContent();
            return resp;
        } catch (Exception e) {
            throw new DropboxException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
	public MyHelperClass BROWSER_COMPATIBLE;
public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass sign(HttpPost o0){ return null; }
	public MyHelperClass addTrailingSeparator(){ return null; }}

class File {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class DropboxException extends Exception{
	public DropboxException(String errorMessage) { super(errorMessage); }
}

class Path {

Path(String o0){}
	Path(){}
	public MyHelperClass removeLastSegments(int o0){ return null; }
	public MyHelperClass lastSegment(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0, MyHelperClass o1){}}

class MultipartEntity {

MultipartEntity(MyHelperClass o0){}
	MultipartEntity(){}
	public MyHelperClass addPart(String o0, FileBody o1){ return null; }}

class FileBody {

FileBody(){}
	FileBody(File o0, MyHelperClass o1, String o2, Object o3){}}
