


class c17363729 {

    private String sendImpl(String from, String destNumber, String text) throws IOException {
        final QueryStringBuilder query = new QueryStringBuilder();
        MyHelperClass username = new MyHelperClass();
        query.append("user", username);
        MyHelperClass password = new MyHelperClass();
        query.append("password", password);
        MyHelperClass apiId = new MyHelperClass();
        query.append("api_id", apiId);
        query.append("to", destNumber);
        if (from != null) {
            query.append("from", from);
        }
        query.append("text", text);
        MyHelperClass CLICKATELL_GATEWAY_URL = new MyHelperClass();
        final URL url = new URL(CLICKATELL_GATEWAY_URL + "sendmsg" + query.toString());
        final HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.connect();
        final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        try {
            return(String)(Object) br.readLine();
        } finally {
            br.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class QueryStringBuilder {

public MyHelperClass append(String o0, String o1){ return null; }
	public MyHelperClass append(String o0, MyHelperClass o1){ return null; }}

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
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
