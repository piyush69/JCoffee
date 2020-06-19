


class c19814779 {
public MyHelperClass LOG;
	public MyHelperClass getResource(String o0){ return null; }

    public Reader getConfResourceAsReader(String name) {
        try {
            URL url =(URL)(Object) getResource(name);
            if (url == null) {
                LOG.info(name + " not found");
                return null;
            } else {
                LOG.info("found resource " + name + " at " + url);
            }
            return (Reader)(Object)new InputStreamReader(url.openStream());
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class Reader {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
