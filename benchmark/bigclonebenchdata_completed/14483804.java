import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14483804 {
public MyHelperClass conn;
	public MyHelperClass name;
	public MyHelperClass contentType;
	public MyHelperClass url;
	public MyHelperClass size;
	public MyHelperClass sourceInfo;

        public void URLStream(URL url) throws IOException {
            this.url =(MyHelperClass)(Object) url;
            this.conn = this.url.openConnection();
            contentType = conn.getContentType();
            name =(MyHelperClass)(Object) url.toExternalForm();
            size =(MyHelperClass)(Object) new Long((long)(Object)conn.getContentLength());
            sourceInfo =(MyHelperClass)(Object) "url";
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
