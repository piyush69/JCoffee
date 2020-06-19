


class c15790157 {

    public String runRawSearch(final String search) throws IOException {
        if (search == null) {
            return null;
        }
        StringBuilder urlString = new StringBuilder("http://ajax.googleapis.com/ajax/services/search/web?");
        MyHelperClass version = new MyHelperClass();
        if (version != null) {
            urlString.append("v=");
//            MyHelperClass version = new MyHelperClass();
            urlString.append(version);
            urlString.append("&");
        }
        urlString.append("q=");
        MyHelperClass StringEscapeUtils = new MyHelperClass();
        urlString.append(StringEscapeUtils.escapeHtml(search));
        URL url = new URL(urlString.toString());
        Proxy proxy = null;
        final URLConnection connection;
        if (proxy != null) {
            connection =(URLConnection)(Object) url.openConnection(proxy);
        } else {
            connection =(URLConnection)(Object) url.openConnection();
        }
        MyHelperClass referer = new MyHelperClass();
        if (referer != null) {
//            MyHelperClass referer = new MyHelperClass();
            connection.addRequestProperty("Referer", referer);
        }
        String line;
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((line =(String)(Object) reader.readLine()) != null) {
            builder.append(line);
        }
        return builder.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass escapeHtml(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class Proxy {

}

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
