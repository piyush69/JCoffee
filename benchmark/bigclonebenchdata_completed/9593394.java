


class c9593394 {
public MyHelperClass readURLConnection(HttpURLConnection o0){ return null; }

    private RatingServiceSelectionResponseType contactService(String xmlInputString) throws Exception {
        OutputStream outputStream = null;
        RatingServiceSelectionResponseType rType = null;
        try {
            MyHelperClass ENDPOINT_URL = new MyHelperClass();
            URL url = new URL(ENDPOINT_URL);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            outputStream =(OutputStream)(Object) connection.getOutputStream();
            outputStream.write(xmlInputString.getBytes());
            outputStream.flush();
            outputStream.close();
            rType =(RatingServiceSelectionResponseType)(Object) readURLConnection(connection);
            connection.disconnect();
        } catch (Exception e) {
            throw e;
        } finally {
            if (outputStream != null) {
                outputStream.close();
                outputStream = null;
            }
        }
        return rType;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class RatingServiceSelectionResponseType {

}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }}
