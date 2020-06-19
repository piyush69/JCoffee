
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1263069 {

    public boolean getAuth(String content) throws IOException {
        String resp_remote;
        try {
            MyHelperClass remoteurl = new MyHelperClass();
            URL url = new URL(remoteurl);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write("md5sum=" + content);
            writer.close();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream is =(InputStream)(Object) connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                String line;
                StringBuffer response = new StringBuffer();
                while ((line =(String)(Object) rd.readLine()) != null) {
                    response.append(line);
                    response.append('\r');
                }
                rd.close();
                resp_remote = response.toString();
                MyHelperClass wd = new MyHelperClass();
                wd.del();
//                MyHelperClass wd = new MyHelperClass();
                wd.setKey(resp_remote);
                return true;
            } else {
                return false;
            }
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass del(){ return null; }
	public MyHelperClass setKey(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
