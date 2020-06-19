
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17947247 {
public MyHelperClass handleHeaders(String o0, MyHelperClass o1){ return null; }
public MyHelperClass loadCookies(String o0, HttpURLConnection o1, RenderEngine o2){ return null; }

    public String postURL(String urlLocation, ArrayList headers, String content, HashMap postVariables, RenderEngine c) throws Exception {
        String postContent = null;
        if (postVariables != null) {
            boolean firstElement = true;
            postContent = new String();
            Iterator elements =(Iterator)(Object) postVariables.keySet().iterator();
            while ((boolean)(Object)elements.hasNext()) {
                String key = (String)(String)(Object) elements.next();
                String val = (String)(String)(Object) postVariables.get(key);
                if (firstElement) {
                    MyHelperClass Encoder = new MyHelperClass();
                    postContent += Encoder.URLEncode(key) + "=" + Encoder.URLEncode(val);
                    firstElement = false;
                } else {
                    MyHelperClass Encoder = new MyHelperClass();
                    postContent += "&" + Encoder.URLEncode(key) + "=" + Encoder.URLEncode(val);
                }
            }
            elements = null;
        } else {
            postContent = content;
        }
        MyHelperClass Debug = new MyHelperClass();
        Debug.log("Connecting to URL '" + urlLocation + "', content '" + postContent + "'");
        URL url = null;
        try {
            url = new URL(urlLocation);
        } catch (UncheckedIOException e) {
//            MyHelperClass Debug = new MyHelperClass();
            Debug.log("Unable to retrieve URL '" + urlLocation + "': " + e.getMessage());
            return null;
        }
        StringBuffer lines = new StringBuffer();
        HttpURLConnection conn = null;
        boolean contentLengthFound = false;
        try {
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            loadCookies(urlLocation, conn, c);
            if (headers != null) {
                for (int i = 0; i < (int)(Object)headers.size(); i++) {
                    String header = (String)(String)(Object) headers.get(i);
                    String key = header.substring(0, header.indexOf(":"));
                    String value = header.substring(header.indexOf(":") + 2);
                    if (key != null && key.equalsIgnoreCase("content-length")) {
                        contentLengthFound = true;
                    }
//                    MyHelperClass Debug = new MyHelperClass();
                    Debug.log("Adding new request header '" + key + "'='" + value + "'");
                    conn.setRequestProperty(key, value);
                }
            }
            if (!contentLengthFound) {
//                MyHelperClass Debug = new MyHelperClass();
                Debug.log("Adding new request header 'Content-Length'='" + postContent.length() + "'");
                conn.setRequestProperty("Content-Length", Integer.toString(postContent.length()));
            }
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(postContent);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            while ((line =(String)(Object) rd.readLine()) != null) {
                lines.append(line);
                lines.append("\r\n");
            }
            handleHeaders(urlLocation, conn.getHeaderFields());
            wr.close();
            rd.close();
            wr = null;
            rd = null;
        } catch (UncheckedIOException e) {
            if (conn != null) {
                lines = new StringBuffer();
                try {
                    throw new Exception("Server returned error code '" + conn.getResponseCode() + "': " + conn.getResponseMessage());
                } catch (IOException ee) {
                    throw new Exception("Unable to report error codes: " + ee.getMessage());
                }
            }
//            MyHelperClass Debug = new MyHelperClass();
            Debug.log("I/O Exception occurred while communicating with endpoint: " + e.getMessage());
            return lines.toString().trim();
        } catch (Exception e) {
        }
        url = null;
        conn = null;
        return lines.toString().trim();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass URLEncode(String o0){ return null; }}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class HashMap {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class RenderEngine {

}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
