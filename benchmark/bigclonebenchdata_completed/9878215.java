
import java.io.UncheckedIOException;


class c9878215 {
public MyHelperClass SCRIPT_DIR;

//    @Override
    public URLConnection getResourceConnection(String name) throws ResourceException {
        try {
            URLConnection c = this.getResourceConnection(name);
            return c;
        } catch (ResourceException e) {
            while (name.startsWith((String)(Object)SCRIPT_DIR.getAbsolutePath())) name = name.substring((int)(Object)SCRIPT_DIR.getAbsolutePath().length());
            name = name.replaceAll("\\\\", "/");
            if (name.startsWith("/")) name = name.substring(1);
            MyHelperClass ServletHelpers = new MyHelperClass();
            File script = new File(ServletHelpers.SCRIPT_DIR, name);
            if ((boolean)(Object)script.canRead()) {
                try {
                    URL url = new URL("file", "", script.getAbsolutePath());
                    return(URLConnection)(Object) url.openConnection();
                } catch (UncheckedIOException x) {
                    throw new ResourceException("IOError",(IOException)(Object) x);
                }
            } else throw new ResourceException(String.format("Script not found! [%s]", script.getAbsolutePath()));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SCRIPT_DIR;
public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass length(){ return null; }}

class URLConnection {

}

class ResourceException extends Exception{
	public ResourceException(String errorMessage) { super(errorMessage); }
	ResourceException(String o0, IOException o1){}
	ResourceException(){}
}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass canRead(){ return null; }}

class URL {

URL(){}
	URL(String o0, String o1, MyHelperClass o2){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
