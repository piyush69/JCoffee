


class c23677112 {

	public static String downloadWebpage2(String address) throws MalformedURLException, IOException {
		URL url = new URL(address);
		HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
  MyHelperClass HttpURLConnection = new MyHelperClass();
		HttpURLConnection.setFollowRedirects(true);
		String encoding =(String)(Object) conn.getContentEncoding();
		InputStream is = null;
		if(encoding != null && encoding.equalsIgnoreCase("gzip")) {
			is =(InputStream)(Object) new GZIPInputStream(conn.getInputStream());
		} else if (encoding != null && encoding.equalsIgnoreCase("deflate")) {
			is =(InputStream)(Object) new InflaterInputStream(conn.getInputStream());
		} else {
			is =(InputStream)(Object) conn.getInputStream();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		String page = "";
		while((line =(String)(Object) br.readLine()) != null) {
			page += line + "\n";
		}
		br.close();
		return page;
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setFollowRedirects(boolean o0){ return null; }}

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

public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}

class InflaterInputStream {

InflaterInputStream(MyHelperClass o0){}
	InflaterInputStream(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
