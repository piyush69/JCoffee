
import java.io.UncheckedIOException;


class c13720140 {
public MyHelperClass hexDigit(byte o0){ return null; }

    private void modifyProperty(String valueID, String value, Long userID) throws JspTagException {
        Property property = new Property(new Long(valueID), userID);
        String newValue = value;
        System.out.println(property.getName());
        if (property.getName().equals("Password")) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest crypt =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                crypt.update(value.getBytes());
                byte digest[] =(byte[])(Object) crypt.digest();
                StringBuffer hexString = new StringBuffer();
                for (int i = 0; i < digest.length; i++) {
                    hexString.append(hexDigit(digest[i]));
                }
                newValue = hexString.toString();
                crypt.reset();
            } catch (UncheckedIOException e) {
                System.err.println("jspShop: Could not get instance of MD5 algorithm. Please fix this!" + e.getMessage());
                e.printStackTrace();
                throw new JspTagException("Error crypting password!: " + e.getMessage());
            }
        }
        property.setValue(newValue);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class JspTagException extends Exception{
	public JspTagException(String errorMessage) { super(errorMessage); }
}

class Property {

Property(Long o0, Long o1){}
	Property(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setValue(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
