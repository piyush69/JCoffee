


class c5306724 {
public MyHelperClass URIFactory;
	public MyHelperClass log;

    private void initURL() {
        try {
            MyHelperClass locator = new MyHelperClass();
            log.fine("Checking: " + locator);
//            MyHelperClass locator = new MyHelperClass();
            URLConnection conn =(URLConnection)(Object) URIFactory.url(locator).openConnection();
            conn.setUseCaches(false);
            MyHelperClass log = new MyHelperClass();
            log.info(conn.getHeaderFields().toString());
            String header =(String)(Object) conn.getHeaderField(null);
            if (header.contains("404")) {
//                MyHelperClass locator = new MyHelperClass();
                log.info("404 file not found: " + locator);
                return;
            }
            if (header.contains("500")) {
//                MyHelperClass locator = new MyHelperClass();
                log.info("500 server error: " + locator);
                return;
            }
            if ((int)(Object)conn.getContentLength() > 0) {
                byte[] buffer = new byte[50];
                conn.getInputStream().read(buffer);
                if (new String(buffer).trim().startsWith("<!DOCTYPE")) return;
            } else if ((int)(Object)conn.getContentLength() == 0) {
                boolean exists;// = new boolean();
                exists = true;
                return;
            }
            boolean exists;// = new boolean();
            exists = true;
            MyHelperClass length = new MyHelperClass();
            length = conn.getContentLength();
        } catch (Exception ioe) {
            System.err.println(ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass url(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getHeaderField(Object o0){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
