import java.io.*;
import java.lang.*;
import java.util.*;



class c12340187 {

    private static boolean downloadFile(URL remote, File local) throws IllegalArgumentException, IOException {
        if (local == null) throw new IllegalArgumentException("Must specify remote file");
        if (local.exists() && !local.canWrite()) throw new IOException("Cannot write to " + local);
        long lengthCurrent = local.exists() ? local.length() : -1l;
        if (lengthCurrent == 0) throw new IOException("Cannot get the length for " + local);
        long lastModifiedCurrent = local.exists() ? local.lastModified() : -1l;
        if (remote == null) throw new IllegalArgumentException("Must specify remote url");
        URLConnection urlConnection =(URLConnection)(Object) remote.openConnection();
        urlConnection.setDoInput(true);
        urlConnection.setDoOutput(false);
        long lengthRemote =(long)(Object) urlConnection.getContentLength();
        long lastModifiedRemote =(long)(Object) urlConnection.getLastModified();
        if (lengthRemote == lengthCurrent) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.fine("Not downloading " + remote + " of length " + lengthRemote + " and date " + (lastModifiedRemote > 0 ? new Date(lastModifiedRemote).toString() : "n/a") + " for " + local + " of length " + lengthCurrent + " and date " + new Date(lastModifiedCurrent));
            return false;
        }
        BufferedInputStream inputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            MyHelperClass BUFFER_SIZE = new MyHelperClass();
            inputStream = new BufferedInputStream((InputStream)(Object)urlConnection.getInputStream(),(int)(Object) BUFFER_SIZE);
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(local));
//            MyHelperClass BUFFER_SIZE = new MyHelperClass();
            byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
            do {
                int count = inputStream.read(buffer);
                if (count < 0) break;
                bufferedOutputStream.write(buffer, 0, count);
            } while (true);
            return true;
        } finally {
            try {
                if (inputStream != null) inputStream.close();
            } catch (Throwable throwable) {
            }
            try {
                if (bufferedOutputStream != null) bufferedOutputStream.close();
            } catch (Throwable throwable) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }}
