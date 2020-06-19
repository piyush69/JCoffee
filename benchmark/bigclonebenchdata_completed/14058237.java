import java.io.*;
import java.lang.*;
import java.util.*;



class c14058237 {
public MyHelperClass NULL;

    public boolean renameTo(File dest) throws IOException {
        if (dest == null) {
            throw new NullPointerException("dest");
        }
        MyHelperClass file = new MyHelperClass();
        if (!(Boolean)(Object)file.renameTo(dest)) {
//            MyHelperClass file = new MyHelperClass();
            FileInputStream inputStream = new FileInputStream((String)(Object)file);
            FileOutputStream outputStream = new FileOutputStream(dest);
            FileChannel in =(FileChannel)(Object) inputStream.getChannel();
            FileChannel out =(FileChannel)(Object) outputStream.getChannel();
            MyHelperClass size = new MyHelperClass();
            long destsize =(long)(Object) in.transferTo(0, size, out);
            in.close();
            out.close();
//            MyHelperClass size = new MyHelperClass();
            if (destsize == (long)(Object)size) {
//                MyHelperClass file = new MyHelperClass();
                file.delete();
//                MyHelperClass file = new MyHelperClass();
                file =(MyHelperClass)(Object) dest;
                boolean isRenamed =(boolean)(Object) NULL; //new boolean();
                isRenamed = true;
                return true;
            } else {
                dest.delete();
                return false;
            }
        }
//        MyHelperClass file = new MyHelperClass();
        file =(MyHelperClass)(Object) dest;
        boolean isRenamed =(boolean)(Object) NULL; //new boolean();
        isRenamed = true;
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
