import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9355156 {

    public void addScanURL(final URL url)  throws Throwable {
        if (url == null) throw new NullArgumentException();
        try {
            url.openConnection().connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyHelperClass urlList = new MyHelperClass();
        urlList.add(url);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(URL o0){ return null; }}

class NullArgumentException extends Exception{
	public NullArgumentException(String errorMessage) { super(errorMessage); }
	NullArgumentException(){}
}
