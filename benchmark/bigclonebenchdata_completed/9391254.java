
import java.io.UncheckedIOException;


class c9391254 {

    private byte[] getCharImage(long chrId) {
        byte[] imgData = null;
        try {
            URL url = new URL("http://img.eve.is/serv.asp?s=256&c=" + chrId);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            InputStream is =(InputStream)(Object) conn.getInputStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            int data;
            try {
                while ((data =(int)(Object) is.read()) >= 0) {
                    os.write(data);
                }
            } finally {
                is.close();
            }
            imgData =(byte[])(Object) os.toByteArray();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return imgData;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(int o0){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
