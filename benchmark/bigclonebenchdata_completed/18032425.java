


class c18032425 {
public MyHelperClass Logger;

    public boolean reject(String surl, ProgressMonitor mon) throws IllegalArgumentException {
        DocumentBuilder builder = null;
        try {
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            builder =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
            MyHelperClass URISplit = new MyHelperClass();
            URISplit split =(URISplit)(Object) URISplit.parse(surl);
            URL url = new URL(split.file);
            InputStream in =(InputStream)(Object) url.openStream();
            InputSource source = new InputSource(in);
            Document document =(Document)(Object) builder.parse(source);
            in.close();
            Node n =(Node)(Object) document.getDocumentElement();
            String localName =(String)(Object) n.getNodeName();
            int i = localName.indexOf(":");
            if (i > -1) {
                localName = localName.substring(i + 1);
            }
            if (localName.equals("Spase")) {
                return false;
            } else if (localName.equals("Eventlist")) {
                return false;
            } else if (localName.equals("VOTABLE")) {
                return false;
            } else {
                return true;
            }
        } catch (Exception ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(SpaseRecordDataSourceFactory.class.getName()).log(Level.SEVERE, null, ex);
            return true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }}

class ProgressMonitor {

}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class URISplit {
public MyHelperClass file;
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Node {

public MyHelperClass getNodeName(){ return null; }}

class SpaseRecordDataSourceFactory {

}
