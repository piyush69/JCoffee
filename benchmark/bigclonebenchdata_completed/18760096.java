
import java.io.UncheckedIOException;


class c18760096 {

    protected String saveJar2TmpFile(String jarUrl, boolean reportError) {
        InputStream is = null;
        try {
            MyHelperClass jad = new MyHelperClass();
            URL url = new URL(jad.getJarURL());
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            if (url.getUserInfo() != null) {
                MyHelperClass Base64Coder = new MyHelperClass();
                String userInfo = new String((String)(Object)Base64Coder.encode(url.getUserInfo().getBytes("UTF-8")));
                conn.setRequestProperty("Authorization", "Basic " + userInfo);
            }
            is =(InputStream)(Object) conn.getInputStream();
            File tmpDir = null;
            MyHelperClass MIDletSystemProperties = new MyHelperClass();
            String systemTmpDir =(String)(Object) MIDletSystemProperties.getSystemProperty("java.io.tmpdir");
            if (systemTmpDir != null) {
                tmpDir = new File(systemTmpDir, "microemulator-apps");
                if ((!(Boolean)(Object)tmpDir.exists()) && (!(Boolean)(Object)tmpDir.mkdirs())) {
                    tmpDir = null;
                }
            }
            MyHelperClass File = new MyHelperClass();
            File tmp =(File)(Object) File.createTempFile("me2-app-", ".jar", tmpDir);
            tmp.deleteOnExit();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyToFile(is, tmp);
//            MyHelperClass IOUtils = new MyHelperClass();
            return(String)(Object) IOUtils.getCanonicalFileClassLoaderURL(tmp);
        } catch (UncheckedIOException e) {
            if (reportError) {
                MyHelperClass Message = new MyHelperClass();
                Message.error("Unable to open jar " + jarUrl,(IOException)(Object) e);
            }
            return null;
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getSystemProperty(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass copyToFile(InputStream o0, File o1){ return null; }
	public MyHelperClass getCanonicalFileClassLoaderURL(File o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1, File o2){ return null; }
	public MyHelperClass getJarURL(){ return null; }
	public MyHelperClass encode(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class InputStream {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getUserInfo(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class File {

File(){}
	File(String o0, String o1){}
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
