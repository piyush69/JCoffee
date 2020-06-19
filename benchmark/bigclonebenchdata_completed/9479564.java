


class c9479564 {
public MyHelperClass Base64;

    public String sendGetRequest(String endpoint, String requestParameters, String username, String password) throws Exception {
        String result = null;
        if (endpoint.startsWith("http://")) {
            try {
                String urlStr = endpoint;
                if (requestParameters != null && requestParameters.length() > 0) {
                    urlStr += "?" + requestParameters;
                }
                URL url = new URL(urlStr);
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                String userPassword = username + ":" + password;
                byte[] encoding =(byte[])(Object) Base64.encodeBase64(userPassword.getBytes());
                String authStringEnc = new String(encoding);
                MyHelperClass log = new MyHelperClass();
                log.debug("Base64 encoded auth string: '" + authStringEnc + "'");
                conn.setRequestProperty("Authorization", "Basic " + authStringEnc);
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line =(String)(Object) rd.readLine()) != null) {
                    sb.append(line);
                }
                rd.close();
                result = sb.toString();
            } catch (Throwable e) {
                throw new Exception("problem issuing get to URL", e);
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeBase64(byte[] o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
