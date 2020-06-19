
import java.io.UncheckedIOException;


class c2687278 {

//    @Override
    protected void copy(InputStream inputs, OutputStream outputs) throws IOException {
        if (outputs == null) {
            throw new NullPointerException();
        }
        if (inputs == null) {
            throw new NullPointerException();
        }
        ZipOutputStream zipoutputs = null;
        try {
            zipoutputs = new ZipOutputStream(outputs);
            zipoutputs.putNextEntry(new ZipEntry("default"));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputs, zipoutputs);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (zipoutputs != null) {
                zipoutputs.close();
            }
            if (inputs != null) {
                inputs.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }}

class InputStream {

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
