import java.io.*;
import java.lang.*;
import java.util.*;



class c16002886 {
public static MyHelperClass getURL(String o0){ return null; }
//public MyHelperClass getURL(String o0){ return null; }

    public static InputStream getInputStream(String name) throws java.io.IOException {
        URL url =(URL)(Object) getURL(name);
        if (url != null) {
            return(InputStream)(Object) url.openStream();
        }
        throw new FileNotFoundException("UniverseData: Resource \"" + name + "\" not found.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}
