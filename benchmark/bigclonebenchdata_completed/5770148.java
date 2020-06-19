
import java.io.UncheckedIOException;


class c5770148 {

    public static void pingSearchEngine(String engineURL) throws MalformedURLException, UnsupportedEncodingException {
        MyHelperClass ConfigurationManager = new MyHelperClass();
        if ((ConfigurationManager.getProperty("http.proxy.host") != null) && (ConfigurationManager.getProperty("http.proxy.port") != null)) {
            System.setProperty("proxySet", "true");
//            MyHelperClass ConfigurationManager = new MyHelperClass();
            System.setProperty("proxyHost",(String)(Object) ConfigurationManager.getProperty("http.proxy.host"));
//            MyHelperClass ConfigurationManager = new MyHelperClass();
            System.getProperty("proxyPort",(String)(Object) ConfigurationManager.getProperty("http.proxy.port"));
        }
//        MyHelperClass ConfigurationManager = new MyHelperClass();
        String sitemapURL = ConfigurationManager.getProperty("dspace.url") + "/sitemap";
        MyHelperClass URLEncoder = new MyHelperClass();
        URL url = new URL(engineURL + URLEncoder.encode(sitemapURL, "UTF-8"));
        try {
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer resp = new StringBuffer();
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                resp.append(inputLine).append("\n");
            }
            in.close();
            if ((int)(Object)connection.getResponseCode() == 200) {
                MyHelperClass log = new MyHelperClass();
                log.info("Pinged " + url.toString() + " successfully");
            } else {
                MyHelperClass log = new MyHelperClass();
                log.warn("Error response pinging " + url.toString() + ":\n" + resp);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("Error pinging " + url.toString(),(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
