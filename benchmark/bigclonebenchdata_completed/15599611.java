import java.io.*;
import java.lang.*;
import java.util.*;



class c15599611 {
public MyHelperClass m_obj;
	public MyHelperClass m_format;
	public MyHelperClass DOTranslationUtility;
	public MyHelperClass m_transContext;
	public MyHelperClass IOUtils;

    private void setInlineXML(Entry entry, DatastreamXMLMetadata ds) throws UnsupportedEncodingException, StreamIOException {
        String content;
        MyHelperClass Models = new MyHelperClass();
        if ((boolean)(Object)m_obj.hasContentModel(Models.SERVICE_DEPLOYMENT_3_0) && (ds.DatastreamID.equals("SERVICE-PROFILE") || ds.DatastreamID.equals("WSDL"))) {
            MyHelperClass m_encoding = new MyHelperClass();
            content =(String)(Object) DOTranslationUtility.normalizeInlineXML(new String((byte[])(Object)ds.xmlContent,(int)(Object) m_encoding), m_transContext);
        } else {
            MyHelperClass m_encoding = new MyHelperClass();
            content = new String((byte[])(Object)ds.xmlContent,(int)(Object) m_encoding);
        }
        MyHelperClass ATOM_ZIP1_1 = new MyHelperClass();
        if (m_format.equals(ATOM_ZIP1_1)) {
            String name = ds.DSVersionID + ".xml";
            try {
                MyHelperClass m_zout = new MyHelperClass();
                m_zout.putNextEntry(new ZipEntry(name));
                MyHelperClass m_encoding = new MyHelperClass();
                InputStream is = new ByteArrayInputStream(content.getBytes((String)(Object)m_encoding));
//                MyHelperClass m_zout = new MyHelperClass();
                IOUtils.copy(is, m_zout);
//                MyHelperClass m_zout = new MyHelperClass();
                m_zout.closeEntry();
                is.close();
            } catch (IOException e) {
                throw new StreamIOException(e.getMessage(), e);
            }
            IRI iri = new IRI(name);
            entry.setSummary(ds.DSVersionID);
            entry.setContent(iri, ds.DSMIME);
        } else {
            entry.setContent(content, ds.DSMIME);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVICE_DEPLOYMENT_3_0;
public MyHelperClass hasContentModel(MyHelperClass o0){ return null; }
	public MyHelperClass normalizeInlineXML(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class Entry {

public MyHelperClass setContent(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setSummary(MyHelperClass o0){ return null; }
	public MyHelperClass setContent(IRI o0, MyHelperClass o1){ return null; }}

class DatastreamXMLMetadata {
public MyHelperClass DatastreamID;
	public MyHelperClass DSVersionID;
	public MyHelperClass xmlContent;
	public MyHelperClass DSMIME;
}

class StreamIOException extends Exception{
	public StreamIOException(String errorMessage) { super(errorMessage); }
	StreamIOException(){}
	StreamIOException(String o0, IOException o1){}
}

class ZipEntry {

ZipEntry(){}
	ZipEntry(String o0){}}

class IRI {

IRI(){}
	IRI(String o0){}}
