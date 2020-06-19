
import java.io.UncheckedIOException;


class c11452667 {

    private void processData(InputStream raw) {
        MyHelperClass remoteName = new MyHelperClass();
        String fileName =(String)(Object) remoteName;
        MyHelperClass localName = new MyHelperClass();
        if (localName != null) {
//            MyHelperClass localName = new MyHelperClass();
            fileName =(String)(Object) localName;
        }
        try {
            FileOutputStream fos = new FileOutputStream(new File(fileName), true);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(raw, fos);
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("ok");
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("error writing file",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}}

class File {

File(String o0){}
	File(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
