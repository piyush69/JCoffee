import java.io.*;
import java.lang.*;
import java.util.*;



class c19687729 {

    public static void readShaderSource(ClassLoader context, String path, URL url, StringBuffer result) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("#include ")) {
                    String includeFile = line.substring(9).trim();
                    MyHelperClass Locator = new MyHelperClass();
                    String next =(String)(Object) Locator.getRelativeOf(path, includeFile);
//                    MyHelperClass Locator = new MyHelperClass();
                    URL nextURL =(URL)(Object) Locator.getResource(next, context);
                    if (nextURL == null) {
                        next = includeFile;
//                        MyHelperClass Locator = new MyHelperClass();
                        nextURL =(URL)(Object) Locator.getResource(next, context);
                    }
                    if (nextURL == null) {
                        throw new FileNotFoundException("Can't find include file " + includeFile);
                    }
                    readShaderSource(context, next, nextURL, result);
                } else {
                    result.append(line + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0, ClassLoader o1){ return null; }
	public MyHelperClass getRelativeOf(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
