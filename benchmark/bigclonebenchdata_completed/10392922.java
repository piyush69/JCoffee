import java.io.*;
import java.lang.*;
import java.util.*;



class c10392922 {

    public static void copyCompletely(InputStream input, OutputStream output) throws IOException {
        if ((output instanceof FileOutputStream) && (input instanceof FileInputStream)) {
            try {
                FileChannel target =(FileChannel)(Object) ((FileOutputStream) output).getChannel();
                FileChannel source =(FileChannel)(Object) ((FileInputStream) input).getChannel();
                source.transferTo(0, Integer.MAX_VALUE, target);
                source.close();
                target.close();
                return;
            } catch (Exception e) {
            }
        }
        byte[] buf = new byte[8192];
        while (true) {
            int length = input.read(buf);
            if (length < 0) break;
            output.write(buf, 0, length);
        }
        try {
            input.close();
        } catch (IOException ignore) {
        }
        try {
            output.close();
        } catch (IOException ignore) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, int o1, FileChannel o2){ return null; }}
