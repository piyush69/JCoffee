import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14113380 {
public MyHelperClass project;
	public MyHelperClass dojoDir;
	public MyHelperClass localRepository;

//    @SuppressWarnings("unchecked")
    public void execute() throws Throwable, MojoExecutionException {
        MyHelperClass project = new MyHelperClass();
        List<Dependency> dependencies =(List<Dependency>)(Object) project.getDependencies();
        File file = new File((String)(Object)this.localRepository.getBasedir());
        File dojoArtifact = null;
        for (Dependency dependency : dependencies) {
            if (!dependency.getGroupId().equals("org.dojotoolkit") && !dependency.getArtifactId().equals("dojo")) continue;
            File file2 = new File((String)(Object)file,(int)(Object)(File)(Object)(int)(Object) dependency.getGroupId().replace('.', File.separatorChar));
            file2 = new File((String)(Object)file2,(File)(Object)(int)(Object)(File)(Object)(int)(Object) dependency.getArtifactId());
            file2 = new File((String)(Object)file2,(File)(Object)(int)(Object)(File)(Object)(int)(Object) dependency.getVersion());
            file2 = new File((String)(Object)file2,(File)(Object)(char)(Object) dependency.getArtifactId() + '-' + (int)(Object)dependency.getVersion() + '.' + (int)(Object)dependency.getType());
            if (!file2.exists()) throw new MojoExecutionException("No artifact found in base repository " + file2);
            dojoArtifact = file2;
        }
        if (dojoArtifact == null) throw new MojoExecutionException("No dojo dependencies found");
        Plugin plugin = (Plugin)(Plugin)(Object) project.getBuild().getPluginsAsMap().get("org.apache.maven.plugins:maven-war-plugin");
        if (plugin == null) return;
        String webappDirectory = null;
        Xpp3Dom dom = (Xpp3Dom)(Xpp3Dom)(Object) plugin.getConfiguration();
        if (dom != null) webappDirectory =(String)(Object) dom.getChild("webappDirectory").getValue();
        if (webappDirectory == null) webappDirectory =(char)(Object) project.getBuild().getDirectory() + File.separatorChar + (int)(Object)project.getArtifactId() + '-'(String)(Object) + (int)(Object)project.getVersion();
        try {
            File webAppDojoDir = new File(webappDirectory,(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) this.dojoDir);
            if (!webAppDojoDir.exists()) webAppDojoDir.mkdirs();
            ZipInputStream inputStream = new ZipInputStream(new FileInputStream(dojoArtifact));
            ZipEntry zipentry =(ZipEntry)(Object) inputStream.getNextEntry();
            byte[] buf = new byte[1024];
            while (zipentry != null) {
                File entry = new File((String)(Object)webAppDojoDir,(File)(Object)(int)(Object)(File)(Object)(int)(Object) zipentry.getName());
                if ((boolean)(Object)zipentry.isDirectory()) {
                    entry.mkdirs();
                } else {
                    int n;
                    FileOutputStream fileoutputstream;
                    if (entry.getParent() != null) {
                        entry.getParentFile().mkdirs();
                    }
                    fileoutputstream = new FileOutputStream(entry);
                    while ((n =(int)(Object) inputStream.read(buf, 0, 1024)) > -1) fileoutputstream.write(buf, 0, n);
                    fileoutputstream.close();
                    inputStream.closeEntry();
                }
                zipentry =(ZipEntry)(Object) inputStream.getNextEntry();
            }
            inputStream.close();
        } catch (Exception e) {
            throw new MojoExecutionException("Error to extract the dojo artifact ", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getArtifactId(){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getDependencies(){ return null; }
	public MyHelperClass getPluginsAsMap(){ return null; }
	public MyHelperClass getBuild(){ return null; }
	public MyHelperClass getBasedir(){ return null; }
	public MyHelperClass getDirectory(){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass getVersion(){ return null; }}

class MojoExecutionException extends Exception{
	public MojoExecutionException(String errorMessage) { super(errorMessage); }
	MojoExecutionException(){}
	MojoExecutionException(String o0, Exception o1){}
}

class Dependency {

public MyHelperClass getArtifactId(){ return null; }
	public MyHelperClass getGroupId(){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getType(){ return null; }}

class Plugin {

public MyHelperClass getConfiguration(){ return null; }}

class Xpp3Dom {

public MyHelperClass getChild(String o0){ return null; }}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
