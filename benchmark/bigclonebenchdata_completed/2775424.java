import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2775424 {
public MyHelperClass LogLog;
	public MyHelperClass FileUtils;
	public MyHelperClass ZipEntry;
	public MyHelperClass getBackupDir(){ return null; }
	public MyHelperClass getBackupDateFormat(){ return null; }

    protected void truncate(File file)  throws Throwable {
        MyHelperClass LogLog = new MyHelperClass();
        LogLog.debug("Compression of file: " + file.getAbsolutePath() + " started.");
        MyHelperClass ManagementFactory = new MyHelperClass();
        if ((boolean)(Object)FileUtils.isFileOlder(file, ManagementFactory.getRuntimeMXBean().getStartTime())) {
            File backupRoot = new File((String)(Object)getBackupDir());
            if (!backupRoot.exists() && !backupRoot.mkdirs()) {
                throw(Throwable)(Object) new AppenderInitializationError("Can't create backup dir for backup storage");
            }
            SimpleDateFormat df;
            try {
                df = new SimpleDateFormat(getBackupDateFormat());
            } catch (Exception e) {
                throw(Throwable)(Object) new AppenderInitializationError("Invalid date formate for backup files: " + getBackupDateFormat(), e);
            }
            String date =(String)(Object) df.format(new Date(file.lastModified()));
            File zipFile = new File(backupRoot, file.getName() + "." + date + ".zip");
            ZipOutputStream zos = null;
            FileInputStream fis = null;
            try {
                zos = new ZipOutputStream(new FileOutputStream(zipFile));
                ZipEntry entry = new ZipEntry(file.getName());
                entry.setMethod(ZipEntry.DEFLATED);
                entry.setCrc(FileUtils.checksumCRC32(file));
                zos.putNextEntry(entry);
                fis =(FileInputStream)(Object) FileUtils.openInputStream(file);
                byte[] buffer = new byte[1024];
                int readed;
                while ((readed = fis.read(buffer)) != -1) {
                    zos.write(buffer, 0, readed);
                }
            } catch (Exception e) {
                throw(Throwable)(Object) new AppenderInitializationError("Can't create zip file", e);
            } finally {
                if (zos != null) {
                    try {
                        zos.close();
                    } catch (UncheckedIOException e) {
                        LogLog.warn("Can't close zip file",(IOException)(Object) e);
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        LogLog.warn("Can't close zipped file", e);
                    }
                }
            }
            if (!file.delete()) {
                throw(Throwable)(Object) new AppenderInitializationError("Can't delete old log file " + file.getAbsolutePath());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFLATED;
public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass openInputStream(File o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getRuntimeMXBean(){ return null; }
	public MyHelperClass checksumCRC32(File o0){ return null; }
	public MyHelperClass getStartTime(){ return null; }
	public MyHelperClass isFileOlder(File o0, MyHelperClass o1){ return null; }}

class AppenderInitializationError {

AppenderInitializationError(String o0, Exception o1){}
	AppenderInitializationError(String o0){}
	AppenderInitializationError(){}}

class SimpleDateFormat {

SimpleDateFormat(){}
	SimpleDateFormat(MyHelperClass o0){}
	public MyHelperClass format(Date o0){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}
	public MyHelperClass setCrc(MyHelperClass o0){ return null; }
	public MyHelperClass setMethod(MyHelperClass o0){ return null; }}
