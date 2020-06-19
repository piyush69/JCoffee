


class c967161 {
public static MyHelperClass _LOG;
	public static MyHelperClass _getClassLoader(){ return null; }
//public MyHelperClass _LOG;
//	public MyHelperClass _getClassLoader(){ return null; }

    private static Type _createType() {
        try {
            ClassLoader cl =(ClassLoader)(Object) _getClassLoader();
            URL url =(URL)(Object) cl.getResource("META-INF/faces-bean-type.properties");
            if (url != null) {
                Properties properties = new Properties();
                InputStream is =(InputStream)(Object) url.openStream();
                try {
                    properties.load(is);
                    String className = (String)(String)(Object) properties.get(UIXComponentBase.class.getName());
                    return (Type) cl.loadClass(className).newInstance();
                } finally {
                    is.close();
                }
            }
        } catch (Exception e) {
            _LOG.severe("CANNOT_LOAD_TYPE_PROPERTIES", e);
        }
        return new Type();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0, Exception o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class UIXComponentBase {

}

class Type {

}
