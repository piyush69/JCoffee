


class c15720116 {
public MyHelperClass println(String o0){ return null; }

    void acessResource(ClassLoader cl, String resource) throws IOException {
        URL url =(URL)(Object) cl.getResource(resource);
        if (url == null) {
            println("Ups can't find resource " + resource);
        } else {
            println("URL OK " + resource + " ->" + url);
            InputStream is =(InputStream)(Object) url.openStream();
            try {
                is.read();
            } finally {
                is.close();
            }
            println("Read OK " + resource + " ->" + url);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
