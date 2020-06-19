
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17808807 {

    static String doHttp(String postURL, String text) {
        String returnValue = null;
        StringBuffer sb = new StringBuffer();
        sb.append("bsh.client=Remote");
        sb.append("&bsh.script=");
        MyHelperClass URLEncoder = new MyHelperClass();
        sb.append(URLEncoder.encode(text));
        String formData = sb.toString();
        try {
            URL url = new URL(postURL);
            HttpURLConnection urlcon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlcon.setRequestMethod("POST");
            urlcon.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            urlcon.setDoOutput(true);
            urlcon.setDoInput(true);
            PrintWriter pout = new PrintWriter(new OutputStreamWriter(urlcon.getOutputStream(), "8859_1"), true);
            pout.print(formData);
            pout.flush();
            int rc =(int)(Object) urlcon.getResponseCode();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (rc != (int)(Object)HttpURLConnection.HTTP_OK) System.out.println("Error, HTTP response: " + rc);
            returnValue =(String)(Object) urlcon.getHeaderField("Bsh-Return");
            BufferedReader bin = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String line;
            while ((line =(String)(Object) bin.readLine()) != null) System.out.println(line);
            System.out.println("Return Value: " + returnValue);
        } catch (UncheckedIOException e) {
            System.out.println(e);
        } catch (ArithmeticException e2) {
            System.out.println(e2);
        }
        return returnValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass encode(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(OutputStreamWriter o0, boolean o1){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0, String o1){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
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
