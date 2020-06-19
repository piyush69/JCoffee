
import java.io.UncheckedIOException;


class c5984971 {
public static MyHelperClass getExecuteMethod(String o0, String o1, Map o2, Object o3){ return null; }
public static MyHelperClass Log;
	public static MyHelperClass client;
//	public MyHelperClass getExecuteMethod(String o0, String o1, Map o2, Object o3){ return null; }
//public MyHelperClass client;
//	public MyHelperClass Log;

    public static HttpEntity sendHE(String method, String url, Map paramMap, String encoding) throws HttpServerStatusException {
        MyHelperClass TAG = new MyHelperClass();
        Log.i(TAG, "url:" + url);
        boolean bVisitOK = false;
        int tryCnt = 0;
        MyHelperClass MAXTRYCNT = new MyHelperClass();
        while (!bVisitOK && (tryCnt++ < (int)(Object)MAXTRYCNT)) {
            try {
                HttpRequestBase base =(HttpRequestBase)(Object) getExecuteMethod(method, url, paramMap, null);
                MyHelperClass localContext = new MyHelperClass();
                HttpResponse response =(HttpResponse)(Object) client.execute(base, localContext);
                int status =(int)(Object) response.getStatusLine().getStatusCode();
                if (status == 200) {
                    HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                    if (entity != null) {
                        return entity;
                    }
                } else {
                    HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                    if (entity != null) {
                        entity.consumeContent();
                    }
                    throw new HttpServerStatusException(status, "");
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
        return null;
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

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }}

class HttpServerStatusException extends Exception{
	public HttpServerStatusException(String errorMessage) { super(errorMessage); }
	HttpServerStatusException(){}
	HttpServerStatusException(int o0, String o1){}
}

class HttpRequestBase {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
