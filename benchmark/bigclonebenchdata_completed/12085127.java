import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12085127 {
public MyHelperClass EncogLogging;
	public MyHelperClass navigate(URL o0, InputStream o1){ return null; }

    public final void navigate(final URL url)  throws Throwable {
        try {
            MyHelperClass EncogLogging = new MyHelperClass();
            EncogLogging.log(EncogLogging.LEVEL_INFO, "Navigating to page:" + url);
            final URLConnection connection = url.openConnection();
            final InputStream is = connection.getInputStream();
            navigate(url, is);
            is.close();
        } catch (final IOException e) {
            EncogLogging.log(EncogLogging.LEVEL_ERROR, e);
            throw(Throwable)(Object) new BrowseError(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LEVEL_INFO;
	public MyHelperClass LEVEL_ERROR;
public MyHelperClass log(MyHelperClass o0, IOException o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class BrowseError {

BrowseError(){}
	BrowseError(IOException o0){}}
