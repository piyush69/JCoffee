
import java.io.UncheckedIOException;


class c7975225 {
public MyHelperClass copyStream(InputStream o0, FileOutputStream o1, ProgressMonitor o2){ return null; }
public MyHelperClass root;
	public MyHelperClass toCanonicalFilename(String o0){ return null; }

    protected void downloadFile(String filename, java.io.File targetFile, File partFile, ProgressMonitor monitor) throws java.io.IOException {
        FileOutputStream out = null;
        InputStream is = null;
        try {
            filename =(String)(Object) toCanonicalFilename(filename);
            URL url = new URL(root + filename.substring(1));
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            int i =(int)(Object) urlc.getContentLength();
            monitor.setTaskSize(i);
            out = new FileOutputStream(partFile);
            is =(InputStream)(Object) urlc.getInputStream();
            monitor.started();
            copyStream(is, out, monitor);
            monitor.finished();
            out.close();
            is.close();
            if (!(Boolean)(Object)partFile.renameTo(targetFile)) {
                throw new IllegalArgumentException("unable to rename " + partFile + " to " + targetFile);
            }
        } catch (UncheckedIOException e) {
            if (out != null) out.close();
            if (is != null) is.close();
            if ((boolean)(Object)partFile.exists() && !(Boolean)(Object)partFile.delete()) {
                throw new IllegalArgumentException("unable to delete " + partFile);
            }
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass renameTo(java.io.File o0){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class ProgressMonitor {

public MyHelperClass started(){ return null; }
	public MyHelperClass setTaskSize(int o0){ return null; }
	public MyHelperClass finished(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
