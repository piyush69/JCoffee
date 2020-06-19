


class c18657526 {
public MyHelperClass toHexString(MyHelperClass o0){ return null; }

    public void visit(AuthenticationMD5Password message) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass properties = new MyHelperClass();
            md5.update(((String)(String)(Object) properties.get("password") + (String)(String)(Object) properties.get("user")).getBytes("iso8859-1"));
            String newValue = toHexString(md5.digest()) + new String((byte[])(Object)message.getSalt(), "iso8859-1");
            md5.reset();
            md5.update(newValue.getBytes("iso8859-1"));
            newValue =(String)(Object) toHexString(md5.digest());
            PasswordMessage mes = new PasswordMessage("md5" + newValue);
            MyHelperClass encoder = new MyHelperClass();
            byte[] data =(byte[])(Object) encoder.encode(mes);
            MyHelperClass out = new MyHelperClass();
            out.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(PasswordMessage o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class AuthenticationMD5Password {

public MyHelperClass getSalt(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class PasswordMessage {

PasswordMessage(String o0){}
	PasswordMessage(){}}
