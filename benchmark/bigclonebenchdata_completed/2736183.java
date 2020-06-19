


class c2736183 {

    public static String getURLContent(String urlPath, String charset) {
        BufferedReader reader = null;
        HttpURLConnection conn = null;
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(urlPath);
            MyHelperClass HttpURLConnection = new MyHelperClass();
            HttpURLConnection.setFollowRedirects(false);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setDefaultUseCaches(false);
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(60000);
            conn.connect();
            int repCode =(int)(Object) conn.getResponseCode();
            if (repCode == 200) {
                int count = 0;
                char[] chBuffer = new char[1024];
                BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
                while ((count =(int)(Object) input.read(chBuffer)) != -1) {
                    buffer.append(chBuffer, 0, count);
                }
            }
        } catch (Exception ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("", ex);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (Exception ex) {
            }
        }
        return buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
