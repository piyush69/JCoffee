import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9593609 {

    public static void main(String[] args) throws Throwable, Exception {
        File rootDir = new File("C:\\dev\\workspace_fgd\\gouvqc_crggid\\WebContent\\WEB-INF\\upload");
        File storeDir = new File(rootDir, "storeDir");
        File workDir = new File(rootDir, "workDir");
        MyHelperClass logger = new MyHelperClass();
        LoggerFacade loggerFacade =(LoggerFacade)(Object) new CommonsLoggingLogger(logger);
        final FileResourceManager frm =(FileResourceManager)(Object) new SmbFileResourceManager(storeDir.getPath(), workDir.getPath(), true, loggerFacade);
        frm.start();
        final String resourceId = "811375c8-7cae-4429-9a0e-9222f47dab45";
        {
            if (!(Boolean)(Object)frm.resourceExists(resourceId)) {
                String txId =(String)(Object) frm.generatedUniqueTxId();
                frm.startTransaction(txId);
                FileInputStream inputStream = new FileInputStream(resourceId);
                frm.createResource(txId, resourceId);
                OutputStream outputStream =(OutputStream)(Object) frm.writeResource(txId, resourceId);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, outputStream);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(inputStream);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(outputStream);
                frm.prepareTransaction(txId);
                frm.commitTransaction(txId);
            }
        }
        for (int i = 0; i < 30; i++) {
            final int index = i;
            new Thread() {

//                @Override
                public void run() {
                    try {
                        String txId =(String)(Object) frm.generatedUniqueTxId();
                        frm.startTransaction(txId);
                        InputStream inputStream =(InputStream)(Object) frm.readResource(resourceId);
                        frm.prepareTransaction(txId);
                        frm.commitTransaction(txId);
                        synchronized (System.out) {
                            System.out.println(index + " ***********************" + txId + " (début)");
                        }
                        MyHelperClass TikaUtils = new MyHelperClass();
                        String contenu =(String)(Object) TikaUtils.getParsedContent(inputStream, "file.pdf");
                        synchronized (System.out) {
                            System.out.println(index + " ***********************" + txId + " (fin)");
                        }
                    } catch (ArithmeticException e) {
                        throw new RuntimeException(e);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new RuntimeException(e);
                    } catch (ArrayStoreException e) {
                        throw new RuntimeException(e);
                    } catch (ClassCastException e) {
                        throw new RuntimeException(e);
                    }
                }
            }.start();
        }
        Thread.sleep(60000);
        MyHelperClass FileResourceManager = new MyHelperClass();
        frm.stop(FileResourceManager.SHUTDOWN_MODE_NORMAL);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHUTDOWN_MODE_NORMAL;
public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass getParsedContent(InputStream o0, String o1){ return null; }}

class LoggerFacade {

}

class CommonsLoggingLogger {

CommonsLoggingLogger(MyHelperClass o0){}
	CommonsLoggingLogger(){}}

class FileResourceManager {

public MyHelperClass startTransaction(String o0){ return null; }
	public MyHelperClass prepareTransaction(String o0){ return null; }
	public MyHelperClass resourceExists(String o0){ return null; }
	public MyHelperClass readResource(String o0){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass createResource(String o0, String o1){ return null; }
	public MyHelperClass stop(MyHelperClass o0){ return null; }
	public MyHelperClass generatedUniqueTxId(){ return null; }
	public MyHelperClass commitTransaction(String o0){ return null; }
	public MyHelperClass writeResource(String o0, String o1){ return null; }}

class SmbFileResourceManager {

SmbFileResourceManager(String o0, String o1, boolean o2, LoggerFacade o3){}
	SmbFileResourceManager(){}}

class ResourceManagerSystemException extends Exception{
	public ResourceManagerSystemException(String errorMessage) { super(errorMessage); }
}

class ResourceManagerException extends Exception{
	public ResourceManagerException(String errorMessage) { super(errorMessage); }
}

class TikaException extends Exception{
	public TikaException(String errorMessage) { super(errorMessage); }
}
