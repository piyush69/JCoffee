import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14047630 {
public MyHelperClass IOUtils;
	public MyHelperClass processStdIn;
	public MyHelperClass close(){ return null; }
	public MyHelperClass getSource(){ return null; }

//            @Override
            public void run()  throws Throwable {
                try {
                    IOUtils.copy(getSource(), processStdIn);
                    System.err.println("Copy done.");
                    close();
                } catch (IOException e) {
                    e.printStackTrace();
                    IOUtils.closeQuietly(ExternalDecoder.this);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ExternalDecoder {

}
