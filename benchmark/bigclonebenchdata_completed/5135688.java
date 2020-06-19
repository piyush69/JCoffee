


class c5135688 {
public MyHelperClass saveNode(NodeInfo o0, HttpURLConnection o1){ return null; }
	public MyHelperClass createURLEncodedPropertyString(NodeInfo o0, int o1){ return null; }
	public MyHelperClass setCredentials(HttpURLConnection o0){ return null; }

    private boolean saveNodeMeta(NodeInfo info, int properties) {
        boolean rCode = false;
        MyHelperClass mServer = new MyHelperClass();
        String query = mServer + "save.php" + ("?id=" + info.getId());
        try {
            URL url = new URL(query);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass Helpers = new MyHelperClass();
            byte[] body =(byte[])(Object) Helpers.EncodeString(Helpers.ASCII, createURLEncodedPropertyString(info, properties));
            conn.setAllowUserInteraction(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            setCredentials(conn);
            conn.setDoOutput(true);
            conn.getOutputStream().write(body);
            rCode =(boolean)(Object) saveNode(info, conn);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.toString());
        }
        return rCode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASCII;
public MyHelperClass EncodeString(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class NodeInfo {

public MyHelperClass getId(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}
