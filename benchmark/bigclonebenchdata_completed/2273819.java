import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2273819 {

        String digest(final UserAccountEntity account) {
            try {
                final MessageDigest digest = MessageDigest.getInstance("SHA-1");
                digest.reset();
                digest.update((byte)(Object)account.getUserId().getBytes("UTF-8"));
                digest.update(account.getLastLogin().toString().getBytes("UTF-8"));
                digest.update((byte)(Object)account.getPerson().getGivenName().getBytes("UTF-8"));
                digest.update((byte)(Object)account.getPerson().getSurname().getBytes("UTF-8"));
                digest.update((byte)(Object)account.getPerson().getEmail().getBytes("UTF-8"));
                MyHelperClass m_random = new MyHelperClass();
                digest.update((byte)(Object)m_random);
                return new String((String)(Object)Base64.altEncode(digest.digest()));
            } catch (final Exception e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Exception", e);
                throw new RuntimeException(e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getSurname(){ return null; }
	public MyHelperClass getGivenName(){ return null; }}

class UserAccountEntity {

public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getLastLogin(){ return null; }
	public MyHelperClass getPerson(){ return null; }}

class Base64 {

public static MyHelperClass altEncode(byte[] o0){ return null; }}
