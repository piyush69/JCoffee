


class c11952110 {

    protected RemoteInputStream getUrlResource(URL url) throws IOException {
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        MyHelperClass url_loading_time_out = new MyHelperClass();
        conn.setConnectTimeout(url_loading_time_out);
//        MyHelperClass url_loading_time_out = new MyHelperClass();
        conn.setReadTimeout(url_loading_time_out);
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.connect();
        long last_modify_time =(long)(Object) conn.getLastModified();
        MyHelperClass CIO = new MyHelperClass();
        IOCacheService cache_service =(IOCacheService)(Object) CIO.getAppBridge().getIO().getCache();
        if (cache_service != null) {
            RemoteInputStream cache =(RemoteInputStream)(Object) cache_service.findCache(url, last_modify_time);
            if (cache != null) {
                return cache;
            }
        }
        return (RemoteInputStream)(Object)new URLConnectionInputStream(url, conn);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getIO(){ return null; }
	public MyHelperClass getAppBridge(){ return null; }
	public MyHelperClass getCache(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class RemoteInputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class IOCacheService {

public MyHelperClass findCache(URL o0, long o1){ return null; }}

class URLConnectionInputStream {

URLConnectionInputStream(URL o0, URLConnection o1){}
	URLConnectionInputStream(){}}
