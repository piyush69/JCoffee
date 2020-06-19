
import java.io.UncheckedIOException;


class c9639432 {
public static MyHelperClass deviceIdFromIMEI(Context o0){ return null; }
	public static MyHelperClass deviceIdFromBT_MAC_Address(Context o0){ return null; }
	public static MyHelperClass deviceIdFromAndroidId(Context o0){ return null; }
	public static MyHelperClass deviceIdFromWLAN_MAC_Address(Context o0){ return null; }
public static MyHelperClass MessageDigest;
//	public MyHelperClass deviceIdFromAndroidId(Context o0){ return null; }
	public static MyHelperClass deviceIdFromPseudo_Unique_Id(){ return null; }
//	public MyHelperClass deviceIdFromWLAN_MAC_Address(Context o0){ return null; }
//	public MyHelperClass deviceIdFromIMEI(Context o0){ return null; }
//	public MyHelperClass deviceIdFromBT_MAC_Address(Context o0){ return null; }
//public MyHelperClass MessageDigest;
//	public MyHelperClass deviceIdFromPseudo_Unique_Id(){ return null; }

    private static String deviceIdFromCombined_Device_ID(Context context) {
        StringBuilder builder = new StringBuilder();
        builder.append(deviceIdFromIMEI(context));
        builder.append(deviceIdFromPseudo_Unique_Id());
        builder.append(deviceIdFromAndroidId(context));
        builder.append(deviceIdFromWLAN_MAC_Address(context));
        builder.append(deviceIdFromBT_MAC_Address(context));
        String m_szLongID = builder.toString();
        MessageDigest m = null;
        try {
            m =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        m.update(m_szLongID.getBytes(), 0, m_szLongID.length());
        byte p_md5Data[] =(byte[])(Object) m.digest();
        String m_szUniqueID = new String();
        for (int i = 0; i < p_md5Data.length; i++) {
            int b = (0xFF & p_md5Data[i]);
            if (b <= 0xF) m_szUniqueID += "0";
            m_szUniqueID += Integer.toHexString(b);
        }
        return m_szUniqueID;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class Context {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
