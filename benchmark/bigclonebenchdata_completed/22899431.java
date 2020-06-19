import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c22899431 {
public MyHelperClass FileUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass DATABASE_FILE_END;
	public MyHelperClass getDatabase(){ return null; }

    public void restoreBackup(File backupFile, File destDir, boolean replaceExistingFile) throws BackupException, FileAlreadyExistsException {
        try {
            File databaseEncryptionFile = new File(destDir.getPath() + File.separator + getDatabase() + DATABASE_FILE_END);
            if (databaseEncryptionFile.exists() == true && replaceExistingFile == false) {
                throw new FileAlreadyExistsException("File " + databaseEncryptionFile.getName() + "already exists");
            }
            IOUtils.copy(FileUtils.openInputStream(backupFile), FileUtils.openOutputStream(databaseEncryptionFile));
        } catch (UncheckedIOException e) {
            throw new BackupException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new BackupException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass openInputStream(File o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }}

class BackupException extends Exception{
	public BackupException(String errorMessage) { super(errorMessage); }
}

class FileAlreadyExistsException extends Exception{
	public FileAlreadyExistsException(String errorMessage) { super(errorMessage); }
}
