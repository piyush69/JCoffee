
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5493644 {

    public synchronized void run() {
        MyHelperClass logger = new MyHelperClass();
        logger.info("SEARCH STARTED");
        JSONObject json = null;
//        MyHelperClass logger = new MyHelperClass();
        logger.info("Opening urlConnection");
        URLConnection connection = null;
        try {
            MyHelperClass url = new MyHelperClass();
            connection =(URLConnection)(Object) url.openConnection();
            MyHelperClass HTTP_REFERER = new MyHelperClass();
            connection.addRequestProperty("Referer", HTTP_REFERER);
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.warn("PROBLEM CONTACTING GOOGLE");
            e.printStackTrace();
        }
        String line;
        StringBuilder builder = new StringBuilder();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line =(String)(Object) reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.warn("PROBLEM RETREIVING DATA FROM GOOGLE");
            e.printStackTrace();
        }
//        MyHelperClass logger = new MyHelperClass();
        logger.info("Google RET: " + builder.toString());
        try {
            json = new JSONObject(builder.toString());
            MyHelperClass q = new MyHelperClass();
            json.append("query", q);
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.warn("PROBLEM RETREIVING DATA FROM GOOGLE");
            e.printStackTrace();
        }
        MyHelperClass sc = new MyHelperClass();
        sc.onSearchFinished(json);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass onSearchFinished(JSONObject o0){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass append(String o0, MyHelperClass o1){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
