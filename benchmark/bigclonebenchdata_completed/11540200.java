import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11540200 {

    public File uploadImage(InputStream inputStream, String fileName, String sessionId)  throws Throwable {
        MyHelperClass PathConfig = new MyHelperClass();
        File file = new File(PathConfig.getInstance().sessionFolder(sessionId) + File.separator + fileName);
        FileOutputStream fileOutputStream = null;
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            FileUtils.touch(file);
            fileOutputStream = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, fileOutputStream);
        } catch (IOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Save uploaded image to file occur IOException.", e);
            throw new FileOperationException("Save uploaded image to file occur IOException.", e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Close FileOutputStream Occur IOException while save a uploaded image.", e);
            }
        }
        return file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass sessionFolder(String o0){ return null; }
	public MyHelperClass touch(File o0){ return null; }}

class FileOperationException extends Exception{
	public FileOperationException(String errorMessage) { super(errorMessage); }
	FileOperationException(){}
	FileOperationException(String o0, IOException o1){}
}
