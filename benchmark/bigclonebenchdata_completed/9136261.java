import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9136261 {
public MyHelperClass parent(File o0){ return null; }

    public void copyFile(String source_name, String dest_name) throws Throwable, IOException {
        File source_file = new File(source_name);
        File destination_file = new File(dest_name);
        Reader source = null;
        Writer destination = null;
        char[] buffer;
        int bytes_read;
        try {
            if (!source_file.exists() || !source_file.isFile()) throw new FileCopyException("FileCopy: no such source file: " + source_name);
            if (!source_file.canRead()) throw new FileCopyException("FileCopy: source file " + "is unreadable: " + source_name);
            if (destination_file.exists()) {
                if (destination_file.isFile()) {
                    DataInputStream in = new DataInputStream(System.in);
                    String response;
                    if (!destination_file.canWrite()) throw new FileCopyException("FileCopy: destination " + "file is unwriteable: " + dest_name);
                } else {
                    throw new FileCopyException("FileCopy: destination " + "is not a file: " + dest_name);
                }
            } else {
                File parentdir =(File)(Object) parent(destination_file);
                if (!parentdir.exists()) throw new FileCopyException("FileCopy: destination " + "directory doesn't exist: " + dest_name);
                if (!parentdir.canWrite()) throw new FileCopyException("FileCopy: destination " + "directory is unwriteable: " + dest_name);
            }
            source = new BufferedReader(new FileReader(source_file));
            destination = new BufferedWriter(new FileWriter(destination_file));
            buffer = new char[1024];
            while (true) {
                bytes_read = source.read(buffer, 0, 1024);
                if (bytes_read == -1) break;
                destination.write(buffer, 0, bytes_read);
            }
        } finally {
            if (source != null) {
                try {
                    source.close();
                } catch (IOException e) {
                    ;
                }
            }
            if (destination != null) {
                try {
                    destination.close();
                } catch (IOException e) {
                    ;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileCopyException extends Exception{
	public FileCopyException(String errorMessage) { super(errorMessage); }
}
