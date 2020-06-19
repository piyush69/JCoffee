
import java.io.UncheckedIOException;


class c8365268 {
public static MyHelperClass webctx;
//public MyHelperClass webctx;

    public static String[] readStats() throws Exception {
        URL url = null;
        BufferedReader reader = null;
        StringBuilder stringBuilder;
        try {
            MyHelperClass port = new MyHelperClass();
            url = new URL("http://localhost:" + port + webctx + "/shared/js/libOO/health_check.sjs");
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(10 * 1000);
            connection.connect();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            stringBuilder = new StringBuilder();
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString().split(",");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (UncheckedIOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
