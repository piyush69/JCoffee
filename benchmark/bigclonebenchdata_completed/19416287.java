
import java.io.UncheckedIOException;


class c19416287 {

        private String unzip(TupleInput input) {
            boolean zipped =(boolean)(Object) input.readBoolean();
            if (!zipped) {
                return(String)(Object) input.readString();
            }
            int len =(int)(Object) input.readInt();
            try {
                byte array[] = new byte[len];
                input.read(array);
                GZIPInputStream in = new GZIPInputStream(new ByteArrayInputStream(array));
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyTo(in, out);
                in.close();
                out.close();
                return new String((String)(Object)out.toByteArray());
            } catch (UncheckedIOException err) {
                throw new RuntimeException(err);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyTo(GZIPInputStream o0, ByteArrayOutputStream o1){ return null; }}

class TupleInput {

public MyHelperClass readString(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass readBoolean(){ return null; }
	public MyHelperClass readInt(){ return null; }}

class GZIPInputStream {

GZIPInputStream(ByteArrayInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
