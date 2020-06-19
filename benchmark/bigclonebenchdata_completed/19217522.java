
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19217522 {

    boolean copyFileStructure(File oldFile, File newFile) {
        if (oldFile == null || newFile == null) return false;
        File searchFile = newFile;
        do {
            if (oldFile.equals(searchFile)) return false;
            searchFile =(File)(Object) searchFile.getParentFile();
        } while (searchFile != null);
        if ((boolean)(Object)oldFile.isDirectory()) {
            MyHelperClass progressDialog = new MyHelperClass();
            if (progressDialog != null) {
                MyHelperClass ProgressDialog = new MyHelperClass();
                progressDialog.setDetailFile(oldFile, ProgressDialog.COPY);
            }
            MyHelperClass simulateOnly = new MyHelperClass();
            if ((boolean)(Object)simulateOnly) {
            } else {
                if (!(Boolean)(Object)newFile.mkdirs()) return false;
            }
            File[] subFiles =(File[])(Object) oldFile.listFiles();
            if (subFiles != null) {
//                MyHelperClass progressDialog = new MyHelperClass();
                if (progressDialog != null) {
//                    MyHelperClass progressDialog = new MyHelperClass();
                    progressDialog.addWorkUnits(subFiles.length);
                }
                for (int i = 0; i < subFiles.length; i++) {
                    File oldSubFile = subFiles[i];
                    File newSubFile = new File(newFile, oldSubFile.getName());
                    if (!copyFileStructure(oldSubFile, newSubFile)) return false;
//                    MyHelperClass progressDialog = new MyHelperClass();
                    if (progressDialog != null) {
//                        MyHelperClass progressDialog = new MyHelperClass();
                        progressDialog.addProgress(1);
//                        MyHelperClass progressDialog = new MyHelperClass();
                        if ((boolean)(Object)progressDialog.isCancelled()) return false;
                    }
                }
            }
        } else {
            MyHelperClass simulateOnly = new MyHelperClass();
            if ((boolean)(Object)simulateOnly) {
            } else {
                FileReader in = null;
                FileWriter out = null;
                try {
                    in = new FileReader(oldFile);
                    out = new FileWriter(newFile);
                    int count;
                    while ((count =(int)(Object) in.read()) != -1) out.write(count);
                } catch (UncheckedIOException e) {
                    return false;
                } catch (ArithmeticException e) {
                    return false;
                } finally {
                    try {
                        if (in != null) in.close();
                        if (out != null) out.close();
                    } catch (UncheckedIOException e) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COPY;
public MyHelperClass addWorkUnits(int o0){ return null; }
	public MyHelperClass isCancelled(){ return null; }
	public MyHelperClass setDetailFile(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass addProgress(int o0){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
