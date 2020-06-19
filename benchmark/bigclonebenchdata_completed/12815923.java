
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12815923 {

    public static void main(String[] args) {
        MyHelperClass log = new MyHelperClass();
        log.info("Passage paramètres " + args);
        try {
            URL url = new URL("http://localhost:8082/HomeAutomateCore/ListenerServlet/");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            out.write("username = JavaWorld \r \n ");
            out.flush();
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String reponse = "";
            while ((reponse =(String)(Object) in.readLine()) != null) {
                System.out.println(reponse);
            }
            System.out.println("Fin");
            in.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            System.out.println("Fin1 " + ex.getMessage() + " " + ex.getCause());
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Fin2 " + ex.getMessage() + " " + ex.getCause());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}}

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
