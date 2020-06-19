import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5667973 {
public static MyHelperClass closeQuietly(InputStream o0){ return null; }
	public static MyHelperClass closeQuietly(OutputStream o0){ return null; }
//public MyHelperClass closeQuietly(InputStream o0){ return null; }
//	public MyHelperClass closeQuietly(OutputStream o0){ return null; }

    public static void copyClassPathResource(String classPathResourceName, String fileSystemDirectoryName)  throws Throwable {
        InputStream resourceInputStream = null;
        OutputStream fileOutputStream = null;
        try {
            resourceInputStream = FileUtils.class.getResourceAsStream(classPathResourceName);
            MyHelperClass StringUtils = new MyHelperClass();
            String fileName =(String)(Object) StringUtils.substringAfterLast(classPathResourceName, "/");
            File fileSystemDirectory = new File(fileSystemDirectoryName);
            fileSystemDirectory.mkdirs();
            fileOutputStream = new FileOutputStream(fileSystemDirectoryName + "/" + fileName);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(resourceInputStream, fileOutputStream);
        } catch (IOException e) {
            throw new UnitilsException((String)(Object)e);
        } finally {
            closeQuietly(resourceInputStream);
            closeQuietly(fileOutputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substringAfterLast(String o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class FileUtils {

}

class UnitilsException extends Exception{
	public UnitilsException(String errorMessage) { super(errorMessage); }
}
