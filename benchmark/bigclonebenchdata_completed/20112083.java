import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20112083 {
public MyHelperClass stripTrailer(MyHelperClass o0){ return null; }
public MyHelperClass[] sources;
public MyHelperClass PathUtils;
	public MyHelperClass URLUtils;
	public MyHelperClass contentTypeStr;
	public MyHelperClass ContentDescriptor;
	public MyHelperClass MimeManager;
	public MyHelperClass connected;
	public MyHelperClass logger;
//	public MyHelperClass sources;
	public MyHelperClass conn;
	public MyHelperClass contentType;
	public MyHelperClass getLocator(){ return null; }

//    @Override
    public void connect() throws Throwable, IOException {
        URL url =(URL)(Object) getLocator().getURL();
        if (url.getProtocol().equals("file")) {
            final String newUrlStr =(String)(Object) URLUtils.createAbsoluteFileUrl(url.toExternalForm());
            if (newUrlStr != null) {
                if (!newUrlStr.toString().equals(url.toExternalForm())) {
                    logger.warning("Changing file URL to absolute for URL.openConnection, from " + url.toExternalForm() + " to " + newUrlStr);
                    url = new URL(newUrlStr);
                }
            }
        }
        conn =(MyHelperClass)(Object) url.openConnection();
        if (!url.getProtocol().equals("ftp") && conn.getURL().getProtocol().equals("ftp")) {
            logger.warning("URL.openConnection() morphed " + url + " to " + conn.getURL());
            throw new IOException("URL.openConnection() returned an FTP connection for a non-ftp url: " + url);
        }
        if ((HttpURLConnection)(Object)conn instanceof HttpURLConnection) {
            final HttpURLConnection huc = (HttpURLConnection)(HttpURLConnection)(Object) conn;
            huc.connect();
            final int code = huc.getResponseCode();
            if (!(code >= 200 && code < 300)) {
                huc.disconnect();
                throw new IOException("HTTP response code: " + code);
            }
            logger.finer("URL: " + url);
            logger.finer("Response code: " + code);
            logger.finer("Full content type: " + conn.getContentType());
            boolean contentTypeSet = false;
            if (stripTrailer(conn.getContentType()).equals("text/plain")) {
                final String ext =(String)(Object) PathUtils.extractExtension(url.getPath());
                if (ext != null) {
                    final String result =(String)(Object) MimeManager.getMimeType(ext);
                    if (result != null) {
                        contentTypeStr = ContentDescriptor.mimeTypeToPackageName(result);
                        contentTypeSet = true;
                        logger.fine("Received content type " + conn.getContentType() + "; overriding based on extension, to: " + result);
                    }
                }
            }
            if (!contentTypeSet) contentTypeStr = ContentDescriptor.mimeTypeToPackageName((String)(Object)stripTrailer(conn.getContentType()));
        } else {
            conn.connect();
            contentTypeStr = ContentDescriptor.mimeTypeToPackageName((String)(Object)conn.getContentType());
        }
        contentType =(MyHelperClass)(Object) new ContentDescriptor(contentTypeStr);
        sources =(MyHelperClass[])(Object)(MyHelperClass)(Object) new URLSourceStream[1];
        sources[0] =(MyHelperClass)(Object) new URLSourceStream();
        connected =(MyHelperClass)(Object) true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass createAbsoluteFileUrl(String o0){ return null; }
	public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getMimeType(String o0){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass mimeTypeToPackageName(String o0){ return null; }
	public MyHelperClass extractExtension(String o0){ return null; }}

class ContentDescriptor {

ContentDescriptor(MyHelperClass o0){}
	ContentDescriptor(){}}

class URLSourceStream {

}
