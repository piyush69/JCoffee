


class c21092331 {
public static MyHelperClass IOUtils;
	public static MyHelperClass parentPathOf(String o0){ return null; }
	public static MyHelperClass createTempDir(String o0){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass createTempDir(String o0){ return null; }
//	public MyHelperClass parentPathOf(String o0){ return null; }

    public static URL toFileUrl(URL location) throws IOException {
        String protocol =(String)(Object) location.getProtocol().intern();
        if (protocol != "jar") throw new IOException("cannot explode " + location);
        JarURLConnection juc = (JarURLConnection)(JarURLConnection)(Object) location.openConnection();
        String path =(String)(Object) juc.getEntryName();
        String parentPath =(String)(Object) parentPathOf(path);
        File tempDir =(File)(Object) createTempDir("jartemp");
        JarFile jarFile =(JarFile)(Object) juc.getJarFile();
        for (Enumeration en =(Enumeration)(Object) jarFile.entries();(boolean)(Object) en.hasMoreElements(); ) {
            ZipEntry entry =(ZipEntry)(Object) en.nextElement();
            if ((boolean)(Object)entry.isDirectory()) continue;
            String entryPath =(String)(Object) entry.getName();
            if (entryPath.startsWith(parentPath)) {
                File dest = new File(tempDir, entryPath);
                dest.getParentFile().mkdirs();
                InputStream in =(InputStream)(Object) jarFile.getInputStream(entry);
                OutputStream out =(OutputStream)(Object) new FileOutputStream(dest);
                IOUtils.copy(in, out);
                dest.deleteOnExit();
            }
        }
        File realFile = new File(tempDir, path);
        return(URL)(Object) realFile.toURL();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass intern(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }
	public MyHelperClass getEntryName(){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass toURL(){ return null; }}

class JarFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class JarEntry {

}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
