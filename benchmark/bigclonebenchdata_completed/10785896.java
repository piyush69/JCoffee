
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10785896 {
public MyHelperClass pageContext;
	public MyHelperClass hexDigit(byte o0){ return null; }
	public MyHelperClass getId(){ return null; }

    private void createProperty(String objectID, String value, String propertyID, Long userID) throws JspTagException {
        ClassProperty classProperty = new ClassProperty(new Long(propertyID));
        String newValue = value;
        if (classProperty.getName().equals("Password")) {
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
        Properties properties = new Properties(new Long(objectID), userID);
        try {
            Property property =(Property)(Object) properties.create(new Long(propertyID), newValue);
            pageContext.setAttribute(getId(), property);
        } catch (UncheckedIOException e) {
            throw new JspTagException("Could not create PropertyValue, CreateException: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, Property o1){ return null; }}

class JspTagException extends Exception{
	public JspTagException(String errorMessage) { super(errorMessage); }
}

class ClassProperty {

ClassProperty(Long o0){}
	ClassProperty(){}
	public MyHelperClass getName(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Properties {

Properties(Long o0, Long o1){}
	Properties(){}
	public MyHelperClass create(Long o0, String o1){ return null; }}

class Property {

}

class CreateException extends Exception{
	public CreateException(String errorMessage) { super(errorMessage); }
}
