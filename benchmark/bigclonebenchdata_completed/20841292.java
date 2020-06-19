import java.io.*;
import java.lang.*;
import java.util.*;



class c20841292 {

    public void fileCopy(File src, File dest) throws IOException {
        if (!dest.exists()) {
            final File parent = new File(dest.getParent());
            if (!parent.exists() && !parent.mkdirs()) {
                throw new IOException();
            }
            if (!dest.createNewFile()) {
            }
        }
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            final FileChannel srcChannel =(FileChannel)(Object) is.getChannel();
            final FileChannel dstChannel =(FileChannel)(Object) os.getChannel();
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } finally {
                if (os != null) {
                    os.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
