import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20275821 {
public MyHelperClass NULL;
public MyHelperClass FileType;

    public FileAttribute getAttribute(URL url) throws Throwable, VFSException {
        try {
            HttpURLConnection con =(HttpURLConnection)(Object) NULL; //new HttpURLConnection();
            con = (HttpURLConnection) url.openConnection();
//            MyHelperClass con = new MyHelperClass();
            con.setInstanceFollowRedirects(false);
//            MyHelperClass con = new MyHelperClass();
            int response = con.getResponseCode();
            if (response >= 400) {
                MyHelperClass FileType = new MyHelperClass();
                return(FileAttribute)(Object) new DefaultFileAttribute(false, 0, null, FileType.NOT_EXISTS);
            }
            boolean redirect = (response >= 300 && response <= 399);
            if (redirect) {
//                MyHelperClass con = new MyHelperClass();
                String location = con.getHeaderField("Location");
                return getAttribute(new URL(url, location));
            }
//            MyHelperClass con = new MyHelperClass();
            return(FileAttribute)(Object) new DefaultFileAttribute(true, con.getContentLength(), new Date(con.getLastModified()), url.toString().endsWith("/") ? FileType.DIRECTORY : FileType.FILE);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            MyHelperClass file = new MyHelperClass();
            throw new WrongPathException((String)(Object)file.getAbsolutePath());
        } catch (IOException e) {
            MyHelperClass file = new MyHelperClass();
            throw new VFSIOException("IOException opening " + file.getAbsolutePath(), e);
        } finally {
            MyHelperClass con = new MyHelperClass();
            if (con != null) {
//                MyHelperClass con = new MyHelperClass();
                con.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NOT_EXISTS;
	public MyHelperClass FILE;
	public MyHelperClass DIRECTORY;
public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }}

class FileAttribute {

}

class VFSException extends Exception{
	public VFSException(String errorMessage) { super(errorMessage); }
}

class DefaultFileAttribute {

DefaultFileAttribute(){}
	DefaultFileAttribute(boolean o0, int o1, Object o2, MyHelperClass o3){}}

class WrongPathException extends Exception{
	public WrongPathException(String errorMessage) { super(errorMessage); }
}

class VFSIOException extends Exception{
	public VFSIOException(String errorMessage) { super(errorMessage); }
	VFSIOException(String o0, IOException o1){}
	VFSIOException(){}
}
