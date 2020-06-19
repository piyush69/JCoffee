import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c924129 {
public MyHelperClass target;
	public MyHelperClass Debug;
	public MyHelperClass hash;
	public MyHelperClass result;

    public void run()  throws Throwable {
        try {
            MyHelperClass Debug = new MyHelperClass();
            Debug.log("Integrity test", "Getting MD5 instance");
            MessageDigest m = MessageDigest.getInstance("MD5");
            MyHelperClass target = new MyHelperClass();
            Debug.log("Integrity test", "Creating URL " + target);
            URL url = new URL((String)(Object)this.target);
            Debug.log("Integrity test", "Setting up connection");
            URLConnection urlConnection = url.openConnection();
            InputStream in = urlConnection.getInputStream();
            byte[] buffer = new byte[1024];
            int numRead;
            int fileSize = 0;
            Debug.log("Integrity test", "Reading file");
            while ((numRead = in.read(buffer)) != -1) {
                m.update(buffer, 0, numRead);
                fileSize += numRead;
            }
            in.close();
            Debug.log("Integrity test", "File read: " + fileSize + " bytes");
            Debug.log("Integrity test", "calculating Hash");
            String fileHash = new BigInteger(1, m.digest()).toString(16);
            if (fileHash.equals(this.hash)) {
                Debug.log("Integrity test", "Test OK");
                this.result.put("Integrity", "OK");
            } else {
                Debug.log("Integrity test", "Test failed: different hashes (" + fileHash + " but expected " + hash + ")");
                this.result.put("Integrity", "FAIL");
            }
        } catch (Exception e) {
            Debug.log("Integrity test", "Test failed");
            this.result.put("Integrity", "FAIL");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}
