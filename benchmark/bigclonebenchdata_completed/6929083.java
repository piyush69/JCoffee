


class c6929083 {
public MyHelperClass bc;
	public MyHelperClass substitute(FileInputStream o0){ return null; }
	public MyHelperClass substitute(InputStream o0){ return null; }

    public InputStream getResource(String resourceName) throws IOException {
        if (!resourceName.startsWith("/")) {
            resourceName += "/";
        }
        MyHelperClass COOS_CONFIG_PATH = new MyHelperClass();
        URL url =(URL)(Object) bc.getBundle().getResource(COOS_CONFIG_PATH + resourceName);
        InputStream is = null;
        try {
            MyHelperClass configDir = new MyHelperClass();
            FileInputStream fis = new FileInputStream(configDir + resourceName);
            is =(InputStream)(Object) substitute(fis);
        } catch (Exception e) {
        }
        if (is == null) {
            is =(InputStream)(Object) url.openStream();
            is =(InputStream)(Object) substitute(is);
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getBundle(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
