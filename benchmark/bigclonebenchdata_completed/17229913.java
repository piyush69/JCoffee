import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17229913 {
public MyHelperClass xmlInputFactory;
	public MyHelperClass base_api;
	public MyHelperClass LOG;
	public MyHelperClass srnamespaces;
	public MyHelperClass openStream(String o0){ return null; }

    private void process(int optind, String args[]) throws IOException, XMLStreamException {
        final int srlimit = 500;
        final QName att_title = new QName("title");
        final QName att_sroffset = new QName("sroffset");
        String sroffset = null;
        String srnamespace = null;
        if (!(Boolean)(Object)this.srnamespaces.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Integer i :(Integer[])(Object) (Object[])(Object)this.srnamespaces) {
                if (sb.length() > 0) sb.append("|");
                sb.append(String.valueOf(i));
            }
            srnamespace = sb.toString();
        }
        StringBuilder terms = new StringBuilder();
        while (optind < args.length) {
            if (terms.length() > 0) terms.append(" ");
            terms.append(args[optind++]);
        }
        while (true) {
            String url = this.base_api + "?action=query" + "&list=search" + "&format=xml" + "&srsearch=" + URLEncoder.encode(terms.toString(), "UTF-8") + (srnamespace != null ? "&srnamespace=" + srnamespace : "") + (sroffset == null ? "" : "&sroffset=" + sroffset) + "&srlimit=" + srlimit + "&srwhat=text&srprop=timestamp";
            sroffset = null;
            LOG.info(url);
            XMLEventReader reader =(XMLEventReader)(Object) this.xmlInputFactory.createXMLEventReader(openStream(url));
            while ((boolean)(Object)reader.hasNext()) {
                XMLEvent event =(XMLEvent)(Object) reader.nextEvent();
                if ((boolean)(Object)event.isStartElement()) {
                    StartElement e =(StartElement)(Object) event.asStartElement();
                    String name =(String)(Object) e.getName().getLocalPart();
                    Attribute att = null;
                    if (name.equals("p") && (att =(Attribute)(Object) e.getAttributeByName(att_title)) != null) {
                        System.out.println(att.getValue());
                    } else if (name.equals("search") && (att =(Attribute)(Object) e.getAttributeByName(att_sroffset)) != null) {
                        sroffset =(String)(Object) att.getValue();
                    }
                }
            }
            reader.close();
            if (sroffset == null) break;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass createXMLEventReader(MyHelperClass o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass getLocalPart(){ return null; }}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}

class QName {

QName(String o0){}
	QName(){}}

class XMLEventReader {

public MyHelperClass close(){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass nextEvent(){ return null; }}

class XMLEvent {

public MyHelperClass isStartElement(){ return null; }
	public MyHelperClass asStartElement(){ return null; }}

class StartElement {

public MyHelperClass getAttributeByName(QName o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class Attribute {

public MyHelperClass getValue(){ return null; }}
