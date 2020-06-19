import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17580775 {
public MyHelperClass type;
public MyHelperClass MAX_OPDS_ITEMS;
	public MyHelperClass PROGRESS_DELAY_MILLIS;
	public MyHelperClass guiExecutor;
	public MyHelperClass nextLink;
	public MyHelperClass docInfo;
	public MyHelperClass entries;
	public MyHelperClass setProgressMessage(String o0, int o1){ return null; }
	public MyHelperClass downloadBook(String o0, String o1, InputStream o2, int o3, String o4, boolean o5){ return null; }
public MyHelperClass progressMessage;
	public MyHelperClass connection;
	public MyHelperClass expectedType;
	public MyHelperClass READ_TIMEOUT;
	public MyHelperClass url;
	public MyHelperClass defaultFileName;
	public MyHelperClass CONNECT_TIMEOUT;
	public MyHelperClass coolReader;
	public MyHelperClass progressShown;
	public MyHelperClass L;
	public MyHelperClass delayedProgress;
	public MyHelperClass referer;
	public MyHelperClass findSubstring(byte[] o0, String o1){ return null; }
	public MyHelperClass parseFeed(InputStream o0){ return null; }
	public MyHelperClass onError(String o0){ return null; }

        public void runInternal()  throws Throwable {
            MyHelperClass connection = new MyHelperClass();
            connection = null;
            boolean itemsLoadedPartially = false;
            boolean loadNext = false;
            HashSet<String> visited = new HashSet<String>();
            do {
                try {
                    MyHelperClass url = new MyHelperClass();
                    setProgressMessage(url.toString(), -1);
//                    MyHelperClass url = new MyHelperClass();
                    visited.add(url.toString());
                    long startTimeStamp = System.currentTimeMillis();
                    MyHelperClass delayedProgress = new MyHelperClass();
                    delayedProgress = coolReader.getEngine().showProgressDelayed(0, progressMessage, PROGRESS_DELAY_MILLIS);
//                    MyHelperClass url = new MyHelperClass();
                    URLConnection conn =(URLConnection)(Object) url.openConnection();
                    if ((HttpsURLConnection)(Object)conn instanceof HttpsURLConnection) {
                        onError("HTTPs is not supported yet");
                        return;
                    }
                    if (!(conn instanceof HttpURLConnection)) {
                        onError("Only HTTP supported");
                        return;
                    }
                    connection =(MyHelperClass)(Object) (HttpURLConnection) conn;
                    connection.setRequestProperty("User-Agent", "CoolReader/3(Android)");
                    if (referer != null) connection.setRequestProperty("Referer", referer);
                    connection.setInstanceFollowRedirects(true);
                    connection.setAllowUserInteraction(false);
                    connection.setConnectTimeout(CONNECT_TIMEOUT);
                    connection.setReadTimeout(READ_TIMEOUT);
                    connection.setDoInput(true);
                    String fileName = null;
                    String disp =(String)(Object) connection.getHeaderField("Content-Disposition");
                    if (disp != null) {
                        int p = disp.indexOf("filename=");
                        if (p > 0) {
                            fileName = disp.substring(p + 9);
                        }
                    }
                    int response = -1;
                    response =(int)(Object) connection.getResponseCode();
                    L.d("Response: " + response);
                    if (response != 200) {
                        onError("Error " + response);
                        return;
                    }
                    String contentType =(String)(Object) connection.getContentType();
                    String contentEncoding =(String)(Object) connection.getContentEncoding();
                    int contentLen =(int)(Object) connection.getContentLength();
                    L.d("Entity content length: " + contentLen);
                    L.d("Entity content type: " + contentType);
                    L.d("Entity content encoding: " + contentEncoding);
                    setProgressMessage(url.toString(), contentLen);
                    InputStream is =(InputStream)(Object) connection.getInputStream();
                    delayedProgress.cancel();
                    is =(InputStream)(Object) new ProgressInputStream(is, startTimeStamp, progressMessage, contentLen, 80);
                    final int MAX_CONTENT_LEN_TO_BUFFER = 256 * 1024;
                    boolean isZip = contentType != null && contentType.equals("application/zip");
                    if (expectedType != null) contentType =(String)(Object) expectedType; else if (contentLen > 0 && contentLen < MAX_CONTENT_LEN_TO_BUFFER) {
                        byte[] buf = new byte[contentLen];
                        if (is.read(buf) != contentLen) {
                            onError("Wrong content length");
                            return;
                        }
                        is.close();
                        is = null;
                        is = new ByteArrayInputStream(buf);
                        if ((int)(Object)findSubstring(buf, "<?xml version=") >= 0 &&(int)(Object) findSubstring(buf, "<feed") >= 0) contentType = "application/atom+xml";
                    }
                    if (contentType.startsWith("application/atom+xml")) {
                        L.d("Parsing feed");
                        parseFeed(is);
                        itemsLoadedPartially = true;
                        if (docInfo.nextLink != null && type.startsWith("application/atom+xml;profile=opds-catalog")) {
                            if (entries.size() < (int)(Object)MAX_OPDS_ITEMS) {
                                url =(MyHelperClass)(Object) new URL((String)(Object)nextLink.href);
                                loadNext = !visited.contains(url.toString());
                                L.d("continue with next part: " + url);
                            } else {
                                L.d("max item count reached: " + entries.size());
                                loadNext = false;
                            }
                        } else {
                            loadNext = false;
                        }
                    } else {
                        if (fileName == null) fileName =(String)(Object) defaultFileName;
                        L.d("Downloading book: " + contentEncoding);
                        downloadBook(contentType, url.toString(), is, contentLen, fileName, isZip);
                        if ((boolean)(Object)progressShown) coolReader.getEngine().hideProgress();
                        loadNext = false;
                        itemsLoadedPartially = false;
                    }
                } catch (Exception e) {
                    L.e("Exception while trying to open URI " + url.toString(), e);
                    if ((boolean)(Object)progressShown) coolReader.getEngine().hideProgress();
                    onError("Error occured while reading OPDS catalog");
                    break;
                } finally {
                    if (connection != null) try {
                        connection.disconnect();
                    } catch (Exception e) {
                    }
                }
            } while (loadNext);
            if ((boolean)(Object)progressShown) coolReader.getEngine().hideProgress();
            if (itemsLoadedPartially) guiExecutor.execute(new Runnable() {

//                @Override
                public void run() {
                    MyHelperClass entries = new MyHelperClass();
                    L.d("Parsing is finished successfully. " + entries.size() + " entries found");
                    MyHelperClass handler = new MyHelperClass();
                    MyHelperClass callback = new MyHelperClass();
                    callback.onFinish(handler.docInfo, handler.entries);
                }
            });
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass href;
	public MyHelperClass nextLink;
	public MyHelperClass docInfo;
	public MyHelperClass entries;
public MyHelperClass d(String o0){ return null; }
	public MyHelperClass execute(<anonymous Runnable> o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass e(String o0, Exception o1){ return null; }
	public MyHelperClass onFinish(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass showProgressDelayed(int o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass hideProgress(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getEngine(){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass cancel(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }}

class HttpsURLConnection {

}

class ProgressInputStream {

ProgressInputStream(InputStream o0, long o1, MyHelperClass o2, int o3, int o4){}
	ProgressInputStream(){}}
