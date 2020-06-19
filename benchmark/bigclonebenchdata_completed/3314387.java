


class c3314387 {

    private static Properties getProperties(String propFilename, ClassLoader loader) {
        Properties properties = new Properties();
        try {
            MyHelperClass Loader = new MyHelperClass();
            URL url =(URL)(Object) Loader.getResource(loader, propFilename);
            properties.load(url.openStream());
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.debug("Cannot find crypto property file: " + propFilename);
            throw new RuntimeException("CryptoFactory: Cannot load properties: " + propFilename);
        }
        return properties;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getResource(ClassLoader o0, String o1){ return null; }}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
