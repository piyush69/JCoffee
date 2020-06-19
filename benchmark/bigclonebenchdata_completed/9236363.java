


class c9236363 {

    private void unJarStart(String jarPath, String jarEntryStart) {
        String path;
        if (jarPath.lastIndexOf("lib/") >= 0) path = jarPath.substring(0, jarPath.lastIndexOf("lib/")); else path = jarPath.substring(0, jarPath.lastIndexOf("/"));
        String relPath = jarEntryStart.substring(0, jarEntryStart.lastIndexOf("/"));
        try {
            new File(path + "/" + relPath).mkdirs();
            JarFile jar = new JarFile(jarPath);
            Enumeration entries =(Enumeration)(Object) jar.entries();
            while ((boolean)(Object)entries.hasMoreElements()) {
                JarEntry entry =(JarEntry)(Object) entries.nextElement();
                String jarEntry =(String)(Object) entry.getName();
                if (jarEntry.startsWith(jarEntryStart)) {
                    ZipEntry ze =(ZipEntry)(Object) jar.getEntry(jarEntry);
                    File bin = new File(path + "/" + jarEntry);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(jar.getInputStream(ze), new FileOutputStream(bin));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class JarFile {

JarFile(){}
	JarFile(String o0){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class ZipEntry {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
