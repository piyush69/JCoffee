


class c6930079 {
public MyHelperClass getData(HttpURLConnection o0){ return null; }

    public void test_filecluster() throws Exception {
        MyHelperClass Configuration = new MyHelperClass();
        Configuration.init();
        LruPersistentManager sessionManager2 = new LruPersistentManager(new File("d:/temp/test"));
        TomcatServer ts2 = new TomcatServer("hf1", sessionManager2);
        ts2.registerServlet("/*", TestServlet.class.getName());
        ts2.start(5556);
        LruPersistentManager sessionManager1 = new LruPersistentManager(new File("d:/temp/test"));
        TomcatServer ts1 = new TomcatServer("hf2", sessionManager1);
        ts1.registerServlet("/*", TestServlet.class.getName());
        ts1.start(5555);
        URL url1 = new URL("http://127.0.0.1:5555/a");
        HttpURLConnection c1 = (HttpURLConnection)(HttpURLConnection)(Object) url1.openConnection();
        assert getData(c1).equals("a null");
        String cookie =(String)(Object) c1.getHeaderField("Set-Cookie");
        Thread.sleep(10000);
        URL url2 = new URL("http://127.0.0.1:5556/a");
        HttpURLConnection c2 = (HttpURLConnection)(HttpURLConnection)(Object) url2.openConnection();
        c2.setRequestProperty("Cookie", cookie);
        assert getData(c2).equals("a a");
        Thread.sleep(15000);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass init(){ return null; }}

class LruPersistentManager {

LruPersistentManager(File o0){}
	LruPersistentManager(){}}

class File {

File(String o0){}
	File(){}}

class TomcatServer {

TomcatServer(String o0, LruPersistentManager o1){}
	TomcatServer(){}
	public MyHelperClass registerServlet(String o0, String o1){ return null; }
	public MyHelperClass start(int o0){ return null; }}

class TestServlet {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}
