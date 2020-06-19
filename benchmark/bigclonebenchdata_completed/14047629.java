import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14047629 {
public MyHelperClass processStdOut;
	public MyHelperClass processStdIn;
	public MyHelperClass process;
	public MyHelperClass getSource(){ return null; }
	public MyHelperClass close(){ return null; }

    protected  c14047629(InputStream source, Process process)  throws Throwable {
        super(source);
        this.process =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) process;
        this.processStdOut =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) process.getInputStream();
        this.processStdIn =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) process.getOutputStream();
        new Thread() {

//            @Override
            public void run() {
                try {
                    MyHelperClass processStdIn = new MyHelperClass();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(getSource(), processStdIn);
                    System.err.println("Copy done.");
                    close();
                } catch (IOException e) {
                    e.printStackTrace();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(ExternalDecoder.this);
                }
            }
        }.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ExternalDecoder {

}

class Object {

Object(InputStream o0){}
	Object(){}}
