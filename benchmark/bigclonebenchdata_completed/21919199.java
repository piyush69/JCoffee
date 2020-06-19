import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21919199 {
public MyHelperClass m_transContext;
	public MyHelperClass IOUtils;
	public MyHelperClass m_format;
	public MyHelperClass DOTranslationUtility;
	public MyHelperClass getDSMimeType(Entry o0){ return null; }
	public MyHelperClass setDSCommonProperties(Datastream o0, Entry o1){ return null; }
	public MyHelperClass getContentSrcAsFile(IRI o0){ return null; }

    private Datastream addManagedDatastreamVersion(Entry entry) throws Throwable, StreamIOException, ObjectIntegrityException {
        Datastream ds =(Datastream)(Object) new DatastreamManagedContent();
        setDSCommonProperties(ds, entry);
        ds.DSLocationType =(MyHelperClass)(Object) "INTERNAL_ID";
        ds.DSMIME = getDSMimeType(entry);
        IRI contentLocation =(IRI)(Object) entry.getContentSrc();
        if (contentLocation != null) {
            MyHelperClass m_obj = new MyHelperClass();
            if ((boolean)(Object)m_obj.isNew()) {
                MyHelperClass ValidationUtility = new MyHelperClass();
                ValidationUtility.validateURL(contentLocation.toString(), ds.DSControlGrp);
            }
            MyHelperClass ATOM_ZIP1_1 = new MyHelperClass();
            if (m_format.equals(ATOM_ZIP1_1)) {
                if (!(Boolean)(Object)contentLocation.isAbsolute() && !contentLocation.isPathAbsolute()) {
                    File f =(File)(Object) getContentSrcAsFile(contentLocation);
                    MyHelperClass DatastreamManagedContent = new MyHelperClass();
                    contentLocation = new IRI(DatastreamManagedContent.TEMP_SCHEME + f.getAbsolutePath());
                }
            }
            ds.DSLocation =(MyHelperClass)(Object) contentLocation.toString();
//            MyHelperClass m_obj = new MyHelperClass();
            ds.DSLocation = (DOTranslationUtility.normalizeDSLocationURLs(m_obj.getPid(), ds, m_transContext)).DSLocation;
            return ds;
        }
        try {
            File temp = File.createTempFile("binary-datastream", null);
            OutputStream out = new FileOutputStream(temp);
            MyHelperClass MimeTypeHelper = new MyHelperClass();
            if (MimeTypeHelper.isText(ds.DSMIME) || MimeTypeHelper.isXml(ds.DSMIME)) {
                MyHelperClass m_encoding = new MyHelperClass();
                IOUtils.copy(new StringReader((String)(Object)entry.getContent()), out, m_encoding);
            } else {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(entry.getContentStream(), out);
            }
            MyHelperClass DatastreamManagedContent = new MyHelperClass();
            ds.DSLocation = DatastreamManagedContent.TEMP_SCHEME + temp.getAbsolutePath();
        } catch (IOException e) {
            throw new StreamIOException(e.getMessage(), e);
        }
        return ds;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public String TEMP_SCHEME;
public MyHelperClass isText(MyHelperClass o0){ return null; }
	public MyHelperClass isXml(MyHelperClass o0){ return null; }
	public MyHelperClass normalizeDSLocationURLs(MyHelperClass o0, Datastream o1, MyHelperClass o2){ return null; }
	public MyHelperClass validateURL(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass getPid(){ return null; }
	public MyHelperClass isNew(){ return null; }}

class Entry {

public MyHelperClass getContentSrc(){ return null; }
	public MyHelperClass getContentStream(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class Datastream {
public MyHelperClass DSLocationType;
	public MyHelperClass DSMIME;
	public MyHelperClass DSControlGrp;
	public MyHelperClass DSLocation;
}

class StreamIOException extends Exception{
	public StreamIOException(String errorMessage) { super(errorMessage); }
	StreamIOException(String o0, IOException o1){}
	StreamIOException(){}
}

class ObjectIntegrityException extends Exception{
	public ObjectIntegrityException(String errorMessage) { super(errorMessage); }
}

class DatastreamManagedContent {

}

class IRI {

IRI(String o0){}
	IRI(){}
	public MyHelperClass isPathAbsolute(){ return null; }
	public MyHelperClass isAbsolute(){ return null; }}
