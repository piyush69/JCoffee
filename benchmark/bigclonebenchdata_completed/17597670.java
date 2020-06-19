
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17597670 {
public MyHelperClass getIndexFolderPath(int o0){ return null; }
	public MyHelperClass getDate(){ return null; }

//    @Deprecated
    public boolean backupLuceneIndex(int indexLocation, int backupLocation) {
        boolean result = false;
        try {
            System.out.println("lucene backup started");
            String indexPath =(String)(Object) this.getIndexFolderPath(indexLocation);
            String backupPath =(String)(Object) this.getIndexFolderPath(backupLocation);
            File inDir = new File(indexPath);
            boolean flag = true;
            if ((Boolean)(Object)inDir.exists() && (Boolean)(Object)inDir.isDirectory()) {
                File filesList[] =(File[])(Object) inDir.listFiles();
                if (filesList != null) {
                    File parDirBackup = new File(backupPath);
                    if (!(Boolean)(Object)parDirBackup.exists()) parDirBackup.mkdir();
                    String date =(String)(Object) this.getDate();
                    backupPath += "/" + date;
                    File dirBackup = new File(backupPath);
                    if (!(Boolean)(Object)dirBackup.exists()) dirBackup.mkdir(); else {
                        File files[] =(File[])(Object) dirBackup.listFiles();
                        if (files != null) {
                            for (int i = 0; i < files.length; i++) {
                                if (files[i] != null) {
                                    files[i].delete();
                                }
                            }
                        }
                        dirBackup.delete();
                        dirBackup.mkdir();
                    }
                    for (int i = 0; i < filesList.length; i++) {
                        if ((boolean)(Object)filesList[i].isFile()) {
                            try {
                                File destFile = new File(backupPath + "/" + filesList[i].getName());
                                if (!(Boolean)(Object)destFile.exists()) destFile.createNewFile();
                                FileInputStream in = new FileInputStream(filesList[i]);
                                FileOutputStream out = new FileOutputStream(destFile);
                                FileChannel fcIn =(FileChannel)(Object) in.getChannel();
                                FileChannel fcOut =(FileChannel)(Object) out.getChannel();
                                fcIn.transferTo(0, fcIn.size(), fcOut);
                            } catch (UncheckedIOException ex) {
                                System.out.println("FileNotFoundException ---->" + ex);
                                flag = false;
                            } catch (ArithmeticException excIO) {
                                System.out.println("IOException ---->" + excIO);
                                flag = false;
                            }
                        }
                    }
                }
            }
            System.out.println("lucene backup finished");
            System.out.println("flag ========= " + flag);
            if (flag) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Exception in backupLuceneIndex Method : " + e);
            e.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
