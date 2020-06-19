


class c16337161 {

    public String index(URL url) {
        InputStream is = null;
        try {
            HttpURLConnection urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConnection.setInstanceFollowRedirects(true);
            urlConnection.setAllowUserInteraction(false);
            System.setProperty("sun.net.client.defaultConnectTimeout", "15000");
            System.setProperty("sun.net.client.defaultReadTimeout", "15000");
            urlConnection.connect();
            is =(InputStream)(Object) urlConnection.getInputStream();
            return index((URL)(Object)is);
        } catch (Throwable t) {
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class HttpURLConnection {

public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }}
