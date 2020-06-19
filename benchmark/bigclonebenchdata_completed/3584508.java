import java.io.*;
import java.lang.*;
import java.util.*;



class c3584508 {
public MyHelperClass getResource(MyHelperClass o0){ return null; }
public MyHelperClass destinationFile(){ return null; }

    private void copyResource() throws Exception {
        MyHelperClass source = new MyHelperClass();
        URL url =(URL)(Object) getResource(source);
        InputStream input;
        if (url != null) {
            input =(InputStream)(Object) url.openStream();
//        MyHelperClass source = new MyHelperClass();
        } else if (new File((String)(Object)source).exists()) {
//            MyHelperClass source = new MyHelperClass();
            input = new FileInputStream((String)(Object)source);
        } else {
//            MyHelperClass source = new MyHelperClass();
            throw new Exception("Could not load resource: " + source);
        }
        OutputStream output = new FileOutputStream((String)(Object)destinationFile());
        int b;
        while ((b = input.read()) != -1) output.write(b);
        input.close();
        output.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}
