


class c5675398 {
public MyHelperClass QueryResultIO;
	public MyHelperClass SPARQL;
public MyHelperClass fail(String o0){ return null; }

    private TupleQueryResult evaluate(String location, String query, QueryLanguage queryLn) throws Exception {
        MyHelperClass URLEncoder = new MyHelperClass();
        location += "?query=" + URLEncoder.encode(query, "UTF-8") + "&queryLn=" + queryLn.getName();
        URL url = new URL(location);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestProperty("Accept", SPARQL.getDefaultMIMEType());
        conn.connect();
        try {
            int responseCode =(int)(Object) conn.getResponseCode();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (responseCode == (int)(Object)HttpURLConnection.HTTP_OK) {
                MyHelperClass TupleQueryResultFormat = new MyHelperClass();
                return(TupleQueryResult)(Object) QueryResultIO.parse(conn.getInputStream(), TupleQueryResultFormat.SPARQL);
            } else {
                String response = "location " + location + " responded: " + conn.getResponseMessage() + " (" + responseCode + ")";
                fail(response);
                throw new RuntimeException(response);
            }
        } finally {
            conn.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
	public MyHelperClass SPARQL;
public MyHelperClass parse(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDefaultMIMEType(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class QueryLanguage {

public MyHelperClass getName(){ return null; }}

class TupleQueryResult {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}
