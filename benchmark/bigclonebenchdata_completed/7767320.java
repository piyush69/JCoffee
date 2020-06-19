
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7767320 {
public MyHelperClass InterfaceBWebsideController;
public MyHelperClass stripOuterElement(String o0){ return null; }

    private String executeUpload(String urlStr, String specification, String filename, String sessionHandle) {
        StringBuffer result = new StringBuffer();
        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("YAWLSessionHandle", sessionHandle);
            connection.setRequestProperty("filename", filename);
            connection.setRequestProperty("Content-Type", "text/xml");
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(specification);
            out.flush();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                result.append(inputLine);
            }
            in.close();
            out.close();
            connection.disconnect();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            MyHelperClass _backEndURIStr = new MyHelperClass();
            InterfaceBWebsideController.logContactError((IOException)(Object)e, _backEndURIStr);
        }
        String msg = result.toString();
        return(String)(Object) stripOuterElement(msg);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logContactError(IOException o0, MyHelperClass o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(MyHelperClass o0){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

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
