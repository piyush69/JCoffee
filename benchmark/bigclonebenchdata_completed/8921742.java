import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8921742 {
public MyHelperClass localPathMap;
	public MyHelperClass sourceDetail;
	public MyHelperClass client;
	public MyHelperClass workingDirectory;
	public MyHelperClass ConfigManager;

    public void FTPSource(SourceDetail sourceDetail) throws SourceException {
        this.sourceDetail =(MyHelperClass)(Object) sourceDetail;
        localPathMap =(MyHelperClass)(Object) new HashMap<String, String>();
        client =(MyHelperClass)(Object) new FTPClient();
        try {
            client.connect(sourceDetail.getHost());
            client.login(sourceDetail.getUser(), sourceDetail.getPassword());
            workingDirectory =(MyHelperClass)(Object) new File(ConfigManager.getGUIConfig().getWorkingDirectoryName() + File.separator + sourceDetail.getName());
            workingDirectory.mkdir();
        } catch (Exception e) {
            throw new SourceException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getWorkingDirectoryName(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass getGUIConfig(){ return null; }}

class SourceDetail {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getUser(){ return null; }}

class SourceException extends Exception{
	public SourceException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

}
