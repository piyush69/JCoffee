


class c9236362 {

    private String unJar(String jarPath, String jarEntry) {
        String path;
        if (jarPath.lastIndexOf("lib/") >= 0) path = jarPath.substring(0, jarPath.lastIndexOf("lib/")); else path = jarPath.substring(0, jarPath.lastIndexOf("/"));
        String relPath = jarEntry.substring(0, jarEntry.lastIndexOf("/"));
        try {
            new File(path + "/" + relPath).mkdirs();
            JarFile jar = new JarFile(jarPath);
            ZipEntry ze =(ZipEntry)(Object) jar.getEntry(jarEntry);
            File bin = new File(path + "/" + jarEntry);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(jar.getInputStream(ze), new FileOutputStream(bin));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path + "/" + jarEntry;
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

JarFile(String o0){}
	JarFile(){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }}

class ZipEntry {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
