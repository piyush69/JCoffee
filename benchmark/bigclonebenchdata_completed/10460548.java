import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10460548 {
public MyHelperClass StreamUtils;
	public MyHelperClass urlString;
	public MyHelperClass LOG;
	public MyHelperClass SAXParserFactory;
	public MyHelperClass _setProxy(){ return null; }

    public void parse() {
        InputSource urlInputStream = null;
        SAXParserFactory spf = null;
        SAXParser sp = null;
        HttpURLConnection conn = null;
        try {
            URL url = new URL((String)(Object)this.urlString);
            _setProxy();
            conn = (HttpURLConnection) url.openConnection();
            urlInputStream = new InputSource(StreamUtils.inputStreamToReader(conn.getInputStream()));
            spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
            if (spf != null) {
                sp =(SAXParser)(Object) spf.newSAXParser();
                sp.parse(urlInputStream, this);
            }
        } catch (Exception e) {
            if (conn != null) {
                if (conn.getHeaderField("X-RateLimit-Limit") != null) {
                    String rateLimit = conn.getHeaderField("X-RateLimit-Limit");
                    String rateRemaining = conn.getHeaderField("X-RateLimit-Remaining");
                    long rateReset = Long.valueOf(conn.getHeaderField("X-RateLimit-Reset")) * 1000;
                    LOG.warn("Possible rate limits?  LIMIT:" + rateLimit + "  REMAINING:" + rateRemaining + "  RESET:" + new Date(rateReset));
                }
            }
            e.printStackTrace();
            LOG.warn("error parsing rss feed", e);
        } finally {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, Exception o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass inputStreamToReader(InputStream o0){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass parse(InputSource o0, c10460548 o1){ return null; }}
