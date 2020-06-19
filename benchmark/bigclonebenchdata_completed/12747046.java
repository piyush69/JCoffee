


class c12747046 {
public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }

            public Object construct() {
                Object result;
                try {
                    if (getParameter("data") != null &&(int)(Object) getParameter("data").length() > 0) {
                        NanoXMLDOMInput domi = new NanoXMLDOMInput(new UMLFigureFactory(),(InputStream)(Object) new StringReader(getParameter("data")));
                        result = domi.readObject(0);
                    } else if (getParameter("datafile") != null) {
                        InputStream in = null;
                        try {
                            URL url = new URL(getDocumentBase(), getParameter("datafile"));
                            in =(InputStream)(Object) url.openConnection().getInputStream();
                            NanoXMLDOMInput domi = new NanoXMLDOMInput(new UMLFigureFactory(), in);
                            result = domi.readObject(0);
                        } finally {
                            if (in != null) in.close();
                        }
                    } else {
                        result = null;
                    }
                } catch (Throwable t) {
                    result = t;
                }
                return result;
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass length(){ return null; }}

class NanoXMLDOMInput {

NanoXMLDOMInput(UMLFigureFactory o0, InputStream o1){}
	NanoXMLDOMInput(){}
	public MyHelperClass readObject(int o0){ return null; }}

class UMLFigureFactory {

}

class StringReader {

StringReader(MyHelperClass o0){}
	StringReader(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(MyHelperClass o0, MyHelperClass o1){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
