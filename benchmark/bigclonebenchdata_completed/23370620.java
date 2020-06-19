


class c23370620 {
public MyHelperClass getDataEncryptionKey(){ return null; }

    private File prepareFileForUpload(File source, String s3key) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File tmp =(File)(Object) File.createTempFile("dirsync", ".tmp");
        tmp.deleteOnExit();
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new FileInputStream(source);
            MyHelperClass cipher = new MyHelperClass();
            out =(OutputStream)(Object) new DeflaterOutputStream(new CryptOutputStream(new FileOutputStream(tmp), cipher, getDataEncryptionKey()));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            in.close();
            out.close();
            return tmp;
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class File {

public MyHelperClass deleteOnExit(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class DeflaterOutputStream {

DeflaterOutputStream(CryptOutputStream o0){}
	DeflaterOutputStream(){}}

class CryptOutputStream {

CryptOutputStream(){}
	CryptOutputStream(FileOutputStream o0, MyHelperClass o1, MyHelperClass o2){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
