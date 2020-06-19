
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c678400 {
public MyHelperClass url;

    public void go() {
        DataOutputStream outStream = null;
        try {
            HttpURLConnection connection;// = new HttpURLConnection();
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//            MyHelperClass connection = new MyHelperClass();
            connection.setDoOutput(true);
//            MyHelperClass connection = new MyHelperClass();
            connection.setDoInput(true);
//            MyHelperClass connection = new MyHelperClass();
            connection.setRequestMethod("POST");
            MyHelperClass sendData = new MyHelperClass();
            connection.setRequestProperty("Content-Length", new Integer((int)(Object)sendData.length()).toString());
//            MyHelperClass connection = new MyHelperClass();
            connection.setRequestProperty("Content-type", "text/html");
//            MyHelperClass connection = new MyHelperClass();
            connection.setRequestProperty("User-Agent", "Pago HTTP cartridge");
//            MyHelperClass connection = new MyHelperClass();
            outStream = new DataOutputStream(connection.getOutputStream());
//            MyHelperClass sendData = new MyHelperClass();
            outStream.writeBytes(sendData);
            System.out.println(1);
//            MyHelperClass connection = new MyHelperClass();
            InputStream is =(InputStream)(Object) connection.getInputStream();
            System.out.println(2);
            BufferedReader inReader;// = new BufferedReader();
            inReader = new BufferedReader(new InputStreamReader(is));
            String result;
            System.out.println(3);
//            MyHelperClass inReader = new MyHelperClass();
            if ((result =(String)(Object) inReader.readLine()) != null) {
                System.out.println(result);
            }
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
            System.exit(0);
        } finally {
            try {
                if (outStream != null) outStream.close();
                MyHelperClass inReader = new MyHelperClass();
                if (inReader != null) inReader.close();
            } catch (UncheckedIOException ioe) {
                System.err.println("Error closing Streams!");
                ioe.printStackTrace();
            }
            MyHelperClass connection = new MyHelperClass();
            connection.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass writeBytes(MyHelperClass o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}
