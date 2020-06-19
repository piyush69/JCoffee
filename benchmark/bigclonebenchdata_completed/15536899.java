


class c15536899 {

    private String generateCode(String seed) {
        try {
            MyHelperClass Security = new MyHelperClass();
            Security.addProvider(new FNVProvider());
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("FNV-1a");
            MyHelperClass UUID = new MyHelperClass();
            digest.update((seed + UUID.randomUUID().toString()).getBytes());
            byte[] hash1 =(byte[])(Object) digest.digest();
            MyHelperClass LibraryBase64 = new MyHelperClass();
            String sHash1 = "m" + (new String((String)(Object)LibraryBase64.encode(hash1))).replaceAll("=", "").replaceAll("-", "_");
            return sHash1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass randomUUID(){ return null; }
	public MyHelperClass addProvider(FNVProvider o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class FNVProvider {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
