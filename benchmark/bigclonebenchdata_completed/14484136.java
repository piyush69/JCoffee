


class c14484136 {

    public void copyJarContent(File jarPath, File targetDir) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.info("Copying natives from " + jarPath.getName());
        JarFile jar = new JarFile(jarPath);
        Enumeration entries =(Enumeration)(Object) jar.entries();
        while ((boolean)(Object)entries.hasMoreElements()) {
            JarEntry file =(JarEntry)(Object) entries.nextElement();
            File f = new File(targetDir, file.getName());
//            MyHelperClass log = new MyHelperClass();
            log.info("Copying native - " + file.getName());
            File parentFile =(File)(Object) f.getParentFile();
            parentFile.mkdirs();
            if ((boolean)(Object)file.isDirectory()) {
                f.mkdir();
                continue;
            }
            InputStream is = null;
            FileOutputStream fos = null;
            try {
                is =(InputStream)(Object) jar.getInputStream(file);
                fos = new FileOutputStream(f);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, fos);
            } finally {
                if (fos != null) fos.close();
                if (is != null) is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarFile {

JarFile(File o0){}
	JarFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(JarEntry o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
