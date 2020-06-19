import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c17407851 {
public MyHelperClass URLEncoder;

    private String _doPost(final String urlStr, final Map<String, String> params) {
        String paramsStr = "";
        for (String key : params.keySet()) {
            try {
                MyHelperClass ENCODING = new MyHelperClass();
                paramsStr += URLEncoder.encode(key, ENCODING) + "=" + URLEncoder.encode(params.get(key), ENCODING) + "&";
            } catch (UncheckedIOException e) {
                MyHelperClass s_logger = new MyHelperClass();
                s_logger.debug("UnsupportedEncodingException caught. Trying to encode: " + key + " and " + params.get(key));
                return null;
            }
        }
        if (paramsStr.length() == 0) {
            MyHelperClass s_logger = new MyHelperClass();
            s_logger.debug("POST will not complete, no parameters specified.");
            return null;
        }
        MyHelperClass s_logger = new MyHelperClass();
        s_logger.debug("POST to server will be done with the following parameters: " + paramsStr);
        HttpURLConnection connection = null;
        String responseStr = null;
        try {
            connection = (HttpURLConnection)(HttpURLConnection)(Object) (new URL(urlStr)).openConnection();
            MyHelperClass REQUEST_METHOD = new MyHelperClass();
            connection.setRequestMethod(REQUEST_METHOD);
            connection.setDoOutput(true);
            DataOutputStream dos = new DataOutputStream((OutputStream)(Object)connection.getOutputStream());
            dos.write(paramsStr.getBytes());
            dos.flush();
            dos.close();
            InputStream is =(InputStream)(Object) connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            responseStr = response.toString();
        } catch (UncheckedIOException e) {
//            MyHelperClass s_logger = new MyHelperClass();
            s_logger.debug("ProtocolException caught. Unable to execute POST.");
        } catch (ArithmeticException e) {
//            MyHelperClass s_logger = new MyHelperClass();
            s_logger.debug("MalformedURLException caught. Unexpected. Url is: " + urlStr);
        } catch (IOException e) {
//            MyHelperClass s_logger = new MyHelperClass();
            s_logger.debug("IOException caught. Unable to execute POST.");
        }
        return responseStr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class ProtocolException extends Exception{
	public ProtocolException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
