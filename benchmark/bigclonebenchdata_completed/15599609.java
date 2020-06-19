
import java.io.UncheckedIOException;


class c15599609 {
public MyHelperClass VERSIONABLE;
	public MyHelperClass DOTranslationUtility;
	public MyHelperClass LABEL;
	public MyHelperClass CONTROL_GROUP;
	public MyHelperClass AUDIT1_0;
	public MyHelperClass DateUtility;
	public MyHelperClass STATE;
	public MyHelperClass m_format;
	public MyHelperClass ThreadHelper;
	public MyHelperClass IOUtils;
	public MyHelperClass m_encoding;
	public MyHelperClass FORMAT_URI;

    private void addAuditDatastream() throws ObjectIntegrityException, StreamIOException {
        MyHelperClass m_obj = new MyHelperClass();
        if ((int)(Object)m_obj.getAuditRecords().size() == 0) {
            return;
        }
        MyHelperClass m_pid = new MyHelperClass();
        String dsId = m_pid.toURI() + "/AUDIT";
//        MyHelperClass m_obj = new MyHelperClass();
        String dsvId = dsId + "/" + DateUtility.convertDateToString(m_obj.getCreateDate());
        MyHelperClass m_feed = new MyHelperClass();
        Entry dsEntry =(Entry)(Object) m_feed.addEntry();
        dsEntry.setId(dsId);
        dsEntry.setTitle("AUDIT");
//        MyHelperClass m_obj = new MyHelperClass();
        dsEntry.setUpdated(m_obj.getCreateDate());
        dsEntry.addCategory(STATE.uri, "A", null);
        dsEntry.addCategory(CONTROL_GROUP.uri, "X", null);
        dsEntry.addCategory(VERSIONABLE.uri, "false", null);
        MyHelperClass Link = new MyHelperClass();
        dsEntry.addLink(dsvId, Link.REL_ALTERNATE);
//        MyHelperClass m_feed = new MyHelperClass();
        Entry dsvEntry =(Entry)(Object) m_feed.addEntry();
        dsvEntry.setId(dsvId);
        dsvEntry.setTitle("AUDIT.0");
//        MyHelperClass m_obj = new MyHelperClass();
        dsvEntry.setUpdated(m_obj.getCreateDate());
//        MyHelperClass m_pid = new MyHelperClass();
        ThreadHelper.addInReplyTo(dsvEntry, m_pid.toURI() + "/AUDIT");
        dsvEntry.addCategory(FORMAT_URI.uri, AUDIT1_0.uri, null);
        dsvEntry.addCategory(LABEL.uri, "Audit Trail for this object", null);
        MyHelperClass ATOM_ZIP1_1 = new MyHelperClass();
        if (m_format.equals(ATOM_ZIP1_1)) {
            String name = "AUDIT.0.xml";
            try {
                MyHelperClass m_zout = new MyHelperClass();
                m_zout.putNextEntry(new ZipEntry(name));
//                MyHelperClass m_obj = new MyHelperClass();
                Reader r =(Reader)(Object) new StringReader(DOTranslationUtility.getAuditTrail(m_obj));
//                MyHelperClass m_zout = new MyHelperClass();
                IOUtils.copy(r, m_zout, m_encoding);
//                MyHelperClass m_zout = new MyHelperClass();
                m_zout.closeEntry();
                r.close();
            } catch (UncheckedIOException e) {
                throw new StreamIOException(e.getMessage(),(IOException)(Object) e);
            }
            IRI iri = new IRI(name);
            dsvEntry.setSummary("AUDIT.0");
            dsvEntry.setContent(iri, "text/xml");
        } else {
//            MyHelperClass m_obj = new MyHelperClass();
            dsvEntry.setContent((IRI)(Object)DOTranslationUtility.getAuditTrail(m_obj), "text/xml");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
	public MyHelperClass REL_ALTERNATE;
public MyHelperClass size(){ return null; }
	public MyHelperClass getAuditRecords(){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass addInReplyTo(Entry o0, String o1){ return null; }
	public MyHelperClass copy(Reader o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getAuditTrail(MyHelperClass o0){ return null; }
	public MyHelperClass convertDateToString(MyHelperClass o0){ return null; }
	public MyHelperClass getCreateDate(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass addEntry(){ return null; }}

class ObjectIntegrityException extends Exception{
	public ObjectIntegrityException(String errorMessage) { super(errorMessage); }
}

class StreamIOException extends Exception{
	public StreamIOException(String errorMessage) { super(errorMessage); }
	StreamIOException(String o0, IOException o1){}
	StreamIOException(){}
}

class Entry {

public MyHelperClass addCategory(MyHelperClass o0, String o1, Object o2){ return null; }
	public MyHelperClass setId(String o0){ return null; }
	public MyHelperClass setUpdated(MyHelperClass o0){ return null; }
	public MyHelperClass addCategory(MyHelperClass o0, MyHelperClass o1, Object o2){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass addLink(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setSummary(String o0){ return null; }
	public MyHelperClass setContent(IRI o0, String o1){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class Reader {

public MyHelperClass close(){ return null; }}

class StringReader {

StringReader(MyHelperClass o0){}
	StringReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IRI {

IRI(String o0){}
	IRI(){}}
