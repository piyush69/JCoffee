
import java.io.UncheckedIOException;


class c576161 {

    public boolean download(URL url, File file) {
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;
        try {
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(file));
            conn =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) conn.getInputStream();
            byte[] buffer = new byte[4096];
            int numRead;
            long numWritten = 0;
            while ((numRead =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                numWritten += numRead;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (UncheckedIOException ioe) {
                return false;
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
