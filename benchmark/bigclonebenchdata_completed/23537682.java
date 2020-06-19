import java.io.*;
import java.lang.*;
import java.util.*;



class c23537682 {
public static MyHelperClass LOG;
	public static MyHelperClass IOUtils;
	public static MyHelperClass getResourceUrl(Class o0, String o1){ return null; }
//public MyHelperClass LOG;
//	public MyHelperClass IOUtils;
//	public MyHelperClass getResourceUrl(Class o0, String o1){ return null; }

    public static byte[] readResource(Class owningClass, String resourceName) {
        final URL url =(URL)(Object) getResourceUrl(owningClass, resourceName);
        if (null == url) {
            throw new MissingResourceException(owningClass.toString() + " key '" + resourceName + "'", owningClass.toString(), resourceName);
        }
        LOG.info("Loading resource '" + url.toExternalForm() + "' " + "from " + owningClass);
        final InputStream inputStream;
        try {
            inputStream =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Should not happpen", e);
        }
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            IOUtils.copy(inputStream, outputStream);
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Should not happpen", e);
        }
        return outputStream.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class URL {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}
