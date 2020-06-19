


class c3568737 {

    public URLConnection makeURLConnection(String server) throws IOException {
        if (server == null) {
            MyHelperClass connection = new MyHelperClass();
            connection = null;
        } else {
            URL url = new URL("http://" + server + "/Bob/QueryXindice");
            MyHelperClass connection = new MyHelperClass();
            connection = url.openConnection();
//            MyHelperClass connection = new MyHelperClass();
            connection.setDoOutput(true);
        }
        MyHelperClass connection = new MyHelperClass();
        return (URLConnection)(Object)connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDoOutput(boolean o0){ return null; }}

class URLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
