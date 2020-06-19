
import java.io.UncheckedIOException;


class c175778 {

    public void sendShape(String s) {
        try {
            MyHelperClass url = new MyHelperClass();
            URLConnection uc =(URLConnection)(Object) (new URL(url + "&add=" + s).openConnection());
            InputStream in =(InputStream)(Object) uc.getInputStream();
            int b;
            while ((b =(int)(Object) in.read()) != -1) {
            }
            in.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
