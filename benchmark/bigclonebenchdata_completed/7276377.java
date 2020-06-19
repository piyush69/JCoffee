


class c7276377 {
public static MyHelperClass digestAsString(byte[] o0){ return null; }
//public MyHelperClass digestAsString(byte[] o0){ return null; }

    public static String checksum(URL url, String algorithm) {
        MessageDigest messageDigest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messageDigest =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        } catch (Exception ex) {
            throw new RuntimeException("Could not create an instance of MessageDigest", ex);
        }
        byte[] bytes = new byte[4 * 1024];
        try {
            InputStream in = null;
            try {
                in =(InputStream)(Object) url.openStream();
                int nBytesRead = 0;
                while ((nBytesRead =(int)(Object) in.read(bytes)) > 0) {
                    messageDigest.update(bytes, 0, nBytesRead);
                }
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Could not read message digest for: " + url.toExternalForm() + " using algorithm: " + algorithm);
        }
        byte[] checksumValue =(byte[])(Object) messageDigest.digest();
        return(String)(Object) digestAsString(checksumValue);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
