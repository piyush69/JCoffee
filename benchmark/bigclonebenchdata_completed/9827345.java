


class c9827345 {

    private static Properties getProperties(String propFilename) {
        Properties properties = new Properties();
        try {
            MyHelperClass Loader = new MyHelperClass();
            URL url =(URL)(Object) Loader.getResource(propFilename);
            properties.load(url.openStream());
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.debug("Cannot find SAML property file: " + propFilename);
            throw new RuntimeException("SAMLIssuerFactory: Cannot load properties: " + propFilename);
        }
        return properties;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
