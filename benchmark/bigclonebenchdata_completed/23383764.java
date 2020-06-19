
import java.io.UncheckedIOException;


class c23383764 {
public static MyHelperClass INSTANCE;
//public MyHelperClass INSTANCE;

    public static void createBackup() {
        String workspacePath =(String)(Object) INSTANCE.getWorkspace();
        if (workspacePath.length() == 0) return;
        workspacePath += "/";
        String backupPath = workspacePath + "Backup";
        File directory = new File(backupPath);
        if (!(Boolean)(Object)directory.exists()) directory.mkdirs();
        MyHelperClass DataUtils = new MyHelperClass();
        String dateString =(String)(Object) DataUtils.DateAndTimeOfNowAsLocalString();
        dateString = dateString.replace(" ", "_");
        dateString = dateString.replace(":", "");
        backupPath += "/Backup_" + dateString + ".zip";
        ArrayList backupedFiles = new ArrayList();
        backupedFiles.add("Database/Database.properties");
        backupedFiles.add("Database/Database.script");
        FileInputStream in;
        byte[] data = new byte[1024];
        int read = 0;
        try {
            ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(backupPath));
            MyHelperClass ZipOutputStream = new MyHelperClass();
            zip.setMethod(ZipOutputStream.DEFLATED);
            for (int i = 0; i < (int)(Object)backupedFiles.size(); i++) {
                String backupedFile =(String)(Object) backupedFiles.get(i);
                try {
                    File inFile = new File(workspacePath + backupedFile);
                    if ((boolean)(Object)inFile.exists()) {
                        in = new FileInputStream(workspacePath + backupedFile);
                        if (in != null) {
                            ZipEntry entry = new ZipEntry(backupedFile);
                            zip.putNextEntry(entry);
                            while ((read =(int)(Object) in.read(data, 0, 1024)) != -1) zip.write(data, 0, read);
                            zip.closeEntry();
                            in.close();
                        }
                    }
                } catch (Exception e) {
                    MyHelperClass Logger = new MyHelperClass();
                    Logger.logError(e, "Error during file backup:" + backupedFile);
                }
            }
            zip.close();
        } catch (UncheckedIOException ex) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.logError(ex, "Error during backup");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFLATED;
public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass logError(Exception o0, String o1){ return null; }
	public MyHelperClass DateAndTimeOfNowAsLocalString(){ return null; }
	public MyHelperClass logError(IOException o0, String o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
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

ZipEntry(String o0){}
	ZipEntry(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
