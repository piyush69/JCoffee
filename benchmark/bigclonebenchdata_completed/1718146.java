
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1718146 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static void main(String[] args) {
        try {
            String default_uri = "http://www.cs.nmsu.edu/~bchisham/cgi-bin/phylows/tree/Tree3099?format=graphml";
            URL gurl = new URL(default_uri);
            InputStream is =(InputStream)(Object) gurl.openStream();
            Scanner iscan = new Scanner(is);
            while ((boolean)(Object)iscan.hasNext()) {
                System.out.println(iscan.next());
            }
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(GraphUrlLoader.class.getName()).log(Level.SEVERE, null,(MalformedURLException)(Object) ex);
        } catch (ArithmeticException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, MalformedURLException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class Scanner {

Scanner(){}
	Scanner(InputStream o0){}
	public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GraphUrlLoader {

}
