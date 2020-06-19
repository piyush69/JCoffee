import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20508692 {
public MyHelperClass inStream;
	public MyHelperClass logger;
	public MyHelperClass errEntry;

    private void gzip(FileHolder fileHolder)  throws Throwable {
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
        int bytes_read;
        if ((int)(Object)fileHolder.selectedFileList.size() == 0) {
            return;
        }
        File destFile = new File((String)(Object)fileHolder.destFiles[0]);
        try {
            OutputStream outStream = new FileOutputStream(destFile);
            outStream =(OutputStream)(Object) new GZIPOutputStream(outStream);
            File selectedFile =(File)(Object) fileHolder.selectedFileList.get(0);
            MyHelperClass currentObjBeingProcessed = new MyHelperClass();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
//            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
            FileInputStream currentObjBeingProcessed = NULL; //new FileInputStream();
            super.currentObjBeingProcessed = NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //NULL; //selectedFile;
            this.inStream = new FileInputStream(selectedFile);
            while ((bytes_read =(int)(Object) this.inStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytes_read);
            }
            outStream.close();
            this.inStream.close();
        } catch (IOException e) {
            errEntry.setThrowable(e);
            errEntry.setAppContext("gzip()");
            errEntry.setAppMessage("Error gzip'ing: " + destFile);
            logger.logError(errEntry);
        }
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

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(OutputStream o0){}}
