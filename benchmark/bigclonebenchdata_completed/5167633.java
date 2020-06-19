import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5167633 {
public static MyHelperClass prgStatus;
	public static MyHelperClass current;
	public static MyHelperClass Updates;
//public MyHelperClass Updates;
//	public MyHelperClass current;
//	public MyHelperClass prgStatus;

    public static void download(String address, String localFileName, String rawClass, double newVer, int newStage)  throws Throwable {
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;
        int totalBytes = 0;
        int dlBytes = 0;
        try {
            if (!(Boolean)(Object)current.hasFile(rawClass)) {
                current.addFile(newVer, newStage, rawClass);
            }
            current.getFile(rawClass).downloading =(MyHelperClass)(Object) true;
            Updates.setImage(rawClass, "refresh.png");
            java.io.File folder = new java.io.File(localFileName);
            folder.createNewFile();
            URL url = new URL(address);
            out = new BufferedOutputStream(new FileOutputStream(localFileName));
            conn = url.openConnection();
            in = conn.getInputStream();
            totalBytes = conn.getContentLength();
            byte[] buffer = new byte[1024];
            int numRead;
            long numWritten = 0;
            double incr = java.lang.Math.floor(totalBytes / 1000);
            prgStatus.setMaximum(1000);
            prgStatus.setString("0.0%");
            while ((numRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                numWritten += numRead;
                dlBytes += numRead;
                int newVal = (dlBytes != totalBytes ? (int) java.lang.Math.floor(dlBytes / incr) : 1000);
                prgStatus.setValue(newVal);
                prgStatus.setString((newVal / 10) + "." + (newVal % 10) + "%");
            }
            current.getFile(rawClass).downloading =(MyHelperClass)(Object) false;
            current.getFile(rawClass).version =(MyHelperClass)(Object) newVer;
            current.getFile(rawClass).stage =(MyHelperClass)(Object) newStage;
            Updates.setImage(rawClass, "updater.png");
            Updates.updateTable();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ioe) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass downloading;
	public MyHelperClass stage;
	public MyHelperClass version;
public MyHelperClass hasFile(String o0){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass setImage(String o0, String o1){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass setString(String o0){ return null; }
	public MyHelperClass setMaximum(int o0){ return null; }
	public MyHelperClass addFile(double o0, int o1, String o2){ return null; }
	public MyHelperClass updateTable(){ return null; }}
