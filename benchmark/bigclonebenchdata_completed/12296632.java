import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12296632 {

        public boolean check(Object credentials)  throws Throwable {
            try {
                byte[] digest = null;
                if (credentials instanceof Password || credentials instanceof String) {
                    MyHelperClass __md5Lock = new MyHelperClass();
                    synchronized (__md5Lock) {
                        MyHelperClass __md = new MyHelperClass();
                        if (__md == null) __md = MessageDigest.getInstance("MD5");
                        MyHelperClass __md = new MyHelperClass();
                        __md.reset();
                        MyHelperClass StringUtil = new MyHelperClass();
                        __md.update(credentials.toString().getBytes(StringUtil.__ISO_8859_1));
                        MyHelperClass __md = new MyHelperClass();
                        digest = __md.digest();
                    }
                    MyHelperClass _digest = new MyHelperClass();
                    if (digest == null || digest.length != _digest.length) return false;
                    MyHelperClass _digest = new MyHelperClass();
                    for (int i = 0; i < digest.length; i++) if (digest[i] != _digest[i]) return false;
                    return true;
                } else if (credentials instanceof MD5) {
                    MD5 md5 = (MD5) credentials;
                    MyHelperClass _digest = new MyHelperClass();
                    if (_digest.length != md5._digest.length) return false;
                    MyHelperClass _digest = new MyHelperClass();
                    for (int i = 0; i < _digest.length; i++) if (_digest[i] != md5._digest[i]) return false;
                    return true;
                } else if (credentials instanceof Credential) {
                    return ((Credential) credentials).check(this);
                } else {
                    MyHelperClass Log = new MyHelperClass();
                    Log.warn("Can't check " + credentials.getClass() + " against MD5");
                    return false;
                }
            } catch (Exception e) {
                MyHelperClass Log = new MyHelperClass();
                Log.warn(e);
                return false;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Password {

}

class MD5 {

}

class Credential {

}
