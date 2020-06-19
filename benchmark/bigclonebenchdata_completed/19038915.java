
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19038915 {

    private static String executeGet(String urlStr) {
        StringBuffer result = new StringBuffer();
        try {
            MyHelperClass Authentication = new MyHelperClass();
            Authentication.doIt();
            URL url = new URL(urlStr);
            System.out.println("Host: " + url.getHost());
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setDoInput(true);
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                result.append(inputLine);
            }
            in.close();
            connection.disconnect();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass doIt(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
