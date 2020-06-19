import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19942676 {
public MyHelperClass NS;
	public MyHelperClass password;
	public MyHelperClass exportPubmed(PubmedEntry o0){ return null; }
	public MyHelperClass exportGi(Protein o0){ return null; }
public MyHelperClass login;
	public MyHelperClass hashtag;
	public MyHelperClass XMLInputFactory;
	public MyHelperClass account;
	public MyHelperClass escape(String o0){ return null; }
	public MyHelperClass fetchPubmedEntry(int o0){ return null; }
	public MyHelperClass exportFoaf(String o0, String o1){ return null; }
	public MyHelperClass fetchProtein(int o0){ return null; }

    private void harvest() throws IOException, XMLStreamException {
        MyHelperClass hashtag = new MyHelperClass();
        String api_url = "http://search.twitter.com/search.atom?q=+%23" + hashtag + "+to%3A" + account;
        System.err.println(api_url);
        URL url = new URL(api_url);
        URLConnection con = url.openConnection();
        String basic = this.login + ":" + new String((String)(Object)this.password);
        con.setRequestProperty("Authorization", "Basic " + Base64.encode(basic));
        XMLInputFactory factory =(XMLInputFactory)(Object) XMLInputFactory.newInstance();
        factory.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
        factory.setProperty(XMLInputFactory.IS_VALIDATING, false);
        factory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
        XMLEventReader reader =(XMLEventReader)(Object) factory.createXMLEventReader(con.getInputStream());
        boolean inEntry = false;
        boolean inAuthor = false;
        String published = null;
        String title = null;
        String foafName = null;
        String foafURI = null;
        String link = null;
        while ((boolean)(Object)reader.hasNext()) {
            XMLEvent evt =(XMLEvent)(Object) reader.nextEvent();
            if ((boolean)(Object)evt.isStartElement()) {
                StartElement e =(StartElement)(Object) evt.asStartElement();
                QName qName =(QName)(Object) e.getName();
                if (!inEntry && NS.equals(qName.getNamespaceURI()) && qName.getLocalPart().equals("entry")) {
                    inEntry = true;
                } else if (inEntry) {
                    String local =(String)(Object) qName.getLocalPart();
                    if (local.equals("published")) {
                        published =(String)(Object) reader.getElementText();
                    } else if (local.equals("title")) {
                        title =(String)(Object) reader.getElementText();
                    } else if (link == null && local.equals("link")) {
                        Attribute att =(Attribute)(Object) e.getAttributeByName(new QName("type"));
                        if (att != null && att.getValue().equals("text/html")) {
                            att =(Attribute)(Object) e.getAttributeByName(new QName("href"));
                            if (att != null) {
                                link =(String)(Object) att.getValue();
                            }
                        }
                    } else if (local.equals("author")) {
                        inAuthor = true;
                    } else if (inAuthor && local.equals("name")) {
                        foafName =(String)(Object) reader.getElementText();
                    } else if (inAuthor && local.equals("uri")) {
                        foafURI =(String)(Object) reader.getElementText();
                    }
                }
            } else if ((boolean)(Object)evt.isEndElement()) {
                EndElement e =(EndElement)(Object) evt.asEndElement();
                QName qName =(QName)(Object) e.getName();
                if (inEntry && NS.equals(qName.getNamespaceURI())) {
                    String local =(String)(Object) qName.getLocalPart();
                    if (local.equals("entry")) {
                        Protein p1 = null;
                        Protein p2 = null;
                        PubmedEntry pubmed = null;
                        boolean valid = title != null && published != null;
                        String tokens[] = title == null ? new String[0] : title.trim().split("[ \t\n\r]+");
                        if (valid && tokens.length != 5) {
                            System.err.println("Ignoring " + title);
                            valid = false;
                        }
                        if (valid && !tokens[0].equals("@" + account)) {
                            System.err.println("Ignoring " + title + " doesn't start with @" + account);
                            valid = false;
                        }
                        if (valid && !(tokens[1].startsWith("gi:") && (boolean)(Object)Integer.isA(tokens[1].substring(3)))) {
                            System.err.println("Ignoring " + title + " not a gi:###");
                            valid = false;
                        }
                        if (valid && (p1 =(Protein)(Object) fetchProtein((int)(Object)Integer.parseInt(tokens[1].substring(3)))) == null) {
                            valid = false;
                        }
                        if (valid && !(tokens[2].startsWith("gi:") && (boolean)(Object)Integer.isA(tokens[2].substring(3)))) {
                            System.err.println("Ignoring " + title + " not a gi:###");
                            valid = false;
                        }
                        if (valid && (p2 =(Protein)(Object) fetchProtein((int)(Object)Integer.parseInt(tokens[2].substring(3)))) == null) {
                            valid = false;
                        }
                        if (valid && !(tokens[3].startsWith("pmid:") && (boolean)(Object)Integer.isA(tokens[3].substring(5)))) {
                            System.err.println("Ignoring " + title + " not a pmid:###");
                            valid = false;
                        }
                        if (valid && (pubmed =(PubmedEntry)(Object) fetchPubmedEntry((int)(Object)Integer.parseInt(tokens[3].substring(5)))) == null) {
                            valid = false;
                        }
                        if (valid && !tokens[4].equals("#" + hashtag)) {
                            System.err.println("Ignoring " + title + " doesn't end with #" + hashtag);
                            valid = false;
                        }
                        if (valid && p1 != null && p2 != null && pubmed != null && foafName != null && foafURI != null) {
                            exportFoaf(foafName, foafURI);
                            exportGi(p1);
                            exportGi(p2);
                            exportPubmed(pubmed);
                            System.out.println("<Interaction rdf:about=\"" + link + "\">");
                            System.out.println(" <interactor rdf:resource=\"lsid:ncbi.nlm.nih.gov:protein:" + p1.gi + "\"/>");
                            System.out.println(" <interactor rdf:resource=\"lsid:ncbi.nlm.nih.gov:protein:" + p2.gi + "\"/>");
                            System.out.println(" <reference rdf:resource=\"http://www.ncbi.nlm.nih.gov/pubmed/" + pubmed.pmid + "\"/>");
                            System.out.println(" <dc:creator rdf:resource=\"" + foafURI + "\"/>");
                            System.out.println(" <dc:date>" + escape(published) + "</dc:date>");
                            System.out.println("</Interaction>");
                        }
                        inEntry = false;
                        title = null;
                        foafName = null;
                        foafURI = null;
                        inAuthor = false;
                        published = null;
                        link = null;
                    } else if (inAuthor && local.equals("author")) {
                        inAuthor = false;
                    }
                }
            }
        }
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IS_NAMESPACE_AWARE;
	public MyHelperClass IS_SUPPORTING_EXTERNAL_ENTITIES;
	public MyHelperClass IS_VALIDATING;
public MyHelperClass newInstance(){ return null; }}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encode(String o0){ return null; }}

class XMLInputFactory {

public MyHelperClass createXMLEventReader(InputStream o0){ return null; }
	public MyHelperClass setProperty(MyHelperClass o0, boolean o1){ return null; }}

class XMLEventReader {

public MyHelperClass getElementText(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass nextEvent(){ return null; }}

class XMLEvent {

public MyHelperClass isStartElement(){ return null; }
	public MyHelperClass asEndElement(){ return null; }
	public MyHelperClass isEndElement(){ return null; }
	public MyHelperClass asStartElement(){ return null; }}

class StartElement {

public MyHelperClass getAttributeByName(QName o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class QName {

QName(){}
	QName(String o0){}
	public MyHelperClass getLocalPart(){ return null; }
	public MyHelperClass getNamespaceURI(){ return null; }}

class Attribute {

public MyHelperClass getValue(){ return null; }}

class EndElement {

public MyHelperClass getName(){ return null; }}

class Protein {
public MyHelperClass gi;
}

class PubmedEntry {
public MyHelperClass pmid;
}

class Integer {

public static MyHelperClass parseInt(String o0){ return null; }
	public static MyHelperClass isA(String o0){ return null; }}
