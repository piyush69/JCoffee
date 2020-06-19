import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12766394 {
public MyHelperClass FileUtils;
public MyHelperClass IOUtils;
	public MyHelperClass testDir;
	public MyHelperClass LOG;
	public MyHelperClass assertNotNull(byte[] o0){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }
	public MyHelperClass assertNull(byte[] o0){ return null; }

    public void testReadHelloWorldTxt() throws Exception {
        MyHelperClass BASE_DIR = new MyHelperClass();
        final InputStream helloWorldIS = this.getClass().getClassLoader().getResourceAsStream(BASE_DIR + "/HelloWorld.txt");
        FileUtils.forceMkdir(new File(this.testDir.getAbsolutePath() + "/org/settings4j/contentresolver"));
        final String helloWorldPath = this.testDir.getAbsolutePath() + "/org/settings4j/contentresolver/HelloWorld.txt";
        final FileOutputStream fileOutputStream = new FileOutputStream(new File(helloWorldPath));
        IOUtils.copy(helloWorldIS, fileOutputStream);
        IOUtils.closeQuietly(helloWorldIS);
        IOUtils.closeQuietly(fileOutputStream);
        LOG.info("helloWorldPath: " + helloWorldPath);
        final FSContentResolver contentResolver = new FSContentResolver();
        contentResolver.setRootFolderPath(this.testDir.getAbsolutePath());
        byte[] content =(byte[])(Object) contentResolver.getContent("org/settings4j/contentresolver/HelloWorld.txt");
        assertNotNull(content);
        assertEquals("Hello World", new String(content, "UTF-8"));
        content =(byte[])(Object) contentResolver.getContent("file:org/settings4j/contentresolver/HelloWorld.txt");
        assertNotNull(content);
        assertEquals("Hello World", new String(content, "UTF-8"));
        content =(byte[])(Object) contentResolver.getContent("file:/org/settings4j/contentresolver/HelloWorld.txt");
        assertNotNull(content);
        assertEquals("Hello World", new String(content, "UTF-8"));
        content =(byte[])(Object) contentResolver.getContent("file:laksjdhalksdhfa");
        assertNull(content);
        content =(byte[])(Object) contentResolver.getContent("/org/settings4j/contentresolver/HelloWorld.txt");
        assertNotNull(content);
        assertEquals("Hello World", new String(content, "UTF-8"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class FSContentResolver {

public MyHelperClass setRootFolderPath(MyHelperClass o0){ return null; }
	public MyHelperClass getContent(String o0){ return null; }}
