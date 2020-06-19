import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5467376 {
public MyHelperClass encode(byte[] o0){ return null; }

    protected boolean check(String username, String password, String realm, String nonce, String nc, String cnonce, String qop, String uri, String response, HttpServletRequest request)  throws Throwable {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(username.getBytes());
            md.update((byte) ':');
            md.update(realm.getBytes());
            md.update((byte) ':');
            md.update(password.getBytes());
            byte[] ha1 = md.digest();
            md.reset();
            md.update((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte)(Object)request.getMethod().getBytes());
            md.update((byte) ':');
            md.update(uri.getBytes());
            byte[] ha2 = md.digest();
            MyHelperClass TypeUtil = new MyHelperClass();
            md.update(TypeUtil.toString(ha1, 16).getBytes());
            md.update((byte) ':');
            md.update(nonce.getBytes());
            md.update((byte) ':');
            md.update(nc.getBytes());
            md.update((byte) ':');
            md.update(cnonce.getBytes());
            md.update((byte) ':');
            md.update(qop.getBytes());
            md.update((byte) ':');
//            MyHelperClass TypeUtil = new MyHelperClass();
            md.update(TypeUtil.toString(ha2, 16).getBytes());
            byte[] digest = md.digest();
            return response.equals(encode(digest));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }}

class HttpServletRequest {

public MyHelperClass getMethod(){ return null; }}

class Object {

public MyHelperClass toString(byte[] o0, int o1){ return null; }}
