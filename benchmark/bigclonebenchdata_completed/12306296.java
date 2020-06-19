import java.io.*;
import java.lang.*;
import java.util.*;



class c12306296 {
public static MyHelperClass IOUtil;
	public static MyHelperClass BUFFER_LENGTH;
	public static MyHelperClass forceMkdir(File o0){ return null; }
	public static MyHelperClass truncateFile(File o0, int o1){ return null; }
//public MyHelperClass IOUtil;
//	public MyHelperClass BUFFER_LENGTH;
//	public MyHelperClass truncateFile(File o0, int o1){ return null; }
//	public MyHelperClass forceMkdir(File o0){ return null; }

    public static void copyFile(File source, File destination, long copyLength) throws IOException {
        if (!source.exists()) {
            String message = "File " + source + " does not exist";
            throw new FileNotFoundException(message);
        }
        if (destination.getParentFile() != null && !destination.getParentFile().exists()) {
            forceMkdir(destination.getParentFile());
        }
        if (destination.exists() && !destination.canWrite()) {
            String message = "Unable to open file " + destination + " for writing.";
            throw new IOException(message);
        }
        if (source.getCanonicalPath().equals(destination.getCanonicalPath())) {
            String message = "Unable to write file " + source + " on itself.";
            throw new IOException(message);
        }
        if (copyLength == 0) {
            truncateFile(destination, 0);
        }
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(destination);
            long lengthLeft = copyLength;
            byte[] buffer = new byte[(int) Math.min((int)(Object)BUFFER_LENGTH, lengthLeft + 1)];
            int read;
            while (lengthLeft > 0) {
                read = input.read(buffer);
                if (read == -1) {
                    break;
                }
                lengthLeft -= read;
                output.write(buffer, 0, read);
            }
            output.flush();
            output.getFD().sync();
        } finally {
            IOUtil.closeQuietly(input);
            IOUtil.closeQuietly(output);
        }
        destination.setLastModified(source.lastModified());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}
