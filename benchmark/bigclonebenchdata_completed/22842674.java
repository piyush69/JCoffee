


class c22842674 {
public MyHelperClass readStream(InputStream o0){ return null; }

    private byte[] getImage(String urlpath) throws Exception {
        URL url = new URL(urlpath);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(6 * 1000);
        if ((int)(Object)conn.getResponseCode() == 200) {
            InputStream inputStream =(InputStream)(Object) conn.getInputStream();
            return(byte[])(Object) readStream(inputStream);
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
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStream {

}
