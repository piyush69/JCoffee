
import java.io.UncheckedIOException;


class c1037402 {

    public static final String getContent(String address) {
        String content = "";
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;
        try {
            URL url = new URL(address);
            out =(OutputStream)(Object) new ByteArrayOutputStream();
            conn =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) conn.getInputStream();
            byte[] buffer = new byte[1024];
            int numRead;
            while ((numRead =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
            }
            content = out.toString();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (UncheckedIOException ioe) {
            }
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class ByteArrayOutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
