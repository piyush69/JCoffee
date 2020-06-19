import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20370107 {
public MyHelperClass NULL;
public MyHelperClass NOT_FOUND;
	public MyHelperClass PASSWORD_INCORRECT;
	public MyHelperClass PASSWORD_MISSING;
	public MyHelperClass setLocalAttr(MyHelperClass o0, String o1){ return null; }
public MyHelperClass errorMessage;
	public MyHelperClass NO_SUCH_HOST;
	public MyHelperClass COULD_NOT_RETRIEVE;
	public MyHelperClass COULD_NOT_CONNECT;
	public MyHelperClass store(){ return null; }

    public boolean refresh() {
        try {
            MyHelperClass url = new MyHelperClass();
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setUseCaches(false);
            MyHelperClass credential = new MyHelperClass();
            if (credential != null) conn.setRequestProperty("Authorization",(String)(Object) credential);
            conn.connect();
            int status = ((HttpURLConnection) conn).getResponseCode();
            MyHelperClass errorMessage = new MyHelperClass();
            if (status == 401 || status == 403) errorMessage = (credential == null ? PASSWORD_MISSING : PASSWORD_INCORRECT); else if (status == 404) errorMessage = NOT_FOUND; else if (status != 200) errorMessage = COULD_NOT_RETRIEVE; else {
                InputStream in = conn.getInputStream();
                MyHelperClass TinyWebServer = new MyHelperClass();
                byte[] httpData =(byte[])(Object) TinyWebServer.slurpContents(in, true);
                synchronized (this) {
                    byte[] data =(byte[])(Object) NULL; //new byte[]();
                    data = httpData;
                    MyHelperClass dataProvider = new MyHelperClass();
                    dataProvider = null;
                }
//                MyHelperClass errorMessage = new MyHelperClass();
                errorMessage = null;
                Date refreshDate =(Date)(Object) NULL; //new Date();
                refreshDate = new Date();
                MyHelperClass OWNER_HEADER_FIELD = new MyHelperClass();
                String owner = conn.getHeaderField((String)(Object)OWNER_HEADER_FIELD);
                MyHelperClass OWNER_ATTR = new MyHelperClass();
                if (owner != null) setLocalAttr(OWNER_ATTR, owner);
                store();
                return true;
            }
        } catch (UnknownHostException uhe) {
            errorMessage = NO_SUCH_HOST;
        } catch (ConnectException ce) {
            errorMessage = COULD_NOT_CONNECT;
        } catch (IOException ioe) {
            errorMessage = COULD_NOT_RETRIEVE;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass slurpContents(InputStream o0, boolean o1){ return null; }}
