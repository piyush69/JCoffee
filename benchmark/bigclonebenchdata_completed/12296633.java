import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12296633 {
public static MyHelperClass TypeUtil;
//public MyHelperClass TypeUtil;

        public static String digest(String password)  throws Throwable {
            try {
                byte[] digest;
                MyHelperClass __md5Lock = new MyHelperClass();
                synchronized (__md5Lock) {
                    MyHelperClass __md = new MyHelperClass();
                    if (__md == null) {
                        try {
//                            MyHelperClass __md = new MyHelperClass();
                            __md =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) MessageDigest.getInstance("MD5");
                        } catch (Exception e) {
                            MyHelperClass Log = new MyHelperClass();
                            Log.warn(e);
                            return null;
                        }
                    }
//                    MyHelperClass __md = new MyHelperClass();
                    __md.reset();
                    MyHelperClass StringUtil = new MyHelperClass();
                    __md.update(password.getBytes((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)StringUtil.__ISO_8859_1));
//                    MyHelperClass __md = new MyHelperClass();
                    digest =(byte[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) __md.digest();
                }
                MyHelperClass __TYPE = new MyHelperClass();
                return __TYPE + TypeUtil.toString(digest, 16);
            } catch (Exception e) {
                MyHelperClass Log = new MyHelperClass();
                Log.warn(e);
                return null;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass __ISO_8859_1;
public MyHelperClass digest(){ return null; }
	public MyHelperClass warn(Exception o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class Object {

public MyHelperClass toString(byte[] o0, int o1){ return null; }}
