import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15760850 {

    public static void main(String[] args)  throws Throwable {
        File container = new File(ArchiveFeature.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        if (container == null) {
            throw new RuntimeException("this use-case isn't being invoked from the executable jar");
        }
        JarFile jarFile = new JarFile(container);
        MyHelperClass PROJECT_DIST_ARCHIVE = new MyHelperClass();
        String artifactName = PROJECT_DIST_ARCHIVE + ".tar.gz";
        File artifactFile = new File(".", artifactName);
        ZipEntry artifactEntry =(ZipEntry)(Object) jarFile.getEntry(artifactName);
        InputStream source =(InputStream)(Object) jarFile.getInputStream(artifactEntry);
        try {
            FileOutputStream dest = new FileOutputStream(artifactFile);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(source, dest);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(dest);
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(source);
        }
        Project project = new Project();
        project.setName("project");
        project.init();
        Target target = new Target();
        target.setName("target");
        project.addTarget(target);
        project.addBuildListener(new Log4jListener());
        Untar untar = new Untar();
        untar.setTaskName("untar");
        untar.setSrc(artifactFile);
        untar.setDest(new File("."));
        UntarCompressionMethod method = new UntarCompressionMethod();
        method.setValue("gzip");
        untar.setCompression(method);
        untar.setProject(project);
        untar.setOwningTarget(target);
        target.addTask(untar);
        untar.execute();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class ArchiveFeature {

}

class JarFile {

JarFile(){}
	JarFile(File o0){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }}

class ZipEntry {

}

class Project {

public MyHelperClass addTarget(Target o0){ return null; }
	public MyHelperClass addBuildListener(Log4jListener o0){ return null; }
	public MyHelperClass init(){ return null; }
	public MyHelperClass setName(String o0){ return null; }}

class Target {

public MyHelperClass addTask(Untar o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }}

class Log4jListener {

}

class Untar {

public MyHelperClass setCompression(UntarCompressionMethod o0){ return null; }
	public MyHelperClass setProject(Project o0){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass setOwningTarget(Target o0){ return null; }
	public MyHelperClass setTaskName(String o0){ return null; }
	public MyHelperClass setSrc(File o0){ return null; }
	public MyHelperClass setDest(File o0){ return null; }}

class UntarCompressionMethod {

public MyHelperClass setValue(String o0){ return null; }}
