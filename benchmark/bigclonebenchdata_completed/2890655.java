


class c2890655 {
public MyHelperClass Log;

    private Bitmap downloadBitmap(String url) {
        MyHelperClass AndroidHttpClient = new MyHelperClass();
        final AndroidHttpClient client =(AndroidHttpClient)(Object) AndroidHttpClient.newInstance("Android");
        final HttpGet getRequest = new HttpGet(url);
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(getRequest);
            final int statusCode =(int)(Object) response.getStatusLine().getStatusCode();
            MyHelperClass HttpStatus = new MyHelperClass();
            if (statusCode != (int)(Object)HttpStatus.SC_OK) {
                MyHelperClass LOG_TAG = new MyHelperClass();
                Log.w(LOG_TAG, "Error " + statusCode + " while retrieving bitmap from " + url);
                return null;
            }
            final HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity != null) {
                InputStream inputStream = null;
                try {
                    inputStream =(InputStream)(Object) entity.getContent();
                    MyHelperClass BitmapFactory = new MyHelperClass();
                    final Bitmap bitmap =(Bitmap)(Object) BitmapFactory.decodeStream(inputStream);
                    return bitmap;
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    entity.consumeContent();
                }
            }
        } catch (Exception e) {
            getRequest.abort();
            MyHelperClass LOG_TAG = new MyHelperClass();
            Log.w(LOG_TAG, "Error while retrieving bitmap from " + url, e);
        } finally {
            if (client != null) {
                client.close();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass newInstance(String o0){ return null; }
	public MyHelperClass decodeStream(InputStream o0){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, Exception o2){ return null; }}

class Bitmap {

}

class AndroidHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
