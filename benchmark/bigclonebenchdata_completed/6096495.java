


class c6096495 {

	public String getMD5(String password) throws NoSuchAlgorithmException {
  MyHelperClass MessageDigest = new MyHelperClass();
		MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte byteData[] =(byte[])(Object) md.digest();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
