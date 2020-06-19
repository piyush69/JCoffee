import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2161862 {
public MyHelperClass content;
	public MyHelperClass MIMEtype;
	public MyHelperClass responseCode;
	public MyHelperClass responseHeader;
	public MyHelperClass MessageFormat;
	public MyHelperClass Messages;
	public MyHelperClass log;
	public MyHelperClass charset;
	public MyHelperClass getErrors(HttpURLConnection o0){ return null; }

    public  void WebFileInputStream(URL url, String userAgent) throws Throwable, IOException {
        final java.net.URLConnection uconn = url.openConnection();
        if (!(uconn instanceof java.net.HttpURLConnection)) {
            throw new java.lang.IllegalArgumentException("URL protocol must be HTTP: " + url.toExternalForm());
        }
        final java.net.HttpURLConnection conn = (java.net.HttpURLConnection) uconn;
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);
        conn.setInstanceFollowRedirects(true);
        conn.setRequestProperty("User-agent", userAgent);
        conn.connect();
        responseHeader =(MyHelperClass)(Object) conn.getHeaderFields();
        responseCode =(MyHelperClass)(Object) conn.getResponseCode();
        if ((int)(Object)responseCode != 200) {
            if ((boolean)(Object)log.isDebugEnabled()) {
                log.debug(getErrors(conn));
            }
            if ((int)(Object)responseCode == 404) {
                throw new IOException((String)(Object)MessageFormat.format(Messages.getString("WebFileInputStream.ERROR_404"), url.toExternalForm()));
            } else if ((int)(Object)responseCode == 500) {
                throw new IOException((String)(Object)MessageFormat.format(Messages.getString("WebFileInputStream.ERROR_500"), url.toExternalForm()));
            } else if ((int)(Object)responseCode == 403) {
                throw new IOException((String)(Object)MessageFormat.format(Messages.getString("WebFileInputStream.ERROR_403"), url.toExternalForm()));
            } else {
                throw new IOException((String)(Object)MessageFormat.format(Messages.getString("WebFileInputStream.ERROR_OTHER"), url.toExternalForm(), responseCode));
            }
        }
        final String type = conn.getContentType();
        if (type != null) {
            final String[] parts = type.split(";");
            MIMEtype =(MyHelperClass)(Object) parts[0].trim();
            for (int i = 1; i < parts.length && charset == null; i++) {
                final String t = parts[i].trim();
                final int index = t.toLowerCase().indexOf("charset=");
                if (index != -1) {
                    charset =(MyHelperClass)(Object) t.substring(index + 8);
                }
            }
        }
        Object c = conn.getContent();
        if (c instanceof InputStream) {
            content =(MyHelperClass)(Object) (InputStream) c;
        } else {
            content =(MyHelperClass)(Object) conn.getInputStream();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass format(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(MyHelperClass o0){ return null; }}
