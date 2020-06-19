import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9793984 {
public MyHelperClass name;
public MyHelperClass BYTE_CLEANER_10;
	public MyHelperClass BYTE_CLEANER_FF;
	public MyHelperClass path;
	public MyHelperClass checksum;

    public void setChecksum()  throws Throwable {
        try {
            java.security.MessageDigest md5 = java.security.MessageDigest.getInstance("MD5");
            String fqn =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) this.path + (int)(Object)this.name;
            md5.update(fqn.getBytes());
            byte[] array = md5.digest();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array.length; ++j) {
                int b = array[j] & (byte)(Object)BYTE_CLEANER_FF;
                if (b < (int)(Object)BYTE_CLEANER_10) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(b));
            }
            this.checksum =(MyHelperClass)(Object) sb.toString();
        } catch (java.security.NoSuchAlgorithmException nsae) {
            this.checksum =(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) this.path + (int)(Object)this.name;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
