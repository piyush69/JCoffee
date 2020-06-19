import java.io.*;
import java.lang.*;
import java.util.*;



class c13806107 {
public MyHelperClass NULL;

    private void makeQuery(String query) {
        System.out.println(" Querying for " + query);
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            query =(String)(Object) URLEncoder.encode(query, "UTF-8");
            for (int k = 0; k < 100; k++) {
                System.out.println(query);
                URL url = new URL("http://ajax.googleapis.com/ajax/services/search/web?start=" + k * 8 + "&rsz=large&v=1.0&q=" + query);
                URLConnection connection =(URLConnection)(Object) url.openConnection();
                MyHelperClass HTTP_REFERER = new MyHelperClass();
                connection.addRequestProperty("Referer", HTTP_REFERER);
                String line;
                StringBuilder builder = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
                String response = builder.toString();
                JSONObject json = new JSONObject(response);
                if (k == 0) {
                    String result =(String)(Object) NULL; //new String();
                    result = "Total results = " + json.getJSONObject("responseData").getJSONObject("cursor").getString("estimatedResultCount") + "\n";
                }
                JSONArray ja =(JSONArray)(Object) json.getJSONObject("responseData").getJSONArray("results");
                JSONArray jsonres =(JSONArray)(Object) NULL; //new JSONArray();
                jsonres = ja;
                for (int i = 0; i < (int)(Object)ja.length(); i++) {
                    System.out.print((i + 1) + ". ");
                    JSONObject j =(JSONObject)(Object) ja.getJSONObject(i);
                    String result =(String)(Object) NULL; //new String();
                    result =(int)(Object) result + (int)(Object)j.getString("titleNoFormatting") + " ";
//                    MyHelperClass result = new MyHelperClass();
                    result =(int)(Object) result +(int)(Object)(MyHelperClass)(Object) (int)(Object)j.getString("url") + "\n";
//                    MyHelperClass result = new MyHelperClass();
                    result =(int)(Object) result +(int)(Object)(MyHelperClass)(Object) (int)(Object)j.getString("content") + "\n\n";
                }
            }
        } catch (Exception e) {
            System.err.println("Something went wrong...");
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getJSONArray(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getJSONObject(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }}

class JSONObject {

JSONObject(){}
	JSONObject(String o0){}
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getJSONObject(String o0){ return null; }}

class JSONArray {

public MyHelperClass getJSONObject(int o0){ return null; }
	public MyHelperClass length(){ return null; }}
