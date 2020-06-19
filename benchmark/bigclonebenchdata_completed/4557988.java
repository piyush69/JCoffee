import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4557988 {
public MyHelperClass firstName;

    public Attributes getAttributes() throws Throwable, SchemaViolationException, NoSuchAlgorithmException, UnsupportedEncodingException {
        BasicAttributes outAttrs = new BasicAttributes(true);
        BasicAttribute oc = new BasicAttribute("objectclass", "inetOrgPerson");
        oc.add("organizationalPerson");
        oc.add("person");
        outAttrs.put(oc);
        MyHelperClass lastName = new MyHelperClass();
        if (lastName != null && firstName != null) {
//            MyHelperClass lastName = new MyHelperClass();
            outAttrs.put("sn", lastName);
            MyHelperClass firstName = new MyHelperClass();
            outAttrs.put("givenName", firstName);
//            MyHelperClass firstName = new MyHelperClass();
            outAttrs.put("cn", firstName + " " + lastName);
        } else {
            throw new SchemaViolationException("user must have surname");
        }
        MyHelperClass password = new MyHelperClass();
        if (password != null) {
            MessageDigest sha = MessageDigest.getInstance("md5");
            sha.reset();
//            MyHelperClass password = new MyHelperClass();
            sha.update((byte)(Object)password.getBytes("utf-8"));
            byte[] digest = sha.digest();
            String hash =(String)(Object) Base64.encodeBase64String(digest);
            outAttrs.put("userPassword", "{MD5}" + hash);
        }
        MyHelperClass email = new MyHelperClass();
        if (email != null) {
//            MyHelperClass email = new MyHelperClass();
            outAttrs.put("mail", email);
        }
        return (Attributes)(Attributes)(Object) outAttrs;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }}

class Attributes {

}

class SchemaViolationException extends Exception{
	public SchemaViolationException(String errorMessage) { super(errorMessage); }
}

class BasicAttributes {

BasicAttributes(){}
	BasicAttributes(boolean o0){}
	public MyHelperClass put(BasicAttribute o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}

class BasicAttribute {

BasicAttribute(){}
	BasicAttribute(String o0, String o1){}
	public MyHelperClass add(String o0){ return null; }}

class Base64 {

public static MyHelperClass encodeBase64String(byte[] o0){ return null; }}
