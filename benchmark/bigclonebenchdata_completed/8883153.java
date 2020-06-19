


class c8883153 {

    protected int getResponseCode(String address) throws Exception {
        URL url = new URL(address);
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setUseCaches(false);
        try {
            con.connect();
            return(int)(Object) con.getResponseCode();
        } finally {
            con.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}
