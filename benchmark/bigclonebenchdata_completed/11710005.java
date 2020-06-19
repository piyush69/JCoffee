
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11710005 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.lineadecodigo.com");
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(url.openStream()));
            } catch (Throwable t) {
            }
            String inputLine;
            String inputText = "";
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                inputText = inputText + inputLine;
            }
            System.out.println("El contenido de la URL es: " + inputText);
            in.close();
        } catch (UncheckedIOException me) {
            System.out.println("URL erronea");
        } catch (ArithmeticException ioe) {
            System.out.println("Error IO");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

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
