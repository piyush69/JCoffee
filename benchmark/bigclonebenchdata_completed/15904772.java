


class c15904772 {
public static MyHelperClass InetAddress;
	public static MyHelperClass stackDump(Throwable o0){ return null; }
//public MyHelperClass InetAddress;
//	public MyHelperClass stackDump(Throwable o0){ return null; }

    public static byte[] getSystemStateHash() {
        MessageDigest sha1;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha1 =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
        } catch (Exception e) {
            throw new Error("Error in RandomSeed, no sha1 hash");
        }
        sha1.update((byte) System.currentTimeMillis());
        sha1.update((byte) Runtime.getRuntime().totalMemory());
        sha1.update((byte) Runtime.getRuntime().freeMemory());
        sha1.update(stackDump(new Throwable()));
        try {
            Properties props =(Properties)(Object) System.getProperties();
            Enumeration names =(Enumeration)(Object) props.propertyNames();
            while ((boolean)(Object)names.hasMoreElements()) {
                String name = (String)(String)(Object) names.nextElement();
                sha1.update(name.getBytes());
                sha1.update(props.getProperty(name).getBytes());
            }
        } catch (Throwable t) {
            sha1.update(stackDump(t));
        }
        sha1.update((byte) System.currentTimeMillis());
        try {
            sha1.update(InetAddress.getLocalHost().toString().getBytes());
        } catch (Throwable t) {
            sha1.update(stackDump(t));
        }
        sha1.update((byte) System.currentTimeMillis());
        Runtime.getRuntime().gc();
        sha1.update((byte) Runtime.getRuntime().freeMemory());
        sha1.update((byte) System.currentTimeMillis());
        return(byte[])(Object) sha1.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getLocalHost(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass update(byte o0){ return null; }}

class Properties {

public MyHelperClass propertyNames(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}
