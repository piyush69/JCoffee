
import java.io.UncheckedIOException;


class c14803891 {
public MyHelperClass readIntoTempFile(MyHelperClass o0){ return null; }
public MyHelperClass loggerPrefix;

    public File sendPayload(SoapEnvelope payload, URL url) throws IOException {
        URLConnection conn = null;
        File tempFile = null;
        MyHelperClass Logger = new MyHelperClass();
        Logger l =(Logger)(Object) Logger.instance();
        String className = getClass().getName();
//        MyHelperClass Logger = new MyHelperClass();
        l.log(Logger.DEBUG, loggerPrefix, className + ".sendPayload", "sending payload to " + url.toString());
        try {
            conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            payload.writeTo(conn.getOutputStream());
            tempFile =(File)(Object) readIntoTempFile(conn.getInputStream());
        } catch (UncheckedIOException ioe) {
//            MyHelperClass Logger = new MyHelperClass();
            l.log(Logger.ERROR, loggerPrefix, className + ".sendPayload",(String)(Object) ioe);
            throw ioe;
        } finally {
            conn = null;
        }
//        MyHelperClass Logger = new MyHelperClass();
        l.log(Logger.DEBUG, loggerPrefix, className + ".sendPayload", "received response");
        return tempFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass DEBUG;
public MyHelperClass instance(){ return null; }}

class SoapEnvelope {

public MyHelperClass writeTo(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class Logger {

public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, String o2, String o3){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, String o2, IOException o3){ return null; }}
