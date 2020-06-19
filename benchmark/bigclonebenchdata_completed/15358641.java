import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15358641 {

    public void parse(Project project, Object source, RootHandler handler)  throws Throwable {
        MyHelperClass Reflect = new MyHelperClass();
        AntXMLContext context = (AntXMLContext)(AntXMLContext)(Object) Reflect.getField(handler, "context");
        File buildFile = null;
        URL url = null;
        String buildFileName = null;
        if (source instanceof File) {
            buildFile = (File) source;
            MyHelperClass fu = new MyHelperClass();
            buildFile =(File)(Object) fu.normalize(buildFile.getAbsolutePath());
            context.setBuildFile(buildFile);
            buildFileName = buildFile.toString();
        } else if (source instanceof URL) {
            url = (URL) source;
            buildFileName = url.toString();
        } else {
            throw new BuildException("Source " + source.getClass().getName() + " not supported by this plugin");
        }
        InputStream inputStream = null;
        InputSource inputSource = null;
        try {
            MyHelperClass JAXPUtils = new MyHelperClass();
            XMLReader parser =(XMLReader)(Object) JAXPUtils.getNamespaceXMLReader();
            String uri = null;
            if (buildFile != null) {
                MyHelperClass fu = new MyHelperClass();
                uri =(String)(Object) fu.toURI(buildFile.getAbsolutePath());
                inputStream = new FileInputStream(buildFile);
            } else {
                inputStream = url.openStream();
                uri = url.toString();
            }
            inputSource = new InputSource(inputStream);
            if (uri != null) {
                inputSource.setSystemId(uri);
            }
            MyHelperClass Project = new MyHelperClass();
            project.log("parsing buildfile " + buildFileName + " with URI = " + uri, Project.MSG_VERBOSE);
            DefaultHandler hb =(DefaultHandler)(Object) handler;
            parser.setContentHandler(hb);
            parser.setEntityResolver(hb);
            parser.setErrorHandler(hb);
            parser.setDTDHandler(hb);
            parser.parse(inputSource);
        } catch (SAXParseException exc) {
            Location location = new Location(exc.getSystemId(), exc.getLineNumber(), exc.getColumnNumber());
            Throwable t = exc.getException();
            if (t instanceof BuildException) {
                BuildException be = (BuildException) t;
                MyHelperClass Location = new MyHelperClass();
                if (be.getLocation() == Location.UNKNOWN_LOCATION) {
                    be.setLocation(location);
                }
                throw be;
            }
            throw new BuildException(exc.getMessage(), t, location);
        } catch (SAXException exc) {
            Throwable t = exc.getException();
            if (t instanceof BuildException) {
                throw (BuildException) t;
            }
            throw new BuildException(exc.getMessage(), t);
        } catch (FileNotFoundException exc) {
            throw new BuildException((String)(Object)exc);
        } catch (UnsupportedEncodingException exc) {
            throw new BuildException("Encoding of project file " + buildFileName + " is invalid.", exc);
        } catch (IOException exc) {
            throw new BuildException("Error reading project file " + buildFileName + ": " + exc.getMessage(), exc);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ioe) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UNKNOWN_LOCATION;
	public MyHelperClass MSG_VERBOSE;
public MyHelperClass getNamespaceXMLReader(){ return null; }
	public MyHelperClass toURI(String o0){ return null; }
	public MyHelperClass getField(RootHandler o0, String o1){ return null; }
	public MyHelperClass normalize(String o0){ return null; }}

class Project {

public MyHelperClass log(String o0, MyHelperClass o1){ return null; }}

class RootHandler {

}

class AntXMLContext {

public MyHelperClass setBuildFile(File o0){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
	BuildException(String o0, Throwable o1){}
	BuildException(String o0, Throwable o1, Location o2){}
	BuildException(String o0, IOException o1){}
	BuildException(){}
	BuildException(String o0, UnsupportedEncodingException o1){}
}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(DefaultHandler o0){ return null; }
	public MyHelperClass setDTDHandler(DefaultHandler o0){ return null; }
	public MyHelperClass setEntityResolver(DefaultHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setErrorHandler(DefaultHandler o0){ return null; }}

class DefaultHandler {

}

class SAXParseException extends Exception{
	public SAXParseException(String errorMessage) { super(errorMessage); }
}

class Location {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
