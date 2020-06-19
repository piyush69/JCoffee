import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7292100 {
public MyHelperClass client;
	public MyHelperClass FTPClient;

    public  c7292100(Resource resource, String basePath) throws Throwable, Exception {
        super(resource, basePath);
        client =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new FTPClient();
        client.addProtocolCommandListener(new CommandLogger());
        client.connect(resource.getString("host"), Integer.parseInt((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)resource.getString("port")));
        client.login(resource.getString("user"), resource.getString("pw"));
        client.setFileType(FTPClient.BINARY_FILE_TYPE);
        client.enterLocalPassiveMode();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass addProtocolCommandListener(CommandLogger o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class Resource {

public MyHelperClass getString(String o0){ return null; }}

class FTPClient {

}

class CommandLogger {

}

class Object {

Object(Resource o0, String o1){}
	Object(){}}
