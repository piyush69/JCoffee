
import java.io.UncheckedIOException;


class c988878 {
public MyHelperClass toBundleName(String o0, Locale o1){ return null; }
public MyHelperClass toResourceName(String o0, String o1){ return null; }

        public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
            System.out.println("newBundle");
            if (baseName == null || locale == null || format == null || loader == null) throw new NullPointerException();
            ResourceBundle bundle = null;
            if (format.equals("xml")) {
                String bundleName =(String)(Object) toBundleName(baseName, locale);
                String resourceName =(String)(Object) toResourceName(bundleName, format);
                System.out.println(resourceName);
                InputStream stream = null;
                if (reload) {
                    URL url =(URL)(Object) loader.getResource(resourceName);
                    System.out.println(url.toExternalForm());
                    if (url != null) {
                        URLConnection connection =(URLConnection)(Object) url.openConnection();
                        if (connection != null) {
                            connection.setUseCaches(false);
                            stream =(InputStream)(Object) connection.getInputStream();
                        }
                    }
                } else {
                    stream =(InputStream)(Object) loader.getResourceAsStream(resourceName);
                }
                if (stream != null) {
                    InputSource source = new InputSource(stream);
                    try {
                        bundle =(ResourceBundle)(Object) new XMLResourceBundle(source);
                    } catch (UncheckedIOException saxe) {
                        throw new IOException((String)(Object)saxe);
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

class InputStream {

}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class XMLResourceBundle {

XMLResourceBundle(InputSource o0){}
	XMLResourceBundle(){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
