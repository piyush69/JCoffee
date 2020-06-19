
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19544698 {

    public static void main(String args[]) {
        URL url = null;
        try {
            MyHelperClass urlString = new MyHelperClass();
            url = new URL(urlString);
        } catch (UncheckedIOException e) {
            System.err.println(e.toString());
            System.exit(1);
        }
        try {
            InputStream ins =(InputStream)(Object) url.openStream();
            BufferedReader breader = new BufferedReader(new InputStreamReader(ins));
            String info =(String)(Object) breader.readLine();
            while (info != null) {
                System.out.println(info);
                info =(String)(Object) breader.readLine();
            }
        } catch (UncheckedIOException e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
