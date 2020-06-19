
import java.io.UncheckedIOException;


class c20228526 {
public static MyHelperClass downloadContent(URLConnection o0, File o1){ return null; }
//public MyHelperClass downloadContent(URLConnection o0, File o1){ return null; }

    public static File downloadURL(URL url, File dir, String sfilename) {
        MyHelperClass MerlotDebug = new MyHelperClass();
        MerlotDebug.msg("Downloading URL: " + url);
        String filename =(String)(Object) url.getFile();
        if (filename.indexOf('/') >= 0) {
            filename = filename.substring(filename.lastIndexOf('/') + 1);
        }
        File cache = new File(dir, sfilename);
        try {
            if (!(Boolean)(Object)dir.exists()) {
                dir.mkdirs();
            }
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            if ((Boolean)(Object)cache.exists() && (Boolean)(Object)cache.canRead()) {
                connection.connect();
                long remoteTimestamp =(long)(Object) connection.getLastModified();
                if (remoteTimestamp == 0 || remoteTimestamp > (long)(Object)cache.lastModified()) {
                    cache =(File)(Object) downloadContent(connection, cache);
                } else {
//                    MyHelperClass MerlotDebug = new MyHelperClass();
                    MerlotDebug.msg("Using cached version for URL: " + url);
                }
            } else {
                cache =(File)(Object) downloadContent(connection, cache);
            }
        } catch (UncheckedIOException ex) {
//            MyHelperClass MerlotDebug = new MyHelperClass();
            MerlotDebug.exception((IOException)(Object)ex);
        }
        if (cache != null && (boolean)(Object)cache.exists()) {
            return cache;
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exception(IOException o0){ return null; }
	public MyHelperClass msg(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass lastModified(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
