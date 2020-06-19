import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1014829 {

    public int readRaw(byte[] buffer, int offset, int length) throws Throwable, IOException {
        if (offset < 0 || length < 0 || (offset + length) > buffer.length) {
            throw new IndexOutOfBoundsException();
        }
        HttpURLConnection connection = null;
        InputStream is = null;
        int n = 0;
        try {
            MyHelperClass url = new MyHelperClass();
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass position = new MyHelperClass();
            String byteRange = "bytes=" + position + "-" + ((int)(Object)position + length - 1);
            connection.setRequestProperty("Range", byteRange);
            is = connection.getInputStream();
            while (n < length) {
                int count = is.read(buffer, offset + n, length - n);
                if (count < 0) {
                    throw new EOFException();
                }
                n += count;
            }
//            MyHelperClass position = new MyHelperClass();
           (int)(Object) position += n;
            return n;
        } catch (EOFException e) {
            return n;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("We're screwed...");
            System.out.println(n);
            if (e.getMessage().contains("response code: 416")) {
                System.out.println("Trying to be mister nice guy, returning " + n);
                return n;
            } else {
                throw e;
            }
        } finally {
            if (is != null) {
                is.close();
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}
