
import java.io.UncheckedIOException;


class c11337538 {

    public static String machineInfo() {
        StringBuilder machineInfo = new StringBuilder();
        try {
            MyHelperClass NetworkInterface = new MyHelperClass();
            Enumeration networkInterfaces =(Enumeration)(Object) NetworkInterface.getNetworkInterfaces();
            while ((boolean)(Object)networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface)(NetworkInterface)(Object) networkInterfaces.nextElement();
                if ("eth0".equals(networkInterface.getDisplayName())) {
                    for (byte b :(byte[])(Object) (Object[])(Object)networkInterface.getHardwareAddress()) {
                        MyHelperClass StringTools = new MyHelperClass();
                        StringTools.appendWithDelimiter(machineInfo, String.format("%02x", b).toUpperCase(), ":");
                    }
                    machineInfo.append("\n");
                    break;
                }
            }
        } catch (UncheckedIOException x) {
            System.out.println("LicenseTools.machineInfo: " + x.getMessage());
            x.printStackTrace();
        }
        if (machineInfo.length() == 0) {
            return null;
        }
        String info = machineInfo.toString();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5", "SUN");
            messageDigest.update(info.getBytes());
            byte[] md5 =(byte[])(Object) messageDigest.digest(info.getBytes());
            MyHelperClass Base64 = new MyHelperClass();
            return new String((String)(Object)Base64.encodeBase64(md5));
        } catch (Exception x) {
            System.out.println("LicenseTools.machineInfo: " + x.getMessage());
            x.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass appendWithDelimiter(StringBuilder o0, String o1, String o2){ return null; }
	public MyHelperClass getInstance(String o0, String o1){ return null; }
	public MyHelperClass encodeBase64(byte[] o0){ return null; }
	public MyHelperClass getNetworkInterfaces(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class NetworkInterface {

public MyHelperClass getHardwareAddress(){ return null; }
	public MyHelperClass getDisplayName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
