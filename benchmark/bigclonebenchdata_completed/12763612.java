
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12763612 {
public MyHelperClass copy(InputStream o0, OutputStream o1, long o2){ return null; }
public MyHelperClass Log;
	public MyHelperClass HttpStatus;
	public MyHelperClass HttpManager;
	public MyHelperClass Main;
	public MyHelperClass publishProgress(int o0){ return null; }

//    @Override
    protected String doInBackground(MarketData... market) {
        publishProgress(-1);
        InputStream input = null;
        OutputStream output = null;
        long lenghtOfFile = 0;
        int lengthRead = 0;
        try {
            HttpGet newReq = new HttpGet(market[0].apkURL);
            HttpResponse response =(HttpResponse)(Object) HttpManager.execute(newReq);
            Log.i(Main.TAG, "req:" + response.getStatusLine().getStatusCode());
            while (response.getStatusLine().getStatusCode() == HttpStatus.SC_MOVED_TEMPORARILY || response.getStatusLine().getStatusCode() == HttpStatus.SC_MOVED_PERMANENTLY) {
                Log.i(Main.TAG, "redirect to:" + response.getFirstHeader("Location").getValue());
                newReq = new HttpGet(response.getFirstHeader("Location").getValue());
                response =(HttpResponse)(Object) HttpManager.execute(newReq);
                Log.i(Main.TAG, "req:" + response.getStatusLine().getStatusCode());
            }
            lenghtOfFile =(long)(Object) response.getEntity().getContentLength();
            input =(InputStream)(Object) response.getEntity().getContent();
            output =(OutputStream)(Object) new FileOutputStream(market[0].getFile());
            lengthRead =(int)(Object) copy(input, output, lenghtOfFile);
        } catch (UncheckedIOException e) {
            Log.w(Main.TAG, "error downloading " + market[0].apkURL,(IOException)(Object) e);
        } catch (ArithmeticException e) {
            Log.w(Main.TAG, "error downloading " + market[0].apkURL,(IOException)(Object) e);
        } finally {
            Log.v(Main.TAG, "failed to download " + market[0].apkURL + " " + lengthRead + "/" + lenghtOfFile);
            if (lenghtOfFile != 0 && lengthRead != lenghtOfFile) {
                Log.w(Main.TAG, "failed to download " + market[0].apkURL + " " + lengthRead + "/" + lenghtOfFile);
                try {
                    if (input != null) input.close();
                    if (output != null) output.close();
                    market[0].getFile().delete();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
        Log.v(Main.TAG, "copied " + market[0].apkURL + " to " + market[0].getFile());
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_MOVED_TEMPORARILY;
	public MyHelperClass TAG;
	public MyHelperClass SC_MOVED_PERMANENTLY;
public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass v(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, MalformedURLException o2){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class MarketData {
public MyHelperClass apkURL;
public MyHelperClass getFile(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class HttpGet {

HttpGet(){}
	HttpGet(MyHelperClass o0){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getFirstHeader(String o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
