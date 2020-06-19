
import java.io.UncheckedIOException;


class c4381116 {
public MyHelperClass m_urlTF;
public MyHelperClass UITools;
	public MyHelperClass setModified(boolean o0){ return null; }

    private void importUrl() throws ExtractaException {
        MyHelperClass UITools = new MyHelperClass();
        UITools.changeCursor(UITools.WAIT_CURSOR, this);
        try {
            MyHelperClass m_sUrlString = new MyHelperClass();
            m_sUrlString = m_urlTF.getText();
//            MyHelperClass m_sUrlString = new MyHelperClass();
            URL url = new URL(m_sUrlString);
            MyHelperClass DomHelper = new MyHelperClass();
            Document document =(Document)(Object) DomHelper.parseHtml(url.openStream());
            MyHelperClass m_inputPanel = new MyHelperClass();
            m_inputPanel.setDocument(document);
            Edl edl = new Edl();
//            MyHelperClass m_sUrlString = new MyHelperClass();
            edl.addUrlDescriptor(new UrlDescriptor(m_sUrlString));
            MyHelperClass m_resultPanel = new MyHelperClass();
            m_resultPanel.setContext(new ResultContext(edl, document, url));
            setModified(true);
        } catch (UncheckedIOException ex) {
            throw new ExtractaException("Can not open URL!",(IOException)(Object) ex);
        } finally {
            UITools.changeCursor(UITools.DEFAULT_CURSOR, this);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WAIT_CURSOR;
	public MyHelperClass DEFAULT_CURSOR;
public MyHelperClass setContext(ResultContext o0){ return null; }
	public MyHelperClass setDocument(Document o0){ return null; }
	public MyHelperClass changeCursor(MyHelperClass o0, c4381116 o1){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass parseHtml(MyHelperClass o0){ return null; }}

class ExtractaException extends Exception{
	public ExtractaException(String errorMessage) { super(errorMessage); }
	ExtractaException(String o0, IOException o1){}
	ExtractaException(){}
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Document {

}

class Edl {

public MyHelperClass addUrlDescriptor(UrlDescriptor o0){ return null; }}

class UrlDescriptor {

UrlDescriptor(MyHelperClass o0){}
	UrlDescriptor(){}}

class ResultContext {

ResultContext(){}
	ResultContext(Edl o0, Document o1, URL o2){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
