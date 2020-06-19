


class c3342342 {
public MyHelperClass Log;
	public MyHelperClass Server;

    private void downloadPhoto(File photo, String url) {
        try {
            HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "Dowloading photo from " + Server.URL + url);
            MyHelperClass Server = new MyHelperClass();
            HttpGet request = new HttpGet(Server.URL + url);
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            InputStream serverPhoto =(InputStream)(Object) entity.getContent();
            photo.createNewFile();
            FileOutputStream photoStream = new FileOutputStream(photo);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) serverPhoto.read(buf)) > 0) {
                photoStream.write(buf, 0, len);
            }
            photoStream.flush();
            photoStream.close();
        } catch (Exception e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL;
public MyHelperClass v(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
