


class c6853665 {

    public static String postServiceContent(String serviceURL, String text) throws IOException {
        URL url = new URL(serviceURL);
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("POST");
        connection.connect();
        int code =(int)(Object) connection.getResponseCode();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        if (code == (int)(Object)HttpURLConnection.HTTP_OK) {
            InputStream is =(InputStream)(Object) connection.getInputStream();
            byte[] buffer = null;
            String stringBuffer = "";
            buffer = new byte[4096];
            int totBytes, bytes, sumBytes = 0;
            totBytes =(int)(Object) connection.getContentLength();
            while (true) {
                bytes =(int)(Object) is.read(buffer);
                if (bytes <= 0) break;
                stringBuffer = stringBuffer + new String(buffer);
            }
            return stringBuffer;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}
