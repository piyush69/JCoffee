
import java.io.UncheckedIOException;


class c4309920 {
public MyHelperClass getStringFromInputStream(MyHelperClass o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPort(){ return null; }

    public InputStream doRemoteCall(NamedList params) throws IOException {
        String protocol = "http";
        String host =(String)(Object) getHost();
        int port = Integer.parseInt((String)(Object)getPort());
        StringBuilder sb = new StringBuilder();
        for (Entry entry :(Entry[])(Object) (Object[])(Object)params) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb.append(key).append("=").append(value).append("&");
        }
        sb.setLength(sb.length() - 1);
        String file = "/" + getUrl() + "/?" + sb.toString();
        URL url = new URL(protocol, host, port, file);
        logger.debug(url.toString());
        InputStream stream;
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        try {
            stream =(InputStream)(Object) conn.getInputStream();
        } catch (UncheckedIOException ioe) {
            InputStream is =(InputStream)(Object) conn.getErrorStream();
            if (is != null) {
                String msg =(String)(Object) getStringFromInputStream(conn.getErrorStream());
                throw new IOException(msg);
            } else {
                throw ioe;
            }
        }
        return stream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class NamedList {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0, String o1, int o2, String o3){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getErrorStream(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
