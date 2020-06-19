import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7177879 {
public MyHelperClass SM2_MECHANISM;
public MyHelperClass uid;
	public MyHelperClass Ec;
	public MyHelperClass umn;
	public MyHelperClass cat;
	public MyHelperClass state;
	public MyHelperClass sha;
	public MyHelperClass complete;
	public MyHelperClass properties;

    public  c7177879(String umn, String authorizationID, String protocol, String serverName, Map props, CallbackHandler handler)  throws Throwable {
        super(SM2_MECHANISM + "-" + umn, authorizationID, protocol, serverName, props, handler);
        this.umn =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) umn;
        complete =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) false;
        state =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) 0;
        if (sha == null) try {
            sha =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException x) {
            cat.error("SM2Client()", x);
            throw new RuntimeException(String.valueOf(x));
        }
        sha.update(String.valueOf(umn).getBytes());
        sha.update(String.valueOf(authorizationID).getBytes());
        sha.update(String.valueOf(protocol).getBytes());
        sha.update(String.valueOf(serverName).getBytes());
        sha.update(String.valueOf(properties).getBytes());
        sha.update(String.valueOf(Thread.currentThread().getName()).getBytes());
        uid = (MyHelperClass)(Object)new BigInteger(1,(byte[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) sha.digest()).toString(26);
        Ec = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass digest(){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class CallbackHandler {

}

class Object {

Object(String o0, String o1, String o2, String o3, Map o4, CallbackHandler o5){}
	Object(){}}
