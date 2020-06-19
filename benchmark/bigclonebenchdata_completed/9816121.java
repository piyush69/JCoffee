import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9816121 {
public MyHelperClass notifyObservers(MyHelperClass o0){ return null; }
	public MyHelperClass getUngzippedContent(HttpEntity o0){ return null; }

    private Callable newRequestCall(final Request request)  throws Throwable {
        return new Callable() {

            public Request call() {
                InputStream is = null;
                try {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) Log.d(TAG, "Requesting: " + request.uri);
                    HttpGet httpGet = new HttpGet(request.uri.toString());
                    httpGet.addHeader("Accept-Encoding", "gzip");
                    MyHelperClass mHttpClient = new MyHelperClass();
                    HttpResponse response = mHttpClient.execute(httpGet);
                    String mimeType = response.getHeaders("Content-Type")[0].getValue();
//                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) Log.d(TAG, "mimeType:" + mimeType);
                    if (mimeType.startsWith("image")) {
                        HttpEntity entity = response.getEntity();
                        is = getUngzippedContent(entity);
                        MyHelperClass BitmapFactory = new MyHelperClass();
                        Bitmap bitmap = BitmapFactory.decodeStream(is);
                        MyHelperClass mResourceCache = new MyHelperClass();
                        if (mResourceCache.store(request.hash, bitmap)) {
                            MyHelperClass mCache = new MyHelperClass();
                            mCache.put(request.uri.toString(), new SoftReference(bitmap));
//                            MyHelperClass DEBUG = new MyHelperClass();
                            if ((boolean)(Object)DEBUG) Log.d(TAG, "Request successful: " + request.uri);
                        } else {
//                            MyHelperClass mResourceCache = new MyHelperClass();
                            mResourceCache.invalidate(request.hash);
                        }
                    }
                } catch (IOException e) {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) Log.d(TAG, "IOException", e);
                } finally {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) Log.e(TAG, "Request finished: " + request.uri);
                    MyHelperClass mActiveRequestsMap = new MyHelperClass();
                    mActiveRequestsMap.remove(request);
                    if (is != null) {
                        notifyObservers(request.uri);
                    }
                    try {
                        if (is != null) {
                            is.close();
                        }
                    } catch (IOException e) {
//                        MyHelperClass DEBUG = new MyHelperClass();
                        if ((boolean)(Object)DEBUG) e.printStackTrace();
                    }
                }
                return request;
            }
        };
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass invalidate(MyHelperClass o0){ return null; }
	public MyHelperClass store(MyHelperClass o0, Bitmap o1){ return null; }
	public MyHelperClass remove(Request o0){ return null; }
	public MyHelperClass decodeStream(InputStream o0){ return null; }}

class Request {
public MyHelperClass hash;
	public MyHelperClass uri;
}

class Callable {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getHeaders(String o0){ return null; }}

class HttpEntity {

}

class Bitmap {

}

class SoftReference {

}
