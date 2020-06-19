


class c23428514 {

    public void makeQuery(String query, PrintWriter writer) {
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            query =(String)(Object) URLEncoder.encode(query, "UTF-8");
            MyHelperClass KEY = new MyHelperClass();
            URL url = new URL("http://ajax.googleapis.com/ajax/services/search/web?start=0&rsz=large&v=1.0&key=" + KEY + "&q=" + query);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            MyHelperClass HTTP_REFERER = new MyHelperClass();
            connection.addRequestProperty("Referer", HTTP_REFERER);
            String line;
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line =(String)(Object) reader.readLine()) != null) {
                builder.append(line);
            }
            String response = builder.toString();
            JSONObject json = new JSONObject(response);
            writer.println("Total results = " + json.getJSONObject("responseData").getJSONObject("cursor").getString("estimatedResultCount"));
            JSONArray ja =(JSONArray)(Object) json.getJSONObject("responseData").getJSONArray("results");
            writer.println("\nResults:");
            for (int i = 0; i < (int)(Object)ja.length(); i++) {
                writer.print((i + 1) + ". ");
                JSONObject j =(JSONObject)(Object) ja.getJSONObject(i);
                writer.println((String)(Object)j.getString("titleNoFormatting"));
                writer.println((String)(Object)j.getString("url"));
            }
        } catch (Exception e) {
            writer.println("Something went wrong...");
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getJSONArray(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getJSONObject(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class PrintWriter {

public MyHelperClass print(String o0){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }}

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
