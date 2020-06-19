


class c11312019 {
public static MyHelperClass DebuggerQueue;
//public MyHelperClass DebuggerQueue;

    public static String sendGetRequest(String endpoint, String requestParameters) {
        String result = null;
        if (endpoint.startsWith("http://")) {
            try {
                System.setProperty("java.net.useSystemProxies", "true");
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
                    sb.append(line + "\n");
                }
                rd.close();
                result = sb.toString();
            } catch (Exception e) {
                MyHelperClass Level = new MyHelperClass();
                DebuggerQueue.addDebug(HTTPClient.class.getName(), Level.ERROR, "Error during download url %s error: %s", endpoint, e.getMessage());
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass addDebug(String o0, MyHelperClass o1, String o2, String o3, String o4){ return null; }}

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
