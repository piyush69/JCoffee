import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c982157 {
public MyHelperClass Configuration;

    private InputStream getDomainMap() {
        MyHelperClass MAPPING_KEY = new MyHelperClass();
        String domainMap =(String)(Object) Configuration.getString(MAPPING_KEY);
        InputStream is = new StringBufferInputStream(domainMap);
        if ("".equals(domainMap)) {
            try {
                MyHelperClass XML_FILE_NAME = new MyHelperClass();
                URL url = getClass().getResource((String)(Object)XML_FILE_NAME).toURI().toURL();
                is = url.openStream();
            } catch (URISyntaxException e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Could not find domainmapping file", e);
            } catch (MalformedURLException e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Could not find domainmapping file", e);
            } catch (IOException e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Error reading/fetching domain map", e);
            }
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass warn(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass warn(String o0, URISyntaxException o1){ return null; }}
