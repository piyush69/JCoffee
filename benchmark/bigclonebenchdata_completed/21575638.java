
import java.io.UncheckedIOException;


class c21575638 {
public MyHelperClass writeBytes(byte[] o0, TupleOutput o1){ return null; }

    protected void writeGZippedBytes(byte array[], TupleOutput out) {
        if (array == null || array.length == 0) {
            out.writeBoolean(false);
            writeBytes(array, out);
            return;
        }
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(array.length);
            GZIPOutputStream gzout = new GZIPOutputStream(baos);
            ByteArrayInputStream bais = new ByteArrayInputStream(array);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyTo(bais, gzout);
            gzout.finish();
            gzout.close();
            bais.close();
            byte compressed[] =(byte[])(Object) baos.toByteArray();
            if (compressed.length < array.length) {
                out.writeBoolean(true);
                writeBytes(compressed, out);
            } else {
                out.writeBoolean(false);
                writeBytes(array, out);
            }
        } catch (UncheckedIOException err) {
            throw new RuntimeException(err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyTo(ByteArrayInputStream o0, GZIPOutputStream o1){ return null; }}

class TupleOutput {

public MyHelperClass writeBoolean(boolean o0){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass toByteArray(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass finish(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
