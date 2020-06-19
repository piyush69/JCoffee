import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23158910 {
public MyHelperClass letters;
	public MyHelperClass LETTERS_DEFAULT;
	public MyHelperClass alphabet;

    public char check(String password)  throws Throwable {
        MyHelperClass captchaRandom = new MyHelperClass();
        if (captchaRandom.equals("null")) {
            return 's';
        }
//        MyHelperClass captchaRandom = new MyHelperClass();
        if (captchaRandom.equals("used")) {
            return 'm';
        }
        MyHelperClass secret = new MyHelperClass();
        String encryptionBase =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) secret + (int)(Object)captchaRandom;
        MyHelperClass ALPHABET_DEFAULT = new MyHelperClass();
        if (!alphabet.equals(ALPHABET_DEFAULT) || letters != LETTERS_DEFAULT) {
            MyHelperClass alphabet = new MyHelperClass();
            encryptionBase += ":" + alphabet + ":" + letters;
        }
        MessageDigest md5;
        byte[] digest = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.update(encryptionBase.getBytes());
            digest = md5.digest();
        } catch (NoSuchAlgorithmException e) {
        }
        String correctPassword = "";
        int index;
        MyHelperClass letters = new MyHelperClass();
        for (int i = 0; i < (int)(Object)letters; i++) {
            MyHelperClass alphabet = new MyHelperClass();
            index = (digest[i] + 256) % 256 % (int)(Object)alphabet.length();
//            MyHelperClass alphabet = new MyHelperClass();
            correctPassword += alphabet.substring(index, index + 1);
        }
        if (!password.equals(correctPassword)) {
            return 'w';
        } else {
//            MyHelperClass captchaRandom = new MyHelperClass();
            captchaRandom =(MyHelperClass)(Object) "used";
            return 't';
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass length(){ return null; }}
