import java.io.*;
import java.lang.*;
import java.util.*;



class c15527452 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copy(File source, File dest) throws IOException {
        if (dest.isDirectory()) {
            dest = new File(dest + File.separator + source.getName());
        }
        FileChannel in = null, out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            long size =(long)(Object) in.size();
            MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
            out.write(buf);
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }
	public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }}

class MappedByteBuffer {

}
