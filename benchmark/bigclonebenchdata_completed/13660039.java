import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13660039 {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            MyHelperClass PrintUtil = new MyHelperClass();
            PrintUtil.prt("arguments: sourcefile, destfile");
            System.exit(1);
        }
        FileChannel in = (FileChannel)(Object)new FileInputStream(args[0]).getChannel(), out = (FileChannel)(Object)new FileOutputStream(args[1]).getChannel();
        in.transferTo(0, in.size(), out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass prt(String o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
