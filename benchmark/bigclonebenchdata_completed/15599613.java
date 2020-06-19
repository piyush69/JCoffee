import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15599613 {
public MyHelperClass ATOM_ZIP1_1;
	public MyHelperClass IOUtils;
	public MyHelperClass m_format;
	public MyHelperClass DOTranslationUtility;
	public MyHelperClass StreamUtility;

    private void setManagedContent(Entry entry, Datastream vds) throws Throwable, StreamIOException {
        MyHelperClass m_transContext = new MyHelperClass();
        if (m_transContext == DOTranslationUtility.SERIALIZE_EXPORT_ARCHIVE && !m_format.equals(ATOM_ZIP1_1)) {
            String mimeType =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) vds.DSMIME;
            MyHelperClass MimeTypeHelper = new MyHelperClass();
            if (MimeTypeHelper.isText(mimeType) ||(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (Boolean)(Object)MimeTypeHelper.isXml(mimeType)) {
                try {
                    MyHelperClass m_encoding = new MyHelperClass();
                    entry.setContent(IOUtils.toString(vds.getContentStream(), m_encoding), mimeType);
                } catch (IOException e) {
                    throw new StreamIOException(e.getMessage(), e);
                }
            } else {
                entry.setContent(vds.getContentStream(), mimeType);
            }
        } else {
            String dsLocation;
            IRI iri;
            MyHelperClass ATOM_ZIP1_1 = new MyHelperClass();
            if (m_format.equals(ATOM_ZIP1_1) && m_transContext != DOTranslationUtility.AS_IS) {
                MyHelperClass MimeTypeUtils = new MyHelperClass();
                dsLocation = vds.DSVersionID + "." + MimeTypeUtils.fileExtensionForMIMEType(vds.DSMIME);
                try {
                    MyHelperClass m_zout = new MyHelperClass();
                    m_zout.putNextEntry(new ZipEntry(dsLocation));
                    InputStream is =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) vds.getContentStream();
//                    MyHelperClass m_zout = new MyHelperClass();
                    IOUtils.copy(is, m_zout);
                    is.close();
//                    MyHelperClass m_zout = new MyHelperClass();
                    m_zout.closeEntry();
                } catch (IOException e) {
                    throw new StreamIOException(e.getMessage(), e);
                }
            } else {
                MyHelperClass m_obj = new MyHelperClass();
                dsLocation =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) StreamUtility.enc(DOTranslationUtility.normalizeDSLocationURLs(m_obj.getPid(), vds, m_transContext).DSLocation);
            }
            iri = new IRI(dsLocation);
            entry.setSummary(vds.DSVersionID);
            entry.setContent(iri, vds.DSMIME);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERIALIZE_EXPORT_ARCHIVE;
	public MyHelperClass AS_IS;
	public MyHelperClass DSLocation;
public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass enc(MyHelperClass o0){ return null; }
	public MyHelperClass normalizeDSLocationURLs(MyHelperClass o0, Datastream o1, MyHelperClass o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass isXml(String o0){ return null; }
	public MyHelperClass isText(String o0){ return null; }
	public MyHelperClass getPid(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass fileExtensionForMIMEType(MyHelperClass o0){ return null; }}

class Entry {

public MyHelperClass setContent(IRI o0, MyHelperClass o1){ return null; }
	public MyHelperClass setContent(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setSummary(MyHelperClass o0){ return null; }}

class Datastream {
public MyHelperClass DSMIME;
	public MyHelperClass DSVersionID;
public MyHelperClass getContentStream(){ return null; }}

class StreamIOException extends Exception{
	public StreamIOException(String errorMessage) { super(errorMessage); }
	StreamIOException(String o0, IOException o1){}
	StreamIOException(){}
}

class IRI {

IRI(String o0){}
	IRI(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class Object {

public MyHelperClass toString(MyHelperClass o0, MyHelperClass o1){ return null; }}
