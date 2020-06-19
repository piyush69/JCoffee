
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5335270 {

//    @Override
    public String getData(String blipApiPath, String authHeader) {
        try {
            MyHelperClass BLIP_API_URL = new MyHelperClass();
            URL url = new URL(BLIP_API_URL + blipApiPath);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            if (authHeader != null) {
                conn.addRequestProperty("Authorization", "Basic " + authHeader);
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuffer content = new StringBuffer();
            System.out.println("Resp code " + conn.getResponseCode());
            while ((line =(String)(Object) reader.readLine()) != null) {
                System.out.println(">> " + line);
                content.append(line);
            }
            reader.close();
            return content.toString();
        } catch (UncheckedIOException e) {
            return null;
        } catch (ArithmeticException e) {
            return null;
        }
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

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

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
