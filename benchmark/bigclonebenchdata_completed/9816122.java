import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9816122 {
public MyHelperClass mCache;
	public MyHelperClass uri;
	public MyHelperClass mResourceCache;
	public MyHelperClass mActiveRequestsMap;
	public MyHelperClass getUngzippedContent(HttpEntity o0){ return null; }

            public Request call()  throws Throwable {
                InputStream is = null;
                try {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) Log.d(TAG, "Requesting: " + request.uri);
                    HttpGet httpGet = new HttpGet(uri.toString());
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
                        MyHelperClass request = new MyHelperClass();
                        if (mResourceCache.store(request.hash, bitmap)) {
                            mCache.put(uri.toString(), new SoftReference<Bitmap>(bitmap));
//                            MyHelperClass DEBUG = new MyHelperClass();
                            if ((boolean)(Object)DEBUG) Log.d(TAG, "Request successful: " + request.uri);
                        } else {
//                            MyHelperClass request = new MyHelperClass();
                            mResourceCache.invalidate(request.hash);
                        }
                    }
                } catch (IOException e) {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) Log.d(TAG, "IOException", e);
                } finally {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) Log.e(TAG, "Request finished: " + request.uri);
                    MyHelperClass request = new MyHelperClass();
                    mActiveRequestsMap.remove(request);
                    if (is != null) {
//                        MyHelperClass request = new MyHelperClass();
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
                MyHelperClass request = new MyHelperClass();
                return(Request)(Object) request;
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass hash;
	public MyHelperClass uri;
public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass decodeStream(InputStream o0){ return null; }}

class Request {

}

class HttpGet {

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
