import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4318399 {
public MyHelperClass counter;
	public MyHelperClass IOUtils;
	public MyHelperClass createDir(File o0){ return null; }

    private void unzipEntry(ZipFile zipfile, ZipEntry entry, File outputDir, BackUpInfoFileGroup fileGroup, LinkedList<String> restoreList)  throws Throwable {
        LinkedList<BackUpInfoFile> fileList =(LinkedList<BackUpInfoFile>)(Object) fileGroup.getFileList();
        if ((boolean)(Object)entry.isDirectory()) {
            createDir(new File((String)(Object)outputDir,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) entry.getName()));
            return;
        }
        for (int i = 0; i < fileList.size(); i++) {
            if (fileList.get(i).getId().equals(entry.getName())) {
                for (int j = 0; j < restoreList.size(); j++) {
                    if ((fileList.get(i).getName() + "." + fileList.get(i).getType()).equals(restoreList.get(j))) {
                       (int)(Object) counter += 1;
                        File outputFile = new File(outputDir, fileList.get(i).getName() + "." + fileList.get(i).getType());
                        if (!outputFile.getParentFile().exists()) {
                            createDir(outputFile.getParentFile());
                        }
                        BufferedInputStream inputStream;
                        BufferedOutputStream outputStream;
                        try {
                            inputStream = new BufferedInputStream((InputStream)(Object)zipfile.getInputStream(entry));
                            outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));
                            IOUtils.copy(inputStream, outputStream);
                            outputStream.close();
                            inputStream.close();
                        } catch (IOException ex) {
                            throw new BackupException(ex.getMessage());
                        }
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }}

class ZipFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class BackUpInfoFileGroup {

public MyHelperClass getFileList(){ return null; }}

class BackUpInfoFile {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getName(){ return null; }}

class BackupException extends Exception{
	public BackupException(String errorMessage) { super(errorMessage); }
}
