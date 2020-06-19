
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18898823 {
public MyHelperClass log;
	public MyHelperClass getEndLine(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getRequestProperty(){ return null; }
	public MyHelperClass getCharset(){ return null; }
	public MyHelperClass getParam(){ return null; }
	public MyHelperClass getStartLine(){ return null; }
	public MyHelperClass getRequestMethod(){ return null; }

    public String getHttpText() {
        URL url = null;
        try {
            url = new URL(getUrl());
        } catch (UncheckedIOException e) {
            log.error(e.getMessage());
        }
        StringBuffer sb = new StringBuffer();
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestMethod(getRequestMethod());
            conn.setDoOutput(true);
            if (getRequestProperty() != null && "".equals(getRequestProperty())) {
                conn.setRequestProperty("Accept", getRequestProperty());
            }
            PrintWriter out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), getCharset()));
            out.println(getParam());
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), getCharset()));
            String inputLine;
            int i = 1;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                if ((int)(Object)getStartLine() == 0 &&(int)(Object) getEndLine() == 0) {
                    sb.append(inputLine).append("\n");
                } else {
                    if ((int)(Object)getEndLine() > 0) {
                        if (i >= (int)(Object)getStartLine() && i <= (int)(Object)getEndLine()) {
                            sb.append(inputLine).append("\n");
                        }
                    } else {
                        if (i >= (int)(Object)getStartLine()) {
                            sb.append(inputLine).append("\n");
                        }
                    }
                }
                i++;
            }
            in.close();
        } catch (UncheckedIOException e) {
            log.error(e.getMessage());
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(OutputStreamWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(MyHelperClass o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0, MyHelperClass o1){}
	OutputStreamWriter(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
