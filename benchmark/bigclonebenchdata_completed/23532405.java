import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23532405 {
public MyHelperClass getConfigFile(FreeFormConfigurable o0, String o1, MyHelperClass o2){ return null; }

    public void persist(FreeFormConfigurable ffConfigurable, String relativePath)  throws Throwable {
        MyHelperClass PROPERTIES_CONFIG_EXT = new MyHelperClass();
        File file =(File)(Object) getConfigFile(ffConfigurable, relativePath, PROPERTIES_CONFIG_EXT);
        InputStream is =(InputStream)(Object) ffConfigurable.getInputConfigStream();
        try {
            OutputStream os = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
        } catch (Exception e) {
            throw new ConfigurationException("Failed to store free from config for class " + ffConfigurable.getClass().getName() + " into file " + file.getAbsolutePath());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class FreeFormConfigurable {

public MyHelperClass getInputConfigStream(){ return null; }}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
}
