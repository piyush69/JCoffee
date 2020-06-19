
import java.io.UncheckedIOException;


class c21092103 {
public MyHelperClass progress(ProgressEvent o0){ return null; }
public MyHelperClass extractRedirectURL(InputStream o0){ return null; }

    private File tmpFileFromURL(String name) {
        if (name == null) {
            System.out.println("ERROR: the provided URL is invalid, aborting download!");
            return null;
        }
        try {
            final URL url = new URL(name);
            final InputStream in =(InputStream)(Object) url.openStream();
            final URLConnection conn =(URLConnection)(Object) url.openConnection();
            final int total =(int)(Object) conn.getContentLength();
            final String contentType =(String)(Object) conn.getContentType();
            MyHelperClass logger = new MyHelperClass();
            logger.fine("DOWNLOADING   Content-type: " + contentType);
            if (contentType.trim().toLowerCase().indexOf("html") != -1) {
                return tmpFileFromURL((String)(Object)extractRedirectURL(in));
            }
            MyHelperClass system = new MyHelperClass();
            final FileManager fileManager =(FileManager)(Object) system.getFileManager();
            final File dest =(File)(Object) fileManager.createTmpModuleFile();
            final FileOutputStream out = new FileOutputStream(dest);
            final byte[] buf = new byte[2048];
//            MyHelperClass logger = new MyHelperClass();
            logger.fine("Total number of bytes to download: " + total);
            int len, current = 0;
            progress(new ProgressEvent(this, "Downloading " + name, 0));
            while ((len =(int)(Object) in.read(buf)) > 0) {
                current += len;
                progress(new ProgressEvent(this, "Downloading " + name, (int) ((current * 100.0) / total)));
                out.write(buf, 0, len);
                out.flush();
            }
            in.close();
            out.flush();
            out.close();
            return dest;
        } catch (UncheckedIOException ex) {
            progress(new ProgressEvent("  ERROR: downloading of " + name + " failed. URL does not exist!"));
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass getFileManager(){ return null; }}

class File {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class FileManager {

public MyHelperClass createTmpModuleFile(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class ProgressEvent {

ProgressEvent(c21092103 o0, String o1, int o2){}
	ProgressEvent(String o0){}
	ProgressEvent(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
