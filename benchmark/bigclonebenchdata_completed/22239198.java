import java.io.*;
import java.lang.*;
import java.util.*;



class c22239198 {

    public boolean loadURL(URL url) {
        try {
            MyHelperClass propertyBundle = new MyHelperClass();
            propertyBundle.load(url.openStream());
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("Configuration loaded from " + url + "\n");
            return true;
        } catch (Exception e) {
            MyHelperClass canComplain = new MyHelperClass();
            if ((boolean)(Object)canComplain) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Unable to load configuration " + url + "\n");
            }
//            MyHelperClass canComplain = new MyHelperClass();
            canComplain =(MyHelperClass)(Object) false;
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
