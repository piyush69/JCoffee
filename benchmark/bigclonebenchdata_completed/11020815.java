
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11020815 {

    public static byte[] getbytes(String host, int port, String cmd) {
        String result = "GetHtmlFromServer no answer";
        String tmp = "";
        result = "";
        try {
            tmp = "http://" + host + ":" + port + "/" + cmd;
            URL url = new URL(tmp);
            if (1 == 2) {
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                while ((str =(String)(Object) in.readLine()) != null) {
                    result += str;
                }
                in.close();
                return result.getBytes();
            } else {
                HttpURLConnection c = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                c.setConnectTimeout(2 * 1000);
                c.setRequestMethod("GET");
                c.connect();
                int amt =(int)(Object) c.getContentLength();
                InputStream in =(InputStream)(Object) c.getInputStream();
                MojasiWriter writer = new MojasiWriter();
                byte[] buff = new byte[256];
                while ((int)(Object)writer.size() < amt) {
                    int got =(int)(Object) in.read(buff);
                    if (got < 0) break;
                    writer.pushBytes(buff, got);
                }
                in.close();
                c.disconnect();
                return(byte[])(Object) writer.getBytes();
            }
        } catch (UncheckedIOException e) {
            System.err.println(tmp + " " + e);
        } catch (ArithmeticException e) {
            ;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
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

public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class MojasiWriter {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass pushBytes(byte[] o0, int o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
