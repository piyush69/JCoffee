


class c6930078 {
public MyHelperClass getData(HttpURLConnection o0){ return null; }

    public void ztest_cluster() throws Exception {
        MyHelperClass Configuration = new MyHelperClass();
        Configuration.init();
        TomcatServer ts1 = new TomcatServer();
        ts1.registerServlet("/*", TestServlet.class.getName());
        ts1.registerCluster(5554);
        ts1.start(5555);
        TomcatServer ts2 = new TomcatServer();
        ts2.registerServlet("/*", TestServlet.class.getName());
        ts2.registerCluster(5554);
        ts2.start(5556);
        URL url1 = new URL("http://127.0.0.1:5555/a");
        HttpURLConnection c1 = (HttpURLConnection)(HttpURLConnection)(Object) url1.openConnection();
        assert getData(c1).equals("a null");
        String cookie =(String)(Object) c1.getHeaderField("Set-Cookie");
        Thread.sleep(5000);
        URL url2 = new URL("http://127.0.0.1:5556/a");
        HttpURLConnection c2 = (HttpURLConnection)(HttpURLConnection)(Object) url2.openConnection();
        c2.setRequestProperty("Cookie", cookie);
        assert getData(c2).equals("a a");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass init(){ return null; }}

class TomcatServer {

public MyHelperClass registerCluster(int o0){ return null; }
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
