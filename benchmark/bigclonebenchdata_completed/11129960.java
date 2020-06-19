


class c11129960 {

    public static String getGoGl(final String urlPath, String key) {
        MyHelperClass log = new MyHelperClass();
        log.debug("getGoGl url " + urlPath);
//        MyHelperClass log = new MyHelperClass();
        log.debug("getGoGl key " + key);
        String shortUrl = null;
        URL simpleURL = null;
        HttpsURLConnection url = null;
        BufferedInputStream bStream = null;
        StringBuffer resultString = new StringBuffer("");
        String inputString = "{\"longUrl\":\"" + urlPath + "\"}";
//        MyHelperClass log = new MyHelperClass();
        log.debug("getGoGl inputString " + inputString);
        try {
            simpleURL = new URL("https://www.googleapis.com/urlshortener/v1/url?key=" + key);
            url = (HttpsURLConnection)(HttpsURLConnection)(Object) simpleURL.openConnection();
            url.setDoOutput(true);
            url.setRequestProperty("content-type", "application/json");
            PrintWriter pw = new PrintWriter(url.getOutputStream());
            pw.print(inputString);
            pw.close();
        } catch (Exception ex) {
//            MyHelperClass log = new MyHelperClass();
            log.error(ex);
            shortUrl = urlPath;
        }
        try {
            bStream = new BufferedInputStream(url.getInputStream());
            int i;
            while ((i =(int)(Object) bStream.read()) >= 0) {
                resultString.append((char) i);
            }
        } catch (Exception ex) {
            log.error(ex);
            shortUrl = urlPath;
        }
        return shortUrl;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}

class PrintWriter {

PrintWriter(MyHelperClass o0){}
	PrintWriter(){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
