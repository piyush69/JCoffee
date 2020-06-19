
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18935118 {
public MyHelperClass logger;

    public boolean backupFile(File oldFile, File newFile) {
        boolean isBkupFileOK = false;
        FileChannel sourceChannel = null;
        FileChannel targetChannel = null;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(oldFile).getChannel());
            targetChannel =(FileChannel)(Object) (new FileOutputStream(newFile).getChannel());
            targetChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "IO exception occurred while copying config file",(IOException)(Object) e);
        } finally {
            if ((newFile != null) && (boolean)(Object)(newFile.exists()) && ((int)(Object)newFile.length() > 0)) {
                isBkupFileOK = true;
            }
            try {
                if (sourceChannel != null) {
                    sourceChannel.close();
                }
                if (targetChannel != null) {
                    targetChannel.close();
                }
            } catch (UncheckedIOException e) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.INFO, "closing channels failed");
            }
        }
        return isBkupFileOK;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass INFO;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class File {

public MyHelperClass length(){ return null; }
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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
