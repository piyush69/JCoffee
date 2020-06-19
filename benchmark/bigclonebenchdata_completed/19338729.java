


class c19338729 {

    public static InputStream call(String serviceUrl, Map parameters) throws IOException, RestException {
        StringBuffer urlString = new StringBuffer(serviceUrl);
        MyHelperClass RestClient = new MyHelperClass();
        String query =(String)(Object) RestClient.buildQueryString(parameters);
        HttpURLConnection conn;
        MyHelperClass MAX_URI_LENGTH_FOR_GET = new MyHelperClass();
        if ((urlString.length() + query.length() + 1) > (int)(Object)MAX_URI_LENGTH_FOR_GET) {
            URL url = new URL(urlString.toString());
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass USER_AGENT_STRING = new MyHelperClass();
            conn.setRequestProperty("User-Agent", USER_AGENT_STRING);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);
            conn.getOutputStream().write(query.getBytes());
        } else {
            if (query.length() > 0) {
                urlString.append("?").append(query);
            }
            URL url = new URL(urlString.toString());
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass USER_AGENT_STRING = new MyHelperClass();
            conn.setRequestProperty("User-Agent", USER_AGENT_STRING);
            conn.setRequestMethod("GET");
        }
        int responseCode =(int)(Object) conn.getResponseCode();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        if ((int)(Object)HttpURLConnection.HTTP_OK != responseCode) {
            ByteArrayOutputStream errorBuffer = new ByteArrayOutputStream();
            int read;
            MyHelperClass ERROR_READ_BUFFER_SIZE = new MyHelperClass();
            byte[] readBuffer = new byte[(int)(Object)ERROR_READ_BUFFER_SIZE];
            InputStream errorStream =(InputStream)(Object) conn.getErrorStream();
            while (-1 != (read =(int)(Object) errorStream.read(readBuffer))) {
                errorBuffer.write(readBuffer, 0, read);
            }
            throw new RestException("Request failed, HTTP " + responseCode + ": " + conn.getResponseMessage(), errorBuffer.toByteArray());
        }
        return(InputStream)(Object) conn.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass buildQueryString(Map o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class Map {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class RestException extends Exception{
	public RestException(String errorMessage) { super(errorMessage); }
	RestException(){}
	RestException(String o0, MyHelperClass o1){}
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
