import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19058139 {
public MyHelperClass setCompletionParser(XSDCompletionParser o0){ return null; }
	public MyHelperClass setCompletionParser(DTDCompletionParser o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass doc;
	public MyHelperClass XPontusConstantsIF;
	public MyHelperClass updateAssistInfo(Object o0, String o1, Reader o2){ return null; }

    public void init(final javax.swing.text.Document doc) {
        this.doc =(MyHelperClass)(Object) doc;
        String dtdLocation = null;
        String schemaLocation = null;
        SyntaxDocument mDoc = (SyntaxDocument) doc;
        Object mDtd = mDoc.getProperty(XPontusConstantsIF.PARSER_DATA_DTD_COMPLETION_INFO);
        Object mXsd = mDoc.getProperty(XPontusConstantsIF.PARSER_DATA_SCHEMA_COMPLETION_INFO);
        if (mDtd != null) {
            dtdLocation = mDtd.toString();
        }
        if (mXsd != null) {
            schemaLocation = mXsd.toString();
        }
        Object o = doc.getProperty("BUILTIN_COMPLETION");
        if (o != null) {
            if (o.equals("HTML")) {
                dtdLocation = getClass().getResource("xhtml.dtd").toExternalForm();
            }
        }
        try {
            if (dtdLocation != null) {
                if ((boolean)(Object)logger.isDebugEnabled()) {
                    logger.debug("Using dtd to build completion database");
                }
                setCompletionParser(new DTDCompletionParser());
                URL url = new java.net.URL(dtdLocation);
                Reader dtdReader = new InputStreamReader(url.openStream());
                updateAssistInfo(null, dtdLocation, dtdReader);
            } else if (schemaLocation != null) {
                if ((boolean)(Object)logger.isDebugEnabled()) {
                    logger.debug("Using schema  to build completion database");
                }
                setCompletionParser(new XSDCompletionParser());
                URL url = new java.net.URL(schemaLocation);
                Reader dtdReader = new InputStreamReader(url.openStream());
                updateAssistInfo(null, schemaLocation, dtdReader);
            }
        } catch (Exception err) {
            if ((boolean)(Object)logger.isDebugEnabled()) {
                logger.debug(err.getMessage(), err);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PARSER_DATA_SCHEMA_COMPLETION_INFO;
	public MyHelperClass PARSER_DATA_DTD_COMPLETION_INFO;
public MyHelperClass debug(String o0, Exception o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class SyntaxDocument {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class DTDCompletionParser {

}

class XSDCompletionParser {

}
