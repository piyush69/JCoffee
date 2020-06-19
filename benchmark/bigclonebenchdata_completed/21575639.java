
import java.io.UncheckedIOException;


class c21575639 {
public MyHelperClass readBytes(TupleInput o0){ return null; }

    protected byte[] readGZippedBytes(TupleInput in) {
        final boolean is_compressed =(boolean)(Object) in.readBoolean();
        byte array[] =(byte[])(Object) readBytes(in);
        if (array == null) return null;
        if (!is_compressed) {
            return array;
        }
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(array);
            GZIPInputStream gzin = new GZIPInputStream(bais);
            ByteArrayOutputStream baos = new ByteArrayOutputStream(array.length);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyTo(gzin, baos);
            gzin.close();
            bais.close();
            return(byte[])(Object) baos.toByteArray();
        } catch (UncheckedIOException err) {
            throw new RuntimeException(err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyTo(GZIPInputStream o0, ByteArrayOutputStream o1){ return null; }}

class TupleInput {

public MyHelperClass readBoolean(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}

class GZIPInputStream {

GZIPInputStream(ByteArrayInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
