


class c20467314 {

    public List makeQuery(String query) {
        List result =(List)(Object) new ArrayList();
        try {
            MyHelperClass URLUTF8Encoder = new MyHelperClass();
            query =(String)(Object) URLUTF8Encoder.encode(query);
            URL url = new URL("http://ajax.googleapis.com/ajax/services/search/web?start=0&rsz=large&v=1.0&q=" + query);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.addRequestProperty("Referer", "http://poo.sk");
            String line;
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line =(String)(Object) reader.readLine()) != null) {
                builder.append(line);
            }
            String response = builder.toString();
            JSONObject json = new JSONObject(response);
            Long count = Long.decode((String)(Object)json.getJSONObject("responseData").getJSONObject("cursor").getString("estimatedResultCount"));
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("Found " + count + " potential pages");
            JSONArray ja =(JSONArray)(Object) json.getJSONObject("responseData").getJSONArray("results");
            for (int i = 0; i < (int)(Object)ja.length(); i++) {
                JSONObject j =(JSONObject)(Object) ja.getJSONObject(i);
                result.add(j.getString("url"));
            }
        } catch (Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("Couldnt query Google for some reason check exception below");
            e.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getJSONObject(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass encode(String o0){ return null; }
	public MyHelperClass getJSONArray(String o0){ return null; }}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getJSONObject(String o0){ return null; }}

class JSONArray {

public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}
