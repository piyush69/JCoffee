
import java.io.UncheckedIOException;


class c21608109 {
public static MyHelperClass Log;
//public MyHelperClass Log;

    public static boolean loadContentFromURL(String fromURL, String toFile) {
        try {
            URL url = new URL("http://bible-desktop.com/xml" + fromURL);
            File file = new File(toFile);
            URLConnection ucon =(URLConnection)(Object) url.openConnection();
            InputStream is =(InputStream)(Object) ucon.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            ByteArrayBuffer baf = new ByteArrayBuffer(50);
            int current = 0;
            while ((current =(int)(Object) bis.read()) != -1) {
                baf.append((byte) current);
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(baf.toByteArray());
            fos.close();
        } catch (UncheckedIOException e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG,(IOException)(Object) e);
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(MyHelperClass o0, IOException o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class File {

File(String o0){}
	File(){}}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}

class ByteArrayBuffer {

ByteArrayBuffer(int o0){}
	ByteArrayBuffer(){}
	public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass append(byte o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
