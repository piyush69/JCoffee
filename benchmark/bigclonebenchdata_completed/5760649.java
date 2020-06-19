import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5760649 {
public MyHelperClass fileResourceManager;
public MyHelperClass IOUtils;
	public MyHelperClass LOGGER;
	public MyHelperClass txId;

    public void createFile(File src, String filename) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(src);
            OutputStream fos =(OutputStream)(Object) this.fileResourceManager.writeResource(this.txId, filename);
            IOUtils.copy(fis, fos);
            fos.close();
            fis.close();
        } catch (UncheckedIOException e) {
            LOGGER.error((ResourceManagerException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(ResourceManagerException o0){ return null; }
	public MyHelperClass writeResource(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }}

class ResourceManagerException extends Exception{
	public ResourceManagerException(String errorMessage) { super(errorMessage); }
}
