import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18358467 {
public MyHelperClass DocSummaryPOIFSReaderListener;
	public MyHelperClass createExtractor(InputStream o0){ return null; }

    public DocumentSummary parseDocument(URL url) throws Throwable, IOException, DocumentHandlerException {
        InputStream inputStream = null;
        try {
            inputStream = url.openStream();
            POIOLE2TextExtractor extractor =(POIOLE2TextExtractor)(Object) createExtractor(inputStream);
            SummaryInformation info =(SummaryInformation)(Object) extractor.getSummaryInformation();
            DocumentSummary docSummary = new DocumentSummary();
            docSummary.authors = DocSummaryPOIFSReaderListener.getAuthors(info);
            docSummary.contentReader =(MyHelperClass)(Object) new StringReader((String)(Object)extractor.getText());
            docSummary.creationDate = info.getCreateDateTime();
            docSummary.keywords =(MyHelperClass)(Object) new ArrayList();
            docSummary.keywords.add(info.getKeywords());
            docSummary.modificationDate =(MyHelperClass)(Object) new Date((long)(Object)info.getEditTime());
            docSummary.title = info.getTitle();
            return docSummary;
        } catch (IOException e) {
            if (e.getMessage().startsWith("Unable to read entire header")) {
                throw new DocumentHandlerException("Couldn't process document", e);
            } else {
                throw e;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAuthors(SummaryInformation o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class DocumentSummary {
public MyHelperClass keywords;
	public MyHelperClass authors;
	public MyHelperClass contentReader;
	public MyHelperClass creationDate;
	public MyHelperClass modificationDate;
	public MyHelperClass title;
}

class DocumentHandlerException extends Exception{
	public DocumentHandlerException(String errorMessage) { super(errorMessage); }
	DocumentHandlerException(String o0, IOException o1){}
	DocumentHandlerException(){}
}

class POIOLE2TextExtractor {

public MyHelperClass getText(){ return null; }
	public MyHelperClass getSummaryInformation(){ return null; }}

class SummaryInformation {

public MyHelperClass getCreateDateTime(){ return null; }
	public MyHelperClass getKeywords(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getEditTime(){ return null; }}
