import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12214889 {

    public static boolean copyFile(String source, String destination, boolean replace)  throws Throwable {
        File sourceFile = new File(source);
        File destinationFile = new File(destination);
        if (sourceFile.isDirectory() || destinationFile.isDirectory()) return false;
        if (destinationFile.isFile() && !replace) return false;
        if (!sourceFile.isFile()) return false;
        if (replace) destinationFile.delete();
        try {
            File dir = destinationFile.getParentFile();
            while (dir != null && !dir.exists()) {
                dir.mkdir();
            }
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(destinationFile), 10240));
            DataInputStream inStream = new DataInputStream(new BufferedInputStream(new FileInputStream(sourceFile), 10240));
            try {
                while (inStream.available() > 0) {
                    outStream.write(inStream.readUnsignedByte());
                }
            } catch (EOFException eof) {
            }
            inStream.close();
            outStream.close();
        } catch (IOException ex) {
            throw new FailedException("Failed to copy file " + sourceFile.getAbsolutePath() + " to " + destinationFile.getAbsolutePath(), ex).setFile(destinationFile.getAbsolutePath());
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FailedException extends Exception{
	public FailedException(String errorMessage) { super(errorMessage); }
	FailedException(String o0, IOException o1){}
	FailedException(){}
}
