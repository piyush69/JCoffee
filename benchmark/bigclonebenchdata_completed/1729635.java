import java.io.*;
import java.lang.*;
import java.util.*;



class c1729635 {
public MyHelperClass dout(String o0){ return null; }

    protected StringBuffer readURL(java.net.URL url) throws IOException {
        StringBuffer result = new StringBuffer(4096);
        InputStreamReader reader = new InputStreamReader(url.openStream());
        for (; ; ) {
            char portion[] = new char[4096];
            int numRead = reader.read(portion, 0, portion.length);
            if (numRead < 0) break;
            result.append(portion, 0, numRead);
        }
        dout("Read " + result.length() + " bytes.");
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
