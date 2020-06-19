


class c15984793 {

    public InputStream getPage(String page) throws IOException {
        MyHelperClass hattrickServerURL = new MyHelperClass();
        URL url = new URL(hattrickServerURL + "/Common/" + page);
        HttpURLConnection huc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        MyHelperClass sessionCookie = new MyHelperClass();
        huc.setRequestProperty("Cookie", sessionCookie);
        return(InputStream)(Object) huc.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }}
