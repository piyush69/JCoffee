import java.io.*;
import java.lang.*;
import java.util.*;



class c22841782 {
public MyHelperClass inputStream;
	public MyHelperClass urlc;
	public MyHelperClass readDirectory(){ return null; }

    public void GridDirectoryList(String gridSource) throws McIDASException {
        try {
            URL url = new URL(gridSource);
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

class McIDASException extends Exception{
	public McIDASException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class AddeURLConnection {

}
