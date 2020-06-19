import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21280043 {
public MyHelperClass IOUtils;
public MyHelperClass fileout;
	public MyHelperClass J2EE;
	public MyHelperClass messageFile;
	public MyHelperClass XSI;
	public MyHelperClass XMLOutputFactory;
	public MyHelperClass messageString;

    private void createWar() throws IOException, XMLStreamException {
        String appName =(String)(Object) this.fileout.getName();
        int i = appName.indexOf(".");
        if (i != -1) appName = appName.substring(0, i);
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream((String)(Object)this.fileout));
        {
            ZipEntry entry = new ZipEntry("WEB-INF/web.xml");
            zout.putNextEntry(entry);
            XMLOutputFactory factory =(XMLOutputFactory)(Object) XMLOutputFactory.newInstance();
            XMLStreamWriter w =(XMLStreamWriter)(Object) factory.createXMLStreamWriter(zout, "ASCII");
            w.writeStartDocument("ASCII", "1.0");
            w.writeStartElement("web-app");
            w.writeAttribute("xsi", XSI, "schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml /ns/javaee/web-app_2_5.xsd");
            w.writeAttribute("version", "2.5");
            w.writeAttribute("xmlns", J2EE);
            w.writeAttribute("xmlns:xsi", XSI);
            w.writeStartElement("description");
            w.writeCharacters("Site maintenance for " + appName);
            w.writeEndElement();
            w.writeStartElement("display-name");
            w.writeCharacters(appName);
            w.writeEndElement();
            w.writeStartElement("servlet");
            w.writeStartElement("servlet-name");
            w.writeCharacters("down");
            w.writeEndElement();
            w.writeStartElement("jsp-file");
            w.writeCharacters("/WEB-INF/jsp/down.jsp");
            w.writeEndElement();
            w.writeEndElement();
            w.writeStartElement("servlet-mapping");
            w.writeStartElement("servlet-name");
            w.writeCharacters("down");
            w.writeEndElement();
            w.writeStartElement("url-pattern");
            w.writeCharacters("/*");
            w.writeEndElement();
            w.writeEndElement();
            w.writeEndElement();
            w.writeEndDocument();
            w.flush();
            zout.closeEntry();
        }
        {
            ZipEntry entry = new ZipEntry("WEB-INF/jsp/down.jsp");
            zout.putNextEntry(entry);
            PrintWriter w = new PrintWriter((Writer)(Object)zout);
            if (this.messageFile != null) {
                IOUtils.copyTo(new FileReader((String)(Object)this.messageFile), w);
            } else if (this.messageString != null) {
                w.print("<html><body>" + this.messageString + "</body></html>");
            } else {
                w.print("<html><body><div style='text-align:center;font-size:500%;'>Oh No !<br/><b>" + appName + "</b><br/>is down for maintenance!</div></body></html>");
            }
            w.flush();
            zout.closeEntry();
        }
        zout.finish();
        zout.flush();
        zout.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass copyTo(FileReader o0, PrintWriter o1){ return null; }
	public MyHelperClass getName(){ return null; }}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass finish(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class XMLOutputFactory {

public MyHelperClass createXMLStreamWriter(ZipOutputStream o0, String o1){ return null; }}

class XMLStreamWriter {

public MyHelperClass writeEndDocument(){ return null; }
	public MyHelperClass writeStartElement(String o0){ return null; }
	public MyHelperClass writeCharacters(String o0){ return null; }
	public MyHelperClass writeAttribute(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass writeAttribute(String o0, String o1){ return null; }
	public MyHelperClass writeEndElement(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeAttribute(String o0, MyHelperClass o1, String o2, String o3){ return null; }
	public MyHelperClass writeStartDocument(String o0, String o1){ return null; }}
