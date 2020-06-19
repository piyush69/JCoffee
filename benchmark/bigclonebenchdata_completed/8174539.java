
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8174539 {

    public static void invokeServlet(String op, String user) throws Exception {
        boolean isSayHi = true;
        try {
            if (!"sayHi".equals(op)) {
                isSayHi = false;
            }
            URL url = new URL("http://localhost:9080/helloworld/*.do");
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            out.write("Operation=" + op);
            if (!isSayHi) {
                out.write("&User=" + user);
            }
            out.flush();
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            boolean correctReturn = false;
            String response;
            if (isSayHi) {
                while ((response =(String)(Object) in.readLine()) != null) {
                    if (response.contains("Bonjour")) {
                        System.out.println(" sayHi server return: Bonjour");
                        correctReturn = true;
                        break;
                    }
                }
            } else {
                while ((response =(String)(Object) in.readLine()) != null) {
                    if (response.contains("Hello CXF")) {
                        System.out.println(" greetMe server return: Hello CXF");
                        correctReturn = true;
                        break;
                    }
                }
            }
            if (!correctReturn) {
                System.out.println("Can't got correct return from server.");
            }
            in.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
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

public MyHelperClass setRequestMethod(String o0){ return null; }
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
