
import java.io.UncheckedIOException;


class c9591960 {
public MyHelperClass Comms;
	public MyHelperClass Files;

    protected Object serveFile(MyServerSocket socket, String filenm, URL url) {
        PrintStream out = null;
        InputStream in = null;
        long len = 0;
        try {
            out = new PrintStream(socket.getOutputStream());
            in =(InputStream)(Object) url.openStream();
            len =(long)(Object) in.available();
        } catch (UncheckedIOException e) {
            MyHelperClass HttpHelper = new MyHelperClass();
            HttpHelper.httpWrap(HttpHelper.EXC, e.toString(), 0);
        }
        MyHelperClass HttpHelper = new MyHelperClass();
        if ((boolean)(Object)HttpHelper.isImage(filenm)) {
//            MyHelperClass HttpHelper = new MyHelperClass();
            out.print(HttpHelper.httpWrapPic(filenm, len));
        } else if (filenm.endsWith(".html")) {
            MyHelperClass MPRES = new MyHelperClass();
            Comms.copyStreamSED(in, out, MPRES);
//        MyHelperClass HttpHelper = new MyHelperClass();
        } else if ((boolean)(Object)HttpHelper.isOtherFile(filenm)) {
//            MyHelperClass HttpHelper = new MyHelperClass();
            out.print(HttpHelper.httpWrapOtherFile(filenm, len));
        } else {
            MyHelperClass MimeUtils = new MyHelperClass();
            String type =(String)(Object) MimeUtils.getMimeType(filenm);
//            MyHelperClass MimeUtils = new MyHelperClass();
            if (type.equals(MimeUtils.UNKNOWN_MIME_TYPE)) {
//                MyHelperClass HttpHelper = new MyHelperClass();
                out.print(HttpHelper.httpWrapMimeType(type, len));
            } else {
//                MyHelperClass HttpHelper = new MyHelperClass();
                out.print(HttpHelper.httpWrapMimeType(type, len));
            }
        }
        if (in == null) {
            MyHelperClass Log = new MyHelperClass();
            Log.logThis("THE INPUT STREAM IS NULL...url=" + url);
        MyHelperClass Files = new MyHelperClass();
        } else Files.copyStream(in, out);
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXC;
	public MyHelperClass UNKNOWN_MIME_TYPE;
public MyHelperClass httpWrapMimeType(String o0, long o1){ return null; }
	public MyHelperClass getMimeType(String o0){ return null; }
	public MyHelperClass isImage(String o0){ return null; }
	public MyHelperClass httpWrapOtherFile(String o0, long o1){ return null; }
	public MyHelperClass logThis(String o0){ return null; }
	public MyHelperClass copyStream(InputStream o0, PrintStream o1){ return null; }
	public MyHelperClass httpWrapPic(String o0, long o1){ return null; }
	public MyHelperClass copyStreamSED(InputStream o0, PrintStream o1, MyHelperClass o2){ return null; }
	public MyHelperClass httpWrap(MyHelperClass o0, String o1, int o2){ return null; }
	public MyHelperClass isOtherFile(String o0){ return null; }}

class MyServerSocket {

public MyHelperClass getOutputStream(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class PrintStream {

PrintStream(MyHelperClass o0){}
	PrintStream(){}
	public MyHelperClass print(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
