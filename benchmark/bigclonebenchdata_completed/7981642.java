import java.io.*;
import java.lang.*;
import java.util.*;



class c7981642 {

//    @Override
    public void update(String mail, String email, String pwd, String firstname, String lastname) throws NamingException, NoSuchAlgorithmException, UnsupportedEncodingException {
        jndiManagerConnection connection = new jndiManagerConnection();
        Attributes attrs =(Attributes)(Object) new BasicAttributes();
        attrs.put("sn", lastname);
        attrs.put("givenName", firstname);
        attrs.put("cn", firstname + " " + lastname);
        if (!pwd.isEmpty()) {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            sha.reset();
            sha.update(pwd.getBytes("utf-8"));
            byte[] digest =(byte[])(Object) sha.digest();
            String hash =(String)(Object) Base64.encodeBase64String(digest);
            attrs.put("userPassword", "{MD5}" + hash);
        }
        DirContext ctx =(DirContext)(Object) connection.getLDAPDirContext();
        MyHelperClass dn = new MyHelperClass();
        ctx.modifyAttributes("mail=" + mail + "," + dn, DirContext.REPLACE_ATTRIBUTE, attrs);
        if (!mail.equals(email)) {
//            MyHelperClass dn = new MyHelperClass();
            String newName = "mail=" + email + "," + dn;
//            MyHelperClass dn = new MyHelperClass();
            String oldName = "mail=" + mail + "," + dn;
            ctx.rename(oldName, newName);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NamingException extends Exception{
	public NamingException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class jndiManagerConnection {

public MyHelperClass getLDAPDirContext(){ return null; }}

class Attributes {

public MyHelperClass put(String o0, String o1){ return null; }}

class BasicAttributes {

}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class Base64 {

public static MyHelperClass encodeBase64String(byte[] o0){ return null; }}

class DirContext {
public static MyHelperClass REPLACE_ATTRIBUTE;
public MyHelperClass modifyAttributes(String o0, MyHelperClass o1, Attributes o2){ return null; }
	public MyHelperClass rename(String o0, String o1){ return null; }}
