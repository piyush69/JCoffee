import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6483359 {

    private void unzipData(ZipFile zipfile, ZipEntry entry)  throws Throwable {
        if (entry.getName().equals("backUpExternalInfo.out")) {
            File outputFile = new File("temp",(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) entry.getName());
            if (!outputFile.getParentFile().exists()) {
                outputFile.getParentFile().mkdirs();
            }
            try {
                BufferedInputStream inputStream = new BufferedInputStream((InputStream)(Object)zipfile.getInputStream(entry));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, outputStream);
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                throw new BackupException(e.getMessage());
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

public MyHelperClass getName(){ return null; }}

class BackupException extends Exception{
	public BackupException(String errorMessage) { super(errorMessage); }
}
