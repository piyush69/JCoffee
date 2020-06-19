


class c23512543 {
public MyHelperClass GeoNetworkContext;
	public MyHelperClass Xml;
	public MyHelperClass log;
	public MyHelperClass getConnection(){ return null; }

    protected void logout() {
        Session session =(Session)(Object) getConnection().getSession();
        session.removeAttribute("usercookie.object");
        String urlIn = GeoNetworkContext.url + "/" + GeoNetworkContext.logoutService;
        Element results = null;
        String cookie = (String)(String)(Object) session.getAttribute("usercookie.object");
        if (cookie != null) {
            try {
                URL url = new URL(urlIn);
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setConnectTimeout(1000);
                conn.setRequestProperty("Cookie", cookie);
                BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
                try {
                    results =(Element)(Object) Xml.loadStream(in);
                    log.debug("CheckLogout to GeoNetwork returned " + Xml.getString(results));
                } finally {
                    in.close();
                }
            } catch (Exception e) {
                throw new RuntimeException("User logout to GeoNetwork failed: ", e);
            }
        }
        log.debug("GeoNetwork logout done");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass url;
	public MyHelperClass logoutService;
public MyHelperClass loadStream(BufferedInputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getString(Element o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class Session {

public MyHelperClass removeAttribute(String o0){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}

class Element {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}
