
import java.io.UncheckedIOException;


class c7187035 {

//    @Override
    public byte[] read(String path) throws PersistenceException {
        InputStream reader = null;
        ByteArrayOutputStream sw = new ByteArrayOutputStream();
        try {
            reader =(InputStream)(Object) new FileInputStream(path);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(reader, sw);
        } catch (Exception e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("fail to read file - " + path, e);
            throw new PersistenceException((String)(Object)e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("fail to close reader", e);
                }
            }
        }
        return(byte[])(Object) sw.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
