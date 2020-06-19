import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7891509 {
public MyHelperClass inputLine;

    public  void PageLoader(String pageAddress) throws Throwable, Exception {
        URL url = new URL(pageAddress);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        inputLine =(MyHelperClass)(Object) "";
        while (in.ready()) {
            inputLine =(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) inputLine + in.readLine();
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
