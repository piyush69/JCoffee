
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7524607 {
public MyHelperClass Logger;

    private void copyFile(String file) {
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            Date dt = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd HHmmss ");
            File in = new File(file);
            String[] name = file.split("\\\\");
            File out = new File(".\\xml_archiv\\" + df.format(dt) + name[name.length - 1]);
            inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
            outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (UncheckedIOException e) {
            System.err.println("Copy error!");
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (inChannel != null) {
                try {
                    inChannel.close();
                } catch (UncheckedIOException ex) {
                    MyHelperClass Level = new MyHelperClass();
                    Logger.getLogger(ImportIntoDb.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                }
            }
            if (outChannel != null) {
                try {
                    outChannel.close();
                } catch (UncheckedIOException ex) {
                    MyHelperClass Level = new MyHelperClass();
                    Logger.getLogger(ImportIntoDb.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class Date {

}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ImportIntoDb {

}
