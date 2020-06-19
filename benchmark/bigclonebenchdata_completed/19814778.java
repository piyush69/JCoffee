


class c19814778 {
public MyHelperClass LOG;
	public MyHelperClass getResource(String o0){ return null; }

    public InputStream getConfResourceAsInputStream(String name) {
        try {
            URL url =(URL)(Object) getResource(name);
            if (url == null) {
                LOG.info(name + " not found");
                return null;
            } else {
                LOG.info("found resource " + name + " at " + url);
            }
            return(InputStream)(Object) url.openStream();
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}
