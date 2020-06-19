


class c11650951 {

    private Properties loadProperties(final String propertiesName) throws IOException {
        Properties bundle = null;
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        final URL url =(URL)(Object) loader.getResource(propertiesName);
        if (url == null) {
            throw new IOException("Properties file " + propertiesName + " not found");
        }
        final InputStream is =(InputStream)(Object) url.openStream();
        if (is != null) {
            bundle = new Properties();
            bundle.load(is);
        } else {
            throw new IOException("Properties file " + propertiesName + " not avilable");
        }
        return bundle;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}
