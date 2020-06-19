
import java.io.UncheckedIOException;


class c20523308 {
public MyHelperClass sessionId;
	public MyHelperClass URLEncoder;
	public MyHelperClass _getPassword(URI o0){ return null; }
	public MyHelperClass scrubURI(URI o0){ return null; }

    public String getPassword(URI uri) {
        if (_getPassword(uri) != null) return(String)(Object) _getPassword(uri);
        String result = null;
        try {
            String sUri =(String)(Object) scrubURI(uri);
            MyHelperClass TEMP_PASSWORD_SERVICE_URL = new MyHelperClass();
            URL url = new URL(TEMP_PASSWORD_SERVICE_URL + "?SID=" + sessionId + "&ruri=" + URLEncoder.encode(sUri, "UTF-8"));
            JSONObject jsonObject = null;
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            InputStream istream =(InputStream)(Object) conn.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(istream));
            if ((result =(String)(Object) in.readLine()) != null) {
                jsonObject = new JSONObject(result);
            }
            if ((boolean)(Object)jsonObject.has("success")) {
                if (jsonObject.get("success").toString().equals("false")) {
                    if ((boolean)(Object)jsonObject.has("error")) {
                        MyHelperClass logger = new MyHelperClass();
                        logger.log("Returned error message from temporary password service is: " + jsonObject.get("error"));
                    }
                    return null;
                }
            }
            if ((boolean)(Object)jsonObject.has("temppass")) {
                result = (String)(String)(Object) jsonObject.get("temppass");
            }
        } catch (java.io.UncheckedIOException fe) {
            MyHelperClass logger = new MyHelperClass();
            logger.log("Could not find temporary password service. " + fe);
            fe.printStackTrace();
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.log("Exception getting temporary password. " + e);
            e.printStackTrace();
        }
        if (result == null) return null;
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URI {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass has(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
