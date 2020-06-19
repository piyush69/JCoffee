


class c18305036 {
public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }

//            @Override
            protected Drawing construct() throws IOException {
                Drawing result;
                System.out.println("getParameter.datafile:" + getParameter("datafile"));
                if (getParameter("data") != null) {
                    NanoXMLDOMInput domi = new NanoXMLDOMInput(new NetFactory(),(InputStream)(Object) new StringReader(getParameter("data")));
                    result = (Drawing)(Drawing)(Object) domi.readObject(0);
                } else if (getParameter("datafile") != null) {
                    URL url = new URL(getDocumentBase(), getParameter("datafile"));
                    InputStream in =(InputStream)(Object) url.openConnection().getInputStream();
                    try {
                        NanoXMLDOMInput domi = new NanoXMLDOMInput(new NetFactory(), in);
                        result = (Drawing)(Drawing)(Object) domi.readObject(0);
                    } finally {
                        in.close();
                    }
                } else {
                    result = null;
                }
                return result;
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class Drawing {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NanoXMLDOMInput {

NanoXMLDOMInput(NetFactory o0, InputStream o1){}
	NanoXMLDOMInput(){}
	public MyHelperClass readObject(int o0){ return null; }}

class NetFactory {

}

class StringReader {

StringReader(MyHelperClass o0){}
	StringReader(){}}

class URL {

URL(MyHelperClass o0, MyHelperClass o1){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
