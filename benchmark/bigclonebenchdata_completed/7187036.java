
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7187036 {

//    @Override
    public void write(String path, InputStream is) throws PersistenceException {
        Writer out = null;
        try {
            out =(Writer)(Object) new OutputStreamWriter(new FileOutputStream(path), "utf-8");
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, out);
        } catch (UncheckedIOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("fail to write file",(IOException)(Object) e);
            throw new PersistenceException((String)(Object)e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                    out = null;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, Writer o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class InputStream {

}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}

class Writer {

public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
