import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c5907854 {
public MyHelperClass URLEncoder;
	public MyHelperClass CONFIDENCE;
	public MyHelperClass SUPPORT;

//    @Override
    public List<String> getNamedEntitites(String sentence) {
        List<String> namedEntities = new ArrayList<String>();
        try {
            MyHelperClass SERVICE_URL = new MyHelperClass();
            URL url = new URL(SERVICE_URL + "text=" + URLEncoder.encode(sentence, "UTF-8") + "&confidence=" + CONFIDENCE + "&support=" + SUPPORT);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setRequestProperty("accept", "application/json");
            BufferedReader rd = new BufferedReader(new InputStreamReader((InputStream)(Object)conn.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            JSONObject json = new JSONObject(sb.toString());
            if (!(Boolean)(Object)json.isNull("Resources")) {
                JSONArray array =(JSONArray)(Object) json.getJSONArray("Resources");
                JSONObject entityObject;
                for (int i = 0; i < (int)(Object)array.length(); i++) {
                    entityObject =(JSONObject)(Object) array.getJSONObject(i);
                    System.out.println("Entity: " + entityObject.getString("@surfaceForm"));
                    System.out.println("DBpedia URI: " + entityObject.getString("@URI"));
                    System.out.println("Types: " + entityObject.getString("@types"));
                    namedEntities.add((String)(Object)entityObject.getString("@surfaceForm"));
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return namedEntities;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getJSONArray(String o0){ return null; }
	public MyHelperClass isNull(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class JSONArray {

public MyHelperClass getJSONObject(int o0){ return null; }
	public MyHelperClass length(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
