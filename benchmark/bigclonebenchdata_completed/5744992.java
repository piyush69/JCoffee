


class c5744992 {
public MyHelperClass readBufferedContent(BufferedReader o0){ return null; }
	public MyHelperClass readCookie(HttpURLConnection o0){ return null; }
	public MyHelperClass setCookie(HttpURLConnection o0){ return null; }

    public void dorequest(Map ps, String method) throws IOException {
        StringBuffer httpResponse = new StringBuffer();
        MyHelperClass url = new MyHelperClass();
        URL ourl = new URL(url);
        HttpURLConnection httpConnection = (HttpURLConnection)(HttpURLConnection)(Object) ourl.openConnection();
        httpConnection.setRequestMethod(method);
        httpConnection.setDoOutput(true);
        this.setCookie(httpConnection);
        OutputStream httpOutputStream =(OutputStream)(Object) httpConnection.getOutputStream();
        StringBuffer postParams = new StringBuffer("");
        for (Entry entry :(Entry[])(Object) (Object[])(Object)ps.entrySet()) {
            postParams.append(entry.getKey());
            postParams.append("=");
            postParams.append(entry.getValue());
            postParams.append("&");
        }
        httpOutputStream.write(postParams.toString().getBytes());
        BufferedReader httpBufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
        httpResponse.append(this.readBufferedContent(httpBufferedReader));
        String text;// = new String();
        text = httpResponse.toString();
        this.readCookie(httpConnection);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Map {

public MyHelperClass entrySet(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0){ return null; }}

class Entry {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getKey(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
