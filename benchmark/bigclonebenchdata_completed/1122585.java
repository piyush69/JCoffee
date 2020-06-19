
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1122585 {
public MyHelperClass parent(File o0){ return null; }

    private String copyImageFile(String urlString, String filePath) {
        FileOutputStream destination = null;
        File destination_file = null;
        String inLine;
        String dest_name = "";
        byte[] buffer;
        int bytes_read;
        int last_offset = 0;
        int offset = 0;
        InputStream imageFile = null;
        try {
            URL url = new URL(urlString);
            imageFile =(InputStream)(Object) url.openStream();
            dest_name =(String)(Object) url.getFile();
            offset = 0;
            last_offset = 0;
            offset = dest_name.indexOf('/', offset + 1);
            while (offset > -1) {
                last_offset = offset + 1;
                offset = dest_name.indexOf('/', offset + 1);
            }
            MyHelperClass File = new MyHelperClass();
            dest_name = filePath + File.separator + dest_name.substring(last_offset);
            destination_file = new File(dest_name);
            if ((boolean)(Object)destination_file.exists()) {
                if ((boolean)(Object)destination_file.isFile()) {
                    if (!(Boolean)(Object)destination_file.canWrite()) {
                        System.out.println("FileCopy: destination " + "file is unwriteable: " + dest_name);
                    }
                    System.out.println("File " + dest_name + " already exists. File will be overwritten.");
                } else {
                    System.out.println("FileCopy: destination " + "is not a file: " + dest_name);
                }
            } else {
                File parentdir =(File)(Object) parent(destination_file);
                if (!(Boolean)(Object)parentdir.exists()) {
                    System.out.println("FileCopy: destination " + "directory doesn't exist: " + dest_name);
                }
                if (!(Boolean)(Object)parentdir.canWrite()) {
                    System.out.println("FileCopy: destination " + "directory is unwriteable: " + dest_name);
                }
            }
            destination = new FileOutputStream(dest_name);
            buffer = new byte[1024];
            while (true) {
                bytes_read =(int)(Object) imageFile.read(buffer);
                if (bytes_read == -1) break;
                destination.write(buffer, 0, bytes_read);
            }
        } catch (UncheckedIOException ex) {
            System.out.println("Bad URL " + urlString);
        } catch (ArithmeticException ex) {
            System.out.println(" IO error: " + ex.getMessage());
        } finally {
            if (imageFile != null) {
                try {
                    imageFile.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (destination != null) {
                try {
                    destination.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
        return (dest_name);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
