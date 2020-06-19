
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13167991 {

    public void connectToUrl(String url_address) {
        StringBuffer message;// = new StringBuffer();
        message = new StringBuffer("");
        try {
            URL url = new URL(url_address);
            try {
                HttpsURLConnection httpsConnection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
                httpsConnection.setDoOutput(false);
                httpsConnection.connect();
//                MyHelperClass message = new MyHelperClass();
                message.append("<BR>\n Connection Code:[" + httpsConnection.getResponseCode() + "]");
//                MyHelperClass message = new MyHelperClass();
                message.append("<BR>\n Response Message:[" + httpsConnection.getResponseMessage() + "]");
                InputStreamReader insr = new InputStreamReader(httpsConnection.getInputStream());
                BufferedReader in = new BufferedReader(insr);
                StringBuffer fullStringBuffer;// = new StringBuffer();
                fullStringBuffer = new StringBuffer("");
                String temp =(String)(Object) in.readLine();
                while (temp != null) {
//                    MyHelperClass fullStringBuffer = new MyHelperClass();
                    fullStringBuffer.append(temp);
                    temp =(String)(Object) in.readLine();
                }
                in.close();
            } catch (UncheckedIOException e) {
//                MyHelperClass message = new MyHelperClass();
                message.append("<BR>\n [Error][IOException][" + e.getMessage() + "]");
            }
        } catch (UncheckedIOException e) {
//            MyHelperClass message = new MyHelperClass();
            message.append("<BR>\n [Error][MalformedURLException][" + e.getMessage() + "]");
        } catch (Exception e) {
//            MyHelperClass message = new MyHelperClass();
            message.append("<BR>\n [Error][Exception][" + e.getMessage() + "]");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass append(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
