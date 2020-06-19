import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6866575 {

//    @Primitive
    public static Value caml_md5_string(final CodeRunner ctxt, final Value str, final Value ofs, final Value len) throws Throwable, Exception {
        try {
            MyHelperClass Md5 = new MyHelperClass();
            final MessageDigest md5 = MessageDigest.getInstance((String)(Object)Md5.ALGO);
            md5.update((byte[])(Object)str.asBlock().getBytes(),(int)(Object) ofs.asLong(),(int)(Object) len.asLong());
            MyHelperClass Block = new MyHelperClass();
            return(Value)(Object) Value.createFromBlock(Block.createString(md5.digest()));
        } catch (final NoSuchAlgorithmException nsae) {
            MyHelperClass Fail = new MyHelperClass();
            Fail.invalidArgument("Digest.substring");
            MyHelperClass Value = new MyHelperClass();
            return(Value)(Object) Value.UNIT;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UNIT;
	public MyHelperClass ALGO;
public MyHelperClass getBytes(){ return null; }
	public MyHelperClass createString(byte[] o0){ return null; }
	public MyHelperClass invalidArgument(String o0){ return null; }}

class CodeRunner {

}

class Value {

public MyHelperClass asBlock(){ return null; }
	public MyHelperClass asLong(){ return null; }
	public static MyHelperClass createFromBlock(MyHelperClass o0){ return null; }}

class Primitive {

}
