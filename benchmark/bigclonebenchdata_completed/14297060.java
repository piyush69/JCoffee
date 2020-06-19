import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14297060 {
public static MyHelperClass lowMinorVersion;
	public static MyHelperClass highMinorVersion;
	public static MyHelperClass highMajorVersion;
	public static MyHelperClass lowMajorVersion;
public static MyHelperClass keyQuantity;
public static MyHelperClass NULL;
public static MyHelperClass keyType;
//	public MyHelperClass NULL;
public static MyHelperClass keyProduct;
	public static MyHelperClass FIELD_SEPERATOR;
//public MyHelperClass keyProduct;
//	public MyHelperClass highMinorVersion;
//	public MyHelperClass keyQuantity;
//	public MyHelperClass FIELD_SEPERATOR;
//	public MyHelperClass lowMinorVersion;
//	public MyHelperClass keyType;
//	public MyHelperClass highMajorVersion;
//	public MyHelperClass lowMajorVersion;

    static boolean generateKey() throws NoSuchAlgorithmException {
        MyHelperClass reg_name = new MyHelperClass();
        java.util.Random rand = new Random(reg_name.hashCode() + System.currentTimeMillis());
        DecimalFormat vf = new DecimalFormat("000");
        MyHelperClass ccKey = new MyHelperClass();
        ccKey =(int)(Object) keyProduct + (int)(Object)FIELD_SEPERATOR + (int)(Object)keyType + (int)(Object)FIELD_SEPERATOR + (int)(Object)keyQuantity + (int)(Object)FIELD_SEPERATOR + (int)(Object)vf.format(lowMajorVersion) + FIELD_SEPERATOR + vf.format(lowMinorVersion) + FIELD_SEPERATOR + vf.format(highMajorVersion) + FIELD_SEPERATOR + vf.format(highMinorVersion) + FIELD_SEPERATOR + reg_name + FIELD_SEPERATOR + Integer.toHexString(rand.nextInt()).toUpperCase();
        byte[] md5;
        MessageDigest md = null;
        md = MessageDigest.getInstance("MD5");
//        MyHelperClass ccKey = new MyHelperClass();
        md.update((byte)(Object)ccKey.getBytes());
        MyHelperClass FIELD_SEPERATOR = new MyHelperClass();
        md.update((byte)(Object)FIELD_SEPERATOR.getBytes());
        MyHelperClass zuonicsPassword = new MyHelperClass();
        md.update((byte)(Object)zuonicsPassword.getBytes());
        md5 = md.digest();
        int userKey =(int)(Object) NULL; //new int();
        userKey =(int)(Object) ccKey + (int)(Object)FIELD_SEPERATOR;
//        MyHelperClass userKey = new MyHelperClass();
        for (int i = 0; i < md5.length; i++)(int)(Object) userKey +=(int)(Object)(MyHelperClass)(Object) Integer.toHexString(md5[i]).toUpperCase();
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }}

class DecimalFormat {

DecimalFormat(String o0){}
	DecimalFormat(){}
	public MyHelperClass format(MyHelperClass o0){ return null; }}
