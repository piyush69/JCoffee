


class c6634379 {

//    @Deprecated
    public static void getAndProcessContents(String videoPageURL, int bufsize, String charset, Closure process) throws IOException {
        URL url = null;
        HttpURLConnection connection = null;
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            url = new URL(videoPageURL);
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            is =(InputStream)(Object) connection.getInputStream();
            isr = new InputStreamReader(is, charset);
            br = new BufferedReader(isr);
            for (String line =(String)(Object) br.readLine(); line != null; line =(String)(Object) br.readLine()) {
                process.exec(line);
            }
        } finally {
            MyHelperClass Closeables = new MyHelperClass();
            Closeables.closeQuietly(br);
//            MyHelperClass Closeables = new MyHelperClass();
            Closeables.closeQuietly(isr);
//            MyHelperClass Closeables = new MyHelperClass();
            Closeables.closeQuietly(is);
            MyHelperClass HttpUtils = new MyHelperClass();
            HttpUtils.disconnect(connection);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass disconnect(HttpURLConnection o0){ return null; }
	public MyHelperClass closeQuietly(InputStreamReader o0){ return null; }
	public MyHelperClass closeQuietly(BufferedReader o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class Closure {

public MyHelperClass exec(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

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
