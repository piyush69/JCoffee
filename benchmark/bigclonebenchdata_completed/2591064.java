


class c2591064 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static String sendGetRequest(String endpoint, String requestParameters) {
        if (endpoint == null) return null;
        String result = null;
        if (endpoint.startsWith("http://")) {
            try {
                StringBuffer data = new StringBuffer();
                String urlStr = endpoint;
                if (requestParameters != null && requestParameters.length() > 0) {
                    urlStr += "?" + requestParameters;
                }
                URL url = new URL(urlStr);
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line =(String)(Object) rd.readLine()) != null) {
                    sb.append(line);
                }
                rd.close();
                result = sb.toString();
            } catch (Exception e) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(HTTPClient.class.getClass().getName()).log(Level.FINE, "Could not connect to URL, is the service online?");
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class HTTPClient {

}
