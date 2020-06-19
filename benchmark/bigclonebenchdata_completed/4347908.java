import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4347908 {
public MyHelperClass lineEnd;
public MyHelperClass Log;
	public MyHelperClass toByte(String o0){ return null; }
	public MyHelperClass toByte(MyHelperClass o0){ return null; }

//    @Override
    protected String doInBackground(String... params) {
        HttpURLConnection conn = null;
        String localFilePath = params[0];
        if (localFilePath == null) {
            return null;
        }
        try {
            MyHelperClass ConnectionHandler = new MyHelperClass();
            URL url = new URL(ConnectionHandler.getServerURL() + ":" + ConnectionHandler.getServerPort() + "/");
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            MyHelperClass boundary = new MyHelperClass();
            conn.addRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
            DataInputStream fileReader = new DataInputStream(new FileInputStream(localFilePath));
            MyHelperClass twoHyphens = new MyHelperClass();
            dos.write((int)(Object)toByte((String)(Object)(int)(Object)twoHyphens + (int)(Object)boundary + (int)(Object)lineEnd));
            MyHelperClass lineEnd = new MyHelperClass();
            dos.write((int)(Object)toByte("Content-Disposition: form-data; name=\"uploadfile\"; filename=\"redpinfile\"" + lineEnd));
//            MyHelperClass lineEnd = new MyHelperClass();
            dos.write((int)(Object)toByte("Content-Type: application/octet-stream" + lineEnd));
//            MyHelperClass lineEnd = new MyHelperClass();
            dos.write((int)(Object)toByte("Content-Length: " + fileReader.available() + lineEnd));
//            MyHelperClass lineEnd = new MyHelperClass();
            dos.write((int)(Object)toByte(lineEnd));
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileReader.read(buffer)) != -1) {
                dos.write(buffer, 0, bytesRead);
            }
//            MyHelperClass lineEnd = new MyHelperClass();
            dos.write((int)(Object)toByte(lineEnd));
//            MyHelperClass twoHyphens = new MyHelperClass();
            dos.write((int)(Object)toByte((String)(Object)(int)(Object)twoHyphens + (int)(Object)boundary + (int)(Object)twoHyphens + (int)(Object)lineEnd));
            dos.flush();
            dos.close();
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream is = conn.getInputStream();
                int ch;
                StringBuffer b = new StringBuffer();
                while ((ch = is.read()) != -1) {
                    b.append((char) ch);
                }
                return b.toString();
            }
        } catch (MalformedURLException ex) {
            MyHelperClass TAG = new MyHelperClass();
            Log.w(TAG, "error: " + ex.getMessage(), ex);
        } catch (IOException ioe) {
            MyHelperClass TAG = new MyHelperClass();
            Log.w(TAG, "error: " + ioe.getMessage(), ioe);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass getServerURL(){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1, MalformedURLException o2){ return null; }}
