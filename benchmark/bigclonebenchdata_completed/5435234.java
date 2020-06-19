


class c5435234 {

    public static String getURLContent(String urlStr) throws MalformedURLException, IOException {
        URL url = new URL(urlStr);
        MyHelperClass log = new MyHelperClass();
        log.info("url: " + url);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer buf = new StringBuffer();
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) {
            buf.append(inputLine);
        }
        in.close();
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

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

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
