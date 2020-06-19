import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5135685 {
public MyHelperClass JAXBContext;
	public MyHelperClass setCredentials(HttpURLConnection o0){ return null; }

    private NodeInfo loadNodeMeta(int id, int properties)  throws Throwable {
        MyHelperClass mServer = new MyHelperClass();
        String query = mServer + "load.php" + ("?id=" + id) + ("&mask=" + properties);
        NodeInfo info = null;
        try {
            URL url = new URL(query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setAllowUserInteraction(false);
            conn.setRequestMethod("GET");
            setCredentials(conn);
            conn.connect();
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream stream = conn.getInputStream();
                MimeType contentType = new MimeType(conn.getContentType());
                if (contentType.getBaseType().equals("text/xml")) {
                    try {
                        JAXBContext context = JAXBContext.newInstance(NetProcessorInfo.class);
                        Unmarshaller unm = context.createUnmarshaller();
                        NetProcessorInfo root = (NetProcessorInfo) unm.unmarshal(stream);
                        if ((root != null) && (root.getNodes().length == 1)) {
                            info = root.getNodes()[0];
                        }
                    } catch (Exception ex) {
                    }
                }
                stream.close();
            }
        } catch (Exception ex) {
        }
        return info;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(Class<NetProcessorInfo o0){ return null; }}

class NodeInfo {

}

class MimeType {

MimeType(String o0){}
	MimeType(){}
	public MyHelperClass getBaseType(){ return null; }}

class JAXBContext {

public MyHelperClass createUnmarshaller(){ return null; }}

class NetProcessorInfo {

public MyHelperClass getNodes(){ return null; }}

class Unmarshaller {

public MyHelperClass unmarshal(InputStream o0){ return null; }}
