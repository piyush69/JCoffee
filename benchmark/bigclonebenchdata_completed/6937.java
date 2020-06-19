


class c6937 {
public static MyHelperClass printMap(Map o0){ return null; }
//public MyHelperClass printMap(Map o0){ return null; }

    public static void main(String[] args) throws Exception {
        String urlString = "http://php.tech.sina.com.cn/download/d_load.php?d_id=7877&down_id=151542";
        MyHelperClass EncodeUtils = new MyHelperClass();
        urlString =(String)(Object) EncodeUtils.encodeURL(urlString);
        URL url = new URL(urlString);
        System.out.println("第一次：" + url);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        HttpURLConnection.setFollowRedirects(true);
        Map req =(Map)(Object) conn.getRequestProperties();
        System.out.println("第一次请求头：");
        printMap(req);
        conn.connect();
        System.out.println("第一次响应：");
        System.out.println(conn.getResponseMessage());
        int code =(int)(Object) conn.getResponseCode();
        System.out.println("第一次code:" + code);
        printMap((Map)(Object)conn.getHeaderFields());
        System.out.println(conn.getURL().getFile());
        if (code == 404 && !(conn.getURL() + "").equals(urlString)) {
            System.out.println(conn.getURL());
            MyHelperClass URLEncoder = new MyHelperClass();
            String tmp =(String)(Object) URLEncoder.encode(conn.getURL().toString(), "gbk");
//            MyHelperClass URLEncoder = new MyHelperClass();
            System.out.println(URLEncoder.encode("在线音乐播放脚本", "GBK"));
            System.out.println(tmp);
            url = new URL(tmp);
            System.out.println("第二次：" + url);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            System.out.println("第二次响应：");
            System.out.println("code:" + code);
            printMap((Map)(Object)conn.getHeaderFields());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeURL(String o0){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getRequestProperties(){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }}

class Map {

}
