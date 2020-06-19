


class c4262766 {
public MyHelperClass toBundleName(String o0, Locale o1){ return null; }
public MyHelperClass toResourceName(String o0, String o1){ return null; }

    public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
        String bundleName =(String)(Object) toBundleName(baseName, locale);
        String resourceName =(String)(Object) toResourceName(bundleName, "properties");
        ResourceBundle bundle = null;
        InputStream stream = null;
        if (reload) {
            URL url =(URL)(Object) loader.getResource(resourceName);
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
            try {
                bundle =(ResourceBundle)(Object) new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));
            } finally {
                stream.close();
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

public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PropertyResourceBundle {

PropertyResourceBundle(){}
	PropertyResourceBundle(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
