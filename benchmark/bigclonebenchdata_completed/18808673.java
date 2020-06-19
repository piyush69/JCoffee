import java.io.*;
import java.lang.*;
import java.util.*;



class c18808673 {
public MyHelperClass Log;
	public MyHelperClass getName(){ return null; }
public MyHelperClass lastModified;
	public MyHelperClass lastConnect;
	public MyHelperClass conn;
	public MyHelperClass url;
	public MyHelperClass setProxy(){ return null; }

    private synchronized void connect() throws IOException {
        long now = System.currentTimeMillis();
        MyHelperClass lastConnect = new MyHelperClass();
        if ((int)(Object)lastConnect == 0 ||(int)(Object) lastConnect + 500 < now) {
            MyHelperClass Resource = new MyHelperClass();
            Log.logRB(Resource.CONNECTINGTO, new Object[] { getName() });
            String auth =(String)(Object) setProxy();
            conn = url.openConnection();
            if (auth != null) conn.setRequestProperty("Proxy-Authorization", auth);
            conn.connect();
            lastModified = conn.getLastModified();
            lastConnect =(MyHelperClass)(Object) System.currentTimeMillis();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONNECTINGTO;
public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass logRB(MyHelperClass o0, Object[] o1){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass openConnection(){ return null; }}
