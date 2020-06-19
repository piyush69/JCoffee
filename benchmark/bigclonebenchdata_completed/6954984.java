import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6954984 {

    public static byte[] clearPassToUserPassword(String clearpass, HashAlg alg, byte[] salt)  throws Throwable {
        if (alg == null) {
            throw new IllegalArgumentException("Invalid hash argorithm.");
        }
        try {
            MessageDigest digester = null;
            StringBuilder resultInText = new StringBuilder();
            switch(alg) {
                MyHelperClass MD5 = new MyHelperClass();
                case MD5:
                    resultInText.append("{MD5}");
                    digester = MessageDigest.getInstance("MD5");
                    break;
                MyHelperClass SMD5 = new MyHelperClass();
                case SMD5:
                    resultInText.append("{SMD5}");
                    digester = MessageDigest.getInstance("MD5");
                    break;
                MyHelperClass SHA = new MyHelperClass();
                case SHA:
                    resultInText.append("{SHA}");
                    digester = MessageDigest.getInstance("SHA");
                    break;
                MyHelperClass SSHA = new MyHelperClass();
                case SSHA:
                    resultInText.append("{SSHA}");
                    digester = MessageDigest.getInstance("SHA");
                    break;
                default:
                    break;
            }
            digester.reset();
            MyHelperClass DEFAULT_ENCODING = new MyHelperClass();
            digester.update(clearpass.getBytes(DEFAULT_ENCODING));
            byte[] hash = null;
            MyHelperClass HashAlg = new MyHelperClass();
            if (salt != null && (alg == HashAlg.SMD5 || alg == HashAlg.SSHA)) {
                digester.update(salt);
                MyHelperClass ArrayUtils = new MyHelperClass();
                hash = ArrayUtils.addAll(digester.digest(), salt);
            } else {
                hash = digester.digest();
            }
            MyHelperClass DEFAULT_ENCODING = new MyHelperClass();
            resultInText.append(new String(Base64.encodeBase64(hash), DEFAULT_ENCODING));
            MyHelperClass DEFAULT_ENCODING = new MyHelperClass();
            return resultInText.toString().getBytes(DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException uee) {
            MyHelperClass log = new MyHelperClass();
            log.warn("Error occurred while hashing password ", uee);
            return new byte[0];
        } catch (java.security.NoSuchAlgorithmException nse) {
            MyHelperClass log = new MyHelperClass();
            log.warn("Error occurred while hashing password ", nse);
            return new byte[0];
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HashAlg {

}

class Base64 {

public MyHelperClass encodeBase64(byte[] o0){ return null; }}
