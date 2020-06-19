
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20073619 {

    public static String getPagina(String strurl) {
        String resp = "";
        MyHelperClass Authenticator = new MyHelperClass();
        Authenticator.setDefault(new Autenticador());
        try {
            URL url = new URL(strurl);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                resp += str;
            }
            in.close();
        } catch (UncheckedIOException e) {
            resp = e.toString();
        } catch (ArithmeticException e) {
            resp = e.toString();
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefault(Autenticador o0){ return null; }}

class Autenticador {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
