


class c17538992 {

    public static boolean check(String urlStr) {
        try {
            URL url = new URL(urlStr);
            HttpURLConnection urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConnection.setConnectTimeout(2000);
            urlConnection.getContent();
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("There is no internet connection", e);
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}
