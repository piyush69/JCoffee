


class c22475642 {

    void getAddress(String lat, String lag) {
        try {
            URL url = new URL("http://maps.google.cn/maps/geo?key=abcdefg&q=" + lat + "," + lag);
            InputStream inputStream =(InputStream)(Object) url.openConnection().getInputStream();
            InputStreamReader inputReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line = "", lines = "";
            while ((line =(String)(Object) bufReader.readLine()) != null) {
                lines += line;
            }
            if (!lines.equals("")) {
                JSONObject jsonobject = new JSONObject(lines);
                JSONArray jsonArray = new JSONArray(jsonobject.get("Placemark").toString());
                for (int i = 0; i < (int)(Object)jsonArray.length(); i++) {
                    MyHelperClass mTextView = new MyHelperClass();
                    mTextView.setText(mTextView.getText() + "\n" + jsonArray.getJSONObject(i).getString("address"));
                }
            }
        } catch (Exception e) {
            ;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass get(String o0){ return null; }}

class JSONArray {

JSONArray(String o0){}
	JSONArray(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}
