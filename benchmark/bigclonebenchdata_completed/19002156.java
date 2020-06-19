


class c19002156 {

    private String jarDiagnostics(Throwable throwable, File[] files) throws IOException {
        File home = new File(System.getProperty("user.home"));
        MyHelperClass File = new MyHelperClass();
        File jar_file =(File)(Object) File.createTempFile("nuages-diagnostic.", ".jar", home);
        FileOutputStream fos = new FileOutputStream(jar_file);
        JarOutputStream jos = new JarOutputStream(fos);
        ZipEntry ze = new ZipEntry("Exception");
        jos.putNextEntry(ze);
        PrintStream ps = new PrintStream(jos);
        throwable.printStackTrace((java.io.PrintStream)(Object)ps);
        for (File file : files) if ((file != null) && (boolean)(Object)file.exists()) {
            ze = new ZipEntry((String)(Object)file.getName());
            jos.putNextEntry(ze);
            byte[] buffer = new byte[65536];
            FileInputStream fis = new FileInputStream(file);
            int len;
            while ((len =(int)(Object) fis.read(buffer)) > 0) jos.write(buffer, 0, len);
            fis.close();
        }
        jos.close();
        return(String)(Object) jar_file.getPath();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1, File o2){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class JarOutputStream {

JarOutputStream(FileOutputStream o0){}
	JarOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class PrintStream {

PrintStream(){}
	PrintStream(JarOutputStream o0){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
