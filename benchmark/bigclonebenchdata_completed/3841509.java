
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3841509 {

    public StringBuilder get(String q) {
        StringBuilder builder = new StringBuilder();
        try {
            URL url = new URL(q);
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            BufferedInputStream buffer = new BufferedInputStream(urlc.getInputStream());
            int byteRead;
            while ((byteRead =(int)(Object) buffer.read()) != -1) builder.append((char) byteRead);
            buffer.close();
        } catch (UncheckedIOException ex) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "Error " + ex.toString());
        } catch (ArithmeticException ex) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "Error " + ex.toString());
        }
        return builder;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
