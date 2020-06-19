


class c8423555 {

    public static String getContent(String path, String encoding) throws IOException {
        URL url = new URL(path);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        InputStream inputStream =(InputStream)(Object) conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream, encoding);
        StringBuffer sb = new StringBuffer();
        BufferedReader in = new BufferedReader(isr);
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) {
            sb.append(inputLine);
            sb.append("\n");
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
