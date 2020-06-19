import java.io.*;
import java.lang.*;
import java.util.*;



class c15708288 {

    private Response postRequest(String urlString, String params) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection uc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        uc.setDoInput(true);
        uc.setDoOutput(true);
        uc.setUseCaches(false);
        uc.setAllowUserInteraction(false);
        uc.setRequestMethod("POST");
        uc.setRequestProperty("ContentType", "application/x-www-form-urlencoded");
        uc.setRequestProperty("User-Agent", "CytoLinkFromMJ");
        MyHelperClass cookie = new MyHelperClass();
        if (cookie != null) uc.setRequestProperty("Cookie", cookie);
        PrintStream out = new PrintStream((OutputStream)(Object)uc.getOutputStream());
        out.print(params);
        out.flush();
        out.close();
        uc.connect();
        StringBuffer sb = new StringBuffer();
        String inputLine;
        BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)uc.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
            sb.append(inputLine + "\n");
        }
        in.close();
        Response res = new Response();
        res.content =(MyHelperClass)(Object) sb.toString();
        res.contentType = uc.getHeaderField("Content-Type");
        res.cookie = uc.getHeaderField("Set-Cookie");
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Response {
public MyHelperClass content;
	public MyHelperClass cookie;
	public MyHelperClass contentType;
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(){ return null; }}
