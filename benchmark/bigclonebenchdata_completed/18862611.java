
import java.io.UncheckedIOException;


class c18862611 {
public MyHelperClass parserClassName;
public MyHelperClass testFileName;
	public MyHelperClass reportSuccess(){ return null; }

    public TestReport runImpl() throws Exception {
        MyHelperClass GenericDOMImplementation = new MyHelperClass();
        DocumentFactory df =(DocumentFactory)(Object) new SAXDocumentFactory(GenericDOMImplementation.getDOMImplementation(), parserClassName);
        MyHelperClass testFileName = new MyHelperClass();
        File f = (new File(testFileName));
        URL url =(URL)(Object) f.toURL();
        MyHelperClass rootTag = new MyHelperClass();
        Document doc =(Document)(Object) df.createDocument(null, rootTag, url.toString(), url.openStream());
        MyHelperClass File = new MyHelperClass();
        File ser1 =(File)(Object) File.createTempFile("doc1", "ser");
//        MyHelperClass File = new MyHelperClass();
        File ser2 =(File)(Object) File.createTempFile("doc2", "ser");
        try {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(ser1));
            oos.writeObject(doc);
            oos.close();
            ObjectInputStream ois;
            ois = new ObjectInputStream(new FileInputStream(ser1));
            doc = (Document)(Document)(Object) ois.readObject();
            ois.close();
            oos = new ObjectOutputStream(new FileOutputStream(ser2));
            oos.writeObject(doc);
            oos.close();
        } catch (UncheckedIOException e) {
            DefaultTestReport report = new DefaultTestReport(this);
            report.setErrorCode("io.error");
            report.addDescriptionEntry("message", e.getClass().getName() + ": " + e.getMessage());
//            MyHelperClass testFileName = new MyHelperClass();
            report.addDescriptionEntry("file.name", testFileName);
            report.setPassed(false);
            return (TestReport)(Object)report;
        }
        InputStream is1 =(InputStream)(Object) new FileInputStream(ser1);
        InputStream is2 =(InputStream)(Object) new FileInputStream(ser2);
        for (; ; ) {
            int i1 =(int)(Object) is1.read();
            int i2 =(int)(Object) is2.read();
            if (i1 == -1 && i2 == -1) {
                return(TestReport)(Object) reportSuccess();
            }
            if (i1 != i2) {
                DefaultTestReport report = new DefaultTestReport(this);
                report.setErrorCode("difference.found");
                report.addDescriptionEntry("file.name", testFileName);
                report.setPassed(false);
                return (TestReport)(Object)report;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDOMImplementation(){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

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

}

class ObjectOutputStream {

ObjectOutputStream(FileOutputStream o0){}
	ObjectOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass writeObject(Document o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ObjectInputStream {

ObjectInputStream(FileInputStream o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DefaultTestReport {

DefaultTestReport(c18862611 o0){}
	DefaultTestReport(){}
	public MyHelperClass addDescriptionEntry(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setErrorCode(String o0){ return null; }
	public MyHelperClass addDescriptionEntry(String o0, String o1){ return null; }
	public MyHelperClass setPassed(boolean o0){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}
