
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23537684 {
public static MyHelperClass IOUtils;
	public static MyHelperClass readResource(Class o0, String o1){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass readResource(Class o0, String o1){ return null; }

    public static void copyResourceToFile(Class owningClass, String resourceName, File destinationDir) {
        final byte[] resourceBytes =(byte[])(Object) readResource(owningClass, resourceName);
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(resourceBytes);
        final File destinationFile = new File(destinationDir, resourceName);
        final FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(destinationFile);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        try {
            IOUtils.copy(inputStream, fileOutputStream);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ByteArrayInputStream o0, FileOutputStream o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
