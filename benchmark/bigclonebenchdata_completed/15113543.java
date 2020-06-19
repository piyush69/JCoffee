


class c15113543 {

    private static void identify(ContentNetwork cn, String str) {
        try {
            URL url = new URL(str);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass UrlUtils = new MyHelperClass();
            UrlUtils.setBrowserHeaders(con, null);
            String key = "cn." + cn.getID() + ".identify.cookie";
            MyHelperClass COConfigurationManager = new MyHelperClass();
            String cookie =(String)(Object) COConfigurationManager.getStringParameter(key, null);
            if (cookie != null) {
                con.setRequestProperty("Cookie", cookie + ";");
            }
            con.setRequestProperty("Connection", "close");
            con.getResponseCode();
            cookie =(String)(Object) con.getHeaderField("Set-Cookie");
            if (cookie != null) {
                String[] bits = cookie.split(";");
                if (bits.length > 0 && bits[0].length() > 0) {
//                    MyHelperClass COConfigurationManager = new MyHelperClass();
                    COConfigurationManager.setParameter(key, bits[0]);
                }
            }
        } catch (Throwable e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setBrowserHeaders(HttpURLConnection o0, Object o1){ return null; }
	public MyHelperClass setParameter(String o0, String o1){ return null; }
	public MyHelperClass getStringParameter(String o0, Object o1){ return null; }}

class ContentNetwork {

public MyHelperClass getID(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}
