
import java.io.UncheckedIOException;


class c14803892 {
public MyHelperClass readIntoTempFile(MyHelperClass o0){ return null; }
public MyHelperClass loggerPrefix;

    public File getURL(URL url) throws IOException {
        URLConnection conn = null;
        File tempFile = null;
        MyHelperClass Logger = new MyHelperClass();
        Logger l =(Logger)(Object) Logger.instance();
        String className = getClass().getName();
//        MyHelperClass Logger = new MyHelperClass();
        l.log(Logger.DEBUG, loggerPrefix, className + ".getURL", "GET URL " + url.toString());
        try {
            conn =(URLConnection)(Object) url.openConnection();
            tempFile =(File)(Object) readIntoTempFile(conn.getInputStream());
        } catch (UncheckedIOException ioe) {
//            MyHelperClass Logger = new MyHelperClass();
            l.log(Logger.ERROR, loggerPrefix, className + ".getURL",(String)(Object) ioe);
            throw ioe;
        } finally {
            conn = null;
        }
//        MyHelperClass Logger = new MyHelperClass();
        l.log(Logger.DEBUG, loggerPrefix, className + ".getURL", "received URL");
        return tempFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass DEBUG;
public MyHelperClass instance(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Logger {

public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, String o2, String o3){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, String o2, IOException o3){ return null; }}
