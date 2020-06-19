
import java.io.UncheckedIOException;


class c17199913 {

    protected static InputStream loadResource(String resource) throws MissingResourceException {
        Thread thread = Thread.currentThread();
        ClassLoader cLoader = thread.getContextClassLoader();
        URL url =(URL)(Object) cLoader.getResource(resource);
        if (url == null) {
            throw new MissingResourceException("Unable to find resource '" + resource + "'.", resource, resource);
        }
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            return is;
        } catch (UncheckedIOException e) {
            throw new MissingResourceException("Unable to load resource '" + resource + "' (IOException).", resource, resource);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class MissingResourceException extends Exception{
	public MissingResourceException(String errorMessage) { super(errorMessage); }
	MissingResourceException(){}
	MissingResourceException(String o0, String o1, String o2){}
}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
