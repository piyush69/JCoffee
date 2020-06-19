
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8272803 {

    public StringBuffer getReturn(String url_address) {
        StringBuffer message = new StringBuffer();
        try {
            URL url = new URL(url_address);
            try {
                HttpURLConnection httpConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                httpConnection.connect();
                InputStreamReader insr = new InputStreamReader(httpConnection.getInputStream());
                BufferedReader in = new BufferedReader(insr);
                String temp =(String)(Object) in.readLine();
                while (temp != null) {
                    message.append(temp + "\n");
                    temp =(String)(Object) in.readLine();
                }
                in.close();
            } catch (UncheckedIOException e) {
                System.out.println("httpConnecter:Error[" + e + "]");
                message.append("Connect error [" + url_address + "]");
            }
        } catch (UncheckedIOException e) {
            message.append("Connect error [" + url_address + "]");
            System.out.println("httpConneter:Error[" + e.getMessage() + "]");
        } catch (Exception e) {
            message.append("Connect error [" + url_address + "]");
            System.out.println("httpConneter:Error[" + e.getMessage() + "]");
        }
        return message;
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

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
