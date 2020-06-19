


class c1768644 {
public MyHelperClass setContentView(MyHelperClass o0){ return null; }
	public MyHelperClass findViewById(MyHelperClass o0){ return null; }
public MyHelperClass layout;
	public MyHelperClass id;

//    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        setContentView(layout.main);
        try {
            StringBuilder sb = new StringBuilder();
            URL url = new URL("https://ajax.googleapis.com/ajax/services/search/news?v=1.0&q=google");
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            String line;
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line =(String)(Object) reader.readLine()) != null) sb.append(line);
            JSONObject json = new JSONObject(sb.toString());
            sb.setLength(0);
            JSONObject responseData = (JSONObject)(JSONObject)(Object) json.get("responseData");
            JSONArray results = (JSONArray)(JSONArray)(Object) responseData.get("results");
            for (int i = 0; i < (int)(Object)results.length(); i++) {
                JSONObject result = (JSONObject)(JSONObject)(Object) results.get(i);
                sb.append(result.get("title")).append("\n\n");
            }
            TextView tv = (TextView)(TextView)(Object) findViewById(id.textView);
            tv.setText(sb.toString());
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass main;
	public MyHelperClass textView;
}

class Bundle {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

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
	public MyHelperClass get(String o0){ return null; }}

class JSONArray {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass length(){ return null; }}

class TextView {

public MyHelperClass setText(String o0){ return null; }}
