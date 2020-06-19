
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21182830 {

    public void buildCache() {
        MyHelperClass CompositePageUtil = new MyHelperClass();
        XMLCacheBuilder cacheBuilder =(XMLCacheBuilder)(Object) CompositePageUtil.getCacheBuilder();
        String postFix = "";
        if (cacheBuilder.getPostFix() != null && !cacheBuilder.getPostFix().equals("")) {
            postFix = "." + cacheBuilder.getPostFix();
        }
        String basePath =(String)(Object) cacheBuilder.getBasePath();
//        MyHelperClass CompositePageUtil = new MyHelperClass();
        List actions =(List)(Object) CompositePageUtil.getXMLActions();
        for (int i = 0; i < (int)(Object)actions.size(); i++) {
            try {
                XMLAction action = (XMLAction)(XMLAction)(Object) actions.get(i);
                if (action.getEscapeCacheBuilder() != null && action.getEscapeCacheBuilder().equals("true")) continue;
                String actionUrl = basePath + action.getName() + postFix;
                URL url = new URL(actionUrl);
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
                MyHelperClass logger = new MyHelperClass();
                logger.error((MalformedURLException)(Object)e);
                e.printStackTrace();
            } catch (ArithmeticException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.equals(e);
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getXMLActions(){ return null; }
	public MyHelperClass getCacheBuilder(){ return null; }
	public MyHelperClass error(MalformedURLException o0){ return null; }}

class XMLCacheBuilder {

public MyHelperClass getPostFix(){ return null; }
	public MyHelperClass getBasePath(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class XMLAction {

public MyHelperClass getEscapeCacheBuilder(){ return null; }
	public MyHelperClass getName(){ return null; }}

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
