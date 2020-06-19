import java.io.*;
import java.lang.*;
import java.util.*;



class c4381118 {
public MyHelperClass NULL;
	public MyHelperClass initNameCounters(MyHelperClass o0){ return null; }
public MyHelperClass m_urlTF;
	public MyHelperClass updateHistroy(MyHelperClass o0){ return null; }
public MyHelperClass setModified(boolean o0){ return null; }

    private void loadFile(File file) throws Exception {
        Edl edl = new Edl("file:///" + file.getAbsolutePath());
        MyHelperClass ExtractaHelper = new MyHelperClass();
        URL url =(URL)(Object) ExtractaHelper.retrieveUrl(edl.getUrlRetrievalDescriptor());
        String sUrlString =(String)(Object) url.toExternalForm();
        if (sUrlString.startsWith("file:/") && (sUrlString.charAt(6) != '/')) {
            sUrlString = sUrlString.substring(0, 6) + "//" + sUrlString.substring(6);
        }
        MyHelperClass DomHelper = new MyHelperClass();
        Document document =(Document)(Object) DomHelper.parseHtml(url.openStream());
        MyHelperClass m_inputPanel = new MyHelperClass();
        m_inputPanel.setDocument(document);
        MyHelperClass m_resultPanel = new MyHelperClass();
        m_resultPanel.setContext(new ResultContext(edl, document, url));
        initNameCounters(edl.getItemDescriptors());
        File m_outputFile =(File)(Object) NULL; //new File();
        m_outputFile = file;
        String m_sUrlString =(String)(Object) NULL; //new String();
        m_sUrlString = sUrlString;
//        MyHelperClass m_sUrlString = new MyHelperClass();
        m_urlTF.setText(m_sUrlString);
//        MyHelperClass m_outputFile = new MyHelperClass();
        updateHistroy((MyHelperClass)(Object)m_outputFile);
        setModified(false);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setContext(ResultContext o0){ return null; }
	public MyHelperClass parseHtml(MyHelperClass o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass retrieveUrl(MyHelperClass o0){ return null; }
	public MyHelperClass setDocument(Document o0){ return null; }}

class Edl {

Edl(){}
	Edl(String o0){}
	public MyHelperClass getUrlRetrievalDescriptor(){ return null; }
	public MyHelperClass getItemDescriptors(){ return null; }}

class URL {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class Document {

}

class ResultContext {

ResultContext(){}
	ResultContext(Edl o0, Document o1, URL o2){}}
