
import java.io.UncheckedIOException;


class c4975452 {
public MyHelperClass LogService;

    private InputStream openStream(URL url, ProgressListener listener, int minProgress, int maxProgress) throws IOException {
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setDoInput(true);
        con.setDoOutput(false);
        String lengthStr =(String)(Object) con.getHeaderField("Content-Length");
        InputStream urlIn;
        try {
            urlIn =(InputStream)(Object) con.getInputStream();
        } catch (UncheckedIOException e) {
            throw new IOException(con.getResponseCode() + ": " + con.getResponseMessage(),(IOException)(Object) e);
        }
        if (lengthStr == null || lengthStr.isEmpty()) {
            MyHelperClass LogService = new MyHelperClass();
            LogService.getRoot().warning("Server did not send content length.");
            return urlIn;
        } else {
            try {
                long length = Long.parseLong(lengthStr);
                return (InputStream)(Object)new ProgressReportingInputStream(urlIn, listener, minProgress, maxProgress, length);
            } catch (NumberFormatException e) {
                MyHelperClass Level = new MyHelperClass();
                LogService.getRoot().log(Level.WARNING, "Server sent illegal content length: " + lengthStr, e);
                return urlIn;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass getRoot(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, NumberFormatException o2){ return null; }
	public MyHelperClass warning(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class ProgressListener {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
	IOException(String o0, IOException o1){}
	IOException(){}
}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }}

class ProgressReportingInputStream {

ProgressReportingInputStream(){}
	ProgressReportingInputStream(InputStream o0, ProgressListener o1, int o2, int o3, long o4){}}
