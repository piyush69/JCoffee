


class c10993811 {
public MyHelperClass mClient;
	public MyHelperClass Log;
	public MyHelperClass convertStreamToString(InputStream o0){ return null; }

        Bitmap downloadImage(String uri) {
            try {
                MyHelperClass mGetMethod = new MyHelperClass();
                mGetMethod.setURI(new URI(uri));
//                MyHelperClass mGetMethod = new MyHelperClass();
                HttpResponse resp =(HttpResponse)(Object) mClient.execute(mGetMethod);
                if ((int)(Object)resp.getStatusLine().getStatusCode() < 400) {
                    InputStream is =(InputStream)(Object) resp.getEntity().getContent();
                    String tmp =(String)(Object) convertStreamToString(is);
                    MyHelperClass TAG = new MyHelperClass();
                    Log.d(TAG, "hoge" + tmp);
                    is.close();
                    return null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass setURI(URI o0){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }}

class Bitmap {

}

class URI {

URI(String o0){}
	URI(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
