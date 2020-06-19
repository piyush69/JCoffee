import java.io.*;
import java.lang.*;
import java.util.*;



class c17347053 {
public MyHelperClass BUFFRE_SIZE;
	public MyHelperClass url;
	public MyHelperClass destFile;
	public MyHelperClass finished(){ return null; }
	public MyHelperClass checkState(){ return null; }
	public MyHelperClass cancelled(){ return null; }
	public MyHelperClass progress(long o0){ return null; }
	public MyHelperClass started(long o0){ return null; }
	public MyHelperClass checkAbortFlag(){ return null; }

//    @Override
    public HttpResponse makeRequest() throws RequestCancelledException, IllegalStateException, IOException {
        checkState();
        OutputStream out = null;
        InputStream in = null;
        try {
            out = new BufferedOutputStream(new FileOutputStream((String)(Object)destFile));
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) conn.getInputStream();
            byte[] buffer = new byte[(int)(Object)BUFFRE_SIZE];
            int numRead;
            long totalSize =(long)(Object) conn.getContentLength();
            long transferred = 0;
            started(totalSize);
            while (!(Boolean)(Object)checkAbortFlag() && (numRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                out.flush();
                transferred += numRead;
                progress(transferred);
            }
            if ((boolean)(Object)checkAbortFlag()) {
                cancelled();
            } else {
                finished();
            }
            if ((boolean)(Object)checkAbortFlag()) {
                throw new RequestCancelledException();
            }
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class HttpResponse {

}

class RequestCancelledException extends Exception{
	public RequestCancelledException(String errorMessage) { super(errorMessage); }
	RequestCancelledException(){}
}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
