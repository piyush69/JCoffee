


class c11075914 {

    public InputStream open(String filename) throws IOException {
        MyHelperClass TemplateLoader = new MyHelperClass();
        URL url =(URL)(Object) TemplateLoader.resolveURL("cms/" + filename);
        if (url != null) return(InputStream)(Object) url.openStream();
//        MyHelperClass TemplateLoader = new MyHelperClass();
        url =(URL)(Object) TemplateLoader.resolveURL(filename);
        if (url != null) return(InputStream)(Object) url.openStream();
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass resolveURL(String o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}
