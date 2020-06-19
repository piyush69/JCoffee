


class c19401776 {

    public HttpURLConnection connect() throws IOException {
        MyHelperClass url = new MyHelperClass();
        if (url == null) {
            return null;
        }
//        MyHelperClass url = new MyHelperClass();
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        MyHelperClass previousETag = new MyHelperClass();
        if (previousETag != null) {
//            MyHelperClass previousETag = new MyHelperClass();
            connection.addRequestProperty("If-None-Match", previousETag);
        }
        MyHelperClass previousLastModified = new MyHelperClass();
        if (previousLastModified != null) {
//            MyHelperClass previousLastModified = new MyHelperClass();
            connection.addRequestProperty("If-Modified-Since", previousLastModified);
        }
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
