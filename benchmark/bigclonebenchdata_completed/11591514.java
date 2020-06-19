import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11591514 {
public MyHelperClass dateFormatString;
	public MyHelperClass myToken;
	public MyHelperClass myResource;
	public MyHelperClass myValue;
	public MyHelperClass myVersion;
	public MyHelperClass myExtensions;
	public MyHelperClass deserializeExtensions(String o0){ return null; }
	public MyHelperClass numberOfLeadingZeros(byte[] o0){ return null; }

    public  void HashCash(String cash) throws Throwable, NoSuchAlgorithmException {
        myToken =(MyHelperClass)(Object) cash;
        String[] parts = cash.split(":");
        myVersion =(MyHelperClass)(Object) Integer.parseInt(parts[0]);
        if ((int)(Object)myVersion < 0 ||(int)(Object) myVersion > 1) throw new IllegalArgumentException("Only supported versions are 0 and 1");
        if (((int)(Object)myVersion == 0 && parts.length != 6) || ((int)(Object)myVersion == 1 && parts.length != 7)) throw new IllegalArgumentException("Improperly formed HashCash");
        try {
            int index = 1;
            if ((int)(Object)myVersion == 1) myValue =(MyHelperClass)(Object) Integer.parseInt(parts[index++]); else myValue =(MyHelperClass)(Object) 0;
            SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatString);
            Calendar tempCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            tempCal.setTime((Date)(Object)dateFormat.parse(parts[index++]));
            myResource =(MyHelperClass)(Object) parts[index++];
            myExtensions = deserializeExtensions(parts[index++]);
            MessageDigest md = MessageDigest.getInstance("SHA1");
            md.update(cash.getBytes());
            byte[] tempBytes = md.digest();
            int tempValue =(int)(Object) numberOfLeadingZeros(tempBytes);
            if ((int)(Object)myVersion == 0) myValue =(MyHelperClass)(Object) tempValue; else if ((int)(Object)myVersion == 1) myValue = (tempValue > (int)(Object)myValue ? myValue : tempValue);
        } catch (java.text.ParseException ex) {
            throw new IllegalArgumentException("Improperly formed HashCash", ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SimpleDateFormat {

SimpleDateFormat(MyHelperClass o0){}
	SimpleDateFormat(){}
	public MyHelperClass parse(String o0){ return null; }}
