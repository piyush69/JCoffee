


class c3370624 {
public MyHelperClass log;

    public void run() {
        try {
            MyHelperClass url = new MyHelperClass();
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass cookies = new MyHelperClass();
            log.trace("passing in cookies: ", cookies);
//            MyHelperClass cookies = new MyHelperClass();
            connection.setRequestProperty("Cookie", cookies);
            connection.getContent();
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass trace(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class HttpURLConnection {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }}
