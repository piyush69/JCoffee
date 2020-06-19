
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4636728 {

    private static Bitmap loadFromUrl(String url, String portId) {
        Bitmap bitmap = null;
        final HttpGet get = new HttpGet(url);
        HttpEntity entity = null;
        try {
            MyHelperClass ServiceProxy = new MyHelperClass();
            final HttpResponse response =(HttpResponse)(Object) ServiceProxy.getInstance(portId).execute(get);
            MyHelperClass HttpStatus = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                entity =(HttpEntity)(Object) response.getEntity();
                try {
                    InputStream in =(InputStream)(Object) entity.getContent();
                    MyHelperClass BitmapFactory = new MyHelperClass();
                    bitmap =(Bitmap)(Object) BitmapFactory.decodeStream(in);
                } catch (UncheckedIOException e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.error((IOException)(Object)e);
                }
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.error((IOException)(Object)e);
        } finally {
            if (entity != null) {
                try {
                    entity.consumeContent();
                } catch (UncheckedIOException e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.error((IOException)(Object)e);
                }
            }
        }
        return bitmap;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass decodeStream(InputStream o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class Bitmap {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
