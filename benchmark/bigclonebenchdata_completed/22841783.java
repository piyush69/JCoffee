import java.io.*;
import java.lang.*;
import java.util.*;



class c22841783 {
public MyHelperClass inputStream;
	public MyHelperClass urlc;
	public MyHelperClass readDirectory(){ return null; }

    public void GridDirectoryList(URL url) throws McIDASException {
        try {
            urlc =(MyHelperClass)(Object) (AddeURLConnection)(AddeURLConnection)(Object) url.openConnection();
            inputStream =(MyHelperClass)(Object) new DataInputStream(new BufferedInputStream((InputStream)(Object)urlc.getInputStream()));
        } catch (UncheckedIOException e) {
            throw new McIDASException("Error opening URL for grids:" + e);
        }
        readDirectory();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class McIDASException extends Exception{
	public McIDASException(String errorMessage) { super(errorMessage); }
}

class AddeURLConnection {

}
