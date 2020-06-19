import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2113293 {
public MyHelperClass NULL;
public MyHelperClass IOUtils;
	public MyHelperClass testOutputDirectory;

    protected void setUp() throws Exception {
        File testOutputDirectory =(File)(Object) NULL; //new File();
        testOutputDirectory = new File(getClass().getResource("/").getPath());
        File zipFile =(File)(Object) NULL; //new File();
        zipFile = new File((String)(Object)this.testOutputDirectory, "/plugin.zip");
        File zipOutputDirectory =(File)(Object) NULL; //new File();
        zipOutputDirectory = new File((String)(Object)this.testOutputDirectory, "zip");
//        MyHelperClass zipOutputDirectory = new MyHelperClass();
        zipOutputDirectory.mkdir();
        MyHelperClass logger = new MyHelperClass();
        logger.fine("zip dir created");
//        MyHelperClass zipFile = new MyHelperClass();
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream((String)(Object)zipFile));
        zos.putNextEntry(new ZipEntry("css/"));
        zos.putNextEntry(new ZipEntry("css/system.properties"));
        System.getProperties().store((Writer)(Object)zos, null);
        zos.closeEntry();
        zos.putNextEntry(new ZipEntry("js/"));
        zos.putNextEntry(new ZipEntry("js/system.properties"));
        System.getProperties().store((Writer)(Object)zos, null);
        zos.closeEntry();
        zos.putNextEntry(new ZipEntry("WEB-INF/"));
        zos.putNextEntry(new ZipEntry("WEB-INF/classes/"));
        zos.putNextEntry(new ZipEntry("WEB-INF/classes/system.properties"));
        System.getProperties().store((Writer)(Object)zos, null);
        zos.closeEntry();
        zos.putNextEntry(new ZipEntry("WEB-INF/lib/"));
        zos.putNextEntry(new ZipEntry("WEB-INF/lib/mylib.jar"));
        File jarFile = new File(this.testOutputDirectory.getPath() + "/mylib.jar");
        JarOutputStream jos = new JarOutputStream(new FileOutputStream(jarFile));
        jos.putNextEntry(new ZipEntry("vqwiki/"));
        jos.putNextEntry(new ZipEntry("vqwiki/plugins/"));
        jos.putNextEntry(new ZipEntry("vqwiki/plugins/system.properties"));
        System.getProperties().store((Writer)(Object)jos, null);
        jos.closeEntry();
        jos.close();
        IOUtils.copy(new FileInputStream(jarFile), zos);
        zos.closeEntry();
        zos.close();
        jarFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass copy(FileInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass fine(String o0){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class JarOutputStream {

JarOutputStream(FileOutputStream o0){}
	JarOutputStream(){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }}
