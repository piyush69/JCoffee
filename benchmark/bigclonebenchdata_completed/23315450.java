


class c23315450 {
public MyHelperClass setManifest(MyHelperClass o0){ return null; }

    public void Manifest(URL url) throws IOException {
        if (!url.getProtocol().equals("jar")) {
            url = new URL("jar:" + url.toExternalForm() + "!/");
        }
        JarURLConnection uc = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
        setManifest(uc.getManifest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarURLConnection {

public MyHelperClass getManifest(){ return null; }}
