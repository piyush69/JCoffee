import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23338805 {
public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
public MyHelperClass juc;
	public MyHelperClass createContent(String o0, String o1){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

//    @TestTargetNew(level = TestLevel.COMPLETE, notes = "", method = "getJarFileURL", args = {  })
    public void test_getJarFileURL() throws Throwable, Exception {
        URL u =(URL)(Object) createContent("lf.jar", "plus.bmp");
        URL fileURL = new URL(u.getPath().substring(0, u.getPath().indexOf("!")));
        juc =(MyHelperClass)(Object) (JarURLConnection) u.openConnection();
        assertTrue("Returned incorrect file URL", juc.getJarFileURL().equals(fileURL));
        URL url = new URL("jar:file:///bar.jar!/foo.jar!/Bugs/HelloWorld.class");
        assertEquals("file:/bar.jar", ((JarURLConnection) url.openConnection()).getJarFileURL().toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getJarFileURL(){ return null; }}

class TestTargetNew {

}
