
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9261777 {

    public static void main(String[] args) {
        String source, destination;
        if (args[0].toLowerCase().endsWith(".gz")) {
            source = args[0];
            destination = source.substring(0, source.length() - 3);
        } else {
            source = args[0] + ".gz";
            destination = args[0];
        }
        InputStream is = null;
        OutputStream os = null;
        try {
            is =(InputStream)(Object) new GZIPInputStream(new FileInputStream(source));
            os =(OutputStream)(Object) new FileOutputStream(destination);
            byte[] buffer = new byte[8192];
            for (int length; (length =(int)(Object) is.read(buffer)) != -1; ) os.write(buffer, 0, length);
        } catch (UncheckedIOException e) {
            System.err.println("Fehler: Kann nicht entpacken " + args[0]);
        } finally {
            if (os != null) try {
                os.close();
            } catch (UncheckedIOException e) {
            }
            if (is != null) try {
                is.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
