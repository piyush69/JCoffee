
import java.io.UncheckedIOException;


class c15113437 {
public MyHelperClass loadProperties(Properties o0, InputStream o1, MyHelperClass o2){ return null; }
public MyHelperClass log(String o0, MyHelperClass o1){ return null; }
public MyHelperClass addProperties(Properties o0){ return null; }
public MyHelperClass getLocation(){ return null; }

    protected void loadUrl(URL url) throws BuildException {
        Properties props = new Properties();
        MyHelperClass Project = new MyHelperClass();
        log("Loading " + url, Project.MSG_VERBOSE);
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            try {
                loadProperties(props, is, url.getFile().endsWith(".xml"));
            } finally {
                if (is != null) {
                    is.close();
                }
            }
            addProperties(props);
        } catch (UncheckedIOException ex) {
            throw new BuildException((IOException)(Object)ex, getLocation());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MSG_VERBOSE;
public MyHelperClass endsWith(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
	BuildException(IOException o0, MyHelperClass o1){}
	BuildException(){}
}

class Properties {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
