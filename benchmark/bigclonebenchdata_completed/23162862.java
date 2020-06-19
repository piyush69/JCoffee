
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23162862 {

    public static NSImage getImage(URL url) {
        InputStream in = null;
        try {
            in =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.error(e.getMessage(),(IOException)(Object) e);
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buff = new byte[10 * 1024];
        int len;
        try {
            if (in != null) {
                while ((len =(int)(Object) in.read(buff)) != -1) {
                    out.write(buff, 0, len);
                }
                in.close();
            }
            out.close();
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.error(e.getMessage(),(IOException)(Object) e);
        }
        NSData data = new NSData(out.toByteArray());
        return new NSImage(data);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class NSImage {

NSImage(NSData o0){}
	NSImage(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class NSData {

NSData(MyHelperClass o0){}
	NSData(){}}
