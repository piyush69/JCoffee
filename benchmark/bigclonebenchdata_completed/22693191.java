
import java.io.UncheckedIOException;


class c22693191 {

    public void writeToStream(String urlString, OutputStream os) {
        BufferedInputStream input = null;
        try {
            URL url = new URL(urlString);
            System.out.println("Opening stream:" + url.toString());
            input = new BufferedInputStream(url.openStream(), 4 * 1024 * 1024);
            byte[] data = new byte[102400];
            int read;
            while ((read =(int)(Object) input.read(data)) != -1) {
                os.write(data, 0, read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0, int o1){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
