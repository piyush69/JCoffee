import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10005623 {

    public synchronized String getSerialNumber() {
        MyHelperClass serialNum = new MyHelperClass();
        if (serialNum != null) return (String)(Object)serialNum;
        final StringBuffer buf = new StringBuffer();
        MyHelperClass classpath = new MyHelperClass();
        Iterator it =(Iterator)(Object) classpath.iterator();
        while (it.hasNext()) {
            ClassPathEntry entry = (ClassPathEntry) it.next();
            buf.append(entry.getResourceURL().toString());
            buf.append(":");
        }
//        MyHelperClass serialNum = new MyHelperClass();
        serialNum =(MyHelperClass)(Object) (String) AccessController.doPrivileged(new PrivilegedAction() {

            public Object run() {
                try {
                    MessageDigest digest = MessageDigest.getInstance("SHA");
                    digest.update(buf.toString().getBytes());
                    byte[] data = digest.digest();
                    MyHelperClass serialNum = new MyHelperClass();
                    serialNum = new BASE64Encoder().encode(data);
//                    MyHelperClass serialNum = new MyHelperClass();
                    return serialNum;
                } catch (NoSuchAlgorithmException exp) {
                    MyHelperClass Level = new MyHelperClass();
                    MyHelperClass securityLogger = new MyHelperClass();
                    securityLogger.log(Level.SEVERE, exp.getMessage(), exp);
                    return buf.toString();
                }
            }
        });
//        MyHelperClass serialNum = new MyHelperClass();
        return (String)(Object)serialNum;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass iterator(){ return null; }}

class ClassPathEntry {

public MyHelperClass getResourceURL(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
