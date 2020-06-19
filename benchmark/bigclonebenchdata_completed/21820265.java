
import java.io.UncheckedIOException;


class c21820265 {
public static MyHelperClass addProperty(String o0, Properties o1, Node o2, LogEvent o3){ return null; }
//public MyHelperClass addProperty(String o0, Properties o1, Node o2, LogEvent o3){ return null; }

    public static Properties addAttributes(Node node, String[] names, Properties props, LogEvent evt) throws ConfigurationException {
        if (props == null) props = new Properties();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            for (int i = 0; i < names.length; i++) {
                String value =(String)(Object) addProperty(names[i], props, node, evt);
                if (value != null) {
                    md.update(names[i].getBytes());
                    md.update(value.getBytes());
                }
            }
            byte[] digest =(byte[])(Object) md.digest();
            MyHelperClass ISOUtil = new MyHelperClass();
            evt.addMessage("digest " + ISOUtil.hexString(digest));
            MyHelperClass DIGEST_PROPERTY = new MyHelperClass();
            props.put(DIGEST_PROPERTY, digest);
        } catch (UncheckedIOException e) {
            throw new ConfigurationException((String)(Object)e);
        }
        return props;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass hexString(byte[] o0){ return null; }}

class Node {

}

class Properties {

public MyHelperClass put(MyHelperClass o0, byte[] o1){ return null; }}

class LogEvent {

public MyHelperClass addMessage(String o0){ return null; }}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
