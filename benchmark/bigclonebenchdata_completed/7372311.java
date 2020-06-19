


class c7372311 {

    private void generateDeviceUUID() {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass deviceType = new MyHelperClass();
            md5.update(deviceType.getBytes());
            MyHelperClass internalId = new MyHelperClass();
            md5.update(internalId.getBytes());
            MyHelperClass bindAddress = new MyHelperClass();
            md5.update(bindAddress.getHostName().getBytes());
            StringBuffer hexString = new StringBuffer();
            byte[] digest =(byte[])(Object) md5.digest();
            for (int i = 0; i < digest.length; i++) {
                hexString.append(Integer.toHexString(0xFF & digest[i]));
            }
            String uuid;// = new String();
            uuid = hexString.toString().toUpperCase();
        } catch (Exception ex) {
            RuntimeException runTimeEx = new RuntimeException("Unexpected error during MD5 hash creation, check your JRE");
            runTimeEx.initCause(ex);
            throw runTimeEx;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getHostName(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}
