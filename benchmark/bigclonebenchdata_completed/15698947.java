


class c15698947 {

    protected InputStream getInputStream(URL url) {
        InputStream is = null;
        if (url != null) {
            try {
                is =(InputStream)(Object) url.openStream();
            } catch (Exception ex) {
            }
        }
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (is == null) {
            try {
                is =(InputStream)(Object) classLoader.getResourceAsStream("osworkflow.xml");
            } catch (Exception e) {
            }
        }
        if (is == null) {
            try {
                is =(InputStream)(Object) classLoader.getResourceAsStream("/osworkflow.xml");
            } catch (Exception e) {
            }
        }
        if (is == null) {
            try {
                is =(InputStream)(Object) classLoader.getResourceAsStream("META-INF/osworkflow.xml");
            } catch (Exception e) {
            }
        }
        if (is == null) {
            try {
                is =(InputStream)(Object) classLoader.getResourceAsStream("/META-INF/osworkflow.xml");
            } catch (Exception e) {
            }
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}
