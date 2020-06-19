import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20059162 {
public MyHelperClass log;
	public MyHelperClass TAR;

    public boolean excuteBackup(String backupOrginlDrctry, String targetFileNm, String archiveFormat) throws Throwable, JobExecutionException {
        File targetFile = new File(targetFileNm);
        File srcFile = new File(backupOrginlDrctry);
        if (!srcFile.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.error("백업원본디렉토리[" + srcFile.getAbsolutePath() + "]가 존재하지 않습니다.");
            throw new JobExecutionException("백업원본디렉토리[" + srcFile.getAbsolutePath() + "]가 존재하지 않습니다.");
        }
        if (srcFile.isFile()) {
            MyHelperClass log = new MyHelperClass();
            log.error("백업원본디렉토리[" + srcFile.getAbsolutePath() + "]가 파일입니다. 디렉토리명을 지정해야 합니다. ");
            throw new JobExecutionException("백업원본디렉토리[" + srcFile.getAbsolutePath() + "]가 파일입니다. 디렉토리명을 지정해야 합니다. ");
        }
        boolean result = false;
        FileInputStream finput = null;
        FileOutputStream fosOutput = null;
        ArchiveOutputStream aosOutput = null;
        ArchiveEntry entry = null;
        try {
            MyHelperClass Charset = new MyHelperClass();
            log.debug("charter set : "(Exception)(Object) + Charset.defaultCharset().name());
            fosOutput = new FileOutputStream(targetFile);
            aosOutput = (ArchiveOutputStream)(Object)new ArchiveStreamFactory().createArchiveOutputStream(archiveFormat, fosOutput);
            if (TAR.equals(archiveFormat)) {
                MyHelperClass TarArchiveOutputStream = new MyHelperClass();
                ((TarArchiveOutputStream)(TarArchiveOutputStream)(Object) aosOutput).setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
            }
            File[] fileArr = srcFile.listFiles();
            MyHelperClass EgovFileTool = new MyHelperClass();
            ArrayList list =(ArrayList)(Object) EgovFileTool.getSubFilesByAll(fileArr);
            for (int i = 0; i < list.size(); i++) {
                File sfile = new File((String) list.get(i));
                finput = new FileInputStream(sfile);
                if (TAR.equals(archiveFormat)) {
//                    MyHelperClass Charset = new MyHelperClass();
                    entry =(ArchiveEntry)(Object) new TarArchiveEntry(sfile, new String(sfile.getAbsolutePath().getBytes((String)(Object)Charset.defaultCharset().name()), "8859_1"));
                    ((TarArchiveEntry)(TarArchiveEntry)(Object) entry).setSize(sfile.length());
                } else {
                    entry =(ArchiveEntry)(Object) new ZipArchiveEntry(sfile.getAbsolutePath());
                    ((ZipArchiveEntry)(ZipArchiveEntry)(Object) entry).setSize(sfile.length());
                }
                aosOutput.putArchiveEntry(entry);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(finput, aosOutput);
                aosOutput.closeArchiveEntry();
                finput.close();
                result = true;
            }
            aosOutput.close();
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("백업화일생성중 에러가 발생했습니다. 에러 : " + e.getMessage());
//            MyHelperClass log = new MyHelperClass();
            log.debug(e);
            result = false;
            throw new JobExecutionException("백업화일생성중 에러가 발생했습니다.", e);
        } finally {
            try {
                if (finput != null) finput.close();
            } catch (Exception e2) {
                MyHelperClass log = new MyHelperClass();
                log.error("IGNORE:", e2);
            }
            try {
                if (aosOutput != null) aosOutput.close();
            } catch (Exception e2) {
                MyHelperClass log = new MyHelperClass();
                log.error("IGNORE:", e2);
            }
            try {
                if (fosOutput != null) fosOutput.close();
            } catch (Exception e2) {
                MyHelperClass log = new MyHelperClass();
                log.error("IGNORE:", e2);
            }
            try {
                if (result == false) targetFile.delete();
            } catch (Exception e2) {
                MyHelperClass log = new MyHelperClass();
                log.error("IGNORE:", e2);
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LONGFILE_GNU;
public MyHelperClass name(){ return null; }
	public MyHelperClass getSubFilesByAll(File[] o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, ArchiveOutputStream o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(Exception o0){ return null; }
	public MyHelperClass defaultCharset(){ return null; }}

class JobExecutionException extends Exception{
	public JobExecutionException(String errorMessage) { super(errorMessage); }
	JobExecutionException(String o0, Exception o1){}
	JobExecutionException(){}
}

class ArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass putArchiveEntry(ArchiveEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ArchiveEntry {

}

class ArchiveStreamFactory {

public MyHelperClass createArchiveOutputStream(String o0, FileOutputStream o1){ return null; }}

class TarArchiveEntry {

TarArchiveEntry(File o0, String o1){}
	TarArchiveEntry(){}
	public MyHelperClass setSize(long o0){ return null; }}

class ZipArchiveEntry {

ZipArchiveEntry(String o0){}
	ZipArchiveEntry(){}
	public MyHelperClass setSize(long o0){ return null; }}

class TarArchiveOutputStream {

public MyHelperClass setLongFileMode(MyHelperClass o0){ return null; }}
