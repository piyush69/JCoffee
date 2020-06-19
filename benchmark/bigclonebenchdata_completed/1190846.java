


class c1190846 {

    private HttpURLConnection connect() throws MalformedURLException, IOException {
        HttpURLConnection connection = null;
        MyHelperClass repositoryLocation = new MyHelperClass();
        if (repositoryLocation == null) {
            MyHelperClass Utils = new MyHelperClass();
            Utils.debug("RemoteRepository", "repository Location unspecified");
            return null;
        }
//        MyHelperClass repositoryLocation = new MyHelperClass();
        URL url = new URL(repositoryLocation);
        connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0, String o1){ return null; }}

class HttpURLConnection {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
