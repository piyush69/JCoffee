


class c5135686 {
public MyHelperClass NodePropertyFlag;
	public MyHelperClass setCredentials(HttpURLConnection o0){ return null; }

    private boolean loadNodeData(NodeInfo info) {
        MyHelperClass mServer = new MyHelperClass();
        String query = mServer + "load.php" + ("?id=" + info.getId()) + ("&mask=" + NodePropertyFlag.Data);
        boolean rCode = false;
        try {
            URL url = new URL(query);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setAllowUserInteraction(false);
            conn.setRequestMethod("GET");
            setCredentials(conn);
            conn.connect();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream stream =(InputStream)(Object) conn.getInputStream();
                byte[] data = new byte[0], temp = new byte[1024];
                boolean eof = false;
                while (!eof) {
                    int read =(int)(Object) stream.read(temp);
                    if (read > 0) {
                        byte[] buf = new byte[data.length + read];
                        System.arraycopy(data, 0, buf, 0, data.length);
                        System.arraycopy(temp, 0, buf, data.length, read);
                        data = buf;
                    } else if (read < 0) {
                        eof = true;
                    }
                }
                info.setData(data);
                info.setMIMEType(new MimeType(conn.getContentType()));
                rCode = true;
                stream.close();
            }
        } catch (Exception ex) {
        }
        return rCode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
	public MyHelperClass Data;
}

class NodeInfo {

public MyHelperClass getId(){ return null; }
	public MyHelperClass setData(byte[] o0){ return null; }
	public MyHelperClass setMIMEType(MimeType o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class MimeType {

MimeType(MyHelperClass o0){}
	MimeType(){}}
