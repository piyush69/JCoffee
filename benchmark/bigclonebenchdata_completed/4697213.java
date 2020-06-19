
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4697213 {

    protected void downloadJar(URL downloadURL, File jarFile, IProgressListener pl) {
        BufferedOutputStream out = null;
        InputStream in = null;
        URLConnection urlConnection = null;
        try {
            urlConnection =(URLConnection)(Object) downloadURL.openConnection();
            out = new BufferedOutputStream(new FileOutputStream(jarFile));
            in =(InputStream)(Object) urlConnection.getInputStream();
            int len =(int)(Object) in.available();
            MyHelperClass Log = new MyHelperClass();
            Log.log("downloading jar with size: " + urlConnection.getContentLength());
            if (len < 1) len = 1024;
            byte[] buffer = new byte[len];
            while ((len =(int)(Object) in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            out.close();
            in.close();
        } catch (Exception e) {
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException ignore) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class IProgressListener {

}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
