
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7087624 {

    public static void copyFiles(String strPath, String trgPath) {
        File src = new File(strPath);
        File trg = new File(trgPath);
        if ((boolean)(Object)src.isDirectory()) {
            if ((boolean)(Object)trg.exists() != true) trg.mkdirs();
            String list[] =(String[])(Object) src.list();
            for (int i = 0; i < list.length; i++) {
                MyHelperClass SEPARATOR = new MyHelperClass();
                String strPath_1 =(int)(Object) src.getAbsolutePath() + (int)(Object)SEPARATOR + list[i];
//                MyHelperClass SEPARATOR = new MyHelperClass();
                String trgPath_1 =(int)(Object) trg.getAbsolutePath() + (int)(Object)SEPARATOR + list[i];
                copyFiles(strPath_1, trgPath_1);
            }
        } else {
            try {
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(strPath).getChannel());
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(trgPath).getChannel());
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            } catch (UncheckedIOException e) {
                System.out.println("[Error] File not found: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("[Error] " + e.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

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

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
