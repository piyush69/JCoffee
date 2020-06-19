import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23597499 {

    private File uploadFile(InputStream inputStream, File file)  throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            File dir = file.getParentFile();
            if (!dir.exists()) {
                dir.mkdirs();
            }
            MyHelperClass FileUtils = new MyHelperClass();
            FileUtils.touch(file);
            fileOutputStream = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, fileOutputStream);
        } catch (IOException e) {
            throw new FileOperationException("Failed to save uploaded image", e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.warn("Failed to close resources on uploaded file", e);
            }
        }
        return file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass touch(File o0){ return null; }}

class FileOperationException extends Exception{
	public FileOperationException(String errorMessage) { super(errorMessage); }
	FileOperationException(){}
	FileOperationException(String o0, IOException o1){}
}
