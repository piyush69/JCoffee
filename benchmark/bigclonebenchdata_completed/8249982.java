


class c8249982 {
public MyHelperClass setResumable(boolean o0){ return null; }
	public MyHelperClass setSize(long o0){ return null; }
public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass setRangeEnd(int o0){ return null; }
public MyHelperClass setURL(String o0){ return null; }
public MyHelperClass con;
	public MyHelperClass secureRedirect(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass mustRedirect(){ return null; }

    public void getDownloadInfo(String _url) throws Exception {
        URL url = new URL(_url);
        HttpURLConnection con;// = new HttpURLConnection();
        con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//        MyHelperClass con = new MyHelperClass();
        con.setRequestProperty("User-Agent", "test");
//        MyHelperClass con = new MyHelperClass();
        con.setRequestProperty("Accept", "*/*");
//        MyHelperClass con = new MyHelperClass();
        con.setRequestProperty("Range", "bytes=0-");
//        MyHelperClass con = new MyHelperClass();
        con.setRequestMethod("HEAD");
//        MyHelperClass con = new MyHelperClass();
        con.setUseCaches(false);
//        MyHelperClass con = new MyHelperClass();
        con.connect();
//        MyHelperClass con = new MyHelperClass();
        con.disconnect();
        if ((boolean)(Object)mustRedirect()) secureRedirect();
        url =(URL)(Object) con.getURL();
        setURL(url.toString());
        setSize(Long.parseLong((String)(Object)con.getHeaderField("Content-Length")));
        setResumable((int)(Object)con.getResponseCode() == 206);
        setLastModified(con.getLastModified());
        setRangeEnd((int)(Object)getSize() - 1);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getURL(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getURL(){ return null; }}
