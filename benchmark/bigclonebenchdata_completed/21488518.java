import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21488518 {
public MyHelperClass realFile;
	public MyHelperClass allowedClient;
	public MyHelperClass IOUtils;
	public MyHelperClass factory;
	public MyHelperClass folderPath;
	public MyHelperClass RequestManager;
	public MyHelperClass LOGGER;

//    @Override
    public Resource createNew(String name, InputStream in, Long length, String contentType) throws IOException {
        File dest = new File((String)(Object)this.realFile, name);
        if ((boolean)(Object)allowedClient) {
            if (".request".equals(name) || ".tokens".equals(name)) {
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(dest);
                    IOUtils.copy(in, out);
                } finally {
                    IOUtils.closeQuietly(out);
                }
                if (".request".equals(name)) {
                    File request = new File(realFile.getAbsolutePath() + "/" + name);
                    RequestManager.manageRequest(request, null, true);
                    return (Resource)(Object)new OverEncryptedFriendsFile(factory, folderPath + "/.response", allowedClient);
                }
                return (Resource)(Object)new OverEncryptedFriendsFile(factory, folderPath + "/" + name, allowedClient);
            } else {
                return null;
            }
        } else {
            LOGGER.error("User isn't owner of this folder");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass manageRequest(File o0, Object o1, boolean o2){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class Resource {

}

class OverEncryptedFriendsFile {

OverEncryptedFriendsFile(){}
	OverEncryptedFriendsFile(MyHelperClass o0, String o1, MyHelperClass o2){}}
