import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13716732 {
public MyHelperClass ACCESS_IS_DENIED;
	public MyHelperClass MP3_UNABLE_TO_ADJUST_PADDING;
	public MyHelperClass GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER;
	public MyHelperClass GENERAL_WRITE_FAILED_TO_MODIFY_TEMPORARY_FILE_IN_FOLDER;
public MyHelperClass logger;
	public MyHelperClass Level;
	public MyHelperClass replaceFile(File o0, File o1){ return null; }

    public void adjustPadding(File file, int paddingSize, long audioStart) throws Throwable, FileNotFoundException, IOException {
        MyHelperClass logger = new MyHelperClass();
        logger.finer("Need to move audio file to accomodate tag");
        FileChannel fcIn = null;
        FileChannel fcOut;
        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer paddingBuffer =(ByteBuffer)(Object) ByteBuffer.wrap(new byte[paddingSize]);
        File paddedFile;
        try {
            MyHelperClass Utils = new MyHelperClass();
            paddedFile = File.createTempFile((String)(Object)Utils.getMinBaseFilenameAllowedForTempFile(file), ".new", file.getParentFile());
//            MyHelperClass logger = new MyHelperClass();
            logger.finest("Created temp file:" + paddedFile.getName() + " for " + file.getName());
        } catch (IOException ioe) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, ioe.getMessage(), ioe);
            if (ioe.getMessage().equals(ACCESS_IS_DENIED.getMsg())) {
                logger.severe(GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER.getMsg(file.getName(), file.getParentFile().getPath()));
                throw new UnableToCreateFileException((String)(Object)GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER.getMsg(file.getName(), file.getParentFile().getPath()));
            } else {
                logger.severe(GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER.getMsg(file.getName(), file.getParentFile().getPath()));
                throw new UnableToCreateFileException((String)(Object)GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER.getMsg(file.getName(), file.getParentFile().getPath()));
            }
        }
        try {
            fcOut = (FileChannel)(Object)new FileOutputStream(paddedFile).getChannel();
        } catch (FileNotFoundException ioe) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, ioe.getMessage(), ioe);
            logger.severe(GENERAL_WRITE_FAILED_TO_MODIFY_TEMPORARY_FILE_IN_FOLDER.getMsg(file.getName(), file.getParentFile().getPath()));
            throw new UnableToModifyFileException((String)(Object)GENERAL_WRITE_FAILED_TO_MODIFY_TEMPORARY_FILE_IN_FOLDER.getMsg(file.getName(), file.getParentFile().getPath()));
        }
        try {
            fcIn = (FileChannel)(Object)new FileInputStream(file).getChannel();
            long written =(long)(Object) fcOut.write(paddingBuffer);
//            MyHelperClass logger = new MyHelperClass();
            logger.finer("Copying:" + (file.length() - audioStart) + "bytes");
            long audiolength = file.length() - audioStart;
            MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
            if (audiolength <= (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE) {
                long written2 =(long)(Object) fcIn.transferTo(audioStart, audiolength, fcOut);
//                MyHelperClass logger = new MyHelperClass();
                logger.finer("Written padding:" + written + " Data:" + written2);
                if (written2 != audiolength) {
                    throw new RuntimeException((String)(Object)MP3_UNABLE_TO_ADJUST_PADDING.getMsg(audiolength, written2));
                }
            } else {
//                MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
                long noOfChunks = audiolength / (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE;
//                MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
                long lastChunkSize = audiolength % (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE;
                long written2 = 0;
                for (int i = 0; i < noOfChunks; i++) {
//                    MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
                    written2 += (long)(Object)fcIn.transferTo(audioStart + (i * (int)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE),(long)(Object) MAXIMUM_WRITABLE_CHUNK_SIZE, fcOut);
                }
//                MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
                written2 += (long)(Object)fcIn.transferTo(audioStart + (noOfChunks * (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE), lastChunkSize, fcOut);
//                MyHelperClass logger = new MyHelperClass();
                logger.finer("Written padding:" + written + " Data:" + written2);
                if (written2 != audiolength) {
                    throw new RuntimeException((String)(Object)MP3_UNABLE_TO_ADJUST_PADDING.getMsg(audiolength, written2));
                }
            }
            long lastModified = file.lastModified();
            if (fcIn != null) {
                if ((boolean)(Object)fcIn.isOpen()) {
                    fcIn.close();
                }
            }
            if (fcOut != null) {
                if ((boolean)(Object)fcOut.isOpen()) {
                    fcOut.close();
                }
            }
            replaceFile(file, paddedFile);
            paddedFile.setLastModified(lastModified);
        } finally {
            try {
                if (fcIn != null) {
                    if ((boolean)(Object)fcIn.isOpen()) {
                        fcIn.close();
                    }
                }
                if (fcOut != null) {
                    if ((boolean)(Object)fcOut.isOpen()) {
                        fcOut.close();
                    }
                }
            } catch (Exception e) {
                logger.log(Level.WARNING, "Problem closing channels and locks:" + e.getMessage(), e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass WARNING;
public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass wrap(byte[] o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass severe(MyHelperClass o0){ return null; }
	public MyHelperClass getMsg(long o0, long o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass getMsg(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, FileNotFoundException o2){ return null; }
	public MyHelperClass getMsg(String o0, String o1){ return null; }
	public MyHelperClass getMinBaseFilenameAllowedForTempFile(File o0){ return null; }
	public MyHelperClass finest(String o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }}

class ByteBuffer {

}

class UnableToCreateFileException extends Exception{
	public UnableToCreateFileException(String errorMessage) { super(errorMessage); }
}

class UnableToModifyFileException extends Exception{
	public UnableToModifyFileException(String errorMessage) { super(errorMessage); }
}
