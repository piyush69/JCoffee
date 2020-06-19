
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11453456 {

    public static boolean canWeConnectToInternet() {
        String s = "http://www.google.com/";
        URL url = null;
        boolean can = false;
        URLConnection conection = null;
        try {
            url = new URL(s);
        } catch (UncheckedIOException e) {
            System.out.println("This should never happend. Error in URL name. URL specified was:" + s + ".");
        }
        try {
            conection =(URLConnection)(Object) url.openConnection();
            conection.connect();
            can = true;
        } catch (UncheckedIOException e) {
            can = false;
        }
        if (can) {
        }
        return can;
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

public MyHelperClass connect(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
