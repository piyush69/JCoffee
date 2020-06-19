


class c21644427 {

    public static Image getImage(String urlChartString) throws IOException, JGoogleChartException {
        Image image = null;
        HttpURLConnection urlConn = null;
        URL url = new URL(urlChartString);
        urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        urlConn.setDoInput(true);
        urlConn.setDoOutput(true);
        urlConn.setUseCaches(false);
        urlConn.setRequestMethod("GET");
        urlConn.setAllowUserInteraction(false);
        urlConn.setRequestProperty("HTTP-Version", "HTTP/1.1");
        urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        int responseCode =(int)(Object) urlConn.getResponseCode();
        if (responseCode != 200) {
            MyHelperClass JGoogleChartException = new MyHelperClass();
            throw new JGoogleChartException((int)(Object)JGoogleChartException.MSG_HTTP_ERROR_CODE + responseCode + " (" + urlConn.getResponseMessage());
        }
        InputStream istream =(InputStream)(Object) urlConn.getInputStream();
        MyHelperClass ImageIO = new MyHelperClass();
        image =(Image)(Object) ImageIO.read(istream);
        return image;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MSG_HTTP_ERROR_CODE;
public MyHelperClass read(InputStream o0){ return null; }}

class Image {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JGoogleChartException extends Exception{
	public JGoogleChartException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}
