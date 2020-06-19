


class c1728000 {
public MyHelperClass config;
	public MyHelperClass toBundleName(String o0, Locale o1){ return null; }

        public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
            if (baseName == null || locale == null || format == null || loader == null) throw new NullPointerException();
            ResourceBundle bundle = null;
            if (format.equals("user")) {
                String bundleName =(String)(Object) toBundleName(baseName, locale);
                MyHelperClass HOME = new MyHelperClass();
                String resourceName = "file://" + config.getString(HOME) + "/" + bundleName + ".properties";
                InputStream stream = null;
                try {
                    URL url = new URL(resourceName);
                    if (url != null) {
                        URLConnection connection =(URLConnection)(Object) url.openConnection();
                        if (connection != null) {
                            if (reload) {
                                connection.setUseCaches(false);
                            }
                            stream =(InputStream)(Object) connection.getInputStream();
                        }
                    }
                } catch (Throwable t) {
                }
                if (stream != null) {
                    BufferedInputStream bis = new BufferedInputStream(stream);
                    MyHelperClass UTF8ClassLoader = new MyHelperClass();
                    bundle =(ResourceBundle)(Object) new UserResourceBundle(UTF8ClassLoader.readUTFStreamToEscapedASCII(bis), this.newBundle(baseName, locale, "java.properties", loader, reload));
                    bis.close();
                } else {
                    return this.newBundle(baseName, locale, "java.properties", loader, reload);
                }
            }
            return bundle;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readUTFStreamToEscapedASCII(BufferedInputStream o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }}

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

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class UserResourceBundle {

UserResourceBundle(MyHelperClass o0, ResourceBundle o1){}
	UserResourceBundle(){}}
