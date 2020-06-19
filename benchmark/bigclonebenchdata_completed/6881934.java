


class c6881934 {

    public static String sendSoapMsg(String SOAPUrl, byte[] b, String SOAPAction) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.finest("HTTP REQUEST SIZE " + b.length);
        if (SOAPAction.startsWith("\"") == false) SOAPAction = "\"" + SOAPAction + "\"";
        URL url = new URL(SOAPUrl);
        HttpURLConnection httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        httpConn.setRequestProperty("SOAPAction", SOAPAction);
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
        httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
        httpConn.setRequestProperty("Cache-Control", "no-cache");
        httpConn.setRequestProperty("Pragma", "no-cache");
        httpConn.setRequestMethod("POST");
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);
        OutputStream out =(OutputStream)(Object) httpConn.getOutputStream();
        out.write(b);
        out.close();
        InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        StringBuffer response = new StringBuffer(1024);
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) response.append(inputLine);
        in.close();
//        MyHelperClass log = new MyHelperClass();
        log.finest("HTTP RESPONSE SIZE: " + response.length());
        return response.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass finest(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}
