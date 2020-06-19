


class c5518199 {
public MyHelperClass Debug;
	public MyHelperClass informFailure(String o0, String o1){ return null; }

    protected String loadPage(String url_string) {
        try {
            URL url = new URL(url_string);
            HttpURLConnection connection = null;
            InputStream is = null;
            try {
                connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                int response =(int)(Object) connection.getResponseCode();
                MyHelperClass HttpURLConnection = new MyHelperClass();
                if (response == (int)(Object)HttpURLConnection.HTTP_ACCEPTED || response == (int)(Object)HttpURLConnection.HTTP_OK) {
                    is =(InputStream)(Object) connection.getInputStream();
                    String page = "";
                    MyHelperClass MAX_PAGE_SIZE = new MyHelperClass();
                    while (page.length() < (int)(Object)MAX_PAGE_SIZE) {
                        byte[] buffer = new byte[2048];
                        int len =(int)(Object) is.read(buffer);
                        if (len < 0) {
                            break;
                        }
                        page += new String(buffer, 0, len);
                    }
                    return (page);
                } else {
                    informFailure("httpinvalidresponse", "" + response);
                    return (null);
                }
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                    if (connection != null) {
                        connection.disconnect();
                    }
                } catch (Throwable e) {
                    Debug.printStackTrace(e);
                }
            }
        } catch (Throwable e) {
            informFailure("httploadfail", e.toString());
            return (null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_ACCEPTED;
	public MyHelperClass HTTP_OK;
public MyHelperClass printStackTrace(Throwable o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
