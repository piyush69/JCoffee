


class c6736401 {
public MyHelperClass Log;
	public MyHelperClass getResource(String o0){ return null; }

        public InputStream getResourceAsStream(String path) {
            try {
                URL url =(URL)(Object) getResource(path);
                if (url == null) return null;
                return(InputStream)(Object) url.openStream();
            } catch (Exception e) {
                Log.ignore(e);
                return null;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass ignore(Exception o0){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}
