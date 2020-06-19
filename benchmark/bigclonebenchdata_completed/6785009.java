
import java.io.UncheckedIOException;


class c6785009 {

    private String[] sendRequest(String url, String requestString) throws ClickatellException, IOException {
        String response = null;
        MessageFormat responseFormat = new MessageFormat("{0}: {1}");
        List idList =(List)(Object) new LinkedList();
        try {
            MyHelperClass log_ = new MyHelperClass();
            log_.debug("sendRequest: posting : " + requestString + " to " + url);
            URL requestURL = new URL(url);
            URLConnection urlConn =(URLConnection)(Object) requestURL.openConnection();
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setUseCaches(false);
            urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            PrintWriter pw = new PrintWriter(urlConn.getOutputStream());
            pw.print(requestString);
            pw.flush();
            pw.close();
            InputStream is =(InputStream)(Object) urlConn.getInputStream();
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(is));
            while ((response =(String)(Object) responseReader.readLine()) != null) {
                Object[] objs =(Object[])(Object) responseFormat.parse(response);
                if ("ERR".equalsIgnoreCase((String) objs[0])) {
                    MessageFormat errorFormat = new MessageFormat("{0}: {1}, {2}");
                    Object[] errObjs =(Object[])(Object) errorFormat.parse(response);
                    String errorNo = (String) errObjs[1];
                    String description = (String) errObjs[2];
                    throw new ClickatellException("Clickatell error. Error " + errorNo + ", " + description, Integer.parseInt(errorNo));
                }
//                MyHelperClass log_ = new MyHelperClass();
                log_.debug("sendRequest: Got ID : " + ((String) objs[1]));
                idList.add(objs[1]);
            }
            responseReader.close();
        } catch (UncheckedIOException ex) {
            MyHelperClass ClickatellException = new MyHelperClass();
            throw new ClickatellException("Unexpected response from Clickatell. : " + response,(int)(Object) ClickatellException.ERROR_UNKNOWN);
        }
        return (String[])(String[])(Object) idList.toArray(new String[(int)(Object)idList.size()]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_UNKNOWN;
public MyHelperClass debug(String o0){ return null; }}

class ClickatellException extends Exception{
	public ClickatellException(String errorMessage) { super(errorMessage); }
	ClickatellException(String o0, int o1){}
	ClickatellException(){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessageFormat {

MessageFormat(String o0){}
	MessageFormat(){}
	public MyHelperClass parse(String o0){ return null; }}

class List {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(Object o0){ return null; }
	public MyHelperClass size(){ return null; }}

class LinkedList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(MyHelperClass o0){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
