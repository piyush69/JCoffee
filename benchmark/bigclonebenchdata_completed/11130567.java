


class c11130567 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static boolean copyFile(File sourceFile, File destFile) throws IOException {
        long flag = 0;
        if (!(Boolean)(Object)destFile.exists()) destFile.createNewFile();
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            destination =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            flag =(long)(Object) destination.transferFrom(source, 0, source.size());
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(FileUtils.class.getPackage().getName()).log(Level.WARNING, "ERROR: Problem copying file", e);
        } finally {
            if (source != null) source.close();
            if (destination != null) destination.close();
        }
        if (flag == 0) return false; else return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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

class FileUtils {

}
