


class c8075979 {

    private URLConnection tryOpenConnection(String url) throws RuntimeException {
        URLConnection connection = null;
        try {
            connection =(URLConnection)(Object) (new URL("https://" + url).openConnection());
            connection.getInputStream();
            connection =(URLConnection)(Object) (new URL("https://" + url).openConnection());
            return connection;
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.w("ERROR", " " + e.getStackTrace()[0]);
        }
        try {
            connection =(URLConnection)(Object) (new URL("http://" + url).openConnection());
            connection.getInputStream();
            connection =(URLConnection)(Object) (new URL("http://" + url).openConnection());
            return connection;
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.w("ERROR", " " + e.getStackTrace()[0]);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass w(String o0, String o1){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
