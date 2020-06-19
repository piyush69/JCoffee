
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6230587 {

    public void saveAs(File f) throws CoverException {
        FileOutputStream fw = null;
        BufferedInputStream in = null;
        try {
            MyHelperClass url = new MyHelperClass();
            HttpURLConnection httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpConn.setDoInput(true);
            in = new BufferedInputStream(httpConn.getInputStream());
            f.delete();
            fw = new FileOutputStream(f);
            int b;
            while ((b =(int)(Object) in.read()) != -1) fw.write(b);
            fw.close();
            in.close();
        } catch (UncheckedIOException e) {
            throw new CoverException(e.getMessage());
        } finally {
            try {
                if (fw != null) fw.close();
                if (in != null) in.close();
            } catch (UncheckedIOException ex) {
                System.err.println("Glurps this is severe: " + ex.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class CoverException extends Exception{
	public CoverException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
