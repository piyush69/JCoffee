
import java.io.UncheckedIOException;


class c13064742 {
public MyHelperClass usesIdentifier(DataIdentifier o0){ return null; }
	public MyHelperClass getFile(DataIdentifier o0){ return null; }
public MyHelperClass DIGEST;
	public MyHelperClass IOUtils;
	public MyHelperClass inUse;
	public MyHelperClass MessageDigest;
	public MyHelperClass newTemporaryFile(){ return null; }

    public DataRecord addRecord(InputStream input) throws DataStoreException {
        File temporary = null;
        try {
            temporary =(File)(Object) newTemporaryFile();
            DataIdentifier tempId = new DataIdentifier(temporary.getName());
            usesIdentifier(tempId);
            long length = 0;
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(DIGEST);
            OutputStream output =(OutputStream)(Object) new DigestOutputStream(new FileOutputStream(temporary), digest);
            try {
                length =(long)(Object) IOUtils.copyLarge(input, output);
            } finally {
                output.close();
            }
            DataIdentifier identifier = new DataIdentifier(digest.digest());
            File file;
            synchronized (this) {
                usesIdentifier(identifier);
                file =(File)(Object) getFile(identifier);
                System.out.println("new file name: " + file.getName());
                File parent =(File)(Object) file.getParentFile();
                System.out.println("parent file: " + file.getParentFile().getName());
                if (!(Boolean)(Object)parent.isDirectory()) {
                    parent.mkdirs();
                }
                if (!(Boolean)(Object)file.exists()) {
                    temporary.renameTo(file);
                    if (!(Boolean)(Object)file.exists()) {
                        throw new IOException("Can not rename " + temporary.getAbsolutePath() + " to " + file.getAbsolutePath() + " (media read only?)");
                    }
                } else {
                    long now = System.currentTimeMillis();
                    if ((long)(Object)file.lastModified() < now) {
                        file.setLastModified(now);
                    }
                }
                if (!(Boolean)(Object)file.isFile()) {
                    throw new IOException("Not a file: " + file);
                }
                if ((long)(Object)file.length() != length) {
                    throw new IOException(DIGEST + " collision: " + file);
                }
            }
            inUse.remove(tempId);
            return (DataRecord)(Object)new FileDataRecord(identifier, file);
        } catch (UncheckedIOException e) {
            throw new DataStoreException(DIGEST + " not available",(NoSuchAlgorithmException)(Object) e);
        } catch (IOException e) {
            throw new DataStoreException("Could not add record", e);
        } finally {
            if (temporary != null) {
                temporary.delete();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass remove(DataIdentifier o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class DataRecord {

}

class DataStoreException extends Exception{
	public DataStoreException(String errorMessage) { super(errorMessage); }
	DataStoreException(String o0, NoSuchAlgorithmException o1){}
	DataStoreException(String o0, IOException o1){}
	DataStoreException(){}
}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class DataIdentifier {

DataIdentifier(MyHelperClass o0){}
	DataIdentifier(){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class DigestOutputStream {

DigestOutputStream(){}
	DigestOutputStream(FileOutputStream o0, MessageDigest o1){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileDataRecord {

FileDataRecord(DataIdentifier o0, File o1){}
	FileDataRecord(){}}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
