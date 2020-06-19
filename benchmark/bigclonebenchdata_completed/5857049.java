


class c5857049 {
public static MyHelperClass logger;
//public MyHelperClass logger;

    public static void signalServer(String solrHostURL) throws IOException {
        if (solrHostURL == null || solrHostURL.length() == 0) return;
        URL url;
        URLConnection urlConn;
        DataOutputStream printout;
        BufferedReader input;
        url = new URL(solrHostURL);
        urlConn =(URLConnection)(Object) url.openConnection();
        urlConn.setDoInput(true);
        urlConn.setDoOutput(true);
        urlConn.setUseCaches(false);
        urlConn.setRequestProperty("Content-Type", "text/xml");
        urlConn.setRequestProperty("charset", "utf-8");
        printout = new DataOutputStream(urlConn.getOutputStream());
        String content = "<commit/>";
        printout.writeBytes(content);
        printout.flush();
        printout.close();
        input = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        String str;
        while (null != ((str =(String)(Object) input.readLine()))) {
            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) System.out.println(str); else logger.info(str);
        }
        input.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
