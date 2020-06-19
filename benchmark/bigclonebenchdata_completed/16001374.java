import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16001374 {

    static void copyFile(File file, File destDir) {
        File destFile = new File(destDir, file.getName());
        if (destFile.exists() && (!destFile.canWrite())) {
            throw new SyncException("Cannot overwrite " + destFile + " because " + "it is read-only");
        }
        try {
            FileInputStream in = new FileInputStream(file);
            try {
                FileOutputStream out = new FileOutputStream(destFile);
                try {
                    MyHelperClass BUFFER_SIZE = new MyHelperClass();
                    byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
                    int read;
                    while ((read = in.read(buffer)) != -1) {
                        out.write(buffer, 0, read);
                    }
                } finally {
                    out.close();
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new SyncException("I/O error copying " + file + " to " + destDir + " (message: " + e.getMessage() + ")", e);
        }
        if (!destFile.setLastModified(file.lastModified())) {
            throw new SyncException("Could not set last modified timestamp " + "of " + destFile);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SyncException extends Exception{
	public SyncException(String errorMessage) { super(errorMessage); }
	SyncException(String o0, IOException o1){}
	SyncException(){}
}
