
import java.io.UncheckedIOException;


class c5984968 {
public static MyHelperClass readByteStream(MyHelperClass o0, String o1){ return null; }
	public static MyHelperClass getExecuteMethod(String o0, String o1, Map o2, File o3){ return null; }
public static MyHelperClass Log;
	public static MyHelperClass client;
//	public MyHelperClass readByteStream(MyHelperClass o0, String o1){ return null; }
//	public MyHelperClass getExecuteMethod(String o0, String o1, Map o2, File o3){ return null; }
//public MyHelperClass client;
//	public MyHelperClass Log;

    public static String send(String method, String url, Map paramMap, File file, String encoding) throws HttpServerStatusException {
        MyHelperClass TAG = new MyHelperClass();
        Log.i(TAG, "url:" + url);
        boolean bVisitOK = false;
        int tryCnt = 0;
        String result = "";
        MyHelperClass MAXTRYCNT = new MyHelperClass();
        while (!bVisitOK && (tryCnt++ < (int)(Object)MAXTRYCNT)) {
            try {
                HttpRequestBase base =(HttpRequestBase)(Object) getExecuteMethod(method, url, paramMap, file);
                MyHelperClass localContext = new MyHelperClass();
                HttpResponse response =(HttpResponse)(Object) client.execute(base, localContext);
                int status =(int)(Object) response.getStatusLine().getStatusCode();
                HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                if (entity != null) {
                    result =(String)(Object) readByteStream(entity.getContent(), encoding);
                    entity.consumeContent();
                }
                if (status == 200) {
                    return result;
                } else {
                    throw new HttpServerStatusException(status, result);
                }
            } catch (HttpServerStatusException e) {
                throw e;
            } catch (IllegalStateException e) {
                bVisitOK = false;
//                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, e.toString());
            } catch (UncheckedIOException e) {
                bVisitOK = false;
//                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, e.toString());
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass execute(HttpRequestBase o0, MyHelperClass o1){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}

class Map {

}

class File {

}

class HttpServerStatusException extends Exception{
	public HttpServerStatusException(String errorMessage) { super(errorMessage); }
	HttpServerStatusException(int o0, String o1){}
	HttpServerStatusException(){}
}

class HttpRequestBase {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
