import java.io.*;
import java.lang.*;
import java.util.*;



class c14227643 {

    public String hmacSHA256(String message, byte[] key) {
        MessageDigest sha256 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha256 =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        } catch (UncheckedIOException e) {
            throw new java.lang.AssertionError(this.getClass().getName() + ".hmacSHA256(): SHA-256 algorithm not found!");
        }
        if (key.length > 64) {
            sha256.update(key);
            key =(byte[])(Object) sha256.digest();
            sha256.reset();
        }
        byte block[] = new byte[64];
        for (int i = 0; i < key.length; ++i) block[i] = key[i];
        for (int i = key.length; i < block.length; ++i) block[i] = 0;
        for (int i = 0; i < 64; ++i) block[i] ^= 0x36;
        sha256.update(block);
        try {
            sha256.update(message.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new java.lang.AssertionError("ITunesU.hmacSH256(): UTF-8 encoding not supported!");
        }
        byte[] hash =(byte[])(Object) sha256.digest();
        sha256.reset();
        for (int i = 0; i < 64; ++i) block[i] ^= (0x36 ^ 0x5c);
        sha256.update(block);
        sha256.update(hash);
        hash =(byte[])(Object) sha256.digest();
        char[] hexadecimals = new char[hash.length * 2];
        for (int i = 0; i < hash.length; ++i) {
            for (int j = 0; j < 2; ++j) {
                int value = (hash[i] >> (4 - 4 * j)) & 0xf;
                char base = (value < 10) ? ('0') : ('a' - 10);
                hexadecimals[i * 2 + j] = (char) (base + value);
            }
        }
        return new String(hexadecimals);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
