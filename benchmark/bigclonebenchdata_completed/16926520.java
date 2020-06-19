import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16926520 {
public MyHelperClass password;
	public MyHelperClass port;
	public MyHelperClass visitDirectory(FTPClient o0, String o1, MyHelperClass o2, DocumentHolder o3, DocumentFactory o4){ return null; }

    public int extractDocumentsInternal(DocumentHolder holder, DocumentFactory docFactory)  throws Throwable {
        FTPClient client = new FTPClient();
        try {
            MyHelperClass site = new MyHelperClass();
            client.connect(site,(int)(Object) port == 0 ?(int)(Object) 21 :(int)(Object) port);
            MyHelperClass user = new MyHelperClass();
            client.login(user, password);
            MyHelperClass path = new MyHelperClass();
            visitDirectory(client, "", path, holder, docFactory);
            client.disconnect();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        MyHelperClass fileCount = new MyHelperClass();
        return(int)(Object) fileCount;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DocumentHolder {

}

class DocumentFactory {

}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass disconnect(){ return null; }}
