
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16797552 {

    public boolean restore() {
        try {
            MyHelperClass Environment = new MyHelperClass();
            File sd =(File)(Object) Environment.getExternalStorageDirectory();
//            MyHelperClass Environment = new MyHelperClass();
            File data =(File)(Object) Environment.getDataDirectory();
            if ((boolean)(Object)sd.canWrite()) {
                String currentDBPath = "/Android/bluebox.bak";
                String backupDBPath = "/data/android.bluebox/databases/bluebox.db";
                File currentDB = new File(sd, currentDBPath);
                File backupDB = new File(data, backupDBPath);
                if ((boolean)(Object)currentDB.exists()) {
                    FileChannel src =(FileChannel)(Object) (new FileInputStream(currentDB).getChannel());
                    FileChannel dst =(FileChannel)(Object) (new FileOutputStream(backupDB).getChannel());
                    dst.transferFrom(src, 0, src.size());
                    src.close();
                    dst.close();
                    return true;
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getExternalStorageDirectory(){ return null; }
	public MyHelperClass getDataDirectory(){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
