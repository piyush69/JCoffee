
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3197089 {
public MyHelperClass logger;

    public void insertStringInFile(String file, String textToInsert, long fromByte, long toByte) throws Exception {
        String tmpFile = file + ".tmp";
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        long byteCount = 0;
        try {
            in = new BufferedInputStream(new FileInputStream(new File(file)));
            out = new BufferedOutputStream(new FileOutputStream(tmpFile));
            long size = fromByte;
            byte[] buf = null;
            if (size == 0) {
            } else {
                buf = new byte[(int) size];
                int length = -1;
                if ((length =(int)(Object) in.read(buf)) != -1) {
                    out.write(buf, 0, length);
                    byteCount = byteCount + length;
                } else {
                    String msg = "Failed to read the first '" + size + "' bytes of file '" + file + "'. This might be a programming error.";
                    MyHelperClass logger = new MyHelperClass();
                    logger.warning(msg);
                    throw new Exception(msg);
                }
            }
            buf = textToInsert.getBytes();
            int length = buf.length;
            out.write(buf, 0, length);
            byteCount = byteCount + length;
            long skipLength = toByte - fromByte;
            long skippedBytes =(long)(Object) in.skip(skipLength);
            if (skippedBytes == -1) {
            } else {
                buf = new byte[4096];
                length = -1;
                while ((length =(int)(Object) in.read(buf)) != -1) {
                    out.write(buf, 0, length);
                    byteCount = byteCount + length;
                }
            }
            in.close();
            in = null;
            out.close();
            out = null;
            File fileToDelete = new File(file);
            boolean wasDeleted =(boolean)(Object) fileToDelete.delete();
            if (!wasDeleted) {
                String msg = "Failed to delete the original file '" + file + "' to replace it with the modified file after text insertion.";
                MyHelperClass logger = new MyHelperClass();
                logger.warning(msg);
                throw new Exception(msg);
            }
            File fileToRename = new File(tmpFile);
            boolean wasRenamed =(boolean)(Object) fileToRename.renameTo(fileToDelete);
            if (!wasRenamed) {
                String msg = "Failed to rename tmp file '" + tmpFile + "' to the name of the original file '" + file + "'";
                MyHelperClass logger = new MyHelperClass();
                logger.warning(msg);
                throw new Exception(msg);
            }
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.WARNING, "Failed to read/write file '" + file + "'.", e);
            throw e;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Level = new MyHelperClass();
                    logger.log(Level.FINEST, "Ignoring error closing input file '" + file + "'.", e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Level = new MyHelperClass();
                    logger.log(Level.FINEST, "Ignoring error closing output file '" + tmpFile + "'.", e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINEST;
	public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass skip(long o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
