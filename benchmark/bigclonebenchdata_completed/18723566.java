
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18723566 {
public MyHelperClass getApiUrl(TreeMap o0, boolean o1){ return null; }

    public String performRequest(TreeMap params, boolean isAuthenticated) {
        params.put("format", "json");
        try {
            URL url = new URL(getApiUrl(params, isAuthenticated));
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            Reader reader =(Reader)(Object) new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String response = "";
            while ((boolean)(Object)reader.ready()) {
                response += (char)(char)(Object) reader.read();
            }
            response = response.replaceFirst("jsonVimeoApi\\(", "");
            response = response.substring(0, response.length() - 2);
            return response;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class TreeMap {

public MyHelperClass put(String o0, String o1){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class Reader {

public MyHelperClass ready(){ return null; }
	public MyHelperClass read(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
