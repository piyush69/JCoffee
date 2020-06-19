import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6812441 {
public MyHelperClass Log;
	public MyHelperClass Mode;

    Bitmap downloadBitmap(String url) {
        final int IO_BUFFER_SIZE = 4 * 1024;
        MyHelperClass mode = new MyHelperClass();
        final HttpClient client = (mode == Mode.NO_ASYNC_TASK) ? new DefaultHttpClient() : AndroidHttpClient.newInstance("Android");
        final HttpGet getRequest = new HttpGet(url);
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(getRequest);
            final int statusCode =(int)(Object) response.getStatusLine().getStatusCode();
            MyHelperClass HttpStatus = new MyHelperClass();
            if (statusCode != (int)(Object)HttpStatus.SC_OK) {
                MyHelperClass Log = new MyHelperClass();
                Log.w("ImageDownloader", "Error " + statusCode + " while retrieving bitmap from " + url);
                return null;
            }
            final HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity != null) {
                InputStream inputStream = null;
                try {
                    inputStream =(InputStream)(Object) entity.getContent();
                    MyHelperClass BitmapFactory = new MyHelperClass();
                    return(Bitmap)(Object) BitmapFactory.decodeStream(new FlushedInputStream(inputStream));
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    entity.consumeContent();
                }
            }
        } catch (IOException e) {
            getRequest.abort();
            MyHelperClass LOG_TAG = new MyHelperClass();
            Log.w(LOG_TAG, "I/O error while retrieving bitmap from " + url, e);
        } catch (IllegalStateException e) {
            getRequest.abort();
            MyHelperClass LOG_TAG = new MyHelperClass();
            Log.w((String)(Object)LOG_TAG, "Incorrect URL: " + url);
        } catch (Exception e) {
            getRequest.abort();
            MyHelperClass LOG_TAG = new MyHelperClass();
            Log.w(LOG_TAG, "Error while retrieving bitmap from " + url, e);
        } finally {
            if (((AndroidHttpClient)(Object)client instanceof AndroidHttpClient)) {
                ((AndroidHttpClient)(AndroidHttpClient)(Object) client).close();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass NO_ASYNC_TASK;
public MyHelperClass w(String o0, String o1){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass decodeStream(FlushedInputStream o0){ return null; }}

class Bitmap {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class FlushedInputStream {

FlushedInputStream(InputStream o0){}
	FlushedInputStream(){}}

class AndroidHttpClient {

public static MyHelperClass newInstance(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class DefaultHttpClient {

}
