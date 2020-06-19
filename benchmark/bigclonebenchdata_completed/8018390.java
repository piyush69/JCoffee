import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8018390 {
public MyHelperClass cache;
	public MyHelperClass hasContent(){ return null; }

    protected String getCache() throws Throwable, IOException {
        MyHelperClass cache = new MyHelperClass();
        if (cache == null) {
            URL url = ((URI)(URI)(Object) hasContent()).toURL();
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) ;
            in.close();
            cache =(MyHelperClass)(Object) inputLine;
        }
        return(String)(Object) cache;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
