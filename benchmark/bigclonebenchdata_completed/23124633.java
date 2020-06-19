
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23124633 {
public MyHelperClass IOUtils;
	public MyHelperClass LOGGER;
	public MyHelperClass getEncodeCharset(){ return null; }
	public MyHelperClass getDecodeCharset(){ return null; }

    private void saveFile(Folder folder, Object key, InputStream stream) throws FileManagerException {
        File file = new File(folder, key.toString());
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.debug("Writing file: " + file.getAbsolutePath());
        Writer writer = null;
        Writer encodedWriter = null;
        try {
            encodedWriter =(Writer)(Object) new OutputStreamWriter(new FileOutputStream(file), getEncodeCharset());
            IOUtils.copy(stream, encodedWriter, getDecodeCharset());
            LOGGER.info("saveFile(), decode charset: " + getDecodeCharset() + ", encode charset: " + getEncodeCharset());
        } catch (UncheckedIOException e) {
            throw new FileManagerException("Unable to write to file: " + file.getAbsolutePath(),(IOException)(Object) e);
        } finally {
            try {
                encodedWriter.close();
            } catch (UncheckedIOException e) {
                throw new FileManagerException("Unable to write to file: " + file.getAbsolutePath(),(IOException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, Writer o1, MyHelperClass o2){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Folder {

}

class InputStream {

}

class FileManagerException extends Exception{
	public FileManagerException(String errorMessage) { super(errorMessage); }
	FileManagerException(String o0, IOException o1){}
	FileManagerException(){}
}

class File {

File(){}
	File(Folder o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class Writer {

public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, MyHelperClass o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
