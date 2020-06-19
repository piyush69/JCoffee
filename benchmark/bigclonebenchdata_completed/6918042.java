
import java.io.UncheckedIOException;


class c6918042 {
public MyHelperClass serverCache;

    public void updateMetaList() {
        MyHelperClass metaserverModel = new MyHelperClass();
        metaserverModel.begin();
        MyHelperClass EXPIRE_INTERVAL = new MyHelperClass();
        serverCache.expire((int)(Object)EXPIRE_INTERVAL * 1000);
        MyHelperClass serverCache = new MyHelperClass();
        final Map oldEntries =(Map)(Object) serverCache.getAll();
        MyHelperClass ServerCache = new MyHelperClass();
        final MetaserverEntry localhostMetaserverEntry =(MetaserverEntry)(Object) MetaserverEntryParser.parseEntry(ServerCache.DEFAULT_ENTRY_LOCALHOST);
        assert localhostMetaserverEntry != null;
//        MyHelperClass metaserverModel = new MyHelperClass();
        metaserverModel.add(localhostMetaserverEntry);
//        MyHelperClass ServerCache = new MyHelperClass();
        oldEntries.remove(ServerCache.makeKey(localhostMetaserverEntry));
//        MyHelperClass serverCache = new MyHelperClass();
        serverCache.put(localhostMetaserverEntry);
        try {
            MyHelperClass METASERVER_URL = new MyHelperClass();
            final URL url = new URL(METASERVER_URL);
            final String httpProxy = System.getenv("http_proxy");
            if (httpProxy != null && httpProxy.length() > 0) {
                if (httpProxy.regionMatches(true, 0, "http://", 0, 7)) {
                    final String[] tmp = httpProxy.substring(7).replaceAll("/.*", "").split(":", 2);
                    System.setProperty("http.proxyHost", tmp[0]);
                    System.setProperty("http.proxyPort", tmp.length >= 2 ? tmp[1] : "80");
                } else {
                    System.err.println("Warning: unsupported http_proxy protocol: " + httpProxy);
                }
            }
            final HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            try {
                conn.setRequestMethod("GET");
                conn.setUseCaches(false);
                conn.connect();
                MyHelperClass HttpURLConnection = new MyHelperClass();
                if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    final InputStream in =(InputStream)(Object) conn.getInputStream();
                    final InputStreamReader isr = new InputStreamReader(in, "ISO-8859-1");
                    try {
                        final BufferedReader br = new BufferedReader(isr);
                        try {
                            final MetaserverEntryParser metaserverEntryParser = new MetaserverEntryParser();
                            while (true) {
                                final String line =(String)(Object) br.readLine();
                                if (line == null) {
                                    break;
                                }
                                final MetaserverEntry metaserverEntry =(MetaserverEntry)(Object) metaserverEntryParser.parseLine(line);
                                if (metaserverEntry != null) {
//                                    MyHelperClass metaserverModel = new MyHelperClass();
                                    metaserverModel.add(metaserverEntry);
//                                    MyHelperClass ServerCache = new MyHelperClass();
                                    oldEntries.remove(ServerCache.makeKey(metaserverEntry));
//                                    MyHelperClass serverCache = new MyHelperClass();
                                    serverCache.put(metaserverEntry);
                                }
                            }
                        } finally {
                            br.close();
                        }
                    } finally {
                        isr.close();
                    }
                }
            } finally {
                conn.disconnect();
            }
        } catch (final UncheckedIOException ignored) {
        }
        for (final MetaserverEntry metaserverEntry :(MetaserverEntry[])(Object) (Object[])(Object)oldEntries.values()) {
//            MyHelperClass metaserverModel = new MyHelperClass();
            metaserverModel.add(metaserverEntry);
        }
//        MyHelperClass metaserverModel = new MyHelperClass();
        metaserverModel.commit();
//        MyHelperClass serverCache = new MyHelperClass();
        serverCache.save();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
	public MyHelperClass DEFAULT_ENTRY_LOCALHOST;
public MyHelperClass begin(){ return null; }
	public MyHelperClass put(MetaserverEntry o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass makeKey(MetaserverEntry o0){ return null; }
	public MyHelperClass add(MetaserverEntry o0){ return null; }
	public MyHelperClass save(){ return null; }
	public MyHelperClass getAll(){ return null; }
	public MyHelperClass expire(int o0){ return null; }}

class Map {

public MyHelperClass values(){ return null; }
	public MyHelperClass remove(MyHelperClass o0){ return null; }}

class MetaserverEntry {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class MetaserverEntryParser {

public MyHelperClass parseLine(String o0){ return null; }
	public static MyHelperClass parseEntry(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
