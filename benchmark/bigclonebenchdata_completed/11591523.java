import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11591523 {
public MyHelperClass numberOfLeadingZeros(byte[] o0){ return null; }
	public MyHelperClass serializeExtensions(Map<String,List<String o0){ return null; }
	public MyHelperClass generateCash(String o0, int o1, MessageDigest o2){ return null; }

    public static HashCash mintCash(String resource, Map<String, List<String>> extensions, Calendar date, int value, int version) throws Throwable, NoSuchAlgorithmException {
        if (version < 0 || version > 1) throw new IllegalArgumentException("Only supported versions are 0 and 1");
        MyHelperClass hashLength = new MyHelperClass();
        if (value < 0 || value > hashLength) throw new IllegalArgumentException("Value must be between 0 and " + hashLength);
        if (resource.contains(":")) throw new IllegalArgumentException("Resource must not contain ':'");
        HashCash result = new HashCash();
        MessageDigest md = MessageDigest.getInstance("SHA1");
        result.myResource = resource;
        result.myExtensions = (null == extensions ? new HashMap<String, List<String>>() : extensions);
        result.myDate = date;
        result.myVersion = version;
        String prefix;
        MyHelperClass dateFormatString = new MyHelperClass();
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatString);
        switch(version) {
            case 0:
                prefix = version + ":" + dateFormat.format(date.getTime()) + ":" + resource + ":" + serializeExtensions(extensions) + ":";
                result.myToken = generateCash(prefix, value, md);
                md.reset();
                md.update(result.myToken.getBytes());
                result.myValue = numberOfLeadingZeros(md.digest());
                break;
            case 1:
                result.myValue = value;
                prefix = version + ":" + value + ":" + dateFormat.format(date.getTime()) + ":" + resource + ":" + serializeExtensions(extensions) + ":";
                result.myToken = generateCash(prefix, value, md);
                break;
            default:
                throw new IllegalArgumentException("Only supported versions are 0 and 1");
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HashCash {

}

class SimpleDateFormat {

}
