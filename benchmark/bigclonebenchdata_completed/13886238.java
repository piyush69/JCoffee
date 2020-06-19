import java.io.*;
import java.lang.*;
import java.util.*;



class c13886238 {
public MyHelperClass NULL;
	public MyHelperClass staxOutputFactory;
public MyHelperClass logger;
	public MyHelperClass documentIDs;
	public MyHelperClass Tools;

    public void init() throws GateException {
        MyHelperClass reportFile = new MyHelperClass();
        if (reportFile == null) throw new GateException("No report file set!");
        boolean restarting = false;
//        MyHelperClass reportFile = new MyHelperClass();
        if (!(Boolean)(Object)reportFile.getParentFile().exists() && !(Boolean)(Object)reportFile.getParentFile().mkdirs()) {
//            MyHelperClass reportFile = new MyHelperClass();
            throw new GateException("Could not create directories for " + reportFile.getAbsolutePath());
        }
//        MyHelperClass reportFile = new MyHelperClass();
        File backupFile = new File(reportFile.getAbsolutePath() + ".bak");
//        MyHelperClass reportFile = new MyHelperClass();
        if ((boolean)(Object)reportFile.exists()) {
            restarting = true;
//            MyHelperClass reportFile = new MyHelperClass();
            logger.info("Existing report file found at \"" + reportFile.getAbsolutePath() + "\", attempting to restart");
//            MyHelperClass reportFile = new MyHelperClass();
            if (!(Boolean)(Object)reportFile.renameTo(backupFile)) {
                try {
                    byte[] buff = new byte[32 * 1024];
//                    MyHelperClass reportFile = new MyHelperClass();
                    InputStream in = new BufferedInputStream(new FileInputStream((String)(Object)reportFile));
                    try {
                        OutputStream out = new BufferedOutputStream(new FileOutputStream(backupFile));
                        try {
                            int read = in.read(buff);
                            while (read != -1) {
                                out.write(buff, 0, read);
                                read = in.read(buff);
                            }
                        } finally {
                            out.close();
                        }
                    } finally {
                        in.close();
                    }
                } catch (IOException e) {
                    throw new GateException("Could not restart batch", e);
                }
            }
        }
        try {
            MyHelperClass reportWriter = new MyHelperClass();
            reportWriter = staxOutputFactory.createXMLStreamWriter(new BufferedOutputStream(new FileOutputStream((String)(Object)reportFile)));
//            MyHelperClass reportWriter = new MyHelperClass();
            reportWriter.writeStartDocument();
//            MyHelperClass reportWriter = new MyHelperClass();
            reportWriter.writeCharacters("\n");
            MyHelperClass Tools = new MyHelperClass();
            reportWriter.setDefaultNamespace(Tools.REPORT_NAMESPACE);
//            MyHelperClass Tools = new MyHelperClass();
            reportWriter.writeStartElement(Tools.REPORT_NAMESPACE, "cloudReport");
//            MyHelperClass Tools = new MyHelperClass();
            reportWriter.writeDefaultNamespace(Tools.REPORT_NAMESPACE);
//            MyHelperClass reportWriter = new MyHelperClass();
            reportWriter.writeCharacters("\n");
//            MyHelperClass Tools = new MyHelperClass();
            reportWriter.writeStartElement(Tools.REPORT_NAMESPACE, "documents");
        } catch (UncheckedIOException e) {
            throw new GateException("Cannot write to the report file!",(IOException)(Object) e);
        } catch (IOException e) {
            throw new GateException("Cannot write to the report file!", e);
        }
        if (restarting) {
            try {
                Set<String> completedDocuments = new HashSet<String>();
                MyHelperClass logger = new MyHelperClass();
                logger.debug("Processing existing report file");
                InputStream bakIn = new BufferedInputStream(new FileInputStream(backupFile));
                MyHelperClass staxInputFactory = new MyHelperClass();
                XMLEventReader xer =(XMLEventReader)(Object) staxInputFactory.createXMLEventReader(bakIn);
                try {
                    XMLEvent event;
                    while ((boolean)(Object)xer.hasNext()) {
                        event =(XMLEvent)(Object) xer.nextEvent();
                        if ((boolean)(Object)event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("documents")) {
                            break;
                        }
                    }
                    List<XMLEvent> events = new LinkedList<XMLEvent>();
                    String currentReturnCode = null;
                    String currentDocid = null;
                    while ((boolean)(Object)xer.hasNext()) {
                        event =(XMLEvent)(Object) xer.nextEvent();
                        events.add(event);
                        if ((boolean)(Object)event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("processResult")) {
                            MyHelperClass XMLConstants = new MyHelperClass();
                            currentReturnCode =(String)(Object) event.asStartElement().getAttributeByName(new QName(XMLConstants.NULL_NS_URI, "returnCode")).getValue();
//                            MyHelperClass XMLConstants = new MyHelperClass();
                            currentDocid =(String)(Object) event.asStartElement().getAttributeByName(new QName(XMLConstants.NULL_NS_URI, "id")).getValue();
                        }
                        if ((boolean)(Object)event.isEndElement() && event.asEndElement().getName().getLocalPart().equals("processResult")) {
                            if (currentReturnCode.equals("SUCCESS") && currentDocid != null) {
                                completedDocuments.add(currentDocid);
                                for (XMLEvent evt : events) {
                                    MyHelperClass reportWriter = new MyHelperClass();
                                    Tools.writeStaxEvent(evt, reportWriter);
                                }
                            }
                            events.clear();
                            currentReturnCode = null;
                            currentDocid = null;
                        }
                        if ((boolean)(Object)event.isEndElement() && event.asEndElement().getName().getLocalPart().equals("documents")) {
                            break;
                        }
                    }
                } catch (Exception e) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.debug("Exception while parsing old report file - probably " + "reached the end of old report", e);
                } finally {
                    xer.close();
                    bakIn.close();
                    backupFile.delete();
                }
                List<String> unprocessedDocs = new ArrayList<String>();
                MyHelperClass documentIDs = new MyHelperClass();
                unprocessedDocs.addAll((Collection<? extends String>)(Object)Arrays.asList(documentIDs));
                unprocessedDocs.removeAll(completedDocuments);
                so unprocessedDocumentIDs =(so)(Object) NULL; //new so();
                unprocessedDocumentIDs =(so)(Object) unprocessedDocs.toArray(new String[unprocessedDocs.size()]);
            } catch (UncheckedIOException e) {
                throw new GateException("Cannot write to the report file!",(IOException)(Object) e);
            } catch (IOException e) {
                throw new GateException("Cannot write to the report file!", e);
            }
        } else {
            MyHelperClass unprocessedDocumentIDs = new MyHelperClass();
            unprocessedDocumentIDs = documentIDs;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NULL_NS_URI;
	public MyHelperClass REPORT_NAMESPACE;
public MyHelperClass createXMLEventReader(InputStream o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass setDefaultNamespace(MyHelperClass o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass writeDefaultNamespace(MyHelperClass o0){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass writeStartElement(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getLocalPart(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getAttributeByName(QName o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0, Exception o1){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass writeStaxEvent(XMLEvent o0, MyHelperClass o1){ return null; }
	public MyHelperClass writeStartDocument(){ return null; }
	public MyHelperClass createXMLStreamWriter(BufferedOutputStream o0){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass writeCharacters(String o0){ return null; }}

class GateException extends Exception{
	public GateException(String errorMessage) { super(errorMessage); }
	GateException(){}
	GateException(String o0, IOException o1){}
	GateException(String o0, XMLStreamException o1){}
}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}

class XMLEventReader {

public MyHelperClass close(){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass nextEvent(){ return null; }}

class XMLEvent {

public MyHelperClass asStartElement(){ return null; }
	public MyHelperClass asEndElement(){ return null; }
	public MyHelperClass isEndElement(){ return null; }
	public MyHelperClass isStartElement(){ return null; }}

class QName {

QName(MyHelperClass o0, String o1){}
	QName(){}}

class so {

}
