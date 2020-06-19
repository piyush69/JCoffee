import java.io.*;
import java.lang.*;
import java.util.*;



class c4641591 {
public static MyHelperClass stripOuterElement(String o0){ return null; }
//public MyHelperClass stripOuterElement(String o0){ return null; }

    public static String executePost(String urlStr, Map paramsMap) throws IOException {
        StringBuffer result = new StringBuffer();
        HttpURLConnection connection = null;
        URL url = new URL(urlStr);
        connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        PrintWriter out = new PrintWriter((Writer)(Object)connection.getOutputStream());
        Iterator paramKeys = paramsMap.keySet().iterator();
        while (paramKeys.hasNext()) {
            String paramName = (String) paramKeys.next();
            out.print(paramName + "=" + paramsMap.get(paramName));
            if (paramKeys.hasNext()) {
                out.print('&');
            }
        }
        out.flush();
        BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            result.append(inputLine);
        }
        in.close();
        out.close();
        connection.disconnect();
        String msg = result.toString();
        return(String)(Object) stripOuterElement(msg);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}
