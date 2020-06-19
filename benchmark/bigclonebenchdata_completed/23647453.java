


class c23647453 {
public MyHelperClass monitor;
	public MyHelperClass oConstants;
	public MyHelperClass getUserAdvisor(){ return null; }

    private void createArchive(String iDatabaseDir, String iArchiveName) throws DbBackupException {
        try {
            File archiveFile = new File(iArchiveName);
            MyHelperClass parameters = new MyHelperClass();
            String force = (String)(String)(Object) parameters.get("force");
            if (force == null && (boolean)(Object)archiveFile.exists()) {
                char response =(char)(Object) getUserAdvisor().askToUser((PrintStream)(Object)System.out, "    Archive already exist, overwrite ?", "#Yes,#No");
                if (response != 'y' && response != 'Y') {
                    System.out.println();
                    throw new DbBackupException("Backup aborted by user.");
                }
                System.out.print("    Overwriting...");
            }
            ZipOutputStream archive = new ZipOutputStream(new FileOutputStream(archiveFile));
            archive.setComment("Orient ODBMS backup archive \r\n" + "Created with odbbackup tool version " + oConstants.PRODUCT_VERSION + ".\r\n" + oConstants.PRODUCT_COPYRIGHTS + "\r\n\r\n" + "WARNING: MODIFING THIS ARCHIVE THE DATABASE CAN BE INCONSISTENT !!!");
            String[] files =(String[])(Object) (new File(iDatabaseDir).list());
            String filePath;
            File inFile;
            FileInputStream inStream;
            byte[] buffer;
            for (int i = 0; i < files.length; ++i) {
                filePath = files[i];
                inFile = new File(iDatabaseDir + "/" + filePath);
                inStream = new FileInputStream(iDatabaseDir + "/" + filePath);
                buffer = new byte[(int)(int)(Object) inFile.length()];
                inStream.read(buffer);
                if (monitor != null) monitor.notifyStatus("Archiving segment: " + filePath, i * 100 / files.length);
                archive.putNextEntry(new ZipEntry(filePath));
                archive.write(buffer);
            }
            archive.close();
        } catch (Exception e) {
            throw new DbBackupException("ERROR! Cannot backup the database.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PRODUCT_VERSION;
	public MyHelperClass PRODUCT_COPYRIGHTS;
public MyHelperClass askToUser(PrintStream o0, String o1, String o2){ return null; }
	public MyHelperClass notifyStatus(String o0, int o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class DbBackupException extends Exception{
	public DbBackupException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass list(){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setComment(String o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class PrintStream {

}
