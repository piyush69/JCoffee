
import java.io.UncheckedIOException;


class c18784731 {

    public static void downloadFromUrl(String url1, String fileName) {
        try {
            URL url = new URL(url1);
            File file = new File(fileName);
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
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
