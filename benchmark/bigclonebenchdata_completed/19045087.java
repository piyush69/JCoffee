import java.io.*;
import java.lang.*;
import java.util.*;



class c19045087 {

    public static void copyfile(String src, String dst) throws IOException {
        dst = new File(dst).getAbsolutePath();
        new File(new File(dst).getParent()).mkdirs();
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        srcChannel.close();
        dstChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
