import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20508694 {
public MyHelperClass inStream;
	public MyHelperClass logger;
	public MyHelperClass errEntry;

    private void tar(FileHolder fileHolder, boolean gzipIt)  throws Throwable {
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
        int bytes_read;
        if ((int)(Object)fileHolder.selectedFileList.size() == 0) {
            return;
        }
        File tarDestFile = new File((String)(Object)fileHolder.destFiles[0]);
        try {
            OutputStream outStream = new FileOutputStream(tarDestFile);
            if (gzipIt) {
                outStream =(OutputStream)(Object) new GZIPOutputStream(outStream);
            }
            TarOutputStream tarOutStream = new TarOutputStream(outStream);
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
                TarEntry tarEntry = null;
                try {
                    tarEntry = new TarEntry(selectedFile, selectedFile.getName());
                } catch (InvalidHeaderException e) {
                    errEntry.setThrowable(e);
                    errEntry.setAppContext("tar()");
                    errEntry.setAppMessage("Error tar'ing: " + selectedFile);
                    logger.logError(errEntry);
                }
                tarOutStream.putNextEntry(tarEntry);
                while ((bytes_read =(int)(Object) inStream.read(buffer)) != -1) {
                    tarOutStream.write(buffer, 0, bytes_read);
                }
                tarOutStream.closeEntry();
                inStream.close();
                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
//                MyHelperClass processorSyncFlag = new MyHelperClass();
                MyHelperClass processorSyncFlag = new MyHelperClass();
                super.processorSyncFlag.restartWaitUntilFalse();
            }
            tarOutStream.close();
        } catch (Exception e) {
            errEntry.setThrowable(e);
            errEntry.setAppContext("tar()");
            errEntry.setAppMessage("Error tar'ing: " + tarDestFile);
            logger.logError(errEntry);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setAppMessage(String o0){ return null; }
	public MyHelperClass setAppContext(String o0){ return null; }
	public MyHelperClass setThrowable(InvalidHeaderException o0){ return null; }
	public MyHelperClass setThrowable(Exception o0){ return null; }
	public MyHelperClass logError(MyHelperClass o0){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileHolder {
public MyHelperClass selectedFileList;
	public MyHelperClass[] destFiles;
}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(OutputStream o0){}}

class TarOutputStream {

TarOutputStream(OutputStream o0){}
	TarOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(TarEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class TarEntry {

TarEntry(File o0, String o1){}
	TarEntry(){}}

class InvalidHeaderException extends Exception{
	public InvalidHeaderException(String errorMessage) { super(errorMessage); }
}
