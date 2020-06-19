
import java.io.UncheckedIOException;


class c19722337 {

//        @Override
        public void objectToEntry(String object, TupleOutput output) {
            byte array[] = object.getBytes();
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                GZIPOutputStream out = new GZIPOutputStream(baos);
                ByteArrayInputStream in = new ByteArrayInputStream(array);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyTo(in, out);
                in.close();
                out.close();
                byte array2[] =(byte[])(Object) baos.toByteArray();
                if (array2.length + 4 < array.length) {
                    output.writeBoolean(true);
                    output.writeInt(array2.length);
                    output.write(array2);
                } else {
                    output.writeBoolean(false);
                    output.writeString(object);
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

public MyHelperClass writeString(String o0){ return null; }
	public MyHelperClass writeInt(int o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass writeBoolean(boolean o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
