import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20508693 {
public MyHelperClass inStream;
	public MyHelperClass logger;
	public MyHelperClass errEntry;

    private void zip(FileHolder fileHolder, int zipCompressionLevel)  throws Throwable {
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
        int bytes_read;
        if ((int)(Object)fileHolder.selectedFileList.size() == 0) {
            return;
        }
        File zipDestFile = new File((String)(Object)fileHolder.destFiles[0]);
        try {
            ZipOutputStream outStream = new ZipOutputStream(new FileOutputStream(zipDestFile));
            for (int i = 0; i < (int)(Object)fileHolder.selectedFileList.size(); i++) {
                File selectedFile =(File)(Object) fileHolder.selectedFileList.get(i);
                MyHelperClass currentObjBeingProcessed = new MyHelperClass();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
                FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
                super.currentObjBeingProcessed = NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //selectedFile;
                this.inStream = new FileInputStream(selectedFile);
                ZipEntry entry = new ZipEntry(selectedFile.getName());
                outStream.setLevel(zipCompressionLevel);
                outStream.putNextEntry(entry);
                while ((bytes_read =(int)(Object) this.inStream.read(buffer)) != -1) {
                    outStream.write(buffer, 0, bytes_read);
                }
                outStream.closeEntry();
                this.inStream.close();
            }
            outStream.close();
        } catch (IOException e) {
            errEntry.setThrowable(e);
            errEntry.setAppContext("gzip()");
            errEntry.setAppMessage("Error zipping: " + zipDestFile);
            logger.logError(errEntry);
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setAppMessage(String o0){ return null; }
	public MyHelperClass setAppContext(String o0){ return null; }
	public MyHelperClass logError(MyHelperClass o0){ return null; }
	public MyHelperClass setThrowable(IOException o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileHolder {
public MyHelperClass selectedFileList;
	public MyHelperClass[] destFiles;
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLevel(int o0){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
