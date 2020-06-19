import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3229361 {
public MyHelperClass PHRASES;
public MyHelperClass parent(File o0){ return null; }

    public void copyFile(String source_name, String dest_name) throws Throwable, IOException {
        File source_file = new File(source_name);
        File destination_file = new File(dest_name);
        FileInputStream source = null;
        FileOutputStream destination = null;
        byte[] buffer;
        int bytes_read;
        try {
            if (!source_file.exists() || !source_file.isFile()) throw new FileCopyException(PHRASES.getPhrase("25") + " " + source_name);
            if (!source_file.canRead()) throw new FileCopyException(PHRASES.getPhrase("26") + " " + PHRASES.getPhrase("27") + ": " + source_name);
            if (destination_file.exists()) {
                if (destination_file.isFile()) {
                    DataInputStream in = new DataInputStream(System.in);
                    String response;
                    if (!destination_file.canWrite()) throw new FileCopyException(PHRASES.getPhrase("28") + " " + PHRASES.getPhrase("29") + ": " + dest_name);
                    System.out.print(PHRASES.getPhrase("19") + dest_name + PHRASES.getPhrase("30") + ": ");
                    System.out.flush();
                    response = in.readLine();
                    if (!response.equals("Y") && !response.equals("y")) throw new FileCopyException((String)(Object)PHRASES.getPhrase("31"));
                } else throw new FileCopyException(PHRASES.getPhrase("28") + " " + PHRASES.getPhrase("32") + ": " + dest_name);
            } else {
                File parentdir =(File)(Object) parent(destination_file);
                if (!parentdir.exists()) throw new FileCopyException(PHRASES.getPhrase("28") + " " + PHRASES.getPhrase("33") + ": " + dest_name);
                if (!parentdir.canWrite()) throw new FileCopyException(PHRASES.getPhrase("28") + " " + PHRASES.getPhrase("34") + ": " + dest_name);
            }
            source = new FileInputStream(source_file);
            destination = new FileOutputStream(destination_file);
            buffer = new byte[1024];
            while (true) {
                bytes_read = source.read(buffer);
                if (bytes_read == -1) break;
                destination.write(buffer, 0, bytes_read);
            }
        } finally {
            if (source != null) try {
                source.close();
            } catch (IOException e) {
                ;
            }
            if (destination != null) try {
                destination.close();
            } catch (IOException e) {
                ;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPhrase(String o0){ return null; }}

class FileCopyException extends Exception{
	public FileCopyException(String errorMessage) { super(errorMessage); }
}
