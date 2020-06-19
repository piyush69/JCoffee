
import java.io.UncheckedIOException;


class c17067833 {

    private void copyResourceToDir(String ondexDir, String resource) {
        InputStream inputStream =(InputStream)(Object) OndexGraphImpl.class.getClassLoader().getResourceAsStream(resource);
        try {
            FileWriter fileWriter = new FileWriter(new File(ondexDir, resource));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Unable to copy '" + resource + "' file to " + ondexDir + "'");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class InputStream {

}

class OndexGraphImpl {

}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(String o0, String o1){}
	File(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
