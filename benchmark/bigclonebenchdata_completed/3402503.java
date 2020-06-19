
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3402503 {
public static MyHelperClass processAndCreateFolderEntries(Zip64File o0, MyHelperClass o1, boolean o2){ return null; }
	public static MyHelperClass normalizePaths(File o0){ return null; }
	public static MyHelperClass listAllFilesAndFolders(File o0, ArrayList o1){ return null; }
public static MyHelperClass getFileEntry(Zip64File o0, String o1){ return null; }
//	public MyHelperClass normalizePaths(File o0){ return null; }
//	public MyHelperClass processAndCreateFolderEntries(Zip64File o0, MyHelperClass o1, boolean o2){ return null; }
	public static MyHelperClass deleteFileEntry(Zip64File o0, FileEntry o1){ return null; }
//	public MyHelperClass listAllFilesAndFolders(File o0, ArrayList o1){ return null; }
	public static MyHelperClass parseTargetPath(String o0, File o1){ return null; }
//public MyHelperClass deleteFileEntry(Zip64File o0, FileEntry o1){ return null; }
//	public MyHelperClass parseTargetPath(String o0, File o1){ return null; }
//	public MyHelperClass getFileEntry(Zip64File o0, String o1){ return null; }

    public static File insertFileInto(File zipFile, File toInsert, String targetPath) {
        Zip64File zip64File = null;
        try {
            boolean compress = false;
            zip64File = new Zip64File(zipFile);
            FileEntry testEntry =(FileEntry)(Object) getFileEntry(zip64File, targetPath);
            MyHelperClass FileEntry = new MyHelperClass();
            if (testEntry != null && testEntry.getMethod() == FileEntry.iMETHOD_DEFLATED) {
                compress = true;
            }
            processAndCreateFolderEntries(zip64File, parseTargetPath(targetPath, toInsert), compress);
            if (testEntry != null) {
                MyHelperClass log = new MyHelperClass();
                log.info("[insertFileInto] Entry exists: " + testEntry.getName());
//                MyHelperClass log = new MyHelperClass();
                log.info("[insertFileInto] Will delete this entry before inserting: " + toInsert.getName());
                if (!(Boolean)(Object)testEntry.isDirectory()) {
                    zip64File.delete(testEntry.getName());
                } else {
//                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Entry is a directory. " + "Will delete all files contained in this entry and insert " + toInsert.getName() + "and all nested files.");
                    if (!targetPath.contains("/")) {
                        targetPath = targetPath + "/";
                    }
                    deleteFileEntry(zip64File, testEntry);
//                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Entry successfully deleted.");
                }
//                MyHelperClass log = new MyHelperClass();
                log.info("[insertFileInto] Writing new Entry: " + targetPath);
                EntryOutputStream out = null;
                if (!compress) {
//                    MyHelperClass FileEntry = new MyHelperClass();
                    out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(targetPath, FileEntry.iMETHOD_STORED, new Date(toInsert.lastModified()));
                } else {
//                    MyHelperClass FileEntry = new MyHelperClass();
                    out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(targetPath, FileEntry.iMETHOD_DEFLATED, new Date(toInsert.lastModified()));
                }
                if ((boolean)(Object)toInsert.isDirectory()) {
                    out.flush();
                    out.close();
//                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Finished writing entry: " + targetPath);
                    List containedPaths =(List)(Object) normalizePaths(toInsert);
                    List containedFiles =(List)(Object) listAllFilesAndFolders(toInsert, new ArrayList());
//                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Added entry is a folder.");
//                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Adding all nested files: ");
                    for (int i = 0; i < (int)(Object)containedPaths.size(); i++) {
                        File currentFile =(File)(Object) containedFiles.get(i);
                        MyHelperClass File = new MyHelperClass();
                        String currentPath = targetPath.replace("/", "") + File.separator + containedPaths.get(i);
                        EntryOutputStream loop_out = null;
                        if (!compress) {
//                            MyHelperClass FileEntry = new MyHelperClass();
                            loop_out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(currentPath, FileEntry.iMETHOD_STORED, new Date(currentFile.lastModified()));
                        } else {
//                            MyHelperClass FileEntry = new MyHelperClass();
                            loop_out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(currentPath, FileEntry.iMETHOD_DEFLATED, new Date(currentFile.lastModified()));
                        }
                        if ((boolean)(Object)currentFile.isFile()) {
                            InputStream loop_in =(InputStream)(Object) new FileInputStream(currentFile);
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copyLarge(loop_in, loop_out);
                            loop_in.close();
                        }
//                        MyHelperClass log = new MyHelperClass();
                        log.info("[insertFileInto] Added: " + currentPath);
                        loop_out.flush();
                        loop_out.close();
                    }
                } else {
                    InputStream in =(InputStream)(Object) new FileInputStream(toInsert);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyLarge(in, out);
                    in.close();
                    out.flush();
                    out.close();
                }
            } else {
                EntryOutputStream out = null;
                if (!compress) {
//                    MyHelperClass FileEntry = new MyHelperClass();
                    out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(targetPath, FileEntry.iMETHOD_STORED, new Date(toInsert.lastModified()));
                } else {
//                    MyHelperClass FileEntry = new MyHelperClass();
                    out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(targetPath, FileEntry.iMETHOD_DEFLATED, new Date(toInsert.lastModified()));
                }
                if ((boolean)(Object)toInsert.isDirectory()) {
                    out.flush();
                    out.close();
                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Finished writing entry: " + targetPath);
                    List containedPaths =(List)(Object) normalizePaths(toInsert);
                    List containedFiles =(List)(Object) listAllFilesAndFolders(toInsert, new ArrayList());
//                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Added entry is a folder.");
//                    MyHelperClass log = new MyHelperClass();
                    log.info("[insertFileInto] Adding all nested files: ");
                    for (int i = 0; i < (int)(Object)containedPaths.size(); i++) {
                        File currentFile =(File)(Object) containedFiles.get(i);
                        MyHelperClass File = new MyHelperClass();
                        String currentPath = targetPath.replace("/", "") + File.separator + containedPaths.get(i);
                        EntryOutputStream loop_out = null;
                        if (!compress) {
//                            MyHelperClass FileEntry = new MyHelperClass();
                            loop_out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(currentPath, FileEntry.iMETHOD_STORED, new Date(currentFile.lastModified()));
                        } else {
//                            MyHelperClass FileEntry = new MyHelperClass();
                            loop_out =(EntryOutputStream)(Object) zip64File.openEntryOutputStream(currentPath, FileEntry.iMETHOD_DEFLATED, new Date(currentFile.lastModified()));
                        }
                        if ((boolean)(Object)currentFile.isFile()) {
                            InputStream loop_in =(InputStream)(Object) new FileInputStream(currentFile);
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copyLarge(loop_in, loop_out);
                            loop_in.close();
                        }
//                        MyHelperClass log = new MyHelperClass();
                        log.info("[insertFileInto] Added: " + currentPath);
                        loop_out.flush();
                        loop_out.close();
                    }
                } else {
                    InputStream in =(InputStream)(Object) new FileInputStream(toInsert);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyLarge(in, out);
                    in.close();
                    out.flush();
                    out.close();
                }
            }
            MyHelperClass log = new MyHelperClass();
            log.info("[insertFileInto] Done! Added " + toInsert.getName() + " to zip.");
            zip64File.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return new File(zip64File.getDiskFile().getFileName());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass iMETHOD_DEFLATED;
	public MyHelperClass iMETHOD_STORED;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, EntryOutputStream o1){ return null; }
	public MyHelperClass getFileName(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Zip64File {

Zip64File(File o0){}
	Zip64File(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getDiskFile(){ return null; }
	public MyHelperClass openEntryOutputStream(String o0, MyHelperClass o1, Date o2){ return null; }
	public MyHelperClass delete(MyHelperClass o0){ return null; }}

class FileEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getName(){ return null; }}

class EntryOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ArrayList {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Date {

Date(){}
	Date(MyHelperClass o0){}}
