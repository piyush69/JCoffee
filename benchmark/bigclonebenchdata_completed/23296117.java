
import java.io.UncheckedIOException;


class c23296117 {
public static MyHelperClass Level;
	public static MyHelperClass buf;
	public static MyHelperClass logger;
	public static MyHelperClass getExtractionDir(){ return null; }
//public MyHelperClass buf;
//	public MyHelperClass Level;
//	public MyHelperClass logger;
//	public MyHelperClass getExtractionDir(){ return null; }

    public static void extractNativeLib(String sysName, String name, boolean load, boolean warning) throws IOException {
        String fullname = System.mapLibraryName(name);
        String path = "native/" + sysName + "/" + fullname;
        URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(path);
        if (url == null) {
            if (!warning) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.WARNING, "Cannot locate native library: {0}/{1}", new String[] { sysName, fullname });
            }
            return;
        }
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        InputStream in =(InputStream)(Object) conn.getInputStream();
        File targetFile = new File(getExtractionDir(), fullname);
        OutputStream out = null;
        try {
            if ((boolean)(Object)targetFile.exists()) {
                long targetLastModified =(long)(Object) targetFile.lastModified();
                long sourceLastModified =(long)(Object) conn.getLastModified();
                if (targetLastModified + 1000 > sourceLastModified) {
                    logger.log(Level.FINE, "Not copying library {0}. Latest already extracted.", fullname);
                    return;
                }
            }
            out =(OutputStream)(Object) new FileOutputStream(targetFile);
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            in = null;
            out.close();
            out = null;
            targetFile.setLastModified(conn.getLastModified());
        } catch (UncheckedIOException ex) {
            if (ex.getMessage().contains("used by another process")) {
                return;
            }
            throw ex;
        } finally {
            if (load) {
                System.load((String)(Object)targetFile.getAbsolutePath());
            }
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        logger.log(Level.FINE, "Copied {0} to {1}", new Object[] { fullname, targetFile });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass FINE;
public MyHelperClass log(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Object[] o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, String[] o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
