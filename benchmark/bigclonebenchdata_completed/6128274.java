import java.io.*;
import java.lang.*;
import java.util.*;



class c6128274 {
public MyHelperClass cacheLog;

    private void compress(File target, Set<File> files) throws CacheOperationException, ConfigurationException {
        ZipOutputStream zipOutput = null;
        try {
            zipOutput = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(target)));
            for (File file : files) {
                BufferedInputStream fileInput = null;
                MyHelperClass cacheFolder = new MyHelperClass();
                File cachePathName = new File((String)(Object)cacheFolder, file.getPath());
                try {
                    if (!cachePathName.exists()) {
                        MyHelperClass account = new MyHelperClass();
                        throw new CacheOperationException("Expected to add file ''{0}'' to export archive ''{1}'' (Account : {2}) but it " + "has gone missing (cause unknown). This can indicate implementation or deployment " + "error. Aborting export operation as a safety precaution.", cachePathName.getPath(), target.getAbsolutePath(), account.getOid());
                    }
                    fileInput = new BufferedInputStream(new FileInputStream(cachePathName));
                    ZipEntry entry = new ZipEntry(file.getPath());
                    entry.setSize(cachePathName.length());
                    entry.setTime(cachePathName.lastModified());
                    zipOutput.putNextEntry(entry);
                    MyHelperClass cacheLog = new MyHelperClass();
                    cacheLog.debug("Added new export zip entry ''{0}''.", file.getPath());
                    int count, total = 0;
                    int buffer = 2048;
                    byte[] data = new byte[buffer];
                    while ((count = fileInput.read(data, 0, buffer)) != -1) {
                        zipOutput.write(data, 0, count);
                        total += count;
                    }
                    zipOutput.flush();
                    if (total != cachePathName.length()) {
                        MyHelperClass account = new MyHelperClass();
                        throw new CacheOperationException("Only wrote {0} out of {1} bytes when archiving file ''{2}'' (Account : {3}). " + "This could have occured either due implementation error or file I/O error. " + "Aborting archive operation to prevent a potentially corrupt export archive to " + "be created.", total, cachePathName.length(), cachePathName.getPath(), account.getOid());
                    } else {
//                        MyHelperClass cacheLog = new MyHelperClass();
                        cacheLog.debug("Wrote {0} out of {1} bytes to zip entry ''{2}''", total, cachePathName.length(), file.getPath());
                    }
                } catch (SecurityException e) {
                    MyHelperClass account = new MyHelperClass();
                    throw new ConfigurationException("Security manager has denied r/w access when attempting to read file ''{0}'' and " + "write it to archive ''{1}'' (Account : {2}) : {3}", e, cachePathName.getPath(), target, account.getOid(), e.getMessage());
                } catch (IllegalArgumentException e) {
                    MyHelperClass account = new MyHelperClass();
                    throw new CacheOperationException("Error creating ZIP archive for account ID = {0} : {1}", e, account.getOid(), e.getMessage());
                } catch (FileNotFoundException e) {
                    MyHelperClass account = new MyHelperClass();
                    throw new CacheOperationException("Attempted to include file ''{0}'' in export archive but it has gone missing " + "(Account : {1}). Possible implementation error in local file cache. Aborting  " + "export operation as a precaution ({2})", e, cachePathName.getPath(), account.getOid(), e.getMessage());
                } catch (UncheckedIOException e) {
                    MyHelperClass account = new MyHelperClass();
                    throw new CacheOperationException("Error writing export archive for account ID = {0} : {1}",(IllegalArgumentException)(Object) e, account.getOid(), e.getMessage());
                } catch (IOException e) {
                    MyHelperClass account = new MyHelperClass();
                    throw new CacheOperationException("I/O error while creating export archive for account ID = {0}. " + "Operation aborted ({1})", e, account.getOid(), e.getMessage());
                } finally {
                    if (zipOutput != null) {
                        try {
                            zipOutput.closeEntry();
                        } catch (Throwable t) {
                            MyHelperClass account = new MyHelperClass();
                            cacheLog.warn("Unable to close zip entry for file ''{0}'' in export archive ''{1}'' " + "(Account : {2}) : {3}.", t, file.getPath(), target.getAbsolutePath(), account.getOid(), t.getMessage());
                        }
                    }
                    if (fileInput != null) {
                        try {
                            fileInput.close();
                        } catch (Throwable t) {
                            MyHelperClass account = new MyHelperClass();
                            cacheLog.warn("Failed to close input stream from file ''{0}'' being added " + "to export archive (Account : {1}) : {2}", t, cachePathName.getPath(), account.getOid(), t.getMessage());
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            MyHelperClass account = new MyHelperClass();
            throw new CacheOperationException("Unable to create target export archive ''{0}'' for account {1) : {2}", e, target, account.getOid(), e.getMessage());
        } finally {
            try {
                if (zipOutput != null) {
                    zipOutput.close();
                }
            } catch (Throwable t) {
                MyHelperClass cacheLog = new MyHelperClass();
                cacheLog.warn("Failed to close the stream to export archive ''{0}'' : {1}.", t, target, t.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0, int o1, long o2, String o3){ return null; }
	public MyHelperClass debug(String o0, String o1){ return null; }
	public MyHelperClass warn(String o0, Throwable o1, String o2, MyHelperClass o3, String o4){ return null; }
	public MyHelperClass warn(String o0, Throwable o1, File o2, String o3){ return null; }
	public MyHelperClass warn(String o0, Throwable o1, String o2, String o3, MyHelperClass o4, String o5){ return null; }
	public MyHelperClass getOid(){ return null; }}

class CacheOperationException extends Exception{
	public CacheOperationException(String errorMessage) { super(errorMessage); }
	CacheOperationException(String o0, IllegalArgumentException o1, MyHelperClass o2, String o3){}
	CacheOperationException(String o0, FileNotFoundException o1, String o2, MyHelperClass o3, String o4){}
	CacheOperationException(String o0, ZipException o1, MyHelperClass o2, String o3){}
	CacheOperationException(String o0, FileNotFoundException o1, File o2, MyHelperClass o3, String o4){}
	CacheOperationException(String o0, IOException o1, MyHelperClass o2, String o3){}
	CacheOperationException(String o0, String o1, String o2, MyHelperClass o3){}
	CacheOperationException(){}
	CacheOperationException(String o0, int o1, long o2, String o3, MyHelperClass o4){}
}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
	ConfigurationException(){}
	ConfigurationException(String o0, SecurityException o1, String o2, File o3, MyHelperClass o4, String o5){}
}

class ZipOutputStream {

ZipOutputStream(BufferedOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(){}
	ZipEntry(String o0){}
	public MyHelperClass setTime(long o0){ return null; }
	public MyHelperClass setSize(long o0){ return null; }}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}
