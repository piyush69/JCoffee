import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9824814 {
public MyHelperClass tmpFileName(MyHelperClass o0){ return null; }
public MyHelperClass stopped;
	public MyHelperClass status;
	public MyHelperClass DOWNLOADING;
	public MyHelperClass downloadId;
	public MyHelperClass log;
	public MyHelperClass statusChangedObserver;
	public MyHelperClass BeatportAccessor;
	public MyHelperClass sessionCookies;
	public MyHelperClass fileName;
	public MyHelperClass downloaded;
	public MyHelperClass size;
	public MyHelperClass MAX_BUFFER_SIZE;
	public MyHelperClass COMPLETE;
	public MyHelperClass started;
	public MyHelperClass user;
	public MyHelperClass time;
	public MyHelperClass password;
	public MyHelperClass changeTotal(int o0, int o1){ return null; }
	public MyHelperClass getContentAsString(HttpURLConnection o0){ return null; }
	public MyHelperClass waitRandom(){ return null; }
	public MyHelperClass error(){ return null; }
	public MyHelperClass stateChanged(){ return null; }

    public void run()  throws Throwable {
        MyHelperClass status = new MyHelperClass();
        if (status == COMPLETE) {
            return;
        }
        waitRandom();
        RandomAccessFile file = null;
        InputStream inputStream = null;
        boolean success = false;
        URL url = null;
        try {
            BeatportAccessor beatportAccessor = new BeatportAccessor();
            if (sessionCookies == null) {
                sessionCookies = beatportAccessor.getSessionCookies(user, password);
            }
            url = new URL((String)(Object)new BeatportAccessor().getTrackDownloadUrl(downloadId, sessionCookies));
            log.info("Open (DownloadWorker.run): " + url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent",(String)(Object) BeatportAccessor.userAgent);
            connection.setRequestProperty("Cookie",(String)(Object) sessionCookies);
            connection.connect();
            if (connection.getResponseCode() / 100 != 2) {
                log.error("Unexpected response from server: " + connection.getResponseCode());
                error();
                return;
            }
            if (connection.getContentType().indexOf("text") >= 0) {
                log.error("Tried to request: " + url.toString());
                log.error("Unexpected file content type from server: " + connection.getContentType());
                log.error("Server replied:\n" + getContentAsString(connection));
                error();
                return;
            }
            int contentLength = connection.getContentLength();
            if (contentLength < 1) {
                log.error("Invalid content length: " + connection.getContentLength());
                error();
                return;
            }
            if ((int)(Object)size == -1) {
                size =(MyHelperClass)(Object) contentLength;
                stateChanged();
            } else if ((int)(Object)size != contentLength) {
                changeTotal(0, contentLength - (int)(Object)size);
            }
            if (new File((String)(Object)tmpFileName(fileName)).exists()) {
                if (!new File((String)(Object)tmpFileName(fileName)).delete()) {
                    throw new Exception("Could not delete file: " + tmpFileName(fileName));
                }
            }
            file = new RandomAccessFile((String)(Object)tmpFileName(fileName), "rw");
            file.seek((long)(Object)downloaded);
            inputStream = connection.getInputStream();
            if ((int)(Object)started == 0) {
                started =(MyHelperClass)(Object) System.currentTimeMillis();
                time = started;
            }
            statusChangedObserver.statusChanged(status);
            byte buffer[] = new byte[(int)(Object)MAX_BUFFER_SIZE];
            while (status == DOWNLOADING) {
                if ((int)(Object)size - (int)(Object)downloaded < (int)(Object)MAX_BUFFER_SIZE) {
                    buffer = new byte[(int) ((int)(Object)size - (int)(Object)downloaded)];
                }
                int read = inputStream.read(buffer);
                if (read == -1) break;
                file.write(buffer, 0, read);
               (int)(Object) downloaded += read;
                changeTotal(read, 0);
                stateChanged();
            }
            if (status == DOWNLOADING) {
                stopped =(MyHelperClass)(Object) System.currentTimeMillis();
                status = COMPLETE;
            }
            statusChangedObserver.statusChanged(status);
            stateChanged();
            success = true;
        } catch (Exception e) {
            e.printStackTrace();
            error();
        } finally {
            try {
                file.close();
            } catch (Exception e) {
            }
            if (success) {
                try {
                    if (!new File((String)(Object)tmpFileName(fileName)).renameTo(new File((String)(Object)fileName))) {
                        throw new Exception("Rename Failed");
                    }
                } catch (Exception e) {
                    log.error("Error moving temp file " + tmpFileName(fileName) + " file: " + fileName, e);
                }
            } else {
                try {
                    new File((String)(Object)tmpFileName(fileName)).delete();
                } catch (Exception e) {
                    log.error("Error deleting erroneous temp file: " + tmpFileName(fileName), e);
                }
            }
            try {
                inputStream.close();
            } catch (Exception e) {
                log.error("Error closing input stream of: " + url + " / " + fileName, e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass userAgent;
public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass statusChanged(MyHelperClass o0){ return null; }}

class BeatportAccessor {

public MyHelperClass getTrackDownloadUrl(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getSessionCookies(MyHelperClass o0, MyHelperClass o1){ return null; }}
