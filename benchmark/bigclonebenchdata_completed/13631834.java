


class c13631834 {

    private static void loadProperties(Properties props, String res, boolean warnIfNotFound) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.debug("Reading properties from resource " + res);
        URL url =(URL)(Object) ResourceFileStorageFactory.class.getResource(res);
        if (null == url) {
            if (warnIfNotFound) {
//                MyHelperClass log = new MyHelperClass();
                log.warn("Resource " + res + " was not found");
            } else {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Resource " + res + " was not found");
            }
        } else {
            InputStream in =(InputStream)(Object) url.openStream();
            try {
                props.load(in);
            } finally {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class ResourceFileStorageFactory {

}

class InputStream {

public MyHelperClass close(){ return null; }}
