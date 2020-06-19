


class c2903590 {
public static MyHelperClass IOUtils;
	public static MyHelperClass add(String o0, String o1, String o2){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass add(String o0, String o1, String o2){ return null; }

    public static void notify(String msg) throws Exception {
        String url = "http://api.clickatell.com/http/sendmsg?";
        MyHelperClass user = new MyHelperClass();
        url =(String)(Object) add(url, "user",(String)(Object) user);
        MyHelperClass password = new MyHelperClass();
        url =(String)(Object) add(url, "password",(String)(Object) password);
        MyHelperClass apiId = new MyHelperClass();
        url =(String)(Object) add(url, "api_id",(String)(Object) apiId);
        MyHelperClass to = new MyHelperClass();
        url =(String)(Object) add(url, "to",(String)(Object) to);
        url =(String)(Object) add(url, "text", msg);
        URL u = new URL(url);
        URLConnection c =(URLConnection)(Object) u.openConnection();
        InputStream is =(InputStream)(Object) c.getInputStream();
        IOUtils.copy(is,(PrintStream)(Object) System.out);
        IOUtils.closeQuietly(is);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, PrintStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class PrintStream {

}
