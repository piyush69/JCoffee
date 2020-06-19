import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22536033 {
public MyHelperClass Headers;

    private boolean setPayload() throws Throwable, IOException {
        MyHelperClass Index = new MyHelperClass();
        if (Index < Headers.length) {
            MyHelperClass Headers = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream(Headers[(int)(Object)Index], true);
            MyHelperClass HeadlessData = new MyHelperClass();
            FileInputStream fis = new FileInputStream((String)(Object)HeadlessData);
            FileChannel fic =(FileChannel)(Object) fis.getChannel();
            FileChannel foc =(FileChannel)(Object) fos.getChannel();
            fic.transferTo(0, fic.size(), foc);
            fic.close();
            foc.close();
            MyHelperClass Destinations = new MyHelperClass();
            setDestination(Destinations[(int)(Object)Index]);
//            MyHelperClass Headers = new MyHelperClass();
            setPayload(Headers[(int)(Object)Index]);
//            MyHelperClass Index = new MyHelperClass();
            Index++;
            return true;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int Index;
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}
