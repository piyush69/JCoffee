


class c8805074 {
public MyHelperClass log;
	public MyHelperClass getConnection(){ return null; }

    protected boolean checkLogin(String username, String password) {
        MyHelperClass log = new MyHelperClass();
        log.debug("Called checkLogin with " + username);
        MyHelperClass GeoNetworkContext = new MyHelperClass();
        String urlIn = GeoNetworkContext.url + "/" + GeoNetworkContext.loginService + "?username=" + username + "&password=" + password;
        Element results = null;
        String cookieValue = null;
        try {
            URL url = new URL(urlIn);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setConnectTimeout(1000);
            BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
            try {
                MyHelperClass Xml = new MyHelperClass();
                results =(Element)(Object) Xml.loadStream(in);
//                MyHelperClass Xml = new MyHelperClass();
                log.debug("CheckLogin to GeoNetwork returned " + Xml.getString(results));
            } finally {
                in.close();
            }
            Map headers =(Map)(Object) conn.getHeaderFields();
            List values =(List)(Object) headers.get("Set-Cookie");
            for (Iterator iter =(Iterator)(Object) values.iterator();(boolean)(Object) iter.hasNext(); ) {
                String v = (String)(String)(Object) iter.next();
                if (cookieValue == null) {
                    cookieValue = v;
                } else {
                    cookieValue = cookieValue + ";" + v;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("User login to GeoNetwork failed: ", e);
        }
        if (!results.getName().equals("ok")) return false;
        Session session =(Session)(Object) getConnection().getSession();
        session.removeAttribute("usercookie.object");
        session.setAttribute("usercookie.object", cookieValue);
        log.debug("Cookie set is " + cookieValue);
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass loginService;
	public MyHelperClass url;
public MyHelperClass loadStream(BufferedInputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getString(Element o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class Element {

public MyHelperClass getName(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Session {

public MyHelperClass removeAttribute(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}
