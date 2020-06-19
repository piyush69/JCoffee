import java.io.*;
import java.lang.*;
import java.util.*;



class c5097360 {
public static MyHelperClass nameToURL(String o0, URI o1, ClassLoader o2){ return null; }
//public MyHelperClass nameToURL(String o0, URI o1, ClassLoader o2){ return null; }

    public static BufferedReader openForReading(String name, URI base, ClassLoader classLoader) throws IOException {
        if ((name == null) || name.trim().equals("")) {
            return null;
        }
        if (name.trim().equals("System.in")) {
            MyHelperClass STD_IN = new MyHelperClass();
            if (STD_IN == null) {
//                MyHelperClass STD_IN = new MyHelperClass();
                STD_IN =(MyHelperClass)(Object) new BufferedReader(new InputStreamReader(System.in));
            }
//            MyHelperClass STD_IN = new MyHelperClass();
            return (BufferedReader)(Object)STD_IN;
        }
        URL url =(URL)(Object) nameToURL(name, base, classLoader);
        if (url == null) {
            throw new IOException("Could not convert \"" + name + "\" with base \"" + base + "\" to a URL.");
        }
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader((InputStream)(Object)url.openStream());
        } catch (UncheckedIOException ex) {
            try {
                MyHelperClass ClassUtilities = new MyHelperClass();
                URL possibleJarURL =(URL)(Object) ClassUtilities.jarURLEntryResource(url.toString());
                if (possibleJarURL != null) {
                    inputStreamReader = new InputStreamReader((InputStream)(Object)possibleJarURL.openStream());
                }
                return new BufferedReader(inputStreamReader);
            } catch (Exception ex2) {
                try {
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                } catch (IOException ex3) {
                }
                IOException ioException = new IOException("Failed to open \"" + url + "\".");
                ioException.initCause(ex);
                throw ioException;
            }
        }
        return new BufferedReader(inputStreamReader);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass jarURLEntryResource(String o0){ return null; }}

class URI {

}

class URL {

public MyHelperClass openStream(){ return null; }}
