
import java.io.UncheckedIOException;


class c14787421 {
public MyHelperClass SimpleConfiguratorUtils;
	public MyHelperClass getLastBundleInfo(){ return null; }

    private void saveStateAsLast(URL url) {
        InputStream sourceStream = null;
        OutputStream destinationStream = null;
        File lastBundlesTxt =(File)(Object) getLastBundleInfo();
        try {
            try {
                destinationStream =(OutputStream)(Object) new FileOutputStream(lastBundlesTxt);
                sourceStream =(InputStream)(Object) url.openStream();
                SimpleConfiguratorUtils.transferStreams(sourceStream, destinationStream);
            } finally {
                if (destinationStream != null) destinationStream.close();
                if (sourceStream != null) sourceStream.close();
            }
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass transferStreams(InputStream o0, OutputStream o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
