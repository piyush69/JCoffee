
import java.io.UncheckedIOException;


class c21234510 {

    public static void zip(String destination, String folder) {
        File fdir = new File(folder);
        File[] files =(File[])(Object) fdir.listFiles();
        PrintWriter stdout = new PrintWriter((PrintStream)(Object)System.out, true);
        int read = 0;
        FileInputStream in;
        byte[] data = new byte[1024];
        try {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destination));
            MyHelperClass ZipOutputStream = new MyHelperClass();
            out.setMethod(ZipOutputStream.DEFLATED);
            for (int i = 0; i < files.length; i++) {
                try {
                    stdout.println(files[i].getName());
                    ZipEntry entry = new ZipEntry(files[i].getName());
                    in = new FileInputStream(files[i].getPath());
                    out.putNextEntry(entry);
                    while ((read =(int)(Object) in.read(data, 0, 1024)) != -1) {
                        out.write(data, 0, read);
                    }
                    out.closeEntry();
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            out.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFLATED;
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class PrintWriter {

PrintWriter(PrintStream o0, boolean o1){}
	PrintWriter(){}
	public MyHelperClass println(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass setMethod(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintStream {

}
