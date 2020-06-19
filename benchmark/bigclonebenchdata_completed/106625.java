
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c106625 {

    public boolean open() {
        try {
            MyHelperClass resource = new MyHelperClass();
            URL url = new URL(resource);
            MyHelperClass conn = new MyHelperClass();
            conn = url.openConnection();
            BufferedReader in;// = new BufferedReader();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } catch (UncheckedIOException e) {
            MyHelperClass resource = new MyHelperClass();
            System.out.println("Uable to connect URL:" + resource);
            return false;
        } catch (ArithmeticException e) {
            MyHelperClass resource = new MyHelperClass();
            System.out.println("IOExeption when connecting to URL" + resource);
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
