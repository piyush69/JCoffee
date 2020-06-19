import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5854498 {

    public void handleMessage(Message message) throws Throwable, Fault(Throwable)(Object) {
        InputStream is = message.getContent(InputStream.class);
        if (is == null) {
            return;
        }
        CachedOutputStream bos = new CachedOutputStream();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, bos);
            is.close();
            bos.close();
            sendMsg("Inbound Message \n" + "--------------" + bos.getOut().toString() + "\n--------------");
            message.setContent(InputStream.class, bos.getInputStream());
        } catch (IOException e) {
            throw new Fault(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, CachedOutputStream o1){ return null; }}

class Message {

public MyHelperClass getContent(Class<InputStream o0){ return null; }}

class Fault {

Fault(IOException o0){}
	Fault(){}}

class CachedOutputStream {

public MyHelperClass getOut(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass close(){ return null; }}
