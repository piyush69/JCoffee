
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21693488 {

    public static String getProgramVersion() {
        String s = "0";
        try {
            URL url;
            URLConnection urlConn;
            DataInputStream dis;
            url = new URL("http://www.dombosfest.org.yu/log/yamiversion.dat");
            urlConn =(URLConnection)(Object) url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);
            dis = new DataInputStream(urlConn.getInputStream());
            while ((dis.readUTF()) != null) {
                s =(String)(Object) dis.readUTF();
            }
            dis.close();
        } catch (UncheckedIOException mue) {
            System.out.println("mue:" + mue.getMessage());
        } catch (ArithmeticException ioe) {
            System.out.println("ioe:" + ioe.getMessage());
        }
        return s;
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

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass readUTF(){ return null; }
	public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
