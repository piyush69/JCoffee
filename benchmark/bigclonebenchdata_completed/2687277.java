
import java.io.UncheckedIOException;


class c2687277 {

//    @Override
    protected void copy(Reader reader, OutputStream outputs) throws IOException {
        if (outputs == null) {
            throw new NullPointerException();
        }
        if (reader == null) {
            throw new NullPointerException();
        }
        ZipOutputStream zipoutputs = null;
        try {
            zipoutputs = new ZipOutputStream(outputs);
            zipoutputs.putNextEntry(new ZipEntry("default"));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(reader, zipoutputs);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (zipoutputs != null) {
                zipoutputs.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, ZipOutputStream o1){ return null; }}

class Reader {

public MyHelperClass close(){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(OutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
