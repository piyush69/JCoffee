
import java.io.UncheckedIOException;


class c23370621 {
public MyHelperClass fetchStream(InputStream o0){ return null; }
public MyHelperClass FileUtils;
	public MyHelperClass File;
	public MyHelperClass IOUtils;
	public MyHelperClass cipher;
	public MyHelperClass getDataEncryptionKey(){ return null; }
	public MyHelperClass downloadData(String o0){ return null; }

    private void downloadFile(File target, String s3key) throws IOException, S3ServiceException {
        InputStream in =(InputStream)(Object) downloadData(s3key);
        if (in == null) {
            throw new IOException("No data found");
        }
        in =(InputStream)(Object) new InflaterInputStream(new CryptInputStream(in, cipher, getDataEncryptionKey()));
        File temp =(File)(Object) File.createTempFile("dirsync", null);
        FileOutputStream fout = new FileOutputStream(temp);
        try {
            IOUtils.copy(in, fout);
            if ((boolean)(Object)target.exists()) {
                target.delete();
            }
            IOUtils.closeQuietly(fout);
            IOUtils.closeQuietly(in);
            FileUtils.moveFile(temp, target);
        } catch (UncheckedIOException e) {
            fetchStream(in);
            throw e;
        } finally {
            IOUtils.closeQuietly(fout);
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass moveFile(File o0, File o1){ return null; }}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class S3ServiceException extends Exception{
	public S3ServiceException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class InflaterInputStream {

InflaterInputStream(CryptInputStream o0){}
	InflaterInputStream(){}}

class CryptInputStream {

CryptInputStream(InputStream o0, MyHelperClass o1, MyHelperClass o2){}
	CryptInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
