
import java.io.UncheckedIOException;


class c1577151 {

    public static void copyFile(final String src, final String dest) {
        Runnable r1 = new Runnable() {

            public void run() {
                try {
                    File inf = new File(dest);
                    if (!(Boolean)(Object)inf.exists()) {
                        inf.getParentFile().mkdirs();
                    }
                    FileChannel in =(FileChannel)(Object) (new FileInputStream(src).getChannel());
                    FileChannel out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
                    out.transferFrom(in, 0, in.size());
                    in.close();
                    out.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                    System.err.println("Error copying file \n" + src + "\n" + dest);
                }
            }
        };
        Thread cFile = new Thread(r1, "copyFile");
        cFile.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
