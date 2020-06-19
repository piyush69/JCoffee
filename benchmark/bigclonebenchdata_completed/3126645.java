


class c3126645 {
public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass log(String o0, Exception o1){ return null; }

//    @Override
    public InputStream getResourceAsStream(String path) {
        try {
            URL url =(URL)(Object) this.getResource(path);
            if (url == null) return null;
            return(InputStream)(Object) url.openStream();
        } catch (Exception e) {
            log(e.getMessage(), e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}
