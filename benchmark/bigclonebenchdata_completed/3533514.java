
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3533514 {
public MyHelperClass getId(){ return null; }
	public MyHelperClass saveVideoXMLOnWebserver(String o0){ return null; }

    public boolean saveVideoXMLOnWebserver() {
        String text = "";
        boolean erg = false;
        try {
            URL url = new URL("http://localhost:8080/virtPresenterVerwalter/videofile.jsp?id=" + this.getId());
            HttpURLConnection http = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
            String zeile = "";
            while ((zeile =(String)(Object) in.readLine()) != null) {
                text += zeile + "\n";
            }
            in.close();
            http.disconnect();
            erg =(boolean)(Object) saveVideoXMLOnWebserver(text);
            System.err.println("Job " + this.getId() + " erfolgreich bearbeitet!");
        } catch (UncheckedIOException e) {
            System.err.println("Job " + this.getId() + ": Konnte video.xml nicht erstellen. Verbindung konnte nicht aufgebaut werden.");
            return false;
        } catch (ArithmeticException e) {
            System.err.println("Job " + this.getId() + ": Konnte video.xml nicht erstellen. Konnte Daten nicht lesen/schreiben.");
            return false;
        }
        return erg;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

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
