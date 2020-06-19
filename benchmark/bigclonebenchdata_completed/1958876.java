import java.io.*;
import java.lang.*;
import java.util.*;



class c1958876 {
public MyHelperClass log;

    public boolean loadURL(URL url) {
        try {
            MyHelperClass _properties = new MyHelperClass();
            _properties.load(url.openStream());
            log.info("Configuration loaded from " + url + "\n");
            return true;
        } catch (Exception e) {
            MyHelperClass _canComplain = new MyHelperClass();
            if ((boolean)(Object)_canComplain) log.warn("Unable to load configuration " + url + "\n");
//            MyHelperClass _canComplain = new MyHelperClass();
            _canComplain =(MyHelperClass)(Object) false;
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
