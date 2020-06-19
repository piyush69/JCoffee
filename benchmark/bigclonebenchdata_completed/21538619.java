import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21538619 {
public static MyHelperClass _context;
//public MyHelperClass _context;

    public static InputStream getInputStream(URL url) throws Throwable, IOException {
        if (url.getProtocol().equals("resource")) {
            Resources res =(Resources)(Object) _context.getResources();
            String resname = url.getFile();
            resname = resname.split("\\.[a-z0-9]{3}")[0];
            int id =(int)(Object) res.getIdentifier(resname, "raw", "com.l1ghtm4n.text2speech");
            if (id == 0) {
                throw new NotFoundException();
            } else return(InputStream)(Object) res.openRawResource(id);
        } else {
            return url.openStream();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResources(){ return null; }}

class Resources {

public MyHelperClass getIdentifier(String o0, String o1, String o2){ return null; }
	public MyHelperClass openRawResource(int o0){ return null; }}

class NotFoundException extends Exception{
	public NotFoundException(String errorMessage) { super(errorMessage); }
	NotFoundException(){}
}
