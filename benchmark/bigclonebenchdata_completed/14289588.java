


class c14289588 {
public MyHelperClass toBundleName(String o0, Locale o1){ return null; }
public MyHelperClass toResourceName(String o0, String o1){ return null; }

//    @Override
    public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
        if ((baseName == null) || (locale == null) || (format == null) || (loader == null)) {
            throw new NullPointerException();
        }
        ResourceBundle bundle = null;
        MyHelperClass XML = new MyHelperClass();
        if (format.equals(XML)) {
            String bundleName =(String)(Object) toBundleName(baseName, locale);
            String resourceName =(String)(Object) toResourceName(bundleName, format);
            URL url =(URL)(Object) loader.getResource(resourceName);
            if (url != null) {
                URLConnection connection =(URLConnection)(Object) url.openConnection();
                if (connection != null) {
                    if (reload) {
                        connection.setUseCaches(false);
                    }
                    InputStream stream =(InputStream)(Object) connection.getInputStream();
                    if (stream != null) {
                        BufferedInputStream bis = new BufferedInputStream(stream);
                        bundle =(ResourceBundle)(Object) new XMLResourceBundle(bis);
                        bis.close();
                    }
                }
            }
        }
        return bundle;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Locale {

}

class ResourceBundle {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class XMLResourceBundle {

XMLResourceBundle(BufferedInputStream o0){}
	XMLResourceBundle(){}}
