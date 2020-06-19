import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9778726 {
public MyHelperClass mutex;
	public MyHelperClass state;
	public MyHelperClass TRANSACTION;
	public MyHelperClass readSingleLineResponse(){ return null; }
	public MyHelperClass sendCommand(String o0, String[] o1){ return null; }
	public MyHelperClass digestToString(byte[] o0){ return null; }

    public void apop(String user, char[] secret) throws Throwable, IOException, POP3Exception {
        MyHelperClass timestamp = new MyHelperClass();
        if (timestamp == null) {
            throw new CommandNotSupportedException("No timestamp from server - APOP not possible");
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
//            MyHelperClass timestamp = new MyHelperClass();
            md.update((byte)(Object)timestamp.getBytes());
            if (secret == null) secret = new char[0];
            byte[] digest = md.digest(new String(secret).getBytes("ISO-8859-1"));
            MyHelperClass mutex = new MyHelperClass();
            mutex.lock();
            sendCommand("APOP", new String[] { user,(String)(Object) digestToString(digest) });
            POP3Response response =(POP3Response)(Object) readSingleLineResponse();
            if (!(Boolean)(Object)response.isOK()) {
                throw new POP3Exception((String)(Object)response);
            }
            state = TRANSACTION;
        } catch (NoSuchAlgorithmException e) {
            throw new POP3Exception("Installed JRE doesn't support MD5 - APOP not possible");
        } finally {
            mutex.release();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass lock(){ return null; }
	public MyHelperClass release(){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class POP3Exception extends Exception{
	public POP3Exception(String errorMessage) { super(errorMessage); }
}

class CommandNotSupportedException extends Exception{
	public CommandNotSupportedException(String errorMessage) { super(errorMessage); }
}

class POP3Response {

public MyHelperClass isOK(){ return null; }}
