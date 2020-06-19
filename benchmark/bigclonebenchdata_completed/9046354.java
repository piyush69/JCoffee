
import java.io.UncheckedIOException;


class c9046354 {

    public static String downloadWebVersionString(String address) {
        StringBuffer stb = new StringBuffer();
        URLConnection conn = null;
        InputStream in = null;
        try {
            URL url = new URL(address);
            conn =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) conn.getInputStream();
            byte[] buffer = new byte[1024];
            int numRead;
            long numWritten = 0;
            while ((numRead =(int)(Object) in.read(buffer)) != -1) {
                for (int i = 0; i < numRead; i++) {
                    stb.append((char) buffer[i]);
                }
                numWritten += numRead;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return stb.toString();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (UncheckedIOException ioe) {
            }
        }
        return stb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
