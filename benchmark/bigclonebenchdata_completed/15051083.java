import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15051083 {
public MyHelperClass SvUtil;

//    @Override
    public String getMessageDigest() throws Throwable, SarasvatiLoadException {
        MyHelperClass messageDigest = new MyHelperClass();
        if (messageDigest == null) {
            MyHelperClass nodes = new MyHelperClass();
            Collections.sort(nodes);
            MyHelperClass externals = new MyHelperClass();
            Collections.sort(externals);
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA1");
                MyHelperClass name = new MyHelperClass();
                digest.update((byte)(Object)name.getBytes());
//                MyHelperClass nodes = new MyHelperClass();
                for (XmlNode node :(XmlNode[])(Object) (Object[])(Object)nodes) {
                    node.addToDigest(digest);
                }
//                MyHelperClass externals = new MyHelperClass();
                for (XmlExternal external :(XmlExternal[])(Object) (Object[])(Object)externals) {
                    external.addToDigest(digest);
                }
//                MyHelperClass messageDigest = new MyHelperClass();
                messageDigest = SvUtil.getHexString(digest.digest());
            } catch (NoSuchAlgorithmException nsae) {
                throw new SarasvatiException("Unable to load SHA1 algorithm", nsae);
            }
        }
//        MyHelperClass messageDigest = new MyHelperClass();
        return(String)(Object) messageDigest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHexString(byte[] o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class SarasvatiLoadException extends Exception{
	public SarasvatiLoadException(String errorMessage) { super(errorMessage); }
}

class SarasvatiException extends Exception{
	public SarasvatiException(String errorMessage) { super(errorMessage); }
	SarasvatiException(){}
	SarasvatiException(String o0, NoSuchAlgorithmException o1){}
}

class Collections {

public static MyHelperClass sort(MyHelperClass o0){ return null; }}

class XmlNode {

public MyHelperClass addToDigest(MessageDigest o0){ return null; }}

class XmlExternal {

public MyHelperClass addToDigest(MessageDigest o0){ return null; }}
