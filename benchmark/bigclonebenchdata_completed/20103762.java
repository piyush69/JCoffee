
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20103762 {
public MyHelperClass DateFormatUtils;
	public MyHelperClass logger;

    public boolean backupLastAuditSchema(File lastAuditSchema) {
        boolean isBkupFileOK = false;
        MyHelperClass configFile = new MyHelperClass();
        String writeTimestamp =(String)(Object) DateFormatUtils.format((Date)(Object)new java.util.Date(), configFile.getTimestampPattern());
//        MyHelperClass configFile = new MyHelperClass();
        File target = new File((int)(Object)configFile.getAuditSchemaFileDir() + (int)(Object)File.separator + (int)(Object)configFile.getAuditSchemaFileName() + ".bkup_" + writeTimestamp);
        FileChannel sourceChannel = null;
        FileChannel targetChannel = null;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(lastAuditSchema).getChannel());
            targetChannel =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            targetChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "IO exception occurred while copying file",(IOException)(Object) e);
        } finally {
            if ((target != null) && (boolean)(Object)(target.exists()) && ((int)(Object)target.length() > 0)) {
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
                MyHelperClass logger = new MyHelperClass();
                logger.info("closing channels failed");
            }
        }
        return isBkupFileOK;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass format(Date o0, MyHelperClass o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getAuditSchemaFileName(){ return null; }
	public MyHelperClass getAuditSchemaFileDir(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass getTimestampPattern(){ return null; }}

class File {
public static MyHelperClass separator;
File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }}

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

class Date {

}
