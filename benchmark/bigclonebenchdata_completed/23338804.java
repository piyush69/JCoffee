import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23338804 {
public MyHelperClass assertSame(JarFile o0, JarFile o1){ return null; }
	public MyHelperClass assertSame(JarEntry o0, JarEntry o1){ return null; }
public MyHelperClass fail(String o0){ return null; }

//    @TestTargetNew(level = TestLevel.PARTIAL, notes = "Exceptions checking missed.", method = "setUseCaches", args = { boolean.class })
    public void test_setUseCaches() throws Throwable, Exception {
        MyHelperClass Support_Resources = new MyHelperClass();
        File resources =(File)(Object) Support_Resources.createTempFolder();
//        MyHelperClass Support_Resources = new MyHelperClass();
        Support_Resources.copyFile(resources, null, "hyts_att.jar");
        File file = new File(resources.toString() + "/hyts_att.jar");
        URL url = new URL("jar:file:" + file.getPath() + "!/HasAttributes.txt");
        JarURLConnection connection = (JarURLConnection) url.openConnection();
        connection.setUseCaches(false);
        InputStream in = connection.getInputStream();
        in = connection.getInputStream();
        JarFile jarFile1 =(JarFile)(Object) connection.getJarFile();
        JarEntry jarEntry1 =(JarEntry)(Object) connection.getJarEntry();
        in.read();
        in.close();
        JarFile jarFile2 =(JarFile)(Object) connection.getJarFile();
        JarEntry jarEntry2 =(JarEntry)(Object) connection.getJarEntry();
        assertSame(jarFile1, jarFile2);
        assertSame(jarEntry1, jarEntry2);
        try {
            connection.getInputStream();
            fail("should throw IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFolder(){ return null; }
	public MyHelperClass copyFile(File o0, Object o1, String o2){ return null; }}

class TestTargetNew {

}

class JarFile {

}

class JarEntry {

}
