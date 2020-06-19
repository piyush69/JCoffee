


class c5450104 {
public static MyHelperClass process(String o0){ return null; }
//public MyHelperClass process(String o0){ return null; }

    private static void grab(String urlString) throws MalformedURLException, IOException {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.connect();
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        boolean f = false;
        while ((inputLine =(String)(Object) in.readLine()) != null) {
            inputLine = inputLine.trim();
            if (inputLine.startsWith("<tbody>")) {
                f = true;
                continue;
            }
            if (inputLine.startsWith("</table>")) {
                f = false;
                continue;
            }
            if (f) {
                sb.append(inputLine);
                sb.append("\n");
            }
        }
        process(sb.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
