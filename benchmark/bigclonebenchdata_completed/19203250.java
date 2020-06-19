import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19203250 {
public MyHelperClass readAnnotationBlock(BufferedReader o0){ return null; }

    private void readAnnotations() throws Throwable, IOException {
        MyHelperClass url = new MyHelperClass();
        final BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        try {
            String line = null;
            while ((line = in.readLine()) != null) {
                MyHelperClass lineNumber = new MyHelperClass();
                lineNumber++;
                if (line.startsWith("ANNOTATE")) {
                    readAnnotationBlock(in);
                }
            }
        } catch (IOException e) {
            throw e;
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int lineNumber;
public MyHelperClass openStream(){ return null; }}
