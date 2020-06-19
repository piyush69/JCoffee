import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4643706 {

    private static void zip(ZipOutputStream aOutputStream, final File[] aFiles, final String sArchive, final URI aRootURI, final String sFilter) throws Throwable, FileError(Throwable)(Object) {
        boolean closeStream = false;
        if (aOutputStream == null) try {
            aOutputStream = new ZipOutputStream(new FileOutputStream(sArchive));
            closeStream = true;
        } catch (final FileNotFoundException e) {
            throw new FileError("Can't create ODF file!", e);
        }
        try {
            try {
                for (final File curFile : aFiles) {
                    aOutputStream.putNextEntry(new ZipEntry(URLDecoder.decode(aRootURI.relativize(curFile.toURI()).toASCIIString(), "UTF-8")));
                    if (curFile.isDirectory()) {
                        aOutputStream.closeEntry();
                        MyHelperClass FileUtils = new MyHelperClass();
                        FileUtils.zip(aOutputStream, FileUtils.getFiles(curFile, sFilter), sArchive, aRootURI, sFilter);
                        continue;
                    }
                    final FileInputStream inputStream = new FileInputStream(curFile);
                    MyHelperClass FileUtils = new MyHelperClass();
                    for (int i; (i = inputStream.read(FileUtils.BUFFER)) != -1; ) aOutputStream.write(FileUtils.BUFFER, 0, i);
                    inputStream.close();
                    aOutputStream.closeEntry();
                }
            } finally {
                if (closeStream && aOutputStream != null) aOutputStream.close();
            }
        } catch (final IOException e) {
            throw new FileError("Can't zip file to archive!", e);
        }
        MyHelperClass DocumentController = new MyHelperClass();
        if (closeStream) DocumentController.getStaticLogger().fine(aFiles.length + " files and folders zipped as " + sArchive);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BUFFER;
public MyHelperClass getFiles(File o0, String o1){ return null; }
	public MyHelperClass getStaticLogger(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileError {

FileError(String o0, IOException o1){}
	FileError(){}
	FileError(String o0, FileNotFoundException o1){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
