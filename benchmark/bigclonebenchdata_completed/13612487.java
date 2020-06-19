import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13612487 {

    private ArrayList<String> loadProperties(String filename) throws Throwable, DevFailed,(Throwable)(Object) IOException {
        java.net.URL url = getClass().getResource(filename);
        if (url == null) {
            MyHelperClass Except = new MyHelperClass();
            Except.throw_exception("LOAD_PROPERTY_FAILED", "URL for property file (" + filename + ") is null !", "PogoProperty.loadProperties()");
            return null;
        }
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        ArrayList<String> vs = new ArrayList<String>();
        String str;
        while ((str = br.readLine()) != null) {
            str = str.trim();
            if (!str.startsWith("#")) if (str.length() > 0) vs.add(str);
        }
        br.close();
        return vs;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass throw_exception(String o0, String o1, String o2){ return null; }}

class DevFailed {

}
