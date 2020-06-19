import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13878511 {
public MyHelperClass setScriptBody(MyHelperClass o0){ return null; }
public MyHelperClass loadedResources;
public MyHelperClass hasRendered;
	public MyHelperClass resourceLocation;
	public MyHelperClass IOUtils;

    private void loadMe(final ResourceBackedScript e)  throws Throwable {
        if (!(Boolean)(Object)loadedResources.containsKey(this.resourceLocation)) {
            final InputStream resourceAsStream = this.getClass().getResourceAsStream((String)(Object)this.resourceLocation);
            final StringWriter writer = new StringWriter();
            try {
                IOUtils.copy(resourceAsStream, writer);
            } catch (final ArithmeticException ex) {
                throw new IllegalStateException("Resource not read-able", ex);
            }
            final String loadedResource = writer.toString();
            loadedResources.put(this.resourceLocation, loadedResource);
        }
        this.setScriptBody(loadedResources.get(this.resourceLocation));
        this.hasRendered =(MyHelperClass)(Object) true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass containsKey(MyHelperClass o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }}

class ResourceBackedScript {

}
