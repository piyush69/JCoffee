
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21656668 {

    private void copyResourceToFile(final String resourceFilename, final String destinationFilename) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            MyHelperClass MatsimResource = new MyHelperClass();
            inStream =(InputStream)(Object) MatsimResource.getAsInputStream(resourceFilename);
            outStream =(OutputStream)(Object) new FileOutputStream(destinationFilename);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(inStream, outStream);
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAsInputStream(String o0){ return null; }
	public MyHelperClass copyStream(InputStream o0, OutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
