
import java.io.UncheckedIOException;


class c9738825 {

    public void load(URL url) throws IOException {
        ResourceLocator locator = null;
        try {
            locator =(ResourceLocator)(Object) new RelativeResourceLocator(url);
        } catch (UncheckedIOException use) {
            throw new IllegalArgumentException("Bad URL: " + use);
        }
        MyHelperClass ResourceLocatorTool = new MyHelperClass();
        ResourceLocatorTool.addResourceLocator(ResourceLocatorTool.TYPE_TEXTURE, locator);
        InputStream stream = null;
        try {
            stream =(InputStream)(Object) url.openStream();
            if (stream == null) {
                throw new IOException("Failed to load materials file '" + url + "'");
            }
            MyHelperClass logger = new MyHelperClass();
            logger.fine("Loading materials from '" + url + "'...");
            load((URL)(Object)stream);
        } finally {
            if (stream != null) stream.close();
//            MyHelperClass ResourceLocatorTool = new MyHelperClass();
            ResourceLocatorTool.removeResourceLocator(ResourceLocatorTool.TYPE_TEXTURE, locator);
            locator = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_TEXTURE;
public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass removeResourceLocator(MyHelperClass o0, ResourceLocator o1){ return null; }
	public MyHelperClass addResourceLocator(MyHelperClass o0, ResourceLocator o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ResourceLocator {

}

class RelativeResourceLocator {

RelativeResourceLocator(){}
	RelativeResourceLocator(URL o0){}}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
