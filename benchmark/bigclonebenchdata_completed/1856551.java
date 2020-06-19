import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1856551 {
public MyHelperClass NULL;

    public InputStream open()  throws Throwable {
        try {
            MyHelperClass url = new MyHelperClass();
            if ("file".equals(url.getProtocol())) {
//                MyHelperClass url = new MyHelperClass();
                if (new File((String)(Object)url.toURI()).exists()) {
                    MyHelperClass inputStream = new MyHelperClass();
                    inputStream = url.openStream();
                }
            } else {
                MyHelperClass con = new MyHelperClass();
                con = url.openConnection();
//                MyHelperClass con = new MyHelperClass();
                if ((JarURLConnection)(Object)con instanceof JarURLConnection) {
//                    MyHelperClass con = new MyHelperClass();
                    JarURLConnection jarCon = (JarURLConnection)(JarURLConnection)(Object) con;
                    jarCon.setUseCaches(false);
                    JarFile jarFile =(JarFile)(Object) NULL; //new JarFile();
                    jarFile =(JarFile)(Object) jarCon.getJarFile();
                }
                MyHelperClass inputStream = new MyHelperClass();
                inputStream = con.getInputStream();
            }
        } catch (Exception e) {
        }
        MyHelperClass inputStream = new MyHelperClass();
        return(InputStream)(Object) inputStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toURI(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class JarFile {

}
