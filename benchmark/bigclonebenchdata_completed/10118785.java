
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10118785 {

//    @Override
    public void download(String remoteFilePath, String localFilePath) {
        InputStream remoteStream = null;
        try {
            MyHelperClass client = new MyHelperClass();
            remoteStream =(InputStream)(Object) client.get(remoteFilePath);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        OutputStream localStream = null;
        try {
            localStream =(OutputStream)(Object) new FileOutputStream(new File(localFilePath));
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(remoteStream, localStream);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(String o0){}
	File(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
