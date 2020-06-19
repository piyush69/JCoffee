import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8677886 {
public MyHelperClass SdlCloser;
	public MyHelperClass logger;
	public MyHelperClass MessageFormat;
	public MyHelperClass getDeploymentContext(){ return null; }
	public MyHelperClass getSdlParser(){ return null; }

    public Document getSdlDomResource(String aResourceName) throws Throwable, SdlException {
        InputStream in = null;
        try {
            URL url =(URL)(Object) getDeploymentContext().getResourceURL(aResourceName);
            if (url == null) {
                return null;
            } else {
                in = url.openStream();
                return(Document)(Object) getSdlParser().loadSdlDocument(in, null);
            }
        } catch (Throwable t) {
            logger.error("Error: unable to load: " + aResourceName + " from " + getDeploymentContext().getDeploymentLocation());
            throw new SdlDeploymentException(MessageFormat.format("unable to load: {0} from {1}", new Object[] { aResourceName, getDeploymentContext().getDeploymentLocation() }), t);
        } finally {
            SdlCloser.close(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass format(String o0, Object[] o1){ return null; }
	public MyHelperClass getDeploymentLocation(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getResourceURL(String o0){ return null; }
	public MyHelperClass loadSdlDocument(InputStream o0, Object o1){ return null; }}

class Document {

}

class SdlException extends Exception{
	public SdlException(String errorMessage) { super(errorMessage); }
}

class SdlDeploymentException extends Exception{
	public SdlDeploymentException(String errorMessage) { super(errorMessage); }
	SdlDeploymentException(MyHelperClass o0, Throwable o1){}
	SdlDeploymentException(){}
}
