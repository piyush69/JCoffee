import java.io.*;
import java.lang.*;
import java.util.*;



class c17122199 {
public MyHelperClass u;
	public MyHelperClass Support_Resources;
	public MyHelperClass Support_Jetty;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

    public void test_openStream() throws Exception {
        URL BASE =(URL)(Object) URLTest.class.getClassLoader().getResource(URLTest.class.getPackage().getName().replace('.', File.separatorChar) + "/lf.jar");
        URL url = new URL("jar:" + BASE + "!/foo.jar!/Bugs/HelloWorld.class");
        try {
            url.openStream();
            fail("should throw FNFE.");
        } catch (java.io.UncheckedIOException e) {
        }
        File resources =(File)(Object) Support_Resources.createTempFolder();
        Support_Resources.copyFile(resources, null, "hyts_htmltest.html");
        u =(MyHelperClass)(Object) new URL("file", "", resources.getAbsolutePath() + "/hyts_htmltest.html");
        InputStream is1 =(InputStream)(Object) u.openStream();
        assertTrue("Unable to read from stream", is1.read() != 0);
        is1.close();
        boolean exception = false;
        try {
            u =(MyHelperClass)(Object) new URL("file:///nonexistenttestdir/tstfile");
            u.openStream();
        } catch (UncheckedIOException e) {
            exception = true;
        }
        assertTrue("openStream succeeded for non existent resource", exception);
        int port =(int)(Object) Support_Jetty.startHttpServerWithDocRoot("resources/org/apache/harmony/luni/tests/java/net/");
        URL u = new URL("jar:" + "http://localhost:" + port + "/lf.jar!/plus.bmp");
        InputStream in =(InputStream)(Object) u.openStream();
        byte[] buf = new byte[3];
        int result = in.read(buf);
        assertTrue("Incompete read: " + result, result == 3);
        in.close();
        assertTrue("Returned incorrect data", buf[0] == 0x42 && buf[1] == 0x4d && buf[2] == (byte) 0xbe);
        File test = new File("hytest.$$$");
        FileOutputStream out = new FileOutputStream(test);
        out.write(new byte[] { 0x55, (byte) 0xaa, 0x14 });
        out.close();
        u = new URL("file:" + test.getName());
        in =(InputStream)(Object) u.openStream();
        buf = new byte[3];
        result = in.read(buf);
        in.close();
        test.delete();
        assertEquals("Incompete read 3", 3, result);
        assertTrue("Returned incorrect data 3", buf[0] == 0x55 && buf[1] == (byte) 0xaa && buf[2] == 0x14);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass startHttpServerWithDocRoot(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass createTempFolder(){ return null; }
	public MyHelperClass copyFile(File o0, Object o1, String o2){ return null; }}

class URL {

URL(){}
	URL(String o0, String o1, String o2){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class URLTest {

}
