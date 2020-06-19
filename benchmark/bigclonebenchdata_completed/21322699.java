
import java.io.UncheckedIOException;


class c21322699 {
public MyHelperClass logger;
	public MyHelperClass FileUtils;

    public void zipUp() throws PersistenceException {
        ZipOutputStream out = null;
        try {
            MyHelperClass backup = new MyHelperClass();
            if (!(Boolean)(Object)backup.exists()) backup.createNewFile();
//            MyHelperClass backup = new MyHelperClass();
            out = new ZipOutputStream(new FileOutputStream(backup));
            MyHelperClass Deflater = new MyHelperClass();
            out.setLevel(Deflater.DEFAULT_COMPRESSION);
            MyHelperClass backupDirectory = new MyHelperClass();
            for (String file :(String[])(Object) (Object[])(Object)backupDirectory.list()) {
                MyHelperClass logger = new MyHelperClass();
                logger.debug("Deflating: " + file);
                FileInputStream in = null;
                try {
//                    MyHelperClass backupDirectory = new MyHelperClass();
                    in = new FileInputStream(new File(backupDirectory, file));
                    out.putNextEntry(new ZipEntry(file));
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                } finally {
                    out.closeEntry();
                    if (null != in) in.close();
                }
            }
//            MyHelperClass backupDirectory = new MyHelperClass();
            FileUtils.deleteDirectory(backupDirectory);
        } catch (Exception ex) {
            MyHelperClass backupDirectory = new MyHelperClass();
            logger.error("Unable to ZIP the backup {" + backupDirectory.getAbsolutePath() + "}.",(IOException)(Object) ex);
            throw new PersistenceException((String)(Object)ex);
        } finally {
            try {
                if (null != out) out.close();
            } catch (UncheckedIOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Unable to close ZIP output stream.",(IOException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_COMPRESSION;
public MyHelperClass list(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass deleteDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass copy(FileInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
