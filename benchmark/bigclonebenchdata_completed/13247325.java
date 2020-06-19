
import java.io.UncheckedIOException;


class c13247325 {
public MyHelperClass IOUtils;
	public MyHelperClass openStream(){ return null; }

//    @Override
    public String getPath() {
        InputStream in = null;
        OutputStream out = null;
        File file = null;
        try {
            MyHelperClass RandomStringUtils = new MyHelperClass();
            file =(File)(Object) File.createTempFile("java-storage_" + RandomStringUtils.randomAlphanumeric(32), ".tmp");
            file.deleteOnExit();
            out =(OutputStream)(Object) new FileOutputStream(file);
            in =(InputStream)(Object) openStream();
            IOUtils.copy(in, out);
        } catch (UncheckedIOException e) {
            throw new RuntimeException();
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
        if (file != null && (boolean)(Object)file.exists()) {
            return(String)(Object) file.getPath();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass randomAlphanumeric(int o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class OutputStream {

}

class File {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public static MyHelperClass createTempFile(String o0, String o1){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
