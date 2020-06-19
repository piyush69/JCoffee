


class c9272325 {
public static MyHelperClass generatorParamString(Map o0){ return null; }
//public MyHelperClass generatorParamString(Map o0){ return null; }

    private static HttpURLConnection sendPost(String reqUrl, Map parameters) {
        HttpURLConnection urlConn = null;
        try {
            String params =(String)(Object) generatorParamString(parameters);
            URL url = new URL(reqUrl);
            urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConn.setRequestMethod("POST");
            urlConn.setConnectTimeout(5000);
            urlConn.setReadTimeout(5000);
            urlConn.setDoOutput(true);
            byte[] b = params.getBytes();
            urlConn.getOutputStream().write(b, 0, b.length);
            urlConn.getOutputStream().flush();
            urlConn.getOutputStream().close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return urlConn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class Map {

}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
