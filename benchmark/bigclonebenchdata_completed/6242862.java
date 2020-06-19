import java.io.*;
import java.lang.*;
import java.util.*;



class c6242862 {
public MyHelperClass configFile;
	public MyHelperClass builder;

    public void reload() throws SAXException, IOException {
        MyHelperClass url = new MyHelperClass();
        if (url != null) {
//            MyHelperClass url = new MyHelperClass();
            java.io.InputStream is =(InputStream)(Object) url.openStream();
            MyHelperClass configDoc = new MyHelperClass();
            configDoc = builder.parse(is);
            is.close();
//            MyHelperClass url = new MyHelperClass();
            System.out.println("XML config file read correctly from " + url);
        } else {
            MyHelperClass configDoc = new MyHelperClass();
            configDoc = builder.parse(configFile);
            MyHelperClass configFile = new MyHelperClass();
            System.out.println("XML config file read correctly from " + configFile);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
