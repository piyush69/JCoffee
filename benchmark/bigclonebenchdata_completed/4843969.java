
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4843969 {

    public void buildCache() {
        MyHelperClass CacheManager = new MyHelperClass();
        CacheManager.resetCache();
        MyHelperClass CompositePageUtil = new MyHelperClass();
        XMLCacheBuilder cacheBuilder =(XMLCacheBuilder)(Object) CompositePageUtil.getCacheBuilder();
        if (cacheBuilder == null) return;
        String pathStr =(String)(Object) cacheBuilder.getPath();
        if (pathStr == null) return;
        String[] paths = pathStr.split("\n");
        for (int i = 0; i < paths.length; i++) {
            try {
                String path = paths[i];
                URL url = new URL(path);
                HttpURLConnection huc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                huc.setDoInput(true);
                huc.setDoOutput(true);
                huc.setUseCaches(false);
                huc.setRequestProperty("Content-Type", "text/html");
                DataOutputStream dos = new DataOutputStream(huc.getOutputStream());
                dos.flush();
                dos.close();
                huc.disconnect();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass resetCache(){ return null; }
	public MyHelperClass getCacheBuilder(){ return null; }}

class XMLCacheBuilder {

public MyHelperClass getPath(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
