import java.io.*;
import java.lang.*;
import java.util.*;



class c7743689 {

    private void loadProperties() {
        MyHelperClass properties = new MyHelperClass();
        if (properties == null) {
//            MyHelperClass properties = new MyHelperClass();
            properties =(MyHelperClass)(Object) new Properties();
            try {
                MyHelperClass propsFile = new MyHelperClass();
                URL url =(URL)(Object) getClass().getResource((String)(Object)propsFile);
//                MyHelperClass properties = new MyHelperClass();
                properties.load(url.openStream());
            } catch (UncheckedIOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
