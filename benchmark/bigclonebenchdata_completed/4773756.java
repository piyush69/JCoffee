
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4773756 {

    public void zipDocsetFiles(SaxHandler theXmlHandler, int theEventId, Attributes theAtts) throws BpsProcessException {
        ZipOutputStream myZipOut = null;
        BufferedInputStream myDocumentInputStream = null;
        String myFinalFile = null;
        String myTargetPath = null;
        String myTargetFileName = null;
        String myInputFileName = null;
        byte[] myBytesBuffer = null;
        int myLength = 0;
        try {
            myZipOut = new ZipOutputStream(new FileOutputStream(myFinalFile));
            myZipOut.putNextEntry(new ZipEntry(myTargetPath + myTargetFileName));
            myDocumentInputStream = new BufferedInputStream(new FileInputStream(myInputFileName));
            while ((myLength =(int)(Object) myDocumentInputStream.read(myBytesBuffer, 0, 4096)) != -1) myZipOut.write(myBytesBuffer, 0, myLength);
            myZipOut.closeEntry();
            myZipOut.close();
        } catch (UncheckedIOException e) {
            MyHelperClass BpsProcessException = new MyHelperClass();
            throw (new BpsProcessException(BpsProcessException.ERR_OPEN_FILE, "FileNotFoundException while building zip dest file"));
        } catch (ArithmeticException e) {
            MyHelperClass BpsProcessException = new MyHelperClass();
            throw (new BpsProcessException(BpsProcessException.ERR_OPEN_FILE, "IOException while building zip dest file"));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERR_OPEN_FILE;
}

class SaxHandler {

}

class Attributes {

}

class BpsProcessException extends Exception{
	public BpsProcessException(String errorMessage) { super(errorMessage); }
	BpsProcessException(){}
	BpsProcessException(MyHelperClass o0, String o1){}
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
