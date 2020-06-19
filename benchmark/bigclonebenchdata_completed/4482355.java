


class c4482355 {

    protected static byte[] downloadAndSendBinary(String u, boolean saveOnDisk, File f) throws IOException {
        URL url = new URL(u);
        MyHelperClass Authenticator = new MyHelperClass();
        Authenticator.setDefault(new HTTPResourceAuthenticator());
        MyHelperClass HTTPResourceAuthenticator = new MyHelperClass();
        HTTPResourceAuthenticator.addURL(url);
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Retrieving " + url.toString());
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        MyHelperClass PMS = new MyHelperClass();
        conn.setRequestProperty("User-agent", "PS3 Media Server " + PMS.getVersion());
        InputStream in =(InputStream)(Object) conn.getInputStream();
        FileOutputStream fOUT = null;
        if (saveOnDisk && f != null) {
            fOUT = new FileOutputStream(f);
        }
        byte buf[] = new byte[4096];
        int n = -1;
        while ((n =(int)(Object) in.read(buf)) > -1) {
            bytes.write(buf, 0, n);
            if (fOUT != null) {
                fOUT.write(buf, 0, n);
            }
        }
        in.close();
        if (fOUT != null) {
            fOUT.close();
        }
        return(byte[])(Object) bytes.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getVersion(){ return null; }
	public MyHelperClass addURL(URL o0){ return null; }
	public MyHelperClass setDefault(HTTPResourceAuthenticator o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HTTPResourceAuthenticator {

}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
