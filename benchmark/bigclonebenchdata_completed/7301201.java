


class c7301201 {
public MyHelperClass url;

    private void openConnection() throws IOException {
        HttpURLConnection connection;// = new HttpURLConnection();
        connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//        MyHelperClass connection = new MyHelperClass();
        connection.setDoInput(true);
//        MyHelperClass connection = new MyHelperClass();
        connection.setDoOutput(true);
//        MyHelperClass connection = new MyHelperClass();
        connection.setRequestMethod("POST");
//        MyHelperClass connection = new MyHelperClass();
        connection.setRequestProperty("Content-Type", "text/xml");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}
