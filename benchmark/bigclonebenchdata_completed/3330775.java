import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3330775 {

    public static JSONObject getJSONData(String url) throws JSONException {
        JSONObject jObject = null;
        InputStream data = null;
        DefaultHttpClient httpClient = new DefaultHttpClient();
        URI uri;
        try {
            uri = new URI(url);
            HttpGet httpGet = new HttpGet(uri);
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpGet);
            data =(InputStream)(Object) response.getEntity().getContent();
            String line;
            StringBuilder builder = new StringBuilder();
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(data), 8192);
            while ((line = reader.readLine()) != null) builder.append(line);
            reader.close();
            jObject = (JSONObject) (JSONObject)(Object)new JSONTokener(builder.toString()).nextValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jObject;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class JSONObject {

}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class JSONTokener {

JSONTokener(String o0){}
	JSONTokener(){}
	public MyHelperClass nextValue(){ return null; }}
