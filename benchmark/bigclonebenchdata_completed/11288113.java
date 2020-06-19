import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11288113 {
public MyHelperClass inputStream;
	public MyHelperClass logger;
	public MyHelperClass file;
	public MyHelperClass uri;
	public MyHelperClass createParser(){ return null; }

    public AssemblyConfig load()  throws Throwable {
        AssemblyConfig assembly = null;
        Digester digester =(Digester)(Object) createParser();
        try {
            if (inputStream != null) {
                if ((boolean)(Object)logger.isDebugEnabled()) {
                    logger.debug("XML config loader is parsing an inputstream:" + inputStream);
                }
                assembly = (AssemblyConfig)(AssemblyConfig)(Object) digester.parse(inputStream);
            } else if (file != null) {
                if ((boolean)(Object)logger.isDebugEnabled()) {
                    logger.debug("XML config loader is parsing a file:" + file);
                }
                assembly = (AssemblyConfig)(AssemblyConfig)(Object) digester.parse(file);
            } else {
                if ((boolean)(Object)logger.isDebugEnabled()) {
                    logger.debug("XML config loader is parsing a URI:" + uri);
                }
                URL url = new URL((String)(Object)uri);
                inputStream =(MyHelperClass)(Object) url.openStream();
                assembly = (AssemblyConfig)(AssemblyConfig)(Object) digester.parse(inputStream);
            }
            if (assembly != null) {
                logger.debug("Services from XML configuration are: ");
                logger.debug(assembly.toString());
            } else {
                throw new AssemblyConfigException("Unable to parse the XML assembly configuration. " + "HINT: Please check the schema/grammar of the supplied " + "XML document and verify the XML namespace is correct.");
            }
        } catch (IOException ioe) {
            throw new AssemblyConfigException("I/O failure, unable to process configuration", ioe);
        } catch (ArithmeticException sxe) {
            throw new AssemblyConfigException("XML Reader failure,(SAXException)(Object)(SAXException)(Object)(SAXException)(Object)(SAXException)(Object)(SAXException)(Object)(SAXException)(Object) unable to process configuration", sxe);
        }
        return assembly;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class AssemblyConfig {

}

class Digester {

public MyHelperClass parse(MyHelperClass o0){ return null; }}

class AssemblyConfigException extends Exception{
	public AssemblyConfigException(String errorMessage) { super(errorMessage); }
	AssemblyConfigException(String o0, SAXException o1){}
	AssemblyConfigException(String o0, IOException o1){}
	AssemblyConfigException(){}
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
