


class c3616301 {

    public static final String getHash(int iterationNb, String password, String salt) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(salt.getBytes("UTF-8"));
            byte[] input =(byte[])(Object) digest.digest(password.getBytes("UTF-8"));
            for (int i = 0; i < iterationNb; i++) {
                digest.reset();
                input =(byte[])(Object) digest.digest(input);
            }
            MyHelperClass encoder = new MyHelperClass();
            String hashedValue =(String)(Object) encoder.encode(input);
            MyHelperClass LOG = new MyHelperClass();
            LOG.finer("Creating hash '" + hashedValue + "' with iterationNb '" + iterationNb + "' and password '" + password + "' and salt '" + salt + "'!!");
            return hashedValue;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Problem in the getHash method.", ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
