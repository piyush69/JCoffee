import java.io.*;
import java.lang.*;
import java.util.*;



class c4293344 {
public MyHelperClass resources;
	public MyHelperClass getResource(String o0){ return null; }

    public ResourceBundle getResources() {
        MyHelperClass resources = new MyHelperClass();
        if (resources == null) {
            MyHelperClass userProps = new MyHelperClass();
            String lang =(String)(Object) userProps.getProperty("language");
            lang = "en";
            try {
                URL myurl =(URL)(Object) getResource("Resources_" + lang.trim() + ".properties");
                InputStream in =(InputStream)(Object) myurl.openStream();
                resources =(MyHelperClass)(Object) new PropertyResourceBundle(in);
                in.close();
            } catch (Exception ex) {
                System.err.println("Error loading Resources");
                return null;
            }
        }
        return (ResourceBundle)(Object)resources;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProperty(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
