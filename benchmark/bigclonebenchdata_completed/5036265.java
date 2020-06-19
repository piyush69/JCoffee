import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5036265 {
public MyHelperClass hasFile(MyHelperClass o0){ return null; }
	public MyHelperClass removeFile(MyHelperClass o0){ return null; }
public MyHelperClass CONTENT_FILE;
	public MyHelperClass zFile;
	public MyHelperClass addedFileSet;
	public MyHelperClass PROPERTY_FILE;
	public MyHelperClass tmpDir;
	public MyHelperClass IOUtils;
	public MyHelperClass dirty;
	public MyHelperClass xstream;
	public MyHelperClass removedFileSet;
	public MyHelperClass FileUtil;
	public MyHelperClass log;
	public MyHelperClass file;
	public MyHelperClass getFileAsInputStream(String o0){ return null; }
	public MyHelperClass getPropertyMap(){ return null; }

    public void save() throws Throwable, IOException {
        CodeTimer saveTimer;
        MyHelperClass dirty = new MyHelperClass();
        if (!(Boolean)(Object)dirty) {
            return;
        }
        saveTimer = new CodeTimer("PackedFile.save");
        MyHelperClass log = new MyHelperClass();
        saveTimer.setEnabled(log.isDebugEnabled());
        MyHelperClass tmpDir = new MyHelperClass();
        File newFile = new File(tmpDir.getAbsolutePath() + "/" + new GUID() + ".pak");
        ZipOutputStream zout = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(newFile)));
        zout.setLevel(1);
        try {
            saveTimer.start("contentFile");
            MyHelperClass CONTENT_FILE = new MyHelperClass();
            if ((boolean)(Object)hasFile(CONTENT_FILE)) {
//                MyHelperClass CONTENT_FILE = new MyHelperClass();
                zout.putNextEntry(new ZipEntry(CONTENT_FILE));
//                MyHelperClass CONTENT_FILE = new MyHelperClass();
                InputStream is =(InputStream)(Object) getFileAsInputStream((String)(Object)CONTENT_FILE);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, zout);
                zout.closeEntry();
            }
            saveTimer.stop("contentFile");
            saveTimer.start("propertyFile");
            if ((boolean)(Object)getPropertyMap().isEmpty()) {
                removeFile(PROPERTY_FILE);
            } else {
                zout.putNextEntry(new ZipEntry(PROPERTY_FILE));
                xstream.toXML(getPropertyMap(), zout);
                zout.closeEntry();
            }
            saveTimer.stop("propertyFile");
            saveTimer.start("addFiles");
            addedFileSet.remove(CONTENT_FILE);
            for (String path :(String[])(Object) (Object[])(Object)addedFileSet) {
                zout.putNextEntry(new ZipEntry(path));
                InputStream is =(InputStream)(Object) getFileAsInputStream(path);
                IOUtils.copy(is, zout);
                zout.closeEntry();
            }
            saveTimer.stop("addFiles");
            saveTimer.start("copyFiles");
            if ((boolean)(Object)file.exists()) {
                Enumeration<? extends ZipEntry> entries =(ZipEntry>)(Object) zFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry entry = entries.nextElement();
                    if (!(Boolean)(Object)entry.isDirectory() && !addedFileSet.contains(entry.getName()) && !removedFileSet.contains(entry.getName()) && !CONTENT_FILE.equals(entry.getName()) && !PROPERTY_FILE.equals(entry.getName())) {
                        zout.putNextEntry(entry);
                        InputStream is = getFileAsInputStream((String)(Object)entry.getName());
                        IOUtils.copy(is, zout);
                        zout.closeEntry();
                    } else if ((boolean)(Object)entry.isDirectory()) {
                        zout.putNextEntry(entry);
                        zout.closeEntry();
                    }
                }
            }
            try {
                if (zFile != null) zFile.close();
            } catch (IOException e) {
            }
            zFile = null;
            saveTimer.stop("copyFiles");
            saveTimer.start("close");
            zout.close();
            zout = null;
            saveTimer.stop("close");
            saveTimer.start("backup");
            File backupFile = new File(tmpDir.getAbsolutePath() + "/" + new GUID() + ".mv");
            if ((boolean)(Object)file.exists()) {
                backupFile.delete();
                if (!(Boolean)(Object)file.renameTo(backupFile)) {
                    FileUtil.copyFile(file, backupFile);
                    file.delete();
                }
            }
            saveTimer.stop("backup");
            saveTimer.start("finalize");
            if (!newFile.renameTo((File)(Object)file)) FileUtil.copyFile((MyHelperClass)(Object)newFile, file);
            if (backupFile.exists()) backupFile.delete();
            saveTimer.stop("finalize");
            dirty =(MyHelperClass)(Object) false;
        } finally {
            saveTimer.start("cleanup");
            try {
                if (zFile != null) zFile.close();
            } catch (IOException e) {
            }
            if (newFile.exists()) newFile.delete();
            try {
                if (zout != null) zout.close();
            } catch (IOException e) {
            }
            saveTimer.stop("cleanup");
            if ((boolean)(Object)log.isDebugEnabled()) log.debug(saveTimer);
            saveTimer = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass toXML(MyHelperClass o0, ZipOutputStream o1){ return null; }
	public MyHelperClass entries(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass debug(CodeTimer o0){ return null; }
	public MyHelperClass copyFile(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass remove(MyHelperClass o0){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass close(){ return null; }}

class CodeTimer {

CodeTimer(){}
	CodeTimer(String o0){}
	public MyHelperClass start(String o0){ return null; }
	public MyHelperClass setEnabled(MyHelperClass o0){ return null; }
	public MyHelperClass stop(String o0){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLevel(int o0){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}
	ZipEntry(String o0){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class GUID {

}
