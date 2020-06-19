import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19670855 {
public MyHelperClass configurationFilesMaxModificationTime;
	public MyHelperClass groups;
	public MyHelperClass SAXParserFactory;
	public MyHelperClass log;
	public MyHelperClass getConfigResources(){ return null; }
	public MyHelperClass findMaxConfigModificationTime(){ return null; }

    private synchronized void configure()  throws Throwable {
        final Map res = new HashMap();
        try {
            final Enumeration resources =(Enumeration)(Object) getConfigResources();
            SAXParser saxParser =(SAXParser)(Object) SAXParserFactory.newInstance().newSAXParser();
            while (resources.hasMoreElements()) {
                final URL url = (URL) resources.nextElement();
                DefaultHandler saxHandler = new DefaultHandler() {

                    private Group group;

                    private StringBuffer tagContent = new StringBuffer();

                    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                        if ("group".equals(qName)) {
                            group = new Group(attributes.getValue("name"));
                            String minimizeJs =(String)(Object) attributes.getValue("minimize");
                            String minimizeCss =(String)(Object) attributes.getValue("minimizeCss");
                            group.setMinimize(!"false".equals(minimizeJs));
                            group.setMinimizeCss("true".equals(minimizeCss));
                        } else if ("js".equals(qName) || "css".equals(qName) || "group-ref".equals(qName)) tagContent.setLength(0);
                    }

                    public void characters(char ch[], int start, int length) throws SAXException {
                        tagContent.append(ch, start, length);
                    }

                    public void endElement(String uri, String localName, String qName) throws SAXException {
                        if ("group".equals(qName)) res.put(group.getName(), group); else if ("js".equals(qName)) group.getJsNames().add(tagContent.toString()); else if ("css".equals(qName)) group.getCssNames().add(tagContent.toString()); else if ("group-ref".equals(qName)) {
                            String name = tagContent.toString();
                            Group subGroup = (Group) res.get(name);
                            if (subGroup == null) throw new RuntimeException("Error parsing " + url.toString() + " <group-ref>" + name + "</group-ref> unknown");
                            group.getSubgroups().add(subGroup);
                        }
                    }
                };
                try {
                    saxParser.parse(url.openStream(), saxHandler);
                } catch (Throwable e) {
                    log.warn(e.toString(), e);
                    log.warn("Exception " + e.toString() + " ignored, let's move on..");
                }
            }
            configurationFilesMaxModificationTime = findMaxConfigModificationTime();
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } catch (ArrayStoreException e) {
            throw new RuntimeException(e);
        }
        this.groups =(MyHelperClass)(Object) res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Group o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass warn(String o0, Throwable o1){ return null; }
	public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class SAXParser {

public MyHelperClass parse(InputStream o0, DefaultHandler o1){ return null; }}

class DefaultHandler {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class Group {

Group(MyHelperClass o0){}
	Group(){}
	public MyHelperClass getCssNames(){ return null; }
	public MyHelperClass setMinimize(boolean o0){ return null; }
	public MyHelperClass getSubgroups(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getJsNames(){ return null; }
	public MyHelperClass setMinimizeCss(boolean o0){ return null; }}

class Attributes {

public MyHelperClass getValue(String o0){ return null; }}
