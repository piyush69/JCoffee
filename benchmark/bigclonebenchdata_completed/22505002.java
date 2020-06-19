


class c22505002 {

    private void importUrl(String str) throws Exception {
        URL url = new URL(str);
        InputStream xmlStream =(InputStream)(Object) url.openStream();
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        MyHelperClass MessageHolder = new MyHelperClass();
        MessageHolder messages =(MessageHolder)(Object) MessageHolder.getInstance();
        DocumentBuilder builder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
        Document document =(Document)(Object) builder.parse(xmlStream);
        Element rootElement =(Element)(Object) document.getDocumentElement();
        EntrySetParser entrySetParser = new EntrySetParser();
        EntrySetTag entrySet =(EntrySetTag)(Object) entrySetParser.process(rootElement);
        UpdateProteinsI proteinFactory =(UpdateProteinsI)(Object) new UpdateProteins();
        BioSourceFactory bioSourceFactory = new BioSourceFactory();
        MyHelperClass ControlledVocabularyRepository = new MyHelperClass();
        ControlledVocabularyRepository.check();
        MyHelperClass EntrySetChecker = new MyHelperClass();
        EntrySetChecker.check(entrySet, proteinFactory, bioSourceFactory);
        if ((boolean)(Object)messages.checkerMessageExists()) {
//            MyHelperClass MessageHolder = new MyHelperClass();
            MessageHolder.getInstance().printCheckerReport((PrintStream)(Object)System.err);
        } else {
            MyHelperClass EntrySetPersister = new MyHelperClass();
            EntrySetPersister.persist(entrySet);
            if ((boolean)(Object)messages.checkerMessageExists()) {
//                MyHelperClass MessageHolder = new MyHelperClass();
                MessageHolder.getInstance().printPersisterReport((PrintStream)(Object)System.err);
            } else {
                System.out.println("The data have been successfully saved in your Intact node.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass printPersisterReport(PrintStream o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass printCheckerReport(PrintStream o0){ return null; }
	public MyHelperClass check(EntrySetTag o0, UpdateProteinsI o1, BioSourceFactory o2){ return null; }
	public MyHelperClass check(){ return null; }
	public MyHelperClass persist(EntrySetTag o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class MessageHolder {

public MyHelperClass checkerMessageExists(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

}

class EntrySetParser {

public MyHelperClass process(Element o0){ return null; }}

class EntrySetTag {

}

class UpdateProteinsI {

}

class UpdateProteins {

}

class BioSourceFactory {

}

class PrintStream {

}
