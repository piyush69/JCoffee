
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2646424 {
public MyHelperClass iox;

    public String downloadFromUrl(URL url) {
        BufferedReader dis;
        String content = "";
        HttpURLConnection urlConn = null;
        try {
            urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);
            urlConn.setAllowUserInteraction(false);
            dis = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;
            while ((line =(String)(Object) dis.readLine()) != null) {
                content = content.concat(line);
                content = content.concat("\n");
            }
        } catch (UncheckedIOException ex) {
            System.err.println(ex + " (downloadFromUrl)");
//         } catch (java.io.ArithmeticException iox) {
            System.out.println(iox + " (downloadFromUrl)");
        } catch (Exception generic) {
            System.out.println(generic.toString() + " (downloadFromUrl)");
        } finally {
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
