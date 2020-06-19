
import java.io.UncheckedIOException;


class c13646834 {
public MyHelperClass ERROR_EXCEPTION_NOT_THROWN;
	public MyHelperClass reportSuccess(){ return null; }

    public TestReport runImpl() throws Exception {
        MyHelperClass XMLResourceDescriptor = new MyHelperClass();
        String parser =(String)(Object) XMLResourceDescriptor.getXMLParserClassName();
        MyHelperClass GenericDOMImplementation = new MyHelperClass();
        DocumentFactory df =(DocumentFactory)(Object) new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), parser);
        MyHelperClass testFileName = new MyHelperClass();
        File f = (new File(testFileName));
        URL url =(URL)(Object) f.toURL();
        MyHelperClass rootTag = new MyHelperClass();
        Document doc =(Document)(Object) df.createDocument(null, rootTag, url.toString(), url.openStream());
        MyHelperClass targetId = new MyHelperClass();
        Element e =(Element)(Object) doc.getElementById(targetId);
        if (e == null) {
            DefaultTestReport report = new DefaultTestReport(this);
            MyHelperClass ERROR_GET_ELEMENT_BY_ID_FAILED = new MyHelperClass();
            report.setErrorCode(ERROR_GET_ELEMENT_BY_ID_FAILED);
            MyHelperClass ENTRY_KEY_ID = new MyHelperClass();
            report.addDescriptionEntry(ENTRY_KEY_ID, targetId);
            report.setPassed(false);
            return (TestReport)(Object)report;
        }
//        MyHelperClass rootTag = new MyHelperClass();
        Document otherDocument =(Document)(Object) df.createDocument(null, rootTag, url.toString(), url.openStream());
        DocumentFragment docFrag =(DocumentFragment)(Object) otherDocument.createDocumentFragment();
        try {
            docFrag.appendChild(doc.getDocumentElement());
        } catch (UncheckedIOException ex) {
            return(TestReport)(Object) reportSuccess();
        }
        DefaultTestReport report = new DefaultTestReport(this);
        report.setErrorCode(ERROR_EXCEPTION_NOT_THROWN);
        report.setPassed(false);
        return (TestReport)(Object)report;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getXMLParserClassName(){ return null; }
	public MyHelperClass getDOMImplementation(){ return null; }}

class TestReport {

}

class DocumentFactory {

public MyHelperClass createDocument(Object o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }}

class SAXDocumentFactory {

SAXDocumentFactory(){}
	SAXDocumentFactory(MyHelperClass o0, String o1){}}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass toURL(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }
	public MyHelperClass createDocumentFragment(){ return null; }
	public MyHelperClass getElementById(MyHelperClass o0){ return null; }}

class Element {

}

class DefaultTestReport {

DefaultTestReport(){}
	DefaultTestReport(c13646834 o0){}
	public MyHelperClass addDescriptionEntry(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setPassed(boolean o0){ return null; }
	public MyHelperClass setErrorCode(MyHelperClass o0){ return null; }}

class DocumentFragment {

public MyHelperClass appendChild(MyHelperClass o0){ return null; }}

class DOMException extends Exception{
	public DOMException(String errorMessage) { super(errorMessage); }
}
