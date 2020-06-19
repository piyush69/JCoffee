import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1109960 {
public MyHelperClass Utilities;
	public MyHelperClass url;
	public MyHelperClass dstFile;
	public MyHelperClass data;
	public MyHelperClass logger;
	public MyHelperClass groupID;
	public MyHelperClass disableHttsValidation(){ return null; }

    public void run()  throws Throwable {
        MyHelperClass url = new MyHelperClass();
        logger.info("downloading '" + url.toString() + "' to: " + dstFile.getAbsolutePath());
        MyHelperClass Preferences = new MyHelperClass();
        Preferences prefs =(Preferences)(Object) Preferences.userRoot().node("gvsig.downloader");
        int timeout =(int)(Object) prefs.getInt("timeout", 60000);
        DataOutputStream dos;
        try {
            DataInputStream is;
            OutputStreamWriter os = null;
            HttpURLConnection connection = null;
//            MyHelperClass url = new MyHelperClass();
            if (url.getProtocol().equals("https")) {
                disableHttsValidation();
            }
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setConnectTimeout(timeout);
            if (data != null) {
                connection.setRequestProperty("SOAPAction", "post");
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                connection.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
                os = new OutputStreamWriter(connection.getOutputStream());
                os.write((int)(Object)data);
                os.flush();
                is = new DataInputStream(connection.getInputStream());
            } else {
                is = new DataInputStream((InputStream)(Object)url.openStream());
            }
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((String)(Object)dstFile)));
            byte[] buffer = new byte[1024 * 4];
            long readed = 0;
            for (int i = is.read(buffer); !(Boolean)(Object)Utilities.getCanceled(groupID) && i > 0; i = is.read(buffer)) {
                dos.write(buffer, 0, i);
                readed += i;
            }
            if (os != null) {
                os.close();
            }
            dos.close();
            is.close();
            is = null;
            dos = null;
            if ((boolean)(Object)Utilities.getCanceled(groupID)) {
                logger.warning("[RemoteServices] '" + url + "' CANCELED.");
                dstFile.delete();
                dstFile = null;
            } else {
                Utilities.addDownloadedURL(url, dstFile.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Utilities.downloadException =(MyHelperClass)(Object) e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass downloadException;
public MyHelperClass node(String o0){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass addDownloadedURL(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass userRoot(){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass getCanceled(MyHelperClass o0){ return null; }}

class Preferences {

public MyHelperClass getInt(String o0, int o1){ return null; }}
