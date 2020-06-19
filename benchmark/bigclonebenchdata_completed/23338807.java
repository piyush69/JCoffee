import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23338807 {
public MyHelperClass assertTrue(boolean o0){ return null; }

//    @TestTargetNew(level = TestLevel.COMPLETE, notes = "Test fails: IOException expected but IllegalStateException is thrown: ticket 128", method = "getInputStream", args = {  })
    public void test_getInputStream_DeleteJarFileUsingURLConnection() throws Throwable, Exception {
        String jarFileName = "";
        String entry = "text.txt";
        String cts = System.getProperty("java.io.tmpdir");
        File tmpDir = new File(cts);
        File jarFile = tmpDir.createTempFile("file", ".jar", tmpDir);
        jarFileName = jarFile.getPath();
        FileOutputStream jarFileOutputStream = new FileOutputStream(jarFileName);
        JarOutputStream out = new JarOutputStream(new BufferedOutputStream(jarFileOutputStream));
        JarEntry jarEntry = new JarEntry(entry);
        out.putNextEntry(jarEntry);
        out.write(new byte[] { 'a', 'b', 'c' });
        out.close();
        URL url = new URL("jar:file:" + jarFileName + "!/" + entry);
        URLConnection conn = url.openConnection();
        conn.setUseCaches(false);
        InputStream is = conn.getInputStream();
        is.close();
        assertTrue(jarFile.delete());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class TestTargetNew {

}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(BufferedOutputStream o0){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}}
