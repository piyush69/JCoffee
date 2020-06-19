


class c5203784 {
public MyHelperClass Log;

    private String urlConnectionTranslate(String word) {
        try {
            URL url = new URL("http://ajax.googleapis.com/ajax/services/" + "language/translate?v=1.0&q=" + word + "&langpair=is%7Cen");
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.addRequestProperty("Referer", "http://www.hi.is");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                builder.append(line);
            }
            JSONObject json = new JSONObject(builder.toString());
            return(String)(Object) json.getJSONObject("responseData").getString("translatedText");
        } catch (Exception e) {
            MyHelperClass TranslatorApplication = new MyHelperClass();
            Log.e(TranslatorApplication.tag, e.toString());
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass tag;
public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}

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
	public MyHelperClass getJSONObject(String o0){ return null; }}
