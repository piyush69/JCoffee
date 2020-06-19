


class c5135689 {
public MyHelperClass saveNode(NodeInfo o0, HttpURLConnection o1){ return null; }
	public MyHelperClass setCredentials(HttpURLConnection o0){ return null; }

    private boolean saveNodeData(NodeInfo info) {
        boolean rCode = false;
        MyHelperClass mServer = new MyHelperClass();
        String query = mServer + "save.php" + ("?id=" + info.getId());
        try {
            URL url = new URL(query);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            String contentType = info.getMIMEType().toString();
            byte[] body =(byte[])(Object) info.getData();
            conn.setAllowUserInteraction(false);
            conn.setRequestMethod("PUT");
            if (contentType.equals("")) {
                contentType = "application/octet-stream";
            }
            System.out.println("contentType: " + contentType);
            conn.setRequestProperty("Content-Type", contentType);
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

public MyHelperClass write(byte[] o0){ return null; }}

class NodeInfo {

public MyHelperClass getMIMEType(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getData(){ return null; }}

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
