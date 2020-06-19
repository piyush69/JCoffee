import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9977165 {
public MyHelperClass IOUtils;
	public MyHelperClass testOutputDirectory;
	public MyHelperClass pluginFile;
	public MyHelperClass pcl;

    protected void setUp() throws Throwable, Exception {
        this.testOutputDirectory =(MyHelperClass)(Object) new File(getClass().getResource("/").getPath());
        this.pluginFile =(MyHelperClass)(Object) new File((String)(Object)this.testOutputDirectory, "/plugin.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream((String)(Object)pluginFile));
        zos.putNextEntry(new ZipEntry("WEB-INF/"));
        zos.putNextEntry(new ZipEntry("WEB-INF/classes/"));
        zos.putNextEntry(new ZipEntry("WEB-INF/classes/system.properties"));
        System.getProperties().store((Writer)(Object)zos, null);
        zos.closeEntry();
        zos.putNextEntry(new ZipEntry("WEB-INF/lib/"));
        zos.putNextEntry(new ZipEntry("WEB-INF/lib/plugin.jar"));
        File jarFile = new File(this.testOutputDirectory.getPath() + "/plugin.jar");
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
        pcl =(MyHelperClass)(Object) new PluginClassLoader(new File((String)(Object)testOutputDirectory, "/work"));
        pcl.addPlugin(pluginFile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addPlugin(MyHelperClass o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass getPath(){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(FileOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class PluginClassLoader {

PluginClassLoader(){}
	PluginClassLoader(File o0){}}
