import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20004216 {
public MyHelperClass method;
	public MyHelperClass TypeUtil;
	public MyHelperClass log;
	public MyHelperClass realm;
	public MyHelperClass cnonce;
	public MyHelperClass nc;
	public MyHelperClass nonce;
	public MyHelperClass username;
	public MyHelperClass qop;
	public MyHelperClass uri;

        public boolean check(Object credentials)  throws Throwable {
            String password = ((String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[])(Object)credentials instanceof String) ? (String) credentials : credentials.toString();
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] ha1;
                if ((MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5[])(Object)credentials instanceof MD5) {
                    ha1 = ((MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5[][])(Object)(MD5)(MD5[])(Object) credentials).getDigest();
                } else {
                    MyHelperClass StringUtil = new MyHelperClass();
                    md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)username.getBytes(StringUtil.__ISO_8859_1));
                    md.update((byte) ':');
//                    MyHelperClass StringUtil = new MyHelperClass();
                    md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)realm.getBytes(StringUtil.__ISO_8859_1));
                    md.update((byte) ':');
//                    MyHelperClass StringUtil = new MyHelperClass();
                    md.update(password.getBytes((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)StringUtil.__ISO_8859_1));
                    ha1 = md.digest();
                }
                md.reset();
                MyHelperClass StringUtil = new MyHelperClass();
                md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)method.getBytes(StringUtil.__ISO_8859_1));
                md.update((byte) ':');
//                MyHelperClass StringUtil = new MyHelperClass();
                md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)uri.getBytes(StringUtil.__ISO_8859_1));
                byte[] ha2 = md.digest();
//                MyHelperClass StringUtil = new MyHelperClass();
                md.update(TypeUtil.toString(ha1, 16).getBytes(StringUtil.__ISO_8859_1));
                md.update((byte) ':');
//                MyHelperClass StringUtil = new MyHelperClass();
                md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)nonce.getBytes(StringUtil.__ISO_8859_1));
                md.update((byte) ':');
//                MyHelperClass StringUtil = new MyHelperClass();
                md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)nc.getBytes(StringUtil.__ISO_8859_1));
                md.update((byte) ':');
//                MyHelperClass StringUtil = new MyHelperClass();
                md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)cnonce.getBytes(StringUtil.__ISO_8859_1));
                md.update((byte) ':');
//                MyHelperClass StringUtil = new MyHelperClass();
                md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)qop.getBytes(StringUtil.__ISO_8859_1));
                md.update((byte) ':');
//                MyHelperClass StringUtil = new MyHelperClass();
                md.update(TypeUtil.toString(ha2, 16).getBytes(StringUtil.__ISO_8859_1));
                byte[] digest = md.digest();
                MyHelperClass response = new MyHelperClass();
                return (TypeUtil.toString(digest, 16).equalsIgnoreCase(response));
            } catch (Exception e) {
                MyHelperClass LogSupport = new MyHelperClass();
                log.warn(LogSupport.EXCEPTION, e);
            }
            return false;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass __ISO_8859_1;
	public MyHelperClass EXCEPTION;
public MyHelperClass getBytes(MyHelperClass o0){ return null; }
	public MyHelperClass warn(MyHelperClass o0, Exception o1){ return null; }}

class MD5 {

public MyHelperClass getDigest(){ return null; }}

class Object {

public MyHelperClass toString(byte[] o0, int o1){ return null; }}
