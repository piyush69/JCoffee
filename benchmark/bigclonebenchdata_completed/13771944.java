


class c13771944 {
public static MyHelperClass byteToBase64(byte[] o0){ return null; }
//public MyHelperClass byteToBase64(byte[] o0){ return null; }

    public static String generate(String username, String password) throws PersistenceException {
        String output = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
            md.reset();
            md.update(username.getBytes());
            md.update(password.getBytes());
            byte[] rawhash =(byte[])(Object) md.digest();
            output =(String)(Object) byteToBase64(rawhash);
        } catch (Exception e) {
            throw new PersistenceException("error, could not generate password");
        }
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
