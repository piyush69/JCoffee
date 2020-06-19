import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6066145 {
public MyHelperClass sourceChannel;
	public MyHelperClass targetChannel;

    public void copy(String source, String target) throws Throwable, IOException {
//        @Cleanup FileChannel sourceChannel = new FileInputStream(new File(source)).getChannel();
//        @Cleanup FileChannel targetChannel = new FileOutputStream(new File(target)).getChannel();
        targetChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(MyHelperClass o0, int o1, MyHelperClass o2){ return null; }}

class FileChannel {

}

class Cleanup {

}
