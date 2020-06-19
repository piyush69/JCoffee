


class c16288225 {
public MyHelperClass parserClassName;
	public MyHelperClass targetValue;
public MyHelperClass TestReport;
	public MyHelperClass reportSuccess(){ return null; }

    public TestReport runImpl() throws Exception {
        MyHelperClass GenericDOMImplementation = new MyHelperClass();
        DocumentFactory df =(DocumentFactory)(Object) new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), parserClassName);
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
        MyHelperClass targetAttribute = new MyHelperClass();
        e.setAttribute(targetAttribute, targetValue);
//        MyHelperClass targetAttribute = new MyHelperClass();
        if (targetValue.equals(e.getAttribute(targetAttribute))) {
            return(TestReport)(Object) reportSuccess();
        }
        DefaultTestReport report = new DefaultTestReport(this);
        report.setErrorCode(TestReport.ERROR_TEST_FAILED);
        report.setPassed(false);
        return (TestReport)(Object)report;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_TEST_FAILED;
public MyHelperClass getDOMImplementation(){ return null; }}

class TestReport {

}

class DocumentFactory {

public MyHelperClass createDocument(Object o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }}

class SAXDocumentFactory {

SAXDocumentFactory(MyHelperClass o0, MyHelperClass o1){}
	SAXDocumentFactory(){}}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass toURL(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Document {

public MyHelperClass getElementById(MyHelperClass o0){ return null; }}

class Element {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, MyHelperClass o1){ return null; }}

class DefaultTestReport {

DefaultTestReport(){}
	DefaultTestReport(c16288225 o0){}
	public MyHelperClass addDescriptionEntry(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setPassed(boolean o0){ return null; }
	public MyHelperClass setErrorCode(MyHelperClass o0){ return null; }}
