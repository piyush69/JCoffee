import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12465375 {
public MyHelperClass skipId3v2;

    private void write(File src, File dst, byte id3v1Tag[], byte id3v2HeadTag[], byte id3v2TailTag[]) throws Throwable, IOException {
        MyHelperClass Debug = new MyHelperClass();
        if (src == null || !src.exists()) throw new IOException((String)(Object)Debug.getDebug("missing src", src));
//        MyHelperClass Debug = new MyHelperClass();
        if (!src.getName().toLowerCase().endsWith(".mp3")) throw new IOException((String)(Object)Debug.getDebug("src not mp3", src));
//        MyHelperClass Debug = new MyHelperClass();
        if (dst == null) throw new IOException((String)(Object)Debug.getDebug("missing dst", dst));
        if (dst.exists()) {
            dst.delete();
//            MyHelperClass Debug = new MyHelperClass();
            if (dst.exists()) throw new IOException((String)(Object)Debug.getDebug("could not delete dst", dst));
        }
        boolean hasId3v1 = (boolean)(Object)new MyID3v1().hasID3v1(src);
        MyHelperClass ID3_V1_TAG_LENGTH = new MyHelperClass();
        long id3v1Length = hasId3v1 ? ID3_V1_TAG_LENGTH : 0;
        long id3v2HeadLength = (long)(Object)new MyID3v2().findID3v2HeadLength(src);
        long id3v2TailLength = (long)(Object)new MyID3v2().findID3v2TailLength(src, hasId3v1);
        OutputStream os = null;
        InputStream is = null;
        try {
            dst.getParentFile().mkdirs();
            os = new FileOutputStream(dst);
            os = new BufferedOutputStream(os);
            MyHelperClass skipId3v2Head = new MyHelperClass();
            if (!(Boolean)(Object)skipId3v2Head && !(Boolean)(Object)skipId3v2 && id3v2HeadTag != null) os.write(id3v2HeadTag);
            is = new FileInputStream(src);
            is = new BufferedInputStream(is);
            is.skip(id3v2HeadLength);
            long total_to_read = src.length();
            total_to_read -= id3v1Length;
            total_to_read -= id3v2HeadLength;
            total_to_read -= id3v2TailLength;
            byte buffer[] = new byte[1024];
            long total_read = 0;
            while (total_read < total_to_read) {
                int remainder = (int) (total_to_read - total_read);
                int readSize = Math.min(buffer.length, remainder);
                int read = is.read(buffer, 0, readSize);
                if (read <= 0) throw new IOException("unexpected EOF");
                os.write(buffer, 0, read);
                total_read += read;
            }
            MyHelperClass skipId3v2Tail = new MyHelperClass();
            if (!(Boolean)(Object)skipId3v2Tail && !(Boolean)(Object)skipId3v2 && id3v2TailTag != null) os.write(id3v2TailTag);
            MyHelperClass skipId3v1 = new MyHelperClass();
            if (!(Boolean)(Object)skipId3v1 && id3v1Tag != null) os.write(id3v1Tag);
        } finally {
            try {
                if (is != null) is.close();
            } catch (Throwable e) {
//                MyHelperClass Debug = new MyHelperClass();
                Debug.debug(e);
            }
            try {
                if (os != null) os.close();
            } catch (Throwable e) {
//                MyHelperClass Debug = new MyHelperClass();
                Debug.debug(e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(Throwable o0){ return null; }
	public MyHelperClass getDebug(String o0, File o1){ return null; }}

class MyID3v1 {

public MyHelperClass hasID3v1(File o0){ return null; }}

class MyID3v2 {

public MyHelperClass findID3v2TailLength(File o0, boolean o1){ return null; }
	public MyHelperClass findID3v2HeadLength(File o0){ return null; }}
