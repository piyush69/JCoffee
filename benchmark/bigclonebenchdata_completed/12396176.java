import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12396176 {
public MyHelperClass downloaded;
	public MyHelperClass size;
	public MyHelperClass status;
	public MyHelperClass saveas;
	public MyHelperClass DOWNLOADING;
	public MyHelperClass MAX_BUFFER_SIZE;
	public MyHelperClass COMPLETE;
	public MyHelperClass stateChanged(){ return null; }
	public MyHelperClass error(){ return null; }

    public void run()  throws Throwable {
        RandomAccessFile file = null;
        InputStream stream = null;
        try {
            MyHelperClass url = new MyHelperClass();
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass downloaded = new MyHelperClass();
            connection.setRequestProperty("Range", "bytes=" + downloaded + "-");
            connection.connect();
            if (connection.getResponseCode() / 100 != 2) {
                error();
            }
            int contentLength = connection.getContentLength();
            if (contentLength < 1) {
                error();
            }
            if ((int)(Object)size == -1) {
                size =(MyHelperClass)(Object) contentLength;
                stateChanged();
            }
            file = new RandomAccessFile((String)(Object)saveas, "rw");
            file.seek((long)(Object)downloaded);
            stream = connection.getInputStream();
            while (status == DOWNLOADING) {
                byte buffer[];
                if ((int)(Object)size - (int)(Object)downloaded > (int)(Object)MAX_BUFFER_SIZE) {
                    buffer = new byte[(int)(Object)MAX_BUFFER_SIZE];
                } else {
                    buffer = new byte[(int)(Object)size - (int)(Object)downloaded];
                }
                int read = stream.read(buffer);
                if (read == -1) break;
                file.write(buffer, 0, read);
               (int)(Object) downloaded += read;
                stateChanged();
            }
            if (status == DOWNLOADING) {
                status = COMPLETE;
                stateChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
            error();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (Exception e) {
                }
            }
            if (stream != null) {
                try {
                    stream.close();
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}
