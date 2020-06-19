


class c13610451 {

    private Element getXmlFromGeoNetwork(String urlIn, Session userSession) throws FailedActionException {
        Element results = null;
        try {
            URL url = new URL(urlIn);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setConnectTimeout(1000);
            String cookie = (String)(String)(Object) userSession.getAttribute("usercookie.object");
            if (cookie != null) conn.setRequestProperty("Cookie", cookie);
            BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
            try {
                MyHelperClass Xml = new MyHelperClass();
                results =(Element)(Object) Xml.loadStream(in);
            } finally {
                in.close();
            }
        } catch (Exception e) {
            MyHelperClass FailedActionReason = new MyHelperClass();
            throw new FailedActionException((String)(Object)FailedActionReason.SYSTEM_ERROR);
        }
        return results;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYSTEM_ERROR;
public MyHelperClass loadStream(BufferedInputStream o0){ return null; }}

class Session {

public MyHelperClass getAttribute(String o0){ return null; }}

class Element {

}

class FailedActionException extends Exception{
	public FailedActionException(String errorMessage) { super(errorMessage); }
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
