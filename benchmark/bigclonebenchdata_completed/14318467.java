import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14318467 {
public static MyHelperClass readAndUpdate(long o0, FileInputStream o1, MessageDigest o2){ return null; }
public MyHelperClass CHUNK_SIZE;
//	public MyHelperClass readAndUpdate(long o0, FileInputStream o1, MessageDigest o2){ return null; }

    public static byte[] hashFile(File file)  throws Throwable {
        long size = file.length();
        MyHelperClass CHUNK_SIZE = new MyHelperClass();
        long jump = (long) (size / (float)(float)(Object) CHUNK_SIZE);
        MessageDigest digest;
        FileInputStream stream;
        try {
            stream = new FileInputStream(file);
            digest = MessageDigest.getInstance("SHA-256");
//            MyHelperClass CHUNK_SIZE = new MyHelperClass();
            if (size <(int)(Object) CHUNK_SIZE * 4) {
                readAndUpdate(size, stream, digest);
            } else {
                if (stream.skip(jump) != jump) return null;
                readAndUpdate((long)(Object)CHUNK_SIZE, stream, digest);
                if (stream.skip(jump - (long)(Object)CHUNK_SIZE) != jump - (long)(Object)CHUNK_SIZE) return null;
                readAndUpdate((long)(Object)CHUNK_SIZE, stream, digest);
                if (stream.skip(jump - (long)(Object)CHUNK_SIZE) != jump - (long)(Object)CHUNK_SIZE) return null;
                readAndUpdate((long)(Object)CHUNK_SIZE, stream, digest);
                digest.update(Long.toString(size).getBytes());
            }
            return digest.digest();
        } catch (FileNotFoundException e) {
            return null;
        } catch (NoSuchAlgorithmException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
