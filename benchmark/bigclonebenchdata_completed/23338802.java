import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23338802 {
public MyHelperClass Support_Resources;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
	public MyHelperClass createContent(String o0, String o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }

//    @TestTargetNew(level = TestLevel.COMPLETE, notes = "", method = "getJarFile", args = {  })
    public void test_getJarFile() throws Throwable, MalformedURLException, IOException {
        URL url = null;
        url =(URL)(Object) createContent("lf.jar", "missing");
        JarURLConnection connection = null;
        connection = (JarURLConnection) url.openConnection();
        try {
            connection.connect();
            fail("Did not throw exception on connect");
        } catch (IOException e) {
        }
        try {
            connection.getJarFile();
            fail("Did not throw exception after connect");
        } catch (IOException e) {
        }
        URL invURL =(URL)(Object) createContent("InvalidJar.jar", "Test.class");
        JarURLConnection juConn = (JarURLConnection) invURL.openConnection();
        try {
            juConn.getJarFile();
            fail("IOException was not thrown.");
        } catch (java.io.IOException io) {
        }
        File resources =(File)(Object) Support_Resources.createTempFolder();
        Support_Resources.copyFile(resources, null, "hyts_att.jar");
        File file = new File(resources.toString() + "/hyts_att.jar");
        URL fUrl1 = new URL("jar:file:" + file.getPath() + "!/");
        JarURLConnection con1 = (JarURLConnection) fUrl1.openConnection();
        ZipFile jf1 =(ZipFile)(Object) con1.getJarFile();
        JarURLConnection con2 = (JarURLConnection) fUrl1.openConnection();
        ZipFile jf2 =(ZipFile)(Object) con2.getJarFile();
        assertTrue("file: JarFiles not the same", jf1 == jf2);
        jf1.close();
        assertTrue("File should exist", file.exists());
        fUrl1 =(URL)(Object) createContent("lf.jar", "");
        con1 = (JarURLConnection) fUrl1.openConnection();
        jf1 =(ZipFile)(Object) con1.getJarFile();
        con2 = (JarURLConnection) fUrl1.openConnection();
        jf2 =(ZipFile)(Object) con2.getJarFile();
        assertTrue("http: JarFiles not the same", jf1 == jf2);
        jf1.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFolder(){ return null; }
	public MyHelperClass copyFile(File o0, Object o1, String o2){ return null; }}

class TestTargetNew {

}

class ZipFile {

public MyHelperClass close(){ return null; }}
