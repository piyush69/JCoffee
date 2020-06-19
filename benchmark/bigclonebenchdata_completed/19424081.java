


class c19424081 {

    public static String getContent(String url, String code) {
        HttpURLConnection connect = null;
        try {
            URL myurl = new URL(url);
            connect = (HttpURLConnection)(HttpURLConnection)(Object) myurl.openConnection();
            connect.setConnectTimeout(30000);
            connect.setReadTimeout(30000);
            connect.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; GTB5; .NET CLR 1.1.4322; .NET CLR 2.0.50727; Alexa Toolbar; MAXTHON 2.0)");
            MyHelperClass StringUtil = new MyHelperClass();
            return(String)(Object) StringUtil.convertStreamToString(connect.getInputStream(), code);
        } catch (Exception e) {
            MyHelperClass slogger = new MyHelperClass();
            slogger.warn(e.getMessage());
        } finally {
            if (connect != null) {
                connect.disconnect();
            }
        }
        MyHelperClass slogger = new MyHelperClass();
        slogger.warn("这个没找到" + url);
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass convertStreamToString(MyHelperClass o0, String o1){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
