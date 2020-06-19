
import java.io.UncheckedIOException;


class c21044594 {
public MyHelperClass reportError(String o0, IOException o1, MyHelperClass o2){ return null; }
public MyHelperClass FilenameUtils;
	public MyHelperClass Collections;

        public void run() {
            MyHelperClass file = new MyHelperClass();
            final String basename =(String)(Object) FilenameUtils.removeExtension(file.getName());
            MyHelperClass logDirectory = new MyHelperClass();
            final File compressed = new File(logDirectory, basename + ".gz");
            InputStream in = null;
            OutputStream out = null;
            try {
//                MyHelperClass file = new MyHelperClass();
                in =(InputStream)(Object) new FileInputStream(file);
                out =(OutputStream)(Object) new GZIPOutputStream(new FileOutputStream(compressed));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
                in.close();
                out.close();
            } catch (UncheckedIOException e) {
                MyHelperClass ErrorManager = new MyHelperClass();
                reportError("Error compressing olg log file after file rotation",(IOException)(Object) e, ErrorManager.GENERIC_FAILURE);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(in);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(out);
            }
            MyHelperClass files = new MyHelperClass();
            Collections.replaceAll(files, file, compressed);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GENERIC_FAILURE;
public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass removeExtension(MyHelperClass o0){ return null; }
	public MyHelperClass replaceAll(MyHelperClass o0, MyHelperClass o1, File o2){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
