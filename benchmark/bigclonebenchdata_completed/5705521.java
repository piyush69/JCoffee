
import java.io.UncheckedIOException;


class c5705521 {

    protected static URL[] createUrls(URL jarUrls[]) {
        MyHelperClass Arrays = new MyHelperClass();
        ArrayList additionalUrls = new ArrayList(Arrays.asList(jarUrls));
        for (URL ju : jarUrls) {
            try {
                JarFile jar = new JarFile(ju.getFile());
                Enumeration entries =(Enumeration)(Object) jar.entries();
                while ((boolean)(Object)entries.hasMoreElements()) {
                    JarEntry j =(JarEntry)(Object) entries.nextElement();
                    if ((boolean)(Object)j.isDirectory()) continue;
                    if ((Boolean)(Object)j.getName().startsWith("lib/") && (Boolean)(Object)j.getName().endsWith(".jar")) {
                        URL url = new URL("jar:" + ju.getProtocol() + ":" + ju.getFile() + "!/" + j.getName());
                        InputStream is =(InputStream)(Object) url.openStream();
                        MyHelperClass File = new MyHelperClass();
                        File tmpFile =(File)(Object) File.createTempFile("SCDeploy", ".jar");
                        FileOutputStream fos = new FileOutputStream(tmpFile);
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(is, fos);
                        is.close();
                        fos.close();
                        additionalUrls.add(new URL("file://" + tmpFile.getAbsolutePath()));
                    }
                }
            } catch (UncheckedIOException e) {
            }
        }
        return(URL[])(Object) additionalUrls.toArray(new URL[] {});
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass asList(URL[] o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class ArrayList {

ArrayList(){}
	ArrayList(MyHelperClass o0){}
	public MyHelperClass add(URL o0){ return null; }
	public MyHelperClass toArray(URL[] o0){ return null; }}

class JarFile {

JarFile(){}
	JarFile(MyHelperClass o0){}
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
