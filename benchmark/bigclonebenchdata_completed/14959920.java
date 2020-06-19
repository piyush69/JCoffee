import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14959920 {
public MyHelperClass NULL;
public MyHelperClass[] done;
public MyHelperClass lastModified_;
	public MyHelperClass list_;
	public MyHelperClass exists_;
	public MyHelperClass length_;
	public MyHelperClass type_;
//	public MyHelperClass done;
	public MyHelperClass readList(BufferedReader o0){ return null; }
	public MyHelperClass getContentURL(){ return null; }
	public MyHelperClass isDirectory(){ return null; }

                public void run()  throws Throwable {
                    try {
                        boolean exists_ =(boolean)(Object) NULL; //new boolean();
                        exists_ = true;
                        URL url =(URL)(Object) getContentURL();
                        URLConnection cnx = url.openConnection();
                        cnx.connect();
                        lastModified_ =(MyHelperClass)(Object) cnx.getLastModified();
                        length_ =(MyHelperClass)(Object) cnx.getContentLength();
                        type_ =(MyHelperClass)(Object) cnx.getContentType();
                        if ((boolean)(Object)isDirectory()) {
                            InputStream in = cnx.getInputStream();
                            BufferedReader nr = new BufferedReader(new InputStreamReader(in));
                            FuVectorString v =(FuVectorString)(Object) readList(nr);
                            nr.close();
                            v.sort();
                            v.uniq();
                            list_ = v.toArray();
                        }
                    } catch (Exception ex) {
                        exists_ =(MyHelperClass)(Object) false;
                    }
                    done[0] =(MyHelperClass)(Object) true;
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FuVectorString {

public MyHelperClass uniq(){ return null; }
	public MyHelperClass sort(){ return null; }
	public MyHelperClass toArray(){ return null; }}
