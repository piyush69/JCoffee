import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6439640 {

    public Properties load()  throws Throwable {
        Properties lvProperties = new Properties();
        try {
            MyHelperClass url = new MyHelperClass();
            InputStream lvInputStream =(InputStream)(Object) url.openStream();
            lvProperties.load(lvInputStream);
        } catch (Exception e) {
            throw new PropertiesLoadException("Error in load-method:", e);
        }
        return lvProperties;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class PropertiesLoadException extends Exception{
	public PropertiesLoadException(String errorMessage) { super(errorMessage); }
	PropertiesLoadException(String o0, Exception o1){}
	PropertiesLoadException(){}
}
