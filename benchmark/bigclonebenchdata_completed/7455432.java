
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7455432 {

    private void saveScore(int score) {
        MyHelperClass JOptionPane = new MyHelperClass();
        String name =(String)(Object) JOptionPane.showInputDialog(this, "Skriv navn for å komme på highscorelisten!", "Lagre score!", JOptionPane.INFORMATION_MESSAGE);
        URL url;
        try {
            url = new URL("http://129.177.17.51:8080/GuestBook/TheOnlyServlet?name=" + name + "&score=" + score);
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
            urlConnection.connect();
            urlConnection.getInputStream();
            MyHelperClass BrowserControl = new MyHelperClass();
            BrowserControl.openUrl("http://129.177.17.51:8080/GuestBook/TheOnlyServlet");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showInputDialog(c7455432 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass openUrl(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
