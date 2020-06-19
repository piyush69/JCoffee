import java.io.*;
import java.lang.*;
import java.util.*;



class c19983153 {
public static MyHelperClass HttpStatus;
	public static MyHelperClass BitmapFactory;
	public static MyHelperClass Log;
	public static MyHelperClass EntityUtils;
	public static MyHelperClass TAG;
	public static MyHelperClass getHttpClient(){ return null; }
//public MyHelperClass Log;
//	public MyHelperClass HttpStatus;
//	public MyHelperClass TAG;
//	public MyHelperClass BitmapFactory;
//	public MyHelperClass EntityUtils;
//	public MyHelperClass getHttpClient(){ return null; }

    public static Bitmap loadBitmap(String url) {
        try {
            final HttpClient httpClient =(HttpClient)(Object) getHttpClient();
            final HttpResponse resp =(HttpResponse)(Object) httpClient.execute(new HttpGet(url));
            final HttpEntity entity =(HttpEntity)(Object) resp.getEntity();
            final int statusCode =(int)(Object) resp.getStatusLine().getStatusCode();
            if (statusCode != (int)(Object)HttpStatus.SC_OK || entity == null) {
                return null;
            }
            final byte[] respBytes =(byte[])(Object) EntityUtils.toByteArray(entity);
            Options decodeOptions = new Options();
            decodeOptions.inSampleSize =(MyHelperClass)(Object) 1;
            return(Bitmap)(Object) BitmapFactory.decodeByteArray(respBytes, 0, respBytes.length, decodeOptions);
        } catch (Exception e) {
            Log.w(TAG, "Problem while loading image: " + e.toString(), e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass toByteArray(HttpEntity o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass decodeByteArray(byte[] o0, int o1, int o2, Options o3){ return null; }}

class Bitmap {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpGet {

HttpGet(){}
	HttpGet(String o0){}}

class HttpEntity {

}

class Options {
public MyHelperClass inSampleSize;
}
