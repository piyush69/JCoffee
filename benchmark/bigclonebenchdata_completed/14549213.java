import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14549213 {

    public Result search(Object object)  throws Throwable {
        if (object == null || !(object instanceof String)) {
            return null;
        }
        String query = (String) object;
        Result hitResult = new Result();
        Set<Hit> hits = new HashSet<Hit>(8);
        try {
            query = URLEncoder.encode(query, "UTF-8");
            URL url = new URL("http://ajax.googleapis.com/ajax/services/search/web?start=0&rsz=large&v=1.0&q=" + query);
            URLConnection connection = url.openConnection();
            MyHelperClass HTTP_REFERER = new MyHelperClass();
            connection.addRequestProperty("Referer",(String)(Object) HTTP_REFERER);
            String line;
            StringBuilder builder = new StringBuilder();
            InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            input.close();
            String response = builder.toString();
            JSONObject json = new JSONObject(response);
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug(json.getString("responseData"));
            int count = json.getJSONObject("responseData").getJSONObject("cursor").getInt("estimatedResultCount");
            hitResult.setEstimatedCount(count);
            JSONArray ja = json.getJSONObject("responseData").getJSONArray("results");
            for (int i = 0; i < ja.length(); i++) {
                JSONObject j = ja.getJSONObject(i);
                Hit hit = new Hit();
                String result = j.getString("titleNoFormatting");
                hit.setTitle(result == null || result.equals("") ? "${EMPTY}" : result);
                result = j.getString("url");
                hit.setUrl(new URL(result));
                hits.add(hit);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Something went wrong..." + e.getMessage());
        }
        hitResult.setHits(hits);
        return hitResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class Result {

public MyHelperClass setHits(Set<Hit o0){ return null; }
	public MyHelperClass setEstimatedCount(int o0){ return null; }}

class Hit {

public MyHelperClass setUrl(URL o0){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getJSONObject(String o0){ return null; }}

class JSONArray {

public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}
