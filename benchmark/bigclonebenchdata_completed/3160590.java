import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3160590 {
public MyHelperClass LOG;
	public MyHelperClass ByteUtils;
public MyHelperClass words;
	public MyHelperClass collator;
	public MyHelperClass locale;

//    @Override
    public final byte[] getDigest()  throws Throwable {
        try {
            final MessageDigest hashing = MessageDigest.getInstance("SHA-256");
            MyHelperClass Charset = new MyHelperClass();
            final Charset utf16 =(Charset)(Object) Charset.forName("UTF-16");
            for (final CollationKey wordKey :(CollationKey[])(Object) (Object[])(Object)this.words) {
                hashing.update((byte)(Object)wordKey.toByteArray());
            }
            hashing.update(this.locale.toString().getBytes((String)(Object)utf16));
            hashing.update((byte)(Object)ByteUtils.toBytesLE(this.collator.getStrength()));
            hashing.update((byte)(Object)ByteUtils.toBytesLE(this.collator.getDecomposition()));
            return hashing.digest();
        } catch (final NoSuchAlgorithmException e) {
            LOG.severe(e.toString());
            return new byte[0];
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass toBytesLE(MyHelperClass o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass getDecomposition(){ return null; }
	public MyHelperClass getStrength(){ return null; }}

class Charset {

}

class CollationKey {

public MyHelperClass toByteArray(){ return null; }}
